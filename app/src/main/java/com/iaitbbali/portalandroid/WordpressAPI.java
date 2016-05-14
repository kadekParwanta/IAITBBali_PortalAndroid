package com.iaitbbali.portalandroid;

import com.iaitbbali.portalandroid.model.Post;
import com.iaitbbali.portalandroid.model.WordpressPosts;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Kadek_P on 5/12/2016.
 */
public interface WordpressAPI {
    @GET("/wp-json/wp/v2/posts")
    Call<List<Post>> loadPosts();
}
