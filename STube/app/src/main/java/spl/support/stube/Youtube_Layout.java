package spl.support.stube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Youtube_Layout extends AppCompatActivity {
    YouTubePlayerView ytPlayer;
    String api_key = "AIzaSyAvklJU9mWs1QqxfXOnE7EHQZTUKnelCu0";
    WebView videoWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("error","Not load");
        System.out.println("eror hear");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_layout);

            videoWeb = (WebView)findViewById(R.id.videoWebView);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {

            } );
        /*
        ytPlayer = (YouTubePlayerView)findViewById(R.id.ytPlayer);

       try {
           ytPlayer.initialize(
                   api_key,
                   new YouTubePlayer.OnInitializedListener() {
                       @Override
                       public void onInitializationSuccess(
                               YouTubePlayer.Provider provider,
                               YouTubePlayer youTubePlayer, boolean b)
                       {
                           youTubePlayer.loadVideo("HzeK7g8cD0Y");
                           youTubePlayer.play();
                       }
                       @Override
                       public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
                       {
                           Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
                       }
                   });
       }catch(Exception e){

       }

*/

    }
}