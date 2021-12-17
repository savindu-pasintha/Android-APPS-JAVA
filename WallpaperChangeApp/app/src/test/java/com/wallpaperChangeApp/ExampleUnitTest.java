package com.wallpaperChangeApp;

import org.junit.Test;

import static org.junit.Assert.*;

import android.widget.Toast;

import com.Retrofit_Rest_Api.API_KEY;
import com.Retrofit_Rest_Api.ApiClient;
import com.Retrofit_Rest_Api.Model.DataSet;
import com.Retrofit_Rest_Api.Model.HitsList;
import com.adapter.MainActivityRecyclerViewAdapter;
import com.model.WallpappersModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void API_Connection(){
        final String[] testValue = new String[10];
            Call<DataSet> call;
            call= ApiClient.getInstance().getApi().getPhotos(API_KEY.getKeyValue,"sindu");
            call.enqueue(new Callback<DataSet>() {
                @Override
                public void onResponse(Call<DataSet> call, Response<DataSet> response) {
                    try{
                        testValue[0] = "response.message()";
                        if (response.isSuccessful() && response.body().getHits() != null){
                          //  testValue[0] = response.message();
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<DataSet> call, Throwable t) {

                }
            });
        assertEquals("onFailure",testValue[0]);
    }
}


