package com.adrian.kotlin.recyclerviewMVVM.post

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.adrian.kotlin.R
import com.adrian.kotlin.databinding.ActivityPostListBinding
import com.adrian.kotlin.recyclerviewMVVM.post.domain.PostItemViewModel
import com.android.databinding.library.baseAdapters.BR


class PostListActivity : AppCompatActivity() {

    var postListViewModel = PostListViewModel(testItems())

    lateinit var binding: ActivityPostListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind()

        binding?.list?.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false))
    }

    fun bind() {
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        this.postListViewModel = if (postListViewModel == null) PostListViewModel(testItems()) else postListViewModel
        binding?.setVariable(getVariableId(), postListViewModel)
        // binding?.viewModel = postListViewModel
        binding?.executePendingBindings()
    }

    fun testItems(): List<PostItemViewModel> {
        val postItemViewModel1 = PostItemViewModel("1", "title1")
        val postItemViewModel2 = PostItemViewModel("2", "title2")
        return listOf<PostItemViewModel>(postItemViewModel1, postItemViewModel2)
    }

    fun getLayoutId(): Int {
        return R.layout.activity_post_list
    }

    fun getVariableId(): Int {
        return BR.viewModel
    }
}
