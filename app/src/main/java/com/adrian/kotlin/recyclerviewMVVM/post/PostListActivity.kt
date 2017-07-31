package com.adrian.kotlin.recyclerviewMVVM.post

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.adrian.kotlin.BR
import com.adrian.kotlin.R
import com.adrian.kotlin.databinding.ActivityPostListBinding
import com.adrian.kotlin.recyclerviewMVVM.post.di.PostListComponent
import com.adrian.kotlin.recyclerviewMVVM.post.domain.PostItemViewModel
import com.adrian.kotlin.recyclerviewMVVM.post.router.PostListRouter
import javax.inject.Inject


class PostListActivity : AppCompatActivity(), PostListRouter {


//    var postListViewModel: PostListViewModel = PostListViewModel(PostListModel())

    @Inject
    lateinit var postListViewModel: PostListViewModel

    lateinit var binding: ActivityPostListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        PostListComponent.Injector.buildComponent(this).inject(this)
        bind()

        binding?.list?.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false))
    }

    fun bind() {
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding?.viewModel = postListViewModel
//        binding?.setVariable(getVariableId(), postListViewModel)
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
