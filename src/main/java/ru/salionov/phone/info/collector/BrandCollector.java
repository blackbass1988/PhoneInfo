package ru.salionov.phone.info.collector;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.salionov.phone.info.models.Brand;

import java.util.ArrayList;
import java.util.List;

import static ru.salionov.phone.info.support.Constants.HOST;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class BrandCollector extends Collector {

    final String brandMenuSelector = "div#brandmenu ul li";

    private Elements getBrands() {
        return getElements(HOST).select(brandMenuSelector);
    }

    private Brand parseBrand(Element brand) {
        return new Brand(brand.select("a").html(), HOST + brand.select("a").attr("href"));
    }

    public List<Brand> getBrandList() {
        List<Brand> brandList = new ArrayList<Brand>();
        for (Element brand : getBrands()) {
            brandList.add(parseBrand(brand));
        }
        return brandList;
    }
}
