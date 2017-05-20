package com.example.admin.amazingfact;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 15-07-2016.
 */
public class Client {
    private static FactApiInterface service;
    public static FactApiInterface getService(){
        if(service==null){
            OkHttpClient client = new OkHttpClient.Builder().build();

            Retrofit r = new Retrofit.Builder().baseUrl("https://numbersapi.p.mashape.com").
                    addConverterFactory(GsonConverterFactory.create(
                            new GsonBuilder().create())).client(client)
                    .build();
            service = r.create(FactApiInterface.class);
        }
        return service;
    }
}
