
package com.iaitbbali.portalandroid.model.WpFeaturedMediumItem;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ImageMeta {

    private String aperture;
    private String credit;
    private String camera;
    private String caption;
    @SerializedName("created_timestamp")
    private String createdTimestamp;
    private String copyright;
    @SerializedName("focal_length")
    private String focalLength;
    private String iso;
    @SerializedName("shutter_speed")
    private String shutterSpeed;
    private String title;
    private String orientation;
    private List<Object> keywords = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The aperture
     */
    public String getAperture() {
        return aperture;
    }

    /**
     * 
     * @param aperture
     *     The aperture
     */
    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    /**
     * 
     * @return
     *     The credit
     */
    public String getCredit() {
        return credit;
    }

    /**
     * 
     * @param credit
     *     The credit
     */
    public void setCredit(String credit) {
        this.credit = credit;
    }

    /**
     * 
     * @return
     *     The camera
     */
    public String getCamera() {
        return camera;
    }

    /**
     * 
     * @param camera
     *     The camera
     */
    public void setCamera(String camera) {
        this.camera = camera;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The createdTimestamp
     */
    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * 
     * @param createdTimestamp
     *     The created_timestamp
     */
    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * 
     * @return
     *     The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * 
     * @param copyright
     *     The copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * 
     * @return
     *     The focalLength
     */
    public String getFocalLength() {
        return focalLength;
    }

    /**
     * 
     * @param focalLength
     *     The focal_length
     */
    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    /**
     * 
     * @return
     *     The iso
     */
    public String getIso() {
        return iso;
    }

    /**
     * 
     * @param iso
     *     The iso
     */
    public void setIso(String iso) {
        this.iso = iso;
    }

    /**
     * 
     * @return
     *     The shutterSpeed
     */
    public String getShutterSpeed() {
        return shutterSpeed;
    }

    /**
     * 
     * @param shutterSpeed
     *     The shutter_speed
     */
    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The orientation
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * 
     * @param orientation
     *     The orientation
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * 
     * @return
     *     The keywords
     */
    public List<Object> getKeywords() {
        return keywords;
    }

    /**
     * 
     * @param keywords
     *     The keywords
     */
    public void setKeywords(List<Object> keywords) {
        this.keywords = keywords;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
