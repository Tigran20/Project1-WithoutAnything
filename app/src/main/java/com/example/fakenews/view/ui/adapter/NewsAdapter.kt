package com.example.fakenews.view.ui.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fakenews.R
import com.example.fakenews.model.News
import com.example.fakenews.utils.inflater
import kotlinx.android.synthetic.main.item_list_news.view.*

class NewsAdapter(private val news: List<News>) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(parent.inflater(R.layout.item_list_news))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(news[position])
    override fun getItemCount() = news.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: News) {
            itemView.iv_news_image.setImageResource(R.drawable.ic_launcher_background)
            itemView.tv_news_title.text = data.titleName
            itemView.tv_news_description.text = data.textDescription
        }
    }
}