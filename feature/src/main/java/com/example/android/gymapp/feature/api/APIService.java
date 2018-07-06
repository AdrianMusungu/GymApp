package com.example.android.gymapp.feature.api;

import com.example.android.gymapp.feature.models.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Adrian
 */

public interface APIService {
    //The register call
    @FormUrlEncoded
    @POST("register")
    Call<Result> createUser(
            @Field("fname") String fname,
            @Field("lname") String lname,
            @Field("email") String email,
            @Field("password") String password);
    //the login call
    @FormUrlEncoded
    @POST("login")
    Call<Result> userLogin(
            @Field("email") String email,
            @Field("password") String password
    );


}

