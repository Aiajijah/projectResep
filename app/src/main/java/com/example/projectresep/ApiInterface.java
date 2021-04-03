package com.example.projectresep;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("api/recipes/1")
    Call <Resep> ambilResep();

    @GET("api/recipe/{a}")
    Call<ObjekBesar> ambilObject(@Path("a")String nama);




}
