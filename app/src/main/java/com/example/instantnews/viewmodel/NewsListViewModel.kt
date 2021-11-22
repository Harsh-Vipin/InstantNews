package com.example.instantnews.viewmodel

import androidx.lifecycle.ViewModel
import com.example.instantnews.model.Article
import com.example.instantnews.model.News
import com.example.instantnews.repository.NewsRepository

class NewsListViewModel(private val repository: NewsRepository = NewsRepository()) : ViewModel() {  //repository is referenced

    fun getArticles(successCallback: (response: News?) -> Unit){    //fun to get list of articles from News returned by getNews from repository
        return  repository.getNews{ response->
            successCallback(response)
        }
    }
}