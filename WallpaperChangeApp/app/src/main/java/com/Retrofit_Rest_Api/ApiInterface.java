package com.Retrofit_Rest_Api;

import com.Retrofit_Rest_Api.Model.DataSet;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("/api")
    Call<DataSet> getPhotos(
            @Query("key") String apiKey,
            @Query("q") String query
    );





}
