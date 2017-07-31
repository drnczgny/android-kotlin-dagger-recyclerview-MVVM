package com.adrian.kotlin.recyclerviewMVVM.post.di

import com.adrian.kotlin.recyclerviewMVVM.main.di.ActivityScope
import com.adrian.kotlin.recyclerviewMVVM.post.PostListActivity
import com.adrian.kotlin.recyclerviewMVVM.post.model.PostListModel
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 07. 31..
 */

@Module
class PostListModule(val postListActivity: PostListActivity) {

//    @ActivityScope
//    @Provides
//    fun providesPostListRouter(): PostListRouter {
//        return postListActivity
//    }

    @ActivityScope
    @Provides
    fun providesPostListModel(): PostListModel {
        return PostListModel()
    }

//    @ActivityScope
//    @Provides
//    fun providesPostListViewModel() = PostListViewModel(PostListModel())


}