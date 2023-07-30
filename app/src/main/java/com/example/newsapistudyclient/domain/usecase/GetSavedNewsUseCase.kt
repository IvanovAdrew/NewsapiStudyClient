package com.example.newsapistudyclient.domain.usecase

import com.example.newsapistudyclient.data.model.Article
import com.example.newsapistudyclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute():Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}