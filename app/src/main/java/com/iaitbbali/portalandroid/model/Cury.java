
package com.iaitbbali.portalandroid.model;

import java.util.HashMap;
import java.util.Map;
public class Cury {

    private String name;
    private String href;
    private Boolean templated;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The href
     */
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param href
     *     The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 
     * @return
     *     The templated
     */
    public Boolean getTemplated() {
        return templated;
    }

    /**
     * 
     * @param templated
     *     The templated
     */
    public void setTemplated(Boolean templated) {
        this.templated = templated;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
