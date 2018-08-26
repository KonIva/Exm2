package com.example.ivan.exm2;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Exm2 {
    @GET("/api/dates.php")
    Call<List<Past>> getPast();

    @GET("/api/dates.php")
    Call<List<Future>> getFuture();




}
