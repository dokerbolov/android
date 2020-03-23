package com.example.lab4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String names[], description[];
    int imagesOfContext[], imagesOfAvatar[];
    Context context;

    boolean like_active = false;



    public MyAdapter(Context context, String names[], String description[], int imagesOfContext[], int imagesOfAvatar[]) {
        this.context = context;
        this.names = names;
        this.description = description;
        this.imagesOfContext = imagesOfContext;
        this.imagesOfAvatar = imagesOfAvatar;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((context));
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.imageInContext.setImageResource(imagesOfContext[position]);
        holder.name.setText(names[position]);
        holder.description.setText(names[position]  + " " + description[position]);
        holder.imageInAvatar.setImageResource(imagesOfContext[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name",names[position]);
                intent.putExtra("description",description[position]);
                intent.putExtra("imageInContext",imagesOfContext[position]);
                intent.putExtra("imageInAvatar",imagesOfContext[position]);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return imagesOfContext.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageInContext;
        TextView name;
        TextView description;
        ImageView imageInAvatar;
        LinearLayout mainLayout;
        ImageButton like;
        TextView likes;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            imageInContext = itemView.findViewById(R.id.imageInContext);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            imageInAvatar = itemView.findViewById(R.id.imageInAvatar);
            mainLayout = itemView.findViewById(R.id.mainLayout);
            like = itemView.findViewById(R.id.like);
            likes = itemView.findViewById(R.id.likes);

            like.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(like_active == false)
                    {
                        like.setImageResource(R.drawable.liked);
                        like_active = true;
                        Toast.makeText(context.getApplicationContext(),"Liked it",Toast.LENGTH_SHORT).show();

                    }
                    else
                    {
                        like.setImageResource(R.drawable.like);
                        like_active = false;
                        Toast.makeText(context.getApplicationContext(),"Unliked it",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
