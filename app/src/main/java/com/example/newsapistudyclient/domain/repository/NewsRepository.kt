package com.example.newsapistudyclient.domain.repository

import androidx.lifecycle.LiveData
import com.example.newsapistudyclient.data.model.APIResponce
import com.example.newsapistudyclient.data.model.Article
import com.example.newsapistudyclient.data.util.Resource
import kotlinx.coroutines.flow.Flow


interface NewsRepository {

    suspend fun getNewsHeadlines(country: String, page: Int):Resource<APIResponce>
    suspend fun getSearchedNews(searchQuery:String) : Resource<APIResponce>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>

}