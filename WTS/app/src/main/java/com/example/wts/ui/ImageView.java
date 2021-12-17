package com.example.wts.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.wts.R;

import java.io.File;

public class ImageView extends AppCompatActivity {
    public android.widget.ImageView myImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.setTitle("\uD83E\uDD73"+"  2022 Statuses Saver ");
        }

        Intent intent=getIntent();
       String file1= intent.getStringExtra("file");
       File file=new File(file1);

        if(file.exists()){

            Bitmap myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());

           myImage = findViewById(R.id.image_view1);

            myImage.setImageBitmap(myBitmap);

        }
    }
}