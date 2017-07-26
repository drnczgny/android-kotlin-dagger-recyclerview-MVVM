package com.adrian.kotlin.recyclerviewMVVM.app

import android.app.Application
import com.adrian.kotlin.recyclerviewMVVM.app.di.AppComponent

/**
 * Created by cadri on 2017. 07. 25..
 */

class MyApplication : Application() {

    companion object {
        lateinit var appComponent: AppComponent;
    }

    override fun onCreate() {
        super.onCreate()

        AppComponent.Injector.inject(this)
    }
}
