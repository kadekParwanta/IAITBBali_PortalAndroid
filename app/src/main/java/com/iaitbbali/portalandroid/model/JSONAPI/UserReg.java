package com.iaitbbali.portalandroid.model.JSONAPI;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kadek_P on 6/23/2016.
 */
public class UserReg {
    private String status;
    private String cookie;
    @SerializedName("user_id")
    private String user_id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
