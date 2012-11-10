package ru.salionov.phone.info.models;

import org.jsoup.select.Elements;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Feature {
    private String a2G;
    private String a3G;
    private String a4G;
    private String sim;
    private String announced;
    private String status;
    private String dimensions;
    private String displayMultitouch;
    private String displayProtection;
    private String alertTypes;
    private String loudspeaker;
    private String miniJack;
    private String memoryInternal;
    private String dataGPRS;
    private String dataEDGE;
    private String dataSpeed;
    private String dataWLAN;
    private String dataBluetooth;
    private String dataNFC;
    private String dataUSB;
    private String cameraPrimary;
    private String cameraFeatures;
    private String cameraVideo;
    private String cameraSecondary;
    private String featuresOS;
    private String featuresChipset;
    private String featuresCPU;
    private String featuresGPU;
    private String featuresSensors;
    private String featuresMessaging;
    private String featuresBrowser;
    private String featuresRadio;
    private String featuresGPS;
    private String featuresJAVA;
    private String featuresColors;
    private String featuresOther;
    private String batteryCommon;
    private String batteryStandBy;
    private String batteryTalkTime;
    private String weight;
    private String displayType;
    private String displaySize;
    private String memoryCardSlot;

    public Feature(Elements featureDivElement) {
//
//        .set2G(featureDiv)
//                .set3G(featureDiv)
//                .set4G(featureDiv)
//                .setSim(featureDiv)
//                .setAnnounced(featureDiv)
//                .setStatus(featureDiv)
//                .setDimensions(featureDiv)
//                .setWeight(featureDiv)
//                .setDisplayType(featureDiv)
//                .setDisplaySize(featureDiv)
//                .setDisplayMultitouch(featureDiv)
//                .setDisplayProtection(featureDiv)
//                .setAlertTypes(featureDiv)
//                .setLoudspeaker(featureDiv)
//                .setminiJack(featureDiv)
//                .setMemoryCardSlot(featureDiv)
//                .setMemoryInternal(featureDiv)
//                .setDataGPRS(featureDiv)
//                .setDataEDGE(featureDiv)
//                .setDataSpeed(featureDiv)
//                .setDataWLAN(featureDiv)
//                .setDataBluetooth(featureDiv)
//                .setDataNFC(featureDiv)
//                .setDataUSB(featureDiv)
//                .setCameraPrimary(featureDiv)
//                .setCameraFeatures(featureDiv)
//                .setCameraVideo(featureDiv)
//                .setCameraSecondary(featureDiv)
//                .setFeaturesOS(featureDiv)
//                .setFeaturesChipset(featureDiv)
//                .setFeaturesCPU(featureDiv)
//                .setFeaturesGPU(featureDiv)
//                .setFeaturesSensors(featureDiv)
//                .setFeaturesMessaging(featureDiv)
//                .setFeaturesBrowser(featureDiv)
//                .setFeaturesRadio(featureDiv)
//                .setFeaturesGPS(featureDiv)
//                .setFeaturesJAVA(featureDiv)
//                .setFeaturesColors(featureDiv)
//                .setFeaturesOther(featureDiv)
//                .setBatteryCommon(featureDiv)
//                .setBatteryStandBy(featureDiv)
//                .setBatteryTalkTime(featureDiv);
    }

    public Feature set2G(String a2G) {
        this.a2G = a2G;
        return this;
    }

    public Feature set3G(String a3G) {
        this.a3G = a3G;
        return this;
    }

    public Feature set4G(String a4G) {
        this.a4G = a4G;
        return this;
    }

    public Feature setSim(String sim) {
        this.sim = sim;
        return this;
    }

    public Feature setAnnounced(String announced) {
        this.announced = announced;
        return this;
    }

    public Feature setStatus(String status) {
        this.status = status;
        return this;
    }

    public Feature setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public Feature setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public Feature setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }

    public Feature setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public Feature setDisplayMultitouch(String displayMultitouch) {
        this.displayMultitouch = displayMultitouch;
        return this;
    }

    public Feature setDisplayProtection(String displayProtection) {
        this.displayProtection = displayProtection;
        return this;
    }

    public Feature setAlertTypes(String alertTypes) {
        this.alertTypes = alertTypes;
        return this;
    }

    public Feature setLoudspeaker(String loudspeaker) {
        this.loudspeaker = loudspeaker;
        return this;
    }

    public Feature setminiJack(String miniJack) {
        this.miniJack = miniJack;
        return this;
    }

    public Feature setMemoryCardSlot(String memoryCardSlot) {
        this.memoryCardSlot = memoryCardSlot;
        return this;
    }

    public Feature setMemoryInternal(String memoryInternal) {
        this.memoryInternal = memoryInternal;
        return this;
    }

    public Feature setDataGPRS(String dataGPRS) {
        this.dataGPRS = dataGPRS;
        return this;
    }

    public Feature setDataEDGE(String dataEDGE) {
        this.dataEDGE = dataEDGE;
        return this;
    }

    public Feature setDataSpeed(String dataSpeed) {
        this.dataSpeed = dataSpeed;
        return this;
    }

    public Feature setDataWLAN(String dataWLAN) {
        this.dataWLAN = dataWLAN;
        return this;
    }

    public Feature setDataBluetooth(String dataBluetooth) {
        this.dataBluetooth = dataBluetooth;
        return this;
    }

    public Feature setDataNFC(String dataNFC) {
        this.dataNFC = dataNFC;
        return this;
    }

    public Feature setDataUSB(String dataUSB) {
        this.dataUSB = dataUSB;
        return this;
    }

    public Feature setCameraPrimary(String cameraPrimary) {
        this.cameraPrimary = cameraPrimary;
        return this;
    }

    public Feature setCameraFeatures(String cameraFeatures) {
        this.cameraFeatures = cameraFeatures;
        return this;
    }

    public Feature setCameraVideo(String cameraVideo) {
        this.cameraVideo = cameraVideo;
        return this;
    }

    public Feature setCameraSecondary(String cameraSecondary) {
        this.cameraSecondary = cameraSecondary;
        return this;
    }

    public Feature setFeaturesOS(String featuresOS) {
        this.featuresOS = featuresOS;
        return this;
    }

    public Feature setFeaturesChipset(String featuresChipset) {
        this.featuresChipset = featuresChipset;
        return this;
    }

    public Feature setFeaturesCPU(String featuresCPU) {
        this.featuresCPU = featuresCPU;
        return this;
    }

    public Feature setFeaturesGPU(String featuresGPU) {
        this.featuresGPU = featuresGPU;
        return this;
    }

    public Feature setFeaturesSensors(String featuresSensors) {
        this.featuresSensors = featuresSensors;
        return this;
    }

    public Feature setFeaturesMessaging(String featuresMessaging) {
        this.featuresMessaging = featuresMessaging;
        return this;
    }

    public Feature setFeaturesBrowser(String featuresBrowser) {
        this.featuresBrowser = featuresBrowser;
        return this;
    }

    public Feature setFeaturesRadio(String featuresRadio) {
        this.featuresRadio = featuresRadio;
        return this;
    }


    public Feature setFeaturesGPS(String featuresGPS) {
        this.featuresGPS = featuresGPS;
        return this;
    }

    public Feature setFeaturesJAVA(String featuresJAVA) {
        this.featuresJAVA = featuresJAVA;
        return this;
    }

    public Feature setFeaturesColors(String featuresColors) {
        this.featuresColors = featuresColors;
        return this;
    }

    public Feature setFeaturesOther(String featuresOther) {
        this.featuresOther = featuresOther;
        return this;
    }

    public Feature setBatteryCommon(String batteryCommon) {
        this.batteryCommon = batteryCommon;
        return this;
    }

    public Feature setBatteryStandBy(String batteryStandBy) {
        this.batteryStandBy = batteryStandBy;
        return this;
    }

    public Feature setBatteryTalkTime(String batteryTalkTime) {
        this.batteryTalkTime = batteryTalkTime;
        return this;
    }
}

