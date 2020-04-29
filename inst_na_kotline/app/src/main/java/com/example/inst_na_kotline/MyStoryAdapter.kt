package com.example.inst_na_kotline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyStoryAdapter(
    var context: Context,
    var storyName: Array<String>,
    var storyPic: IntArray
) :
    RecyclerView.Adapter<MyStoryAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.stories, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.storyPic.setImageResource(storyPic[position])
        holder.storyName.text = storyName[position]
    }

    override fun getItemCount(): Int {
        return storyPic.size
    }

    inner class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var storyName: TextView
        var storyPic: ImageView

        init {
            storyName = itemView.findViewById(R.id.storyName)
            storyPic = itemView.findViewById(R.id.storyPic)
        }
    }

}
