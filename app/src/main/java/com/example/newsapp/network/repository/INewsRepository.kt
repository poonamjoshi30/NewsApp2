package com.example.newsapp.network.repository

import com.example.newsapp.data.model.NewsResponse
import com.example.newsapp.state.NetworkState

interface INewsRepository {
    suspend fun getNews(countryCode: String, pageNumber: Int): NetworkState<NewsResponse>
}
