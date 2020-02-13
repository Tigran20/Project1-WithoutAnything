package com.example.fakenews.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fakenews.model.News

fun ViewGroup.inflater(layoutRes: Int): View = LayoutInflater.from(context).inflate(layoutRes, this, false)

fun fakeNews(): List<News> {
    val listOfNews = mutableListOf<News>()
    for(n in 1..30) {
        listOfNews.add(News(n, "Hi $n", "TextDesc"))
    }

    return listOfNews
}
