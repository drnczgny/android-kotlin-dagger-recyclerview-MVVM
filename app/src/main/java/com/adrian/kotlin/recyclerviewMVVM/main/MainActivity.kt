package com.adrian.kotlin.recyclerviewMVVM.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.kotlin.R
import com.adrian.kotlin.recyclerviewMVVM.main.di.MainComponent
import com.adrian.kotlin.recyclerviewMVVM.post.PostListActivity

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainComponent.Injector.buildComponent(this).inject(this);

        var intent = Intent(this, PostListActivity::class.java)
        startActivity(intent)
    }
}
