package ru.salionov.phone.info.support;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Configuration {

    public static Properties properties = null;
    public static String id = null;
    public static final String CONF_BASE_DIR = "conf/";

    public static void loadProperties() {
        id = System.getProperty("phone.id");
        if (id != null){
            System.out.println(String.format("Running SeaBattle Server with id=%s",id));
        }else{
            System.out.println("phone.id is not set. Using default values from config.properties");
        }
        properties = readOneConfigurationFile(CONF_BASE_DIR  +  "application.properties");
    }



    private static Properties readOneConfigurationFile(String filename){
        Properties propsFromFile = null;
        try {
            FileInputStream inputStream = new FileInputStream(filename);
            propsFromFile = IO.readUtf8Properties(inputStream);
        } catch (Exception e){
            System.out.println("config.properties not found, using default");
        }

        // prepare configuration for current sb.id
        if (propsFromFile != null){
            Properties newConfiguration = new OrderSafeProperties();
            Pattern pattern = Pattern.compile("^%([a-zA-Z0-9_\\-]+)\\.(.*)$");
            for (Object key : propsFromFile.keySet()) {
                Matcher matcher = pattern.matcher(key + "");
                if (!matcher.matches()) {
                    newConfiguration.put(key, propsFromFile.get(key).toString().trim());
                }
            }
            for (Object key : propsFromFile.keySet()) {
                Matcher matcher = pattern.matcher(key + "");
                if (matcher.matches()) {
                    String instance = matcher.group(1);
                    if (instance.equals(id)) {
                        newConfiguration.put(matcher.group(2), propsFromFile.get(key).toString().trim());
                    }
                }
            }
            return newConfiguration;
        }
        return new Properties();
    }

    public static String getProperty(String key, String defaultValue) {
        if (properties == null) {
            loadProperties();
        }
        return properties.getProperty(key, defaultValue);
    }

    public static String getProperty(String key) {
        return properties.getProperty(key, null);
    }

    public static Object get(Object key) {
        if (properties == null) {
            loadProperties();
        }
        return properties.get(key);
    }
}
