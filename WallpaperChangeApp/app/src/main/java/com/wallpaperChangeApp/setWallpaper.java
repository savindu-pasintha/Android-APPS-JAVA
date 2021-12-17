package com.wallpaperChangeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.IOException;

public class setWallpaper extends AppCompatActivity {

    Button buttonSet;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_wallpaper);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

       buttonSet=(Button)findViewById(R.id.setButton);
       imageView=(ImageView)findViewById(R.id.finalImage);
       imageView.setImageResource(R.drawable.bus);


       Intent objIntent = getIntent();
       Bundle objBundle=objIntent.getExtras();
       String imageSrcUrl = objBundle.getString("imageSrcUrl");

      Glide.with(getApplicationContext()).asBitmap().load(imageSrcUrl).into(imageView);

       buttonSet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               try {
                   Bitmap bitmap=((BitmapDrawable)imageView.getDrawable()).getBitmap();
                   final WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                   wallpaperManager.setBitmap(bitmap);
                   Toast.makeText(getApplicationContext(),"SET NEW WALLPAPPER !",Toast.LENGTH_LONG).show();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       });

    }
}