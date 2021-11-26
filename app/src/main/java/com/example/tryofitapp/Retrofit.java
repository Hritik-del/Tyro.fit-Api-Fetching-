package com.example.tryofitapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {

    private static String baseurl = "http://3.108.207.62:3003/api/";
    //private static String baseurl = "https://reqres.in/api/";

    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    private  static retrofit2.Retrofit retrofit;

    public static retrofit2.Retrofit getRetrofit()
    {
        if(retrofit == null) {

            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(baseurl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit;
    }
}
