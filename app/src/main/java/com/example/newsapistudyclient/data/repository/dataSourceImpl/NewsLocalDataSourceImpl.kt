package com.example.newsapistudyclient.data.repository.dataSourceImpl

import com.example.newsapistudyclient.data.db.ArticleDAO
import com.example.newsapistudyclient.data.model.Article
import com.example.newsapistudyclient.data.repository.dataSource.NewsLocalDataSource

class NewsLocalDataSourceImpl(private val articleDAO: ArticleDAO) : NewsLocalDataSource {
    override suspend fun saveArticletoDB(article: Article) {
        articleDAO.insert(article)
    }
}