package com.example.newsapistudyclient.domain.usecase

import com.example.newsapistudyclient.data.model.Article
import com.example.newsapistudyclient.domain.repository.NewsRepository

class SaveNewsUseCase (private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}