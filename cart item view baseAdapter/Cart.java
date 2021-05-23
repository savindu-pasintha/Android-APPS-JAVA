package com.example.lolacupcake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        //1
        listView=(ListView)findViewById(R.id.cartList);

        try{
          //  ArrayList<PModel> ProductModelArrayList = new ArrayList<PModel>();
            ArrayList<CartModel> cartArrayList = new ArrayList<CartModel>();
            for(int i=0; i<20; i++){

                //assign data inset model
                CartModel obj=new CartModel();

                obj.setCategiry("cat1");
                obj.setName("name1");
                obj.setPrice("25.36");
                obj.setQuentity("09");
                obj.setImgId(R.drawable.aa);

                //save add to list to add model obj
                cartArrayList.add(obj);

            }

            //view arrary list data
            if(cartArrayList.size()>0){
                CartItemAdapter  adapeter = new CartItemAdapter(this,cartArrayList);
                listView.setAdapter( adapeter);
            }else{
                Toast.makeText(this,"No Cart Items",Toast.LENGTH_LONG).show();
            }
        }catch (Exception e){
            Log.e("Erro :" , e.getMessage());
        }

    }
}