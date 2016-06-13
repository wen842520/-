package com.example.administrator.myapplication;

import retrofit.Call;
import retrofit.http.GET;


/**
 * Created by Administrator on 2016/6/1.
 */
public interface ApiService {
    @GET("SDK/CarouselPicsForIndex/siteID/1")
    Call<Result> loadPeople();
}
