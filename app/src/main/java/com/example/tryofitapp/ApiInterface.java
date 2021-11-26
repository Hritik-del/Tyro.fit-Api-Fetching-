package com.example.tryofitapp;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    //@GET("users")
    @GET("user/workout/all?category_id=14")
    Call<Pojo>getData();
}
