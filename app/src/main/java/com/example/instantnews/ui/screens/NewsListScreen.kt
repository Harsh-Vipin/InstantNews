package com.example.instantnews.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.instantnews.viewmodel.NewsListViewModel

@Composable
fun NewsListScreen() {
val viewModel:NewsListViewModel=viewModel() //view model is instantiated
}