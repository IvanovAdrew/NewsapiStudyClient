package com.example.newsapistudyclient.domain.usecase

import com.example.newsapistudyclient.data.model.APIResponce
import com.example.newsapistudyclient.data.util.Resource
import com.example.newsapistudyclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase (private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery:String):Resource<APIResponce>{
        return newsRepository.getSearchedNews(searchQuery)
    }
}