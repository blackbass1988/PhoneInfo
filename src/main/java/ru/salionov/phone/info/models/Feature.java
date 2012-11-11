package ru.salionov.phone.info.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Feature {

    private Mark mark;

    private String info2G;
    private String info3G;
    private String info4G;
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

    private List<String> alternativeNames;

    public Feature(Mark mark) {
        this.setMark(mark);
        this.setAlternativeNames(new ArrayList<String>());
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public String getInfo2G() {
        return info2G;
    }

    public void setInfo2G(String info2G) {
        this.info2G = info2G;
    }

    public String getInfo3G() {
        return info3G;
    }

    public void setInfo3G(String info3G) {
        this.info3G = info3G;
    }

    public String getInfo4G() {
        return info4G;
    }

    public void setInfo4G(String info4G) {
        this.info4G = info4G;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getAnnounced() {
        return announced;
    }

    public void setAnnounced(String announced) {
        this.announced = announced;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDisplayMultitouch() {
        return displayMultitouch;
    }

    public void setDisplayMultitouch(String displayMultitouch) {
        this.displayMultitouch = displayMultitouch;
    }

    public String getDisplayProtection() {
        return displayProtection;
    }

    public void setDisplayProtection(String displayProtection) {
        this.displayProtection = displayProtection;
    }

    public String getAlertTypes() {
        return alertTypes;
    }

    public void setAlertTypes(String alertTypes) {
        this.alertTypes = alertTypes;
    }

    public String getLoudspeaker() {
        return loudspeaker;
    }

    public void setLoudspeaker(String loudspeaker) {
        this.loudspeaker = loudspeaker;
    }

    public String getMiniJack() {
        return miniJack;
    }

    public void setMiniJack(String miniJack) {
        this.miniJack = miniJack;
    }

    public String getMemoryInternal() {
        return memoryInternal;
    }

    public void setMemoryInternal(String memoryInternal) {
        this.memoryInternal = memoryInternal;
    }

    public String getDataGPRS() {
        return dataGPRS;
    }

    public void setDataGPRS(String dataGPRS) {
        this.dataGPRS = dataGPRS;
    }

    public String getDataEDGE() {
        return dataEDGE;
    }

    public void setDataEDGE(String dataEDGE) {
        this.dataEDGE = dataEDGE;
    }

    public String getDataSpeed() {
        return dataSpeed;
    }

    public void setDataSpeed(String dataSpeed) {
        this.dataSpeed = dataSpeed;
    }

    public String getDataWLAN() {
        return dataWLAN;
    }

    public void setDataWLAN(String dataWLAN) {
        this.dataWLAN = dataWLAN;
    }

    public String getDataBluetooth() {
        return dataBluetooth;
    }

    public void setDataBluetooth(String dataBluetooth) {
        this.dataBluetooth = dataBluetooth;
    }

    public String getDataNFC() {
        return dataNFC;
    }

    public void setDataNFC(String dataNFC) {
        this.dataNFC = dataNFC;
    }

    public String getDataUSB() {
        return dataUSB;
    }

    public void setDataUSB(String dataUSB) {
        this.dataUSB = dataUSB;
    }

    public String getCameraPrimary() {
        return cameraPrimary;
    }

    public void setCameraPrimary(String cameraPrimary) {
        this.cameraPrimary = cameraPrimary;
    }

    public String getCameraFeatures() {
        return cameraFeatures;
    }

    public void setCameraFeatures(String cameraFeatures) {
        this.cameraFeatures = cameraFeatures;
    }

    public String getCameraVideo() {
        return cameraVideo;
    }

    public void setCameraVideo(String cameraVideo) {
        this.cameraVideo = cameraVideo;
    }

    public String getCameraSecondary() {
        return cameraSecondary;
    }

    public void setCameraSecondary(String cameraSecondary) {
        this.cameraSecondary = cameraSecondary;
    }

    public String getFeaturesOS() {
        return featuresOS;
    }

    public void setFeaturesOS(String featuresOS) {
        this.featuresOS = featuresOS;
    }

    public String getFeaturesChipset() {
        return featuresChipset;
    }

    public void setFeaturesChipset(String featuresChipset) {
        this.featuresChipset = featuresChipset;
    }

    public String getFeaturesCPU() {
        return featuresCPU;
    }

    public void setFeaturesCPU(String featuresCPU) {
        this.featuresCPU = featuresCPU;
    }

    public String getFeaturesGPU() {
        return featuresGPU;
    }

    public void setFeaturesGPU(String featuresGPU) {
        this.featuresGPU = featuresGPU;
    }

    public String getFeaturesSensors() {
        return featuresSensors;
    }

    public void setFeaturesSensors(String featuresSensors) {
        this.featuresSensors = featuresSensors;
    }

    public String getFeaturesMessaging() {
        return featuresMessaging;
    }

    public void setFeaturesMessaging(String featuresMessaging) {
        this.featuresMessaging = featuresMessaging;
    }

    public String getFeaturesBrowser() {
        return featuresBrowser;
    }

    public void setFeaturesBrowser(String featuresBrowser) {
        this.featuresBrowser = featuresBrowser;
    }

    public String getFeaturesRadio() {
        return featuresRadio;
    }

    public void setFeaturesRadio(String featuresRadio) {
        this.featuresRadio = featuresRadio;
    }

    public String getFeaturesGPS() {
        return featuresGPS;
    }

    public void setFeaturesGPS(String featuresGPS) {
        this.featuresGPS = featuresGPS;
    }

    public String getFeaturesJAVA() {
        return featuresJAVA;
    }

    public void setFeaturesJAVA(String featuresJAVA) {
        this.featuresJAVA = featuresJAVA;
    }

    public String getFeaturesColors() {
        return featuresColors;
    }

    public void setFeaturesColors(String featuresColors) {
        this.featuresColors = featuresColors;
    }

    public String getFeaturesOther() {
        return featuresOther;
    }

    public void setFeaturesOther(String featuresOther) {
        this.featuresOther = featuresOther;
    }

    public String getBatteryCommon() {
        return batteryCommon;
    }

    public void setBatteryCommon(String batteryCommon) {
        this.batteryCommon = batteryCommon;
    }

    public String getBatteryStandBy() {
        return batteryStandBy;
    }

    public void setBatteryStandBy(String batteryStandBy) {
        this.batteryStandBy = batteryStandBy;
    }

    public String getBatteryTalkTime() {
        return batteryTalkTime;
    }

    public void setBatteryTalkTime(String batteryTalkTime) {
        this.batteryTalkTime = batteryTalkTime;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getMemoryCardSlot() {
        return memoryCardSlot;
    }

    public void setMemoryCardSlot(String memoryCardSlot) {
        this.memoryCardSlot = memoryCardSlot;
    }

    public List<String> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(List<String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public void appendAlternativeNames(String aName) {
        this.alternativeNames.add(aName);
    }

    public String toString() {
        return String.format("Feature{mark: \"%s\", altNames: \"%s\", info2G: \"%s\", info3G: \"%s\", " +
                                     "info4G: \"%s\", sim: \"%s\", announced: \"%s\", status: \"%s\", " +
                                     "dimensions: \"%s\", displayMultitouch: \"%s\", displayProtection: \"%s\"," +
                                     "alertTypes: \"%s\", loudspeaker: \"%s\", miniJack: \"%s\", " +
                                     "memoryInternal: \"%s\", dataGPRS: \"%s\", dataEDGE: \"%s\", dataSpeed: \"%s\"," +
                                     "dataWLAN: \"%s\", dataBluetooth: \"%s\", dataNFC: \"%s\", dataUSB: \"%s\"," +
                                     "cameraPrimary: \"%s\", cameraFeatures: \"%s\", cameraVideo: \"%s\", " +
                                     "cameraSecondary: \"%s\", featuresOS: \"%s\", featuresChipset: \"%s\"," +
                                     "featuresCPU: \"%s\", featuresGPU: \"%s\", featuresSensors: \"%s\", " +
                                     "featuresMessaging: \"%s\", featuresBrowser: \"%s\", featuresRadio: \"%s\"," +
                                     "featuresGPS: \"%s\", featuresJAVA: \"%s\", featuresColors: \"%s\", " +
                                     "featuresOther: \"%s\", batteryCommon: \"%s\", batteryStandBy: \"%s\", " +
                                     "batteryTalkTime: \"%s\", weight: \"%s\", displayType: \"%s\", " +
                                     "displaySize: \"%s\", memoryCardSlot: \"%s\"}",
                             mark.getName(), alternativeNames.toString(), info2G, info3G, info4G, sim, announced,
                             status, dimensions, displayMultitouch, displayProtection, alertTypes, loudspeaker,
                             miniJack, memoryInternal, dataGPRS, dataEDGE, dataSpeed, dataWLAN, dataBluetooth,
                             dataNFC, dataUSB, cameraPrimary, cameraFeatures, cameraVideo, cameraSecondary,
                             featuresOS, featuresChipset, featuresCPU, featuresGPU, featuresSensors,
                             featuresMessaging, featuresBrowser, featuresRadio, featuresGPS, featuresJAVA,
                             featuresColors, featuresOther, batteryCommon, batteryStandBy, batteryTalkTime,
                             weight, displayType, displaySize, memoryCardSlot);
    }
}

