package com.example.inst_na_kotline

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(
    var context: Context,
    var names: Array<String>,
    var description: Array<String>,
    var imagesOfContext: IntArray,
    var imagesOfAvatar: IntArray,
    var like_state: Array<String>
) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.my_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        holder.imageInContext.setImageResource(imagesOfContext[position])
        holder.name.text = names[position]
        holder.description.text = names[position] + " " + description[position]
        holder.imageInAvatar.setImageResource(imagesOfContext[position])
        holder.like_state.text = like_state[position]
        holder.mainLayout.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("name", names[position])
            intent.putExtra("description", description[position])
            intent.putExtra("imageInContext", imagesOfContext[position])
            intent.putExtra("imageInAvatar", imagesOfContext[position])
            intent.putExtra("Like_state", like_state[position])
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return imagesOfContext.size
    }

    inner class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var imageInContext: ImageView
        var name: TextView
        var description: TextView
        var imageInAvatar: ImageView
        var mainLayout: LinearLayout
        var like: ImageButton
        var likes: TextView
        var like_state: TextView

        init {
            imageInContext = itemView.findViewById(R.id.imageInContext)
            name = itemView.findViewById(R.id.name)
            description = itemView.findViewById(R.id.description)
            imageInAvatar = itemView.findViewById(R.id.imageInAvatar)
            mainLayout = itemView.findViewById(R.id.mainLayout)
            like = itemView.findViewById(R.id.like)
            likes = itemView.findViewById(R.id.likes)
            like_state = itemView.findViewById(R.id.like_state)
            like.setOnClickListener {
                if (like_state.text.toString() == "0") {
                    val toast = Toast.makeText(
                        context.applicationContext,
                        "liked",
                        Toast.LENGTH_SHORT
                    )
                    toast.show()
                    likes.text = "101"
                    like_state.text = "1"
                } else {
                    val toast = Toast.makeText(
                        context.applicationContext,
                        "unliked",
                        Toast.LENGTH_SHORT
                    )
                    toast.show()
                    likes.text = "100"
                    like_state.text = "0"
                }
            }
        }
    }

}
