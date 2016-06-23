package com.iaitbbali.portalandroid;

import com.iaitbbali.portalandroid.model.JSONAPI.Nonce;
import com.iaitbbali.portalandroid.model.JSONAPI.UserReg;
import com.iaitbbali.portalandroid.model.User;

import java.util.Map;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Kadek_P on 5/20/2016.
 */
public interface PortalAPI {
    @POST("/Users")
    Call<User> createUser();
}
