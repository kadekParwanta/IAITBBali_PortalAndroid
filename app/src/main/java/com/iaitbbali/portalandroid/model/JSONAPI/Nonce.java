package com.iaitbbali.portalandroid.model.JSONAPI;

/**
 * Created by Kadek_P on 6/23/2016.
 */
public class Nonce {
    private String status;
    private String controller;
    private String method;
    private String nonce;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }
}
