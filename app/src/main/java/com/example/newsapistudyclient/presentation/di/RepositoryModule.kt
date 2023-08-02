package com.example.newsapistudyclient.presentation.di

import com.example.newsapistudyclient.data.repository.NewsRepositoryImpl
import com.example.newsapistudyclient.data.repository.dataSource.NewsLocalDataSource
import com.example.newsapistudyclient.data.repository.dataSource.sd.NewsRemoteDataSource
import com.example.newsapistudyclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ):NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource,newsLocalDataSource)
    }
}