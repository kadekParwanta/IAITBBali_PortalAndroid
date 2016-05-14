
package com.iaitbbali.portalandroid.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Links {

    private List<Object> self = new ArrayList<Object>();
    private List<Object> collection = new ArrayList<Object>();
    private List<Object> about = new ArrayList<Object>();
    private List<Object> author = new ArrayList<Object>();
    private List<Object> replies = new ArrayList<Object>();
    @SerializedName("version-history")
    private List<Object> versionHistory = new ArrayList<Object>();
    @SerializedName("wp:featuredmedia")
    private List<WpFeaturedmedium> wpFeaturedmedia = new ArrayList<WpFeaturedmedium>();
    @SerializedName("wp:attachment")
    private List<WpAttachment> wpAttachment = new ArrayList<WpAttachment>();
    @SerializedName("wp:term")
    private List<WpTerm> wpTerm = new ArrayList<WpTerm>();
    private List<Cury> curies = new ArrayList<Cury>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The self
     */
    public List<Object> getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(List<Object> self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The collection
     */
    public List<Object> getCollection() {
        return collection;
    }

    /**
     * 
     * @param collection
     *     The collection
     */
    public void setCollection(List<Object> collection) {
        this.collection = collection;
    }

    /**
     * 
     * @return
     *     The about
     */
    public List<Object> getAbout() {
        return about;
    }

    /**
     * 
     * @param about
     *     The about
     */
    public void setAbout(List<Object> about) {
        this.about = about;
    }

    /**
     * 
     * @return
     *     The author
     */
    public List<Object> getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(List<Object> author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The replies
     */
    public List<Object> getReplies() {
        return replies;
    }

    /**
     * 
     * @param replies
     *     The replies
     */
    public void setReplies(List<Object> replies) {
        this.replies = replies;
    }

    /**
     * 
     * @return
     *     The versionHistory
     */
    public List<Object> getVersionHistory() {
        return versionHistory;
    }

    /**
     * 
     * @param versionHistory
     *     The version-history
     */
    public void setVersionHistory(List<Object> versionHistory) {
        this.versionHistory = versionHistory;
    }

    /**
     * 
     * @return
     *     The wpFeaturedmedia
     */
    public List<WpFeaturedmedium> getWpFeaturedmedia() {
        return wpFeaturedmedia;
    }

    /**
     * 
     * @param wpFeaturedmedia
     *     The wp:featuredmedia
     */
    public void setWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
        this.wpFeaturedmedia = wpFeaturedmedia;
    }

    /**
     * 
     * @return
     *     The wpAttachment
     */
    public List<WpAttachment> getWpAttachment() {
        return wpAttachment;
    }

    /**
     * 
     * @param wpAttachment
     *     The wp:attachment
     */
    public void setWpAttachment(List<WpAttachment> wpAttachment) {
        this.wpAttachment = wpAttachment;
    }

    /**
     * 
     * @return
     *     The wpTerm
     */
    public List<WpTerm> getWpTerm() {
        return wpTerm;
    }

    /**
     * 
     * @param wpTerm
     *     The wp:term
     */
    public void setWpTerm(List<WpTerm> wpTerm) {
        this.wpTerm = wpTerm;
    }

    /**
     * 
     * @return
     *     The curies
     */
    public List<Cury> getCuries() {
        return curies;
    }

    /**
     * 
     * @param curies
     *     The curies
     */
    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
