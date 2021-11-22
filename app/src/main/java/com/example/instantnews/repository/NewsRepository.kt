package com.example.instantnews.repository

import com.example.instantnews.api.NewsWebService
import com.example.instantnews.model.Article
import com.example.instantnews.model.News
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository(private val webService: NewsWebService = NewsWebService()) {
    fun getNews(successCallback: (response: News?) -> Unit) {     //function to get response of type News
        return webService.getNewsResponse().enqueue(object : Callback<News> {

            override fun onResponse(call: Call<News>, response: Response<News>) {
                if (response.isSuccessful)
                successCallback(response.body())
            }

            override fun onFailure(call: Call<News>, t: Throwable) {

            }

        })
    }
}