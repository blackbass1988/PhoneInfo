package ru.salionov.phone.info.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Brand {

    String name;
    String link;

    List<Model> modelList;

    public Brand(String name, String link) {
        this.name = name;
        this.link = link;
        this.modelList = new ArrayList<Model>();
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public String toString(){
        return String.format("Brand{name: \"%s\", link: \"%s\"}", name, link);
    }
}
