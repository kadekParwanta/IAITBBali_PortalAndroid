package com.iaitbbali.portalandroid.model.JSONAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kadek_P on 6/23/2016.
 */
public class CurrentUserInfo {
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("user")
    @Expose
    private User user;

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }
}
