package com.example.workindia;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://run.mocky.io/v3/";

    @GET("b6a30bb0-140f-4966-8608-1dc35fa1fadc")
    Call<List<Item>> getItems();
}
