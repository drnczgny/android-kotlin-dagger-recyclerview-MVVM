package com.adrian.kotlin.recyclerviewMVVM.main.di

import com.adrian.kotlin.recyclerviewMVVM.app.di.AppComponent
import com.adrian.kotlin.recyclerviewMVVM.main.MainActivity
import dagger.Component

/**
 * Created by cadri on 2017. 07. 25..
 */

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(MainModule::class))
interface MainComponent {

    fun inject(mainActivity: MainActivity)

    object Injector {

        fun buildComponent(mainActivity: MainActivity): MainComponent {
            return DaggerMainComponent.builder()
                    .appComponent(AppComponent.Injector.component)
                    .mainModule(MainModule(mainActivity))
                    .build();
        }
    }
}
