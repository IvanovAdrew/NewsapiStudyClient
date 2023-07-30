package com.example.newsapistudyclient.data.api

import com.example.newsapistudyclient.BuildConfig
import com.example.newsapistudyclient.data.model.APIResponce
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String = BuildConfig.API_KEY
    ): Response<APIResponce>
}