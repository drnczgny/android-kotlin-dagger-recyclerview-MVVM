package com.adrian.kotlin.recyclerviewMVVM.post

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.adrian.kotlin.BR
import com.adrian.kotlin.R


/**
 * Created by cadri on 2017. 07. 26..
 */

class PostListViewModel(var _posts: List<PostItemViewModel>) : BaseObservable() {

    var posts: List<PostItemViewModel>
        @Bindable get() {
            return _posts
        }
        set(posts) {
            _posts = posts
            notifyPropertyChanged(BR.posts)
        }

    init {
        posts = testPostItems()
    }

    fun testPostItems(): List<PostItemViewModel> {
        val postItemViewModel = PostItemViewModel("1", "title1")
        val postItemViewMode2 = PostItemViewModel("2", "title2")
        val list = listOf<PostItemViewModel>(postItemViewModel, postItemViewMode2)
        return list
    }

    @Bindable
    fun getItemLayoutId() = R.layout.post_item_layout

    @Bindable
    fun getVariableId() = BR.viewModel
}