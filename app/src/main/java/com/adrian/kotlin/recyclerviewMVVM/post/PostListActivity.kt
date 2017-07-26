package com.adrian.kotlin.recyclerviewMVVM.post

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.adrian.kotlin.R


class PostListActivity : AppCompatActivity() {

    var postListViewModel = PostListViewModel(testItems())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list)
    }

    fun testItems(): List<PostItemViewModel> {
        val postItemViewModel1 = PostItemViewModel("1", "title1")
        val postItemViewModel2 = PostItemViewModel("2", "title2")
        return listOf<PostItemViewModel>(postItemViewModel1, postItemViewModel2)
    }
}
