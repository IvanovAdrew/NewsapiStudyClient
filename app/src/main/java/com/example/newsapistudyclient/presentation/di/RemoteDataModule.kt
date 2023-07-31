package com.example.newsapistudyclient.presentation.di

import com.example.newsapistudyclient.data.api.NewsAPIService
import com.example.newsapistudyclient.data.repository.dataSource.sd.NewsRemoteDataSource
import com.example.newsapistudyclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService): NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }

}