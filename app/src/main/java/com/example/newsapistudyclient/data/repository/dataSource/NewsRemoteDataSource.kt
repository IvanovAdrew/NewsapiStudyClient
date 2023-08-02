package com.example.newsapistudyclient.data.repository.dataSource.sd

import com.example.newsapistudyclient.data.model.APIResponce
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country: String, page: Int):Response<APIResponce>
    suspend fun getSearchedNews(country: String, searchQuery:String, page: Int):Response<APIResponce>
}