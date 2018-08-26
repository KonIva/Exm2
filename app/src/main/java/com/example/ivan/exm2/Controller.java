package com.example.ivan.exm2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller {
    static final String BASE_URL = "http://www.murzinma.ru/";

    public static Exm2 getApi() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        Exm2 murzinmaApi = retrofit.create(Exm2.class);
        return murzinmaApi;
}}
