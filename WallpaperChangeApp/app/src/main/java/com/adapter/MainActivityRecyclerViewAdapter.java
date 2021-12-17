package com.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adapterHolder.MainActivityRecyclerViewAdapterHolder;
import com.bumptech.glide.Glide;
import com.model.WallpappersModel;
import com.wallpaperChangeApp.R;
import com.wallpaperChangeApp.setWallpaper;

import java.util.ArrayList;

public class MainActivityRecyclerViewAdapter extends RecyclerView.Adapter<MainActivityRecyclerViewAdapterHolder>{

    private  ArrayList<WallpappersModel> wallpapersList;
   // private final RelativeLayout container;
    private Context context;

    public MainActivityRecyclerViewAdapter(Context context, ArrayList<WallpappersModel> wallpapersList) {
        this.context=context;
        this.wallpapersList = wallpapersList;
    }

    @NonNull
    @Override
    public MainActivityRecyclerViewAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        MainActivityRecyclerViewAdapterHolder viewHolder = new MainActivityRecyclerViewAdapterHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainActivityRecyclerViewAdapterHolder holder, int position) {
        String imageUrl = "https://cdn.pixabay.com/photo/2021/09/03/04/40/orange-gull-6594958_150.jpg";
        //wallpapersList.get(position).getImageSrcUrl();
        WallpappersModel  modelList = wallpapersList.get(position);
        holder.setWallpappersModelFromHolder(modelList);
        Glide.with(this.context).asBitmap().load(imageUrl).into(holder.imageViewHolder);

        holder.imageViewHolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context.getApplicationContext(), imageUrl,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, setWallpaper.class);
                intent.putExtra("imageSrcUrl",imageUrl);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return wallpapersList.size();
    }
}