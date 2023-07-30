package com.example.newsapistudyclient.data.repository

import com.example.newsapistudyclient.data.model.APIResponce
import com.example.newsapistudyclient.data.model.Article
import com.example.newsapistudyclient.data.repository.dataSource.sd.NewsRemoteDataSource
import com.example.newsapistudyclient.data.util.Resource
import com.example.newsapistudyclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource
):NewsRepository {
    override suspend fun getNewsHeadlines(): Resource<APIResponce> {
        return responseToResource(newsRemoteDataSource.getTopHeadlines())
    }

    private fun responseToResource(response: Response<APIResponce>): Resource<APIResponce>{
        if (response.isSuccessful){
            //берём боди резальта как резальт, и засовываем его через класс саксеса в ресурсе
            response.body()?.let { result->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<APIResponce> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}