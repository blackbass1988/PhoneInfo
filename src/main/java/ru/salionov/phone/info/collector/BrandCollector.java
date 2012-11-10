package ru.salionov.phone.info.collector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.salionov.phone.info.models.Brand;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ru.salionov.phone.info.service.Constants.*;
/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class BrandCollector {

    final String brandMenuSelector="div#brandmenu ul li";

    private Elements getBrands() {
        Document document;
        try {
            document = Jsoup
                    .connect(HOST)
                    .timeout(TIMEOUT)
                    .followRedirects(FOLLOW_REDIRECTS)
                    .userAgent(USER_AGENT)
                    .get();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
        return document.select(brandMenuSelector);
    }

    private Brand parseBrand(Element brand) {
        return new Brand(brand.select("a").html(), HOST + brand.select("a").attr("href"));
    }

    public List<Brand> getBrandList() {
        List<Brand> brandList = new ArrayList<Brand>();
        for (Element brand: getBrands()) {
            brandList.add(parseBrand(brand));
        }
        return brandList;
    }
}
