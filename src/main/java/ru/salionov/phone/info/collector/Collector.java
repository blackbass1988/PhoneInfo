package ru.salionov.phone.info.collector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import static ru.salionov.phone.info.service.Constants.*;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Collector {
    protected Elements getElements(String link) {
        Document document;
        try {
            document = Jsoup
                    .connect(link)
                    .timeout(TIMEOUT)
                    .followRedirects(FOLLOW_REDIRECTS)
                    .userAgent(USER_AGENT)
                    .get();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
        return document.getAllElements();
    }
}
