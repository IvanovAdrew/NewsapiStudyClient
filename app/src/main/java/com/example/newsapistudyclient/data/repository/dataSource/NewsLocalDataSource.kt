package com.example.newsapistudyclient.data.repository.dataSource

import com.example.newsapistudyclient.data.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {
    suspend fun saveArticletoDB(article: Article)
    fun getSavedArticles():Flow<List<Article>>
    suspend fun deleteArticleFromDB(article: Article)
}