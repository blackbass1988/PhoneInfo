package ru.salionov.phone.info.collector;

import org.jsoup.select.Elements;
import ru.salionov.phone.info.models.Feature;
import ru.salionov.phone.info.models.Model;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class FeatureCollector extends Collector {

    private Model model;


    public FeatureCollector(Model model) {
        this.model = model;
    }

    public void getFeatures() {
        final String featureDiv = "div#main";
        Elements featureDivElement = getElements(model.getLink()).select(featureDiv);
        model.setBigPicture(featureDivElement.select("div#specs-cp-pic img").attr("src"));
        Feature feature = new Feature(featureDivElement);

    }
}
