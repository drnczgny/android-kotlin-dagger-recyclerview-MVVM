package com.adrian.kotlin.recyclerviewMVVM.post

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.adrian.kotlin.BR
import com.adrian.kotlin.R
import com.adrian.kotlin.recyclerviewMVVM.post.model.PostListModel
import javax.inject.Inject


/**
 * Created by cadri on 2017. 07. 26..
 */

class PostListViewModel @Inject constructor(val postListModel: PostListModel) : BaseObservable() {

    var testText = "testText"

    val posts by lazy {
        postListModel.testPostItems()
    }

    @Bindable
    fun getItemLayoutId() = R.layout.post_item_layout

    @Bindable
    fun getVariableId(): Int {
        return BR.viewModel
    }
}