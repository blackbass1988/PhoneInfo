package ru.salionov.phone.info.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Model {

    private Brand brand;
    private String name;
    private List<String> additionalName;
    private String link;
    private String thumbNail;
    private String bigPicture;
    private Details details;

    public Model(Brand brand, String name, String link, String thumbNail) {
        this.brand = brand;
        this.name = name;
        this.link = link;
        this.thumbNail = thumbNail;
        this.additionalName = new ArrayList<String>();
    }

    public String toString() {
        return String.format("Model{brand: \"%s\", name: \"%s\"}", getBrand().getName(), getName());
    }

    public Brand getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getThumbNail() {
        return thumbNail;
    }

    public String getBigPicture() {
        return bigPicture;
    }

    public Details getDetails() {
        return details;
    }

    public List<String> getAdditionalName() {
        return additionalName;
    }
}
