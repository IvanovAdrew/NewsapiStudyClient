package com.example.newsapistudyclient.data.repository.dataSourceImpl

import com.example.newsapistudyclient.data.db.ArticleDAO
import com.example.newsapistudyclient.data.model.Article
import com.example.newsapistudyclient.data.repository.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(private val articleDAO: ArticleDAO) : NewsLocalDataSource {
    override suspend fun saveArticletoDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDAO.getAllArticles()
    }

    override suspend fun deleteArticleFromDB(article: Article) {
        articleDAO.deleteAricleFromDB(article)
    }
}