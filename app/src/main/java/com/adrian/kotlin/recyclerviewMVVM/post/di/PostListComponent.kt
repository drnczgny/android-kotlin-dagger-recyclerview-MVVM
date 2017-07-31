package com.adrian.kotlin.recyclerviewMVVM.post.di

import com.adrian.kotlin.recyclerviewMVVM.app.di.AppComponent
import com.adrian.kotlin.recyclerviewMVVM.main.di.ActivityScope
import com.adrian.kotlin.recyclerviewMVVM.post.PostListActivity
import dagger.Component

/**
 * Created by cadri on 2017. 07. 31..
 */

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(PostListModule::class))
interface PostListComponent {

    fun inject(postListActivity: PostListActivity)

    object Injector {

        fun buildComponent(postListActivity: PostListActivity): PostListComponent {
            return DaggerPostListComponent.builder()
                    .appComponent(AppComponent.Injector.component)
                    .postListModule(PostListModule(postListActivity))
                    .build();
        }
    }

}