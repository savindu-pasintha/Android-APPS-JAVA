package com.adapterHolder;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.model.WallpappersModel;
import com.wallpaperChangeApp.R;

public class MainActivityRecyclerViewAdapterHolder extends RecyclerView.ViewHolder{
    private TextView textViewHolder;
    public ImageView imageViewHolder;
    private WallpappersModel wallpappersModel;
    private Context context;

    public MainActivityRecyclerViewAdapterHolder(@NonNull View itemView) {
        super(itemView);
        textViewHolder=(TextView) itemView.findViewById(R.id.textViewInLayOut);
        imageViewHolder=(ImageView) itemView.findViewById(R.id.imageViewInLayOut);
    }

    public void setWallpappersModelFromHolder(WallpappersModel model) {
        this.wallpappersModel = model;
        this.textViewHolder.setText(wallpappersModel.getName());
        this.textViewHolder.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
