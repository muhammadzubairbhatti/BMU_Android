package com.example.zubairbhatti.bookmyumrah;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Splash extends AppCompatActivity {

    Intent intent;
//    MediaPlayer ourSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        ourSong = MediaPlayer.create(this, R.raw.whistle);
//        ourSong.start();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLACK);
        }


        Thread th = new Thread() {

            public void run() {

                try {
                    sleep(3000);

                } catch (Exception ex) {

                } finally {

                    intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                }

            }

        };

        th.start();

    }


    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
  //      ourSong.release();
        finish();

    }
}









