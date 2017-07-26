package com.adrian.kotlin.recyclerviewMVVM.recyclerview

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by cadri on 2017. 07. 26..
 */

class RecyclerViewAdapter<T : ListItemViewModel> : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items: List<T>
        get() = items
        set(value) {
            items = value
            notifyDataSetChanged()
        }

    var variableId: Int
        get() = variableId
        set(value) {
            variableId = value
        }

    var itemLayout: Int
        get() = itemLayout
        set(value) {
            itemLayout = value
        }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.getContext())
        val dataBinding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, itemLayout, parent, false)
        return BindingViewHolder<T>(dataBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as BindingViewHolder<T>
        val itemViewModel = items[position]
        holder.bind(itemViewModel, variableId)
    }

    inner class BindingViewHolder<T : ListItemViewModel>(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listItemViewModel: T, variableId: Int) {
            binding.setVariable(variableId, listItemViewModel)
            binding.executePendingBindings()
        }
    }

}