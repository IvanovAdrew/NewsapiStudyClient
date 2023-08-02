package com.example.newsapistudyclient.data.repository.dataSource

import com.example.newsapistudyclient.data.model.Article

interface NewsLocalDataSource {
    suspend fun saveArticletoDB(article: Article)
}