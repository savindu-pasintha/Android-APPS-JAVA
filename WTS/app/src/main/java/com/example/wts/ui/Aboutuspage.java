package com.example.wts.ui;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.wts.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class Aboutuspage extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutuspage);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.setTitle("\uD83E\uDD73"+"  About us");
        }

        Element adsElement = new Element();
        adsElement.setTitle("Advertise with us");
        View aboutPage = new AboutPage(this)
            .isRTL(false)
            .setImage(R.drawable.aboutusmypic)
            .setDescription("Hi, I'm Savindu Pasintha From Sri Lanka. I Developed This App For , You Can Easily Save Your Any Type Of Whatsapp " +
                "Statuses Using This App.(photos/videos/audios)-(2021/12/06)")
            .addItem(new Element().setTitle("Version 1.0"))
            .addItem(adsElement)
            .addGroup("Call us +94 76 875 5787 ")
            .addEmail("savindupasingtha@gmail.com")
            .addWebsite("https://savindupasingtha.medium.com")
            .addFacebook("savindu.pasintha.3")
            .addTwitter("savindu-pasintha-6287a31a4")
            .addYoutube("UCN71zDAn2H-re6v5A7Joy8g")
            .addPlayStore("")
            .addInstagram("savindupasintha")
            .addGitHub("savindu-pasintha?tab=repositories")
            .create();
        setContentView(aboutPage);
    }

}
