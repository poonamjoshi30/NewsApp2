
package com.example.newsapp.network.api

import com.example.newsapp.data.model.NewsResponse
import retrofit2.Response

interface ApiHelper {
    suspend fun getNews(countryCode: String, pageNumber: Int): Response<NewsResponse>
}