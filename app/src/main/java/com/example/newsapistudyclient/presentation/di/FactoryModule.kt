package com.example.newsapistudyclient.presentation.di

import android.app.Application
import com.example.newsapistudyclient.domain.usecase.GetNewsHeadlinesUseCase
import com.example.newsapistudyclient.domain.usecase.GetSearchedNewsUseCase
import com.example.newsapistudyclient.domain.usecase.SaveNewsUseCase
import com.example.newsapistudyclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase
    ):NewsViewModelFactory{
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase
        )
    }
}