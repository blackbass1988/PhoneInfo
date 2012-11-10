package ru.salionov.phone.info.collector;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.salionov.phone.info.models.Brand;
import ru.salionov.phone.info.models.Model;
import ru.salionov.phone.info.utils.Logger;

import java.util.ArrayList;
import java.util.List;

import static ru.salionov.phone.info.service.Constants.HOST;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class ModelCollector extends Collector {

    final String modelsSelector = "div.makers ul li";
    final String nextPageSelector = "div.nav-pages [title=Next page]";


    Brand brand;
    String link;
    List<Model> modelList;

    public ModelCollector(Brand brand) {
        this.brand = brand;
        this.link = brand.getLink(); // set default link
        this.modelList = new ArrayList<Model>();

    }


    private Elements getModelsPage() {
        return getElements(link);
    }

    private Model parseModel(Element model) {
        return new Model(model.select("a").html(), HOST + model.select("a").attr("href"),
                         model.select("img").first().attr("src"));
    }


    public List<Model> getModelList() {
        Logger.debug("Processing %s", link);
        Elements page = getModelsPage();
        for (Element model: page.select(modelsSelector)) {
            modelList.add(parseModel(model));
        }
        Element nextPageA = page.select(nextPageSelector).first();
        if (nextPageA != null && nextPageA.attr("href") != null) {
            this.link = HOST + nextPageA.attr("href");
            getModelList();
        }
        Logger.debug("Total models: %s", modelList.size());
        return modelList;
    }
}
