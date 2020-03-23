package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    ImageView imageDetail, imageAvatarDetail;
    TextView nameDetail, descriptionDetail;

    String name, description;
    int imagesOfContext, imagesOfAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageAvatarDetail = findViewById(R.id.imageAvatarDetail);
        imageDetail = findViewById(R.id.imageDetail);
        nameDetail = findViewById(R.id.nameDetail);
        descriptionDetail = findViewById(R.id.descriptionDetail);

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
    }
}
