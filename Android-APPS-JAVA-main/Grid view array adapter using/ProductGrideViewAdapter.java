package com.example.lolacupcake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProductGrideViewAdapter extends ArrayAdapter<PModel> {

    public ProductGrideViewAdapter(@NonNull Context context, ArrayList<PModel> ProductPModelArrayList) {
        super(context,0, ProductPModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.sample_product_card_item_layout, parent, false);
        }
        PModel pModel = getItem(position);
        TextView textVariable = listitemView.findViewById(R.id.textVariable);
        ImageView imageVariable = listitemView.findViewById(R.id.imageVariable);
        TextView priceText=listitemView.findViewById(R.id.priceVariable);
        textVariable.setText(pModel.getPpName());
        imageVariable.setImageResource(pModel.getImgId());
        priceText.setText(pModel.getPrice());
       // imageVariable.setImageResource(obj.getImgid());
        return listitemView;
    }
}

