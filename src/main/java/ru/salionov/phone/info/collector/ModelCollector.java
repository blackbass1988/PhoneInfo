package ru.salionov.phone.info.collector;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.salionov.phone.info.models.Brand;
import ru.salionov.phone.info.models.Mark;
import ru.salionov.phone.info.support.Logger;

import java.util.ArrayList;
import java.util.List;

import static ru.salionov.phone.info.support.Constants.HOST;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class ModelCollector extends Collector {

    final String modelsSelector = "div.makers ul li";
    final String nextPageSelector = "div.nav-pages [title=Next page]";


    Brand brand;
    String link;
    List<Mark> markList;

    public ModelCollector(Brand brand) {
        this.brand = brand;
        this.link = brand.getLink(); // set default link
        this.markList = new ArrayList<Mark>();

    }


    private Elements getModelsPage() {
        return getElements(link);
    }

    private Mark parseModel(Element model) {
        return new Mark(this.brand, model.select("a").select("strong").html(), HOST + model.select("a").attr("href"),
                         model.select("img").first().attr("src"));
    }


    public List<Mark> getMarkList() {
        Logger.debug("Processing %s", link);
        Elements page = getModelsPage();
        for (Element model : page.select(modelsSelector)) {
            markList.add(parseModel(model));
        }
        Element nextPageA = page.select(nextPageSelector).first();
//        if (nextPageA != null && nextPageA.attr("href") != null) {
//            this.link = HOST + nextPageA.attr("href");
//            getMarkList();
//        }
        return markList;
    }
}
