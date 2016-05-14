package com.iaitbbali.portalandroid;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.iaitbbali.portalandroid.model.WpFeaturedMediumItem.WPFeaturedMediaDetail;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Kadek_P on 5/14/2016.
 */
public class WpMediaDownloaderTask extends AsyncTask<String, Void, WPFeaturedMediaDetail> {

    private final ImageView imageViewReference;

    public WpMediaDownloaderTask(ImageView imageView) {
        imageViewReference = imageView;
    }

    @Override
    protected WPFeaturedMediaDetail doInBackground(String... params) {
        return downloadWPFeaturedMedia(params[0]);
    }

    @Override
    protected void onPostExecute(WPFeaturedMediaDetail wpFeaturedMediaDetail) {
        String url = wpFeaturedMediaDetail.getSourceUrl();
        new ImageDownloaderTask(imageViewReference).execute(url);
        super.onPostExecute(wpFeaturedMediaDetail);
    }

    private WPFeaturedMediaDetail downloadWPFeaturedMedia(String url) {
        HttpURLConnection urlConnection = null;
        try {
            URL uri = new URL(url);
            Log.i("WpMediaDownloaderTask", "downloading WPFeaturedMediaDetail from " + url);
            urlConnection = (HttpURLConnection) uri.openConnection();
            int statusCode = urlConnection.getResponseCode();
            if (statusCode != 200) {
                return null;
            }

            urlConnection.connect();
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) urlConnection.getContent()));
            JsonObject rootobj = root.getAsJsonObject();
            Gson gson = new Gson();
            WPFeaturedMediaDetail detail = gson.fromJson(rootobj, WPFeaturedMediaDetail.class);
            Log.i("WpMediaDownloaderTask", "WPFeaturedMediaDetail getSourceUrl " + detail.getSourceUrl());
            return detail;
        } catch (Exception e) {
            urlConnection.disconnect();
            Log.w("WpMediaDownloaderTask", "Error downloading WPFeaturedMediaDetail from " + url);
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        return null;
    }
}
