package com.example.newsapistudyclient.data.model


import com.google.gson.annotations.SerializedName

data class APIResponce(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)