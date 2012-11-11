package unit;

import com.google.gson.Gson;
import org.junit.Test;
import ru.salionov.phone.info.collector.BrandCollector;
import ru.salionov.phone.info.collector.FeatureCollector;
import ru.salionov.phone.info.collector.ModelCollector;
import ru.salionov.phone.info.models.Brand;
import ru.salionov.phone.info.models.Feature;
import ru.salionov.phone.info.models.Mark;
import ru.salionov.phone.info.support.Logger;
import utils.UnitTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class ParserTest extends UnitTest {

    @Test
    public void parserTest(){
        BrandCollector brandCollector = new BrandCollector();
        List<Brand> list = brandCollector.getBrandList();
        Brand nokia = list.get(0);
        assertEquals(nokia.getName(), "Nokia");
        ModelCollector modelCollector = new ModelCollector(nokia);
        List<Mark> markList = modelCollector.getMarkList();
        Logger.info("total models %s", markList.size());
        assertNotNull(markList);
        assertFalse(markList.isEmpty());
        Mark nokia109 = markList.get(0);

        Logger.info("name: %s,\n thumbnail: %s\n link: %s", nokia109.getName(),
                    nokia109.getThumbNail(), nokia109.getLink());
        assertEquals(nokia109.getBrand(), nokia);


        FeatureCollector fc = new FeatureCollector(nokia109);
        Feature nokiaF = fc.getFeatures();

        assertNotNull(nokiaF);
        assertEquals(nokiaF.getMark(), nokia109);
        assertEquals(nokiaF.getInfo2G(), "GSM 900 / 1800");

        List<Feature> featureList = new ArrayList<Feature>();
        int i = 0;
        for (Mark mark: markList) {
            Logger.info("%s Processing %s", i, mark);
            FeatureCollector featureCollector = new FeatureCollector(mark);
            featureList.add(featureCollector.getFeatures());
            i++;
        }

        String json = new Gson().toJson(featureList);
        assertNotNull(json);
        Logger.info(json);
    }
}
