package unit;

import org.junit.Test;
import ru.salionov.phone.info.collector.BrandCollector;
import ru.salionov.phone.info.collector.ModelCollector;
import ru.salionov.phone.info.models.Brand;
import ru.salionov.phone.info.models.Model;
import ru.salionov.phone.info.support.Logger;
import utils.UnitTest;

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
        List<Model> modelList = modelCollector.getModelList();
        Logger.info("total models %s", modelList.size());
        Logger.info("name: %s,\n thumbnail: %s\n link: %s", modelList.get(0).getName(),
                    modelList.get(0).getThumbNail(), modelList.get(0).getLink());
        assertNotNull(modelList);
        assertFalse(modelList.isEmpty());
        assertEquals(modelList.get(0).getBrand(), nokia);
    }
}
