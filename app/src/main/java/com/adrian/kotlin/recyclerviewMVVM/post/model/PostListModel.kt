package com.adrian.kotlin.recyclerviewMVVM.post.model

import com.adrian.kotlin.recyclerviewMVVM.post.domain.PostItemViewModel
import javax.inject.Inject

/**
 * Created by cadri on 2017. 07. 31..
 */

class PostListModel @Inject constructor() {

    fun testPostItems(): List<PostItemViewModel> {
        val postItemViewModel = PostItemViewModel("1", "title1")
        val postItemViewMode2 = PostItemViewModel("2", "title2")
        val postItemViewMode3 = PostItemViewModel("3", "title3")
        val list = listOf<PostItemViewModel>(postItemViewModel, postItemViewMode2, postItemViewMode3)
        return list
    }

}