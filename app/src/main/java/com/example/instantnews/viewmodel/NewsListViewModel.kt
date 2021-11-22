package com.example.instantnews.viewmodel

import androidx.lifecycle.ViewModel
import com.example.instantnews.repository.NewsRepository

class NewsListViewModel(private val repository: NewsRepository = NewsRepository()) : ViewModel() {  //repository is referenced

}