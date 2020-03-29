package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView, recyclerStories;

    String names[], description[];
    int imagesOfContext[] = {R.drawable.first, R.drawable.second, R.drawable.third, R.drawable.fourth,
            R.drawable.fifth, R.drawable.sixth, R.drawable.seventh, R.drawable.eighth, R.drawable.nine, R.drawable.ten};
    int imagesOfAvatar[] = {};
    String like_state[] ={};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerStories = findViewById(R.id.storyRecycler);

        names = getResources().getStringArray(R.array.names);
        description = getResources().getStringArray(R.array.description);
        like_state = getResources().getStringArray(R.array.like_state);

        MyAdapter myAdapter = new MyAdapter(this, names, description, imagesOfContext, imagesOfAvatar, like_state);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyStoryAdapter myStoryAdapter = new MyStoryAdapter(this,names,imagesOfContext);
        recyclerStories.setAdapter(myStoryAdapter);
        recyclerStories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
