package com.example.admin.amazingfact;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Admin on 15-07-2016.
 */
public interface FactApiInterface {

    @Headers(value = "X-Mashape-Key:MoUeVreCuzmshawujZcnPYsEeUqFp1Bqw54jsnXcZwOnsrDj4a")
    @GET("/{month}/{day}/date")
    Call<FactInfo> getdate(@Path("month")int month, @Path("day")int day, @Query("json")boolean json);

    @Headers(value = "X-Mashape-Key:MoUeVreCuzmshawujZcnPYsEeUqFp1Bqw54jsnXcZwOnsrDj4a")
    @GET("/{number}/math")
    Call<FactInfo> getmath(@Path("number")int num, @Query("json")boolean json);

    @Headers(value = "X-Mashape-Key:MoUeVreCuzmshawujZcnPYsEeUqFp1Bqw54jsnXcZwOnsrDj4a")
    @GET("/random/{type}")
    Call<FactInfo> getrandom(@Path("type")String type, @Query("json")boolean json);

    @Headers(value = "X-Mashape-Key:MoUeVreCuzmshawujZcnPYsEeUqFp1Bqw54jsnXcZwOnsrDj4a")
    @GET("/{number}/trivia")
    Call<FactInfo> gettrivia(@Path("number")int num, @Query("json")boolean json);

    @Headers(value = "X-Mashape-Key:MoUeVreCuzmshawujZcnPYsEeUqFp1Bqw54jsnXcZwOnsrDj4a")
    @GET("/{year}/year")
    Call<FactInfo> getyear(@Path("year")int year,  @Query("json")boolean json);
}
