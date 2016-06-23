package com.iaitbbali.portalandroid;

import com.iaitbbali.portalandroid.model.JSONAPI.LoginCookie;
import com.iaitbbali.portalandroid.model.JSONAPI.Nonce;
import com.iaitbbali.portalandroid.model.JSONAPI.UserReg;
import com.iaitbbali.portalandroid.model.Post;
import com.iaitbbali.portalandroid.model.WordpressPosts;

import java.util.List;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Kadek_P on 5/12/2016.
 */
public interface WordpressAPI {
    @GET("/wp-json/wp/v2/posts")
    Call<List<Post>> loadPosts();


    @GET("/api/get_nonce?")
    Call<Nonce> getNonce(@Query("controller") String controller, @Query("method") String method);

    @GET("/api/user/register?insecure=cool")
    Call<UserReg> registerUser(@Query("username") String username,
                               @Query("email") String email,
                               @Query("nonce") String nonce,
                               @Query("display_name") String display_name,
                               @Query("user_pass") String user_pass);

    @GET("api/user/generate_auth_cookie?insecure=cool")
    Call<LoginCookie> generateAuthCookie(@Query("username") String username,
                               @Query("password") String password,
                               @Query("nonce") String nonce);
}
