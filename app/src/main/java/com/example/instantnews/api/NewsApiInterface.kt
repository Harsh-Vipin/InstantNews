package com.example.instantnews.api

import com.example.instantnews.model.News
import retrofit2.Call
import retrofit2.http.GET

interface NewsApiInterface {
    @GET("top-headlines?country=us&category=business&apiKey=28d6dca075364c24ada6e256f96eb15e")
    fun getNewsResponse(): Call<News>
}