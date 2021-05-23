package com.example.lolacupcake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Products extends AppCompatActivity {

    GridView gridVariable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);


       gridVariable=(GridView)findViewById(R.id.grid);


        ArrayList<PModel> ProductModelArrayList = new ArrayList<PModel>();

        for(int i=0; i<100; i++) {
            ProductModelArrayList.add(new PModel("DSA","price",R.drawable.aa));
            //productModelArrayList.add(new ProductModel("DSA", R.drawable.ic_gfglogo));
        }

        ProductGrideViewAdapter adapter = new ProductGrideViewAdapter(this,ProductModelArrayList);
        gridVariable.setAdapter(adapter);


    }
}