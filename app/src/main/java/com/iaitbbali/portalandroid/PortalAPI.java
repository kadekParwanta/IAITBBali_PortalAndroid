package com.iaitbbali.portalandroid;

import com.iaitbbali.portalandroid.model.User;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Kadek_P on 5/20/2016.
 */
public interface PortalAPI {
    @POST("/Users")
    Call<User> createUser();
}
