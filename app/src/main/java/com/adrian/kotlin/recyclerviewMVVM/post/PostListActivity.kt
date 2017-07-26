package com.adrian.kotlin.recyclerviewMVVM.post

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.kotlin.R
import com.adrian.kotlin.databinding.ActivityPostListBinding
import com.android.databinding.library.baseAdapters.BR


class PostListActivity : AppCompatActivity() {

    var postListViewModel = PostListViewModel(testItems())


    private var binding: ActivityPostListBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_post_list)
        bind()

    }

    fun testItems(): List<PostItemViewModel> {
        val postItemViewModel1 = PostItemViewModel("1", "title1")
        val postItemViewModel2 = PostItemViewModel("2", "title2")
        return listOf<PostItemViewModel>(postItemViewModel1, postItemViewModel2)
    }

    private fun bind() {
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        this.postListViewModel = if (postListViewModel == null) PostListViewModel(testItems()) else postListViewModel
//        binding?.setVariable(getVariableId(), postListViewModel)
        binding?.viewModel = postListViewModel
        binding?.executePendingBindings()
    }

    fun getLayoutId(): Int {
        return R.layout.activity_post_list
    }

    fun getVariableId(): Int {
        return BR.viewModel
    }
}
