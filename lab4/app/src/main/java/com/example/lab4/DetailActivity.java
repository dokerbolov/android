package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    ImageView imageDetail, imageAvatarDetail;
    TextView nameDetail, descriptionDetail, detail_like_state, detail_like_count;
    ImageButton detail_like;

    String name, description, like_state;
    int imagesOfContext, imagesOfAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageAvatarDetail = findViewById(R.id.imageAvatarDetail);
        imageDetail = findViewById(R.id.imageDetail);
        nameDetail = findViewById(R.id.nameDetail);
        descriptionDetail = findViewById(R.id.descriptionDetail);
        detail_like_state = findViewById(R.id.detail_like_state);
        detail_like = findViewById(R.id.detail_like);
        detail_like_count = findViewById(R.id.detail_like_count);

        getData();
        setData();

    }
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    private void getData() {
        if (getIntent().hasExtra("name") && getIntent().hasExtra("description") && getIntent().hasExtra("imageInContext")
                && getIntent().hasExtra("imageInAvatar")) {
                name = getIntent().getStringExtra("name");
                description = getIntent().getStringExtra("description");
                imagesOfAvatar = getIntent().getIntExtra("imageInAvatar", 1);
                imagesOfContext = getIntent().getIntExtra("imageInContext", 1);
                like_state = getIntent().getStringExtra("like_state");
        } else
        {
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }
    }

    private  void setData()
    {
        nameDetail.setText(name);
        descriptionDetail.setText(description);
        imageDetail.setImageResource(imagesOfContext);
        imageAvatarDetail.setImageResource(imagesOfAvatar);
        detail_like_state.setText(like_state);
        detail_like.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(detail_like_state.getText().toString().equals("0"))
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "liked", Toast.LENGTH_SHORT);
                    toast.show();
                    detail_like_count.setText("101");
                    detail_like_state.setText("1");
                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "unliked", Toast.LENGTH_SHORT);
                    toast.show();
                    detail_like_count.setText("100");
                    detail_like_state.setText("0");
                }
            }
        });
    }
}
