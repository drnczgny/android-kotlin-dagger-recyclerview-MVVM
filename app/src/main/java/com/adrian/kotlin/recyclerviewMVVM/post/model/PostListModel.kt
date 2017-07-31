package com.adrian.kotlin.recyclerviewMVVM.post.model

import com.adrian.kotlin.recyclerviewMVVM.post.domain.PostItemViewModel

/**
 * Created by cadri on 2017. 07. 31..
 */

class PostListModel {

    fun testPostItems(): List<PostItemViewModel> {
        val postItemViewModel = PostItemViewModel("1", "title1")
        val postItemViewMode2 = PostItemViewModel("2", "title2")
        val list = listOf<PostItemViewModel>(postItemViewModel, postItemViewMode2)
        return list
    }

}