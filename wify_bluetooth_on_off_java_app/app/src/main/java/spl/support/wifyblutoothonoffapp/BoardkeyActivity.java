package spl.support.wifyblutoothonoffapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.*;


import android.os.Bundle;

import spl.support.wifyblutoothonoffapp.databinding.ActivityMainBinding;
import spl.support.wifyblutoothonoffapp.sample.Access;

public class BoardkeyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardkey2);

        //ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
      //  binding = DataBindingUtil.setContentView(this,R.layout.activity_boardkey2);
      //  Access access = new Access("keyName","KeyValue");
     //   binding.setAccess(Access);


    }
}