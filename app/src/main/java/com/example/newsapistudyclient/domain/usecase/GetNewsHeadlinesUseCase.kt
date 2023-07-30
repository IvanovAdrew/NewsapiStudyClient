package com.example.newsapistudyclient.domain.usecase

import com.example.newsapistudyclient.data.model.APIResponce
import com.example.newsapistudyclient.data.util.Resource
import com.example.newsapistudyclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute():Resource<APIResponce>{
        return newsRepository.getNewsHeadlines()
    }
}