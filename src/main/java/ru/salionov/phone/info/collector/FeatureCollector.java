package ru.salionov.phone.info.collector;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.salionov.phone.info.models.Feature;
import ru.salionov.phone.info.models.Model;
import ru.salionov.phone.info.support.Logger;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Feature feature = new Feature(model);
        Element preInfo = featureDivElement.select("div#specs-list p").first();
        if (preInfo != null) {
            final Pattern preInfoPattern = Pattern.compile("(?<=Also known as )(.+)");
            Matcher preInfoMatcher = preInfoPattern.matcher(preInfo.html());
            if (preInfoMatcher.find()) {
                feature.setAlternativeNames(Arrays.asList(preInfoMatcher.group().replaceAll(", ", "").split(",")));
            }
        }


        Elements featureList = featureDivElement.select("div#specs-list table");
        parseFeatures(feature, featureList);

        Logger.info(feature.toString());

    }

    private String getFeatureValue(Element featureBlock, String featureName) {
        Elements featureElements = featureBlock.select("tr");
        for (Element feature: featureElements) {
            Element featureNameElement = feature.select("td.ttl a").first();
            if (featureNameElement != null && featureNameElement.html().equalsIgnoreCase(featureName)) {
                return feature.select("td.nfo").html();
            }
        }
        return null;
    }

    private void parseFeatures(Feature feature, Elements featureList) {
        for (Element featureBlock : featureList) {
            String section = featureBlock.select("th[scope=row]").html();
            if (section.equalsIgnoreCase("general")) {
                feature.setInfo2G(getFeatureValue(featureBlock, "2G Network"));
                feature.setInfo3G(getFeatureValue(featureBlock, "3G Network"));
                feature.setInfo4G(getFeatureValue(featureBlock, "4G Network"));
                feature.setSim(getFeatureValue(featureBlock, "SIM"));
                feature.setAnnounced(getFeatureValue(featureBlock, "Announced"));
                feature.setStatus(getFeatureValue(featureBlock, "Status"));
            } else if (section.equalsIgnoreCase("body")) {
                feature.setDimensions(getFeatureValue(featureBlock, "Dimensions"));
                feature.setWeight(getFeatureValue(featureBlock, "Weight"));
            } else if (section.equalsIgnoreCase("display")) {
                feature.setDisplayType(getFeatureValue(featureBlock, "Type"));
                feature.setDisplaySize(getFeatureValue(featureBlock, "Size"));
                feature.setDisplayMultitouch(getFeatureValue(featureBlock, "Multitouch"));
                feature.setDisplayProtection(getFeatureValue(featureBlock, "Protection"));
            } else if (section.equalsIgnoreCase("sound")) {
                feature.setAlertTypes(getFeatureValue(featureBlock, "Alert types"));
                feature.setLoudspeaker(getFeatureValue(featureBlock, "Loudspeaker"));
                feature.setMiniJack(getFeatureValue(featureBlock, "3.5mm jack"));
            } else if (section.equalsIgnoreCase("memory")) {
                feature.setMemoryCardSlot(getFeatureValue(featureBlock, "Card slot"));
                feature.setMemoryInternal(getFeatureValue(featureBlock, "Internal"));
            } else if (section.equalsIgnoreCase("data")) {
                feature.setDataGPRS(getFeatureValue(featureBlock, "GPRS"));
                feature.setDataEDGE(getFeatureValue(featureBlock, "EDGE"));
                feature.setDataSpeed(getFeatureValue(featureBlock, "Speed"));
                feature.setDataWLAN(getFeatureValue(featureBlock, "WLAN"));
                feature.setDataBluetooth(getFeatureValue(featureBlock, "Bluetooth"));
                feature.setDataNFC(getFeatureValue(featureBlock, "NFC"));
                feature.setDataUSB(getFeatureValue(featureBlock, "USB"));
            } else if (section.equalsIgnoreCase("camera")) {
                feature.setCameraPrimary(getFeatureValue(featureBlock, "Primary"));
                feature.setCameraFeatures(getFeatureValue(featureBlock, "Features"));
                feature.setCameraVideo(getFeatureValue(featureBlock, "Video"));
                feature.setCameraSecondary(getFeatureValue(featureBlock, "Secondary"));
            } else if (section.equalsIgnoreCase("features")) {
                feature.setFeaturesOS(getFeatureValue(featureBlock, "OS"));
                feature.setFeaturesChipset(getFeatureValue(featureBlock, "Chipset"));
                feature.setFeaturesCPU(getFeatureValue(featureBlock, "CPU"));
                feature.setFeaturesGPU(getFeatureValue(featureBlock, "GPU"));
                feature.setFeaturesSensors(getFeatureValue(featureBlock, "Sensors"));
                feature.setFeaturesMessaging(getFeatureValue(featureBlock, "Messaging"));
                feature.setFeaturesBrowser(getFeatureValue(featureBlock, "Browser"));
                feature.setFeaturesRadio(getFeatureValue(featureBlock, "Radio"));
                feature.setFeaturesGPS(getFeatureValue(featureBlock, "GPS"));
                feature.setFeaturesJAVA(getFeatureValue(featureBlock, "Java"));
                feature.setFeaturesColors(getFeatureValue(featureBlock, "Colors"));
                feature.setFeaturesOther(getFeatureValue(featureBlock, ""));
            } else if (section.equalsIgnoreCase("battery")) {
                feature.setBatteryCommon(getFeatureValue(featureBlock, ""));
                feature.setBatteryStandBy(getFeatureValue(featureBlock, "Stand-by"));
                feature.setBatteryTalkTime(getFeatureValue(featureBlock, "Talk time"));
            }
        }
    }
}
