package com.example.newsapistudyclient.data.model


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.io.Serializable
@Keep
data class Source(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    val name: String
): Serializable