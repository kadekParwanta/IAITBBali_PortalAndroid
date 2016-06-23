package com.iaitbbali.portalandroid.model.JSONAPI;

/**
 * Created by Kadek_P on 6/23/2016.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginCookie {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("cookie")
    @Expose
    private String cookie;
    @SerializedName("cookie_name")
    @Expose
    private String cookieName;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("error")
    private String error;

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
     * The cookie
     */
    public String getCookie() {
        return cookie;
    }

    /**
     *
     * @param cookie
     * The cookie
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    /**
     *
     * @return
     * The cookieName
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     *
     * @param cookieName
     * The cookie_name
     */
    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
