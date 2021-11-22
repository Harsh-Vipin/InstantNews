package com.example.instantnews.api

import com.example.instantnews.model.News
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsWebService {
    private lateinit var api: NewsApiInterface
    val BASE_URL = "https://newsapi.org/v2/"

    init {

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        api = retrofit.create(NewsApiInterface::class.java)
    }

    fun getNewsResponse(): Call<News> {
        return api.getNewsResponse()
    }
}