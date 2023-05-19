
package com.example.newsapp.di

import com.example.newsapp.network.repository.INewsRepository
import com.example.newsapp.network.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @Singleton
    @Provides
    fun provideINewsRepository(repository: NewsRepository): INewsRepository = repository
}