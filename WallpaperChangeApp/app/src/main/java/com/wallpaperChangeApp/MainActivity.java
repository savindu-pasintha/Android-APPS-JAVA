package com.wallpaperChangeApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


import com.Retrofit_Rest_Api.API_KEY;
import com.Retrofit_Rest_Api.ApiClient;
import com.Retrofit_Rest_Api.Model.DataSet;
import com.Retrofit_Rest_Api.Model.HitsList;
import com.adapter.MainActivityRecyclerViewAdapter;
import com.google.android.material.appbar.MaterialToolbar;
import com.model.WallpappersModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private MaterialToolbar  topAppBarMaterialToolbar;
    private RecyclerView recyclerView;
    private ArrayList<WallpappersModel> wallpapersModelsArrayList;

    private List<HitsList> hitsLists = new ArrayList<>();

    EditText searchEditText;
    ImageButton imageButtonSearch;
    MainActivityRecyclerViewAdapter mainActivityRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topAppBarMaterialToolbar =(MaterialToolbar)findViewById(R.id.topAppBarMaterialToolbar);
        recyclerView = (RecyclerView)findViewById(R.id.recycleView);
        imageButtonSearch=(ImageButton)findViewById(R.id.imageButtonSearch);
        searchEditText = (EditText)findViewById(R.id.editTextSearch);

        wallpapersModelsArrayList = new ArrayList<WallpappersModel>();
        wallpapersModelsArrayList = getDataFromApi("flowers");


        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);
        //
       // mainActivityRecyclerViewAdapter = new MainActivityRecyclerViewAdapter(getApplicationContext(),wallpapersModelsArrayList);
        //recyclerView.setAdapter(mainActivityRecyclerViewAdapter);


        topAppBarMaterialToolbar.setNavigationOnClickListener(
               v->{}
        );
        topAppBarMaterialToolbar.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()){
                case R.id.menu_aboutUs:{
                    startActivity(new Intent(getApplicationContext(), com.wallpaperChangeApp.Aboutuspage.class));
                    return true;  }
                case R.id.menu_contactUs:{
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse("mailto:savindupasingtha@gmail.com"));
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
                    startActivity(Intent.createChooser(emailIntent, "Contact us!"));
                    return true; }

                case R.id.menu_privacyPolicy:{
                    startActivity(new Intent(getApplicationContext(),com.wallpaperChangeApp.PrivacyPolicy.class));
                    return true;   }

                case R.id.menu_share:{
                    Toast.makeText(getApplicationContext(),"Share App",Toast.LENGTH_LONG).show();
                }
                case R.id.favorite:{
                    Toast.makeText(getApplicationContext(),"favorite",Toast.LENGTH_LONG).show();
                }
                default:{
                    return super.onOptionsItemSelected(item);
                }
            }

                }
        );

       imageButtonSearch.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                  if(!searchEditText.getText().toString().trim().toLowerCase().isEmpty()){
                      getDataFromApi(searchEditText.getText().toString());
                  }else{
                      Toast.makeText(getApplicationContext(),"ENTER WALLPAPER NAME",Toast.LENGTH_LONG).show();
                  }
           }
       });

       searchEditText.addTextChangedListener(new TextWatcher() {
           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
               if(!searchEditText.getText().toString().isEmpty()){
                  Log.i("text",searchEditText.getText().toString());
               }else{
                   Log.i("text","No");
               }
           }

           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }
           @Override
           public void afterTextChanged(Editable s) {

           }
       });
    }

    public ArrayList<WallpappersModel> getDataFromApi(String query){
        
        ArrayList<WallpappersModel> wallpaperList = new ArrayList<WallpappersModel>();
        Call<DataSet> call;
        call= ApiClient.getInstance().getApi().getPhotos(API_KEY.getKeyValue,query);
        call.enqueue(new Callback<DataSet>() {
            @Override
            public void onResponse(Call<DataSet> call, Response<DataSet> response) {
                if (response.isSuccessful() && response.body().getHits() != null){

                    hitsLists.clear();
                    hitsLists = response.body().getHits();

                    for(HitsList objGet : hitsLists){
                        WallpappersModel model = new WallpappersModel();
                          model.setImageSrcUrl(objGet.getPreviewURL());
                          model.setName(objGet.getTags());
                          wallpaperList.add(model);
                    }

                    mainActivityRecyclerViewAdapter = new MainActivityRecyclerViewAdapter(getApplicationContext(),wallpaperList);
                    recyclerView.setAdapter(mainActivityRecyclerViewAdapter);

                }
            }

            @Override
            public void onFailure(Call<DataSet> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"API CALL FAILURE : "+ t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

                WallpappersModel model = new WallpappersModel();
                model.setImageSrcUrl("https://cdn.pixabay.com/photo/2021/09/03/04/40/orange-gull-6594958_150.jpg");
                model.setName("Butterfly");

                wallpaperList.add(model);
                wallpaperList.add(model);
                wallpaperList.add(model);

                mainActivityRecyclerViewAdapter = new MainActivityRecyclerViewAdapter(getApplicationContext(),wallpaperList);
                recyclerView.setAdapter(mainActivityRecyclerViewAdapter);
            }
        });

       return wallpaperList;
    }




}
