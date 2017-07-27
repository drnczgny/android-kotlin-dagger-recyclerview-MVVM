package com.adrian.kotlin.recyclerviewMVVM.recyclerview

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView

/**
 * Created by cadri on 2017. 07. 26..
 */

@BindingAdapter(value = *arrayOf("listItems", "listItemLayout", "variableId"), requireAll = true)
fun  setupRecyclerViewAdapter(recyclerView: RecyclerView, items: List<ListItemViewModel>, itemLayout: Int, variableId: Int) {
    val recyclerViewAdapter = getAdapter(recyclerView)
    recyclerViewAdapter.items = items
    recyclerViewAdapter.itemLayout = itemLayout
    recyclerViewAdapter.variableId = variableId
}

fun getAdapter(recyclerView: RecyclerView): RecyclerViewAdapter<ListItemViewModel> {
    var adapter = recyclerView.adapter
    if (adapter == null) {
        adapter = RecyclerViewAdapter<ListItemViewModel>()
        recyclerView.adapter = adapter
    }
    return adapter as RecyclerViewAdapter<ListItemViewModel>
}

//class CustomBindingAttributes {
//
//    companion object Factory {
//
//        private val TAG = CustomBindingAttributes::class.java.simpleName
//
//        @BindingAdapter(value = *arrayOf("listItems", "listItemLayout", "variableId"), requireAll = true)
//        fun  setupRecyclerViewAdapter(recyclerView: RecyclerView, items: List<ListItemViewModel>, itemLayout: Int, variableId: Int) {
//            val recyclerViewAdapter = getAdapter(recyclerView)
//            recyclerViewAdapter.items = items
//            recyclerViewAdapter.itemLayout = itemLayout
//            recyclerViewAdapter.variableId = variableId
//        }
//
//        fun getAdapter(recyclerView: RecyclerView): RecyclerViewAdapter<ListItemViewModel> {
//            var adapter = recyclerView.adapter
//            if (adapter == null) {
//                adapter = RecyclerViewAdapter<ListItemViewModel>()
//                recyclerView.adapter = adapter
//            }
//            return adapter as RecyclerViewAdapter<ListItemViewModel>
//        }
//    }
//}
