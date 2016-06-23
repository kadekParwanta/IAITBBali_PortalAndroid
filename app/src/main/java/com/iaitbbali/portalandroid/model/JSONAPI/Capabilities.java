package com.iaitbbali.portalandroid.model.JSONAPI;

/**
 * Created by Kadek_P on 6/23/2016.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Capabilities {

    @SerializedName("subscriber")
    @Expose
    private Boolean subscriber;

    /**
     *
     * @return
     * The subscriber
     */
    public Boolean getSubscriber() {
        return subscriber;
    }

    /**
     *
     * @param subscriber
     * The subscriber
     */
    public void setSubscriber(Boolean subscriber) {
        this.subscriber = subscriber;
    }

}
