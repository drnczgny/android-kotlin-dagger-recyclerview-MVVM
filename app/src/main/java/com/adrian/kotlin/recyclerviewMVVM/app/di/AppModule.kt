package com.adrian.kotlin.recyclerviewMVVM.app.di

import android.content.Context
import android.content.SharedPreferences
import com.adrian.kotlin.recyclerviewMVVM.app.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cadri on 2017. 07. 25..
 */

@Module
class AppModule(val myApplication: MyApplication) {

    @Singleton
    @Provides
    fun providesApplication(): MyApplication {
        return myApplication
    }

    @Singleton
    @Provides
    fun providesContext(): Context = myApplication

    @Singleton
    @Provides
    fun providesSharedPreferences(): SharedPreferences {
        return myApplication.getSharedPreferences("PREFS", Context.MODE_PRIVATE)
    }
}
