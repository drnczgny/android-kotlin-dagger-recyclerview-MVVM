package com.adrian.kotlin.recyclerviewMVVM.main

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.kotlin.R
import com.adrian.kotlin.recyclerviewMVVM.main.di.MainComponent
import com.adrian.kotlin.recyclerviewMVVM.post.PostListActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainComponent.Injector.buildComponent(this).inject(this);

        var intent = Intent(this, PostListActivity::class.java)
        startActivity(intent)

//        list.layoutManager = LinearLayoutManager(this)
//        list.hasFixedSize()
//        list.adapter = MyAdapter(this, getLists())
    }

//    fun getLists(): ArrayList<ListItem> {
//        val listItem1 = ListItem(1, "Kotlin", "www.kotlin.com")
//        val listItem2 = ListItem(2, "Java", "www.java.com")
//        val listItem3 = ListItem(3, "Android", "www.android.com")
//        val listItem4 = ListItem(4, "JavaScript", "www.javascript.com")
//        val lists = ArrayList<ListItem>()
//        lists.add(listItem1)
//        lists.add(listItem2)
//        lists.add(listItem3)
//        lists.add(listItem4)
//        return lists;
//    }
}
