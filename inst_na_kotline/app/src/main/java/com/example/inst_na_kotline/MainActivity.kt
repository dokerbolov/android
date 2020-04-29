package com.example.inst_na_kotline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var recyclerStories: RecyclerView? = null
    var names = arrayOf<String>()
    var description = arrayOf<String>()
    var imagesOfContext = intArrayOf(
        R.drawable.first,
        R.drawable.second,
        R.drawable.third,
        R.drawable.fourth,
        R.drawable.fifth,
        R.drawable.sixth,
        R.drawable.seventh,
        R.drawable.eighth,
        R.drawable.nine,
        R.drawable.ten
    )

    var imagesOfAvatar = intArrayOf()
    var like_state = arrayOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerStories = findViewById(R.id.storyRecycler)
        names = resources.getStringArray(R.array.names)
        description = resources.getStringArray(R.array.description)
        like_state = resources.getStringArray(R.array.like_state)
        val myAdapter =
            MyAdapter(this, names, description, imagesOfContext, imagesOfAvatar, like_state)
        recyclerView?.setAdapter(myAdapter)
        recyclerView?.setLayoutManager(LinearLayoutManager(this))
        val myStoryAdapter = MyStoryAdapter(this, names, imagesOfContext)
        recyclerStories?.setAdapter(myStoryAdapter)
        recyclerStories?.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )
    }
}
