package spl.support.layoutdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;


import spl.support.layoutdatabinding.databinding.ActivityMainBinding;

public class Bing_Layout_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bing_layout);

       // ActivityMainBinding sampleKeyBoardBinding = DataBindingUtil.setContentView(this,R.layout.activity_bing_layout);


        //kClickHandler = new Bing_Layout_Activity.KClickHandler(this);
        //kMainBinding.content.
    }
}