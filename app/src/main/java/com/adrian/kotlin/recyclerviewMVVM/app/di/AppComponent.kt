package com.adrian.kotlin.recyclerviewMVVM.app.di

import android.content.SharedPreferences
import com.adrian.kotlin.recyclerviewMVVM.app.MyApplication
import dagger.Component
import javax.inject.Singleton

/**
 * Created by cadri on 2017. 07. 25..
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(myApplication: MyApplication)

    fun sharedPreferences(): SharedPreferences

    object Injector {

        var component: AppComponent? = null
            private set

        fun inject(myApplication: MyApplication) {
            component = DaggerAppComponent.builder()
                    .appModule(AppModule(myApplication))
                    .build()
            component!!.inject(myApplication)
        }
    }
}