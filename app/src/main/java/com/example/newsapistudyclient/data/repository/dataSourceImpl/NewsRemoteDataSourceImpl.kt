package com.example.newsapistudyclient.data.repository.dataSourceImpl

import com.example.newsapistudyclient.data.api.NewsAPIService
import com.example.newsapistudyclient.data.model.APIResponce
import com.example.newsapistudyclient.data.repository.dataSource.sd.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
): NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponce> {
        return newsAPIService.getTopHeadlines(country,page)
    }
}