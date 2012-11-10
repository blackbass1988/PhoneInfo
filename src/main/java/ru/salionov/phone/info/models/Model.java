package ru.salionov.phone.info.models;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Model {

    Brand brand;
    String name;
    String link;
    String thumbNail;
    String bigPicture;
    Details details;

    public Model(String name, String link, String thumbNail) {
        this.name = name;
        this.link = link;
        this.thumbNail = thumbNail;
    }
}
