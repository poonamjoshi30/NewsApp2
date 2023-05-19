
package com.example.newsapp.network.repository


import com.example.newsapp.data.model.NewsResponse
import com.example.newsapp.network.api.ApiHelper
import com.example.newsapp.state.NetworkState
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val remoteDataSource: ApiHelper
) : INewsRepository {

    override suspend fun getNews(
        countryCode: String,
        pageNumber: Int
    ): NetworkState<NewsResponse> {
        return try {
            val response = remoteDataSource.getNews(countryCode, pageNumber)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                NetworkState.Success(result)
            } else {
                NetworkState.Error("An error occurred")
            }
        } catch (e: Exception) {
            NetworkState.Error("Error occurred ${e.localizedMessage}")
        }
    }



}