package com.example.newsapistudyclient.data.repository.dataSource.sd

import com.example.newsapistudyclient.data.model.APIResponce
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines():Response<APIResponce>
}