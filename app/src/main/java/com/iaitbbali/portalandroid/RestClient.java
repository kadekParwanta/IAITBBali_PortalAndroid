package com.iaitbbali.portalandroid;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Kadek_P on 5/12/2016.
 */
public class RestClient {
    private WordpressAPI apiService;

    public RestClient(Context context)
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ia-itb-bali.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(WordpressAPI.class);
    }

    public WordpressAPI getApiService()
    {
        return apiService;
    }
}
