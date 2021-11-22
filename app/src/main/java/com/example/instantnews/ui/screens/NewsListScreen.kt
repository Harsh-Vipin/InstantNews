package com.example.instantnews.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.instantnews.model.Article
import com.example.instantnews.viewmodel.NewsListViewModel

@Composable
fun NewsListScreen() {
    val viewModel: NewsListViewModel = viewModel() //view model is instantiated
    val rememberedArticle: MutableState<List<Article>> =
        remember { mutableStateOf(emptyList<Article>()) }
    viewModel.getArticles { response ->
        val articles = response?.articles
        rememberedArticle.value=articles.orEmpty()
    }
    LazyColumn(){
        items(rememberedArticle.value){ article ->
            Text(text = article.title)
        }
    }

}