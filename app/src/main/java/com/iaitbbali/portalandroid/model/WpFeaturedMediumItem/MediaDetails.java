
package com.iaitbbali.portalandroid.model.WpFeaturedMediumItem;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
public class MediaDetails {

    private Integer width;
    private Integer height;
    private String file;
    private Sizes sizes;
    @SerializedName("image_meta")
    private ImageMeta imageMeta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The file
     */
    public String getFile() {
        return file;
    }

    /**
     * 
     * @param file
     *     The file
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * 
     * @return
     *     The sizes
     */
    public Sizes getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes
     *     The sizes
     */
    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    /**
     * 
     * @return
     *     The imageMeta
     */
    public ImageMeta getImageMeta() {
        return imageMeta;
    }

    /**
     * 
     * @param imageMeta
     *     The image_meta
     */
    public void setImageMeta(ImageMeta imageMeta) {
        this.imageMeta = imageMeta;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
