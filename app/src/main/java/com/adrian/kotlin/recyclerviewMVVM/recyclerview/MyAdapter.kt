package com.adrian.kotlin.recyclerviewMVVM.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adrian.kotlin.R
import com.adrian.kotlin.recyclerviewMVVM.domain.ListItem
import kotlinx.android.synthetic.main.list_item_layout.view.*

/**
 * Created by cadri on 2017. 07. 25..
 */

class MyAdapter(var context: Context, var lists: ArrayList<ListItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder? {
        var v = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as ViewHolder).bindData(lists[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindData(item: ListItem) {
            itemView.itemId.text = item.itemId.toString()
            itemView.title.text = item.title
            itemView.url.text = item.url
        }
    }
}