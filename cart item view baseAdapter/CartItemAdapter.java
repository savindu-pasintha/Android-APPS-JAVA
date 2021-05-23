package com.example.lolacupcake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class CartItemAdapter extends BaseAdapter {

    Context context;
    TextView name,category,price,quentity;
    ImageView imageView;

    ArrayList<CartModel> cartArrayList;

    //constructor method 1
    public CartItemAdapter(Context context, ArrayList<CartModel>  list){
        this.context = context;
        this. cartArrayList =  list;
    }

    @Override
    public int getCount() {
        return cartArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return cartArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //externam lay out access
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //mokakd view kal yutu lay out ek set kala
        View v = inflater.inflate(R.layout.sample_cart_items, parent, false);

        //external layout variable access and define
        name=(TextView)v.findViewById(R.id.name);
        category=(TextView)v.findViewById(R.id.category);
        price=(TextView)v.findViewById(R.id.price);
        quentity=(TextView)v.findViewById(R.id.quentity);
        imageView = (ImageView)v.findViewById(R.id.img);

        //
       // CartModel  cartModel=new CartModel();
        CartModel  cartModel = cartArrayList.get(position);

        //external lay out variables to values set in array inside value assign
        name.setText(cartModel.getName());
        category.setText(cartModel.getCategiry());
        price.setText(cartModel.getPrice());
        quentity.setText(cartModel.getQuentity());
        imageView.setImageResource(cartModel.getImgId());

        // Bitmap bitmap = BitmapFactory.decodeByteArray(product.getImg(),0,product.getImg().length);
        // imageView.setImageBitmap(bitmap);
        return v;
    }
}
