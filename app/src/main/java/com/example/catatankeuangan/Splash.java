package com.example.catatankeuangan;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    Animation app_splash,btt;
    ImageView app_logo;
    TextView app_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //load animation
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        //load elemen
        app_logo = findViewById(R.id.app_logo);
        app_title = findViewById(R.id.app_title);

        //run animation
        app_logo.startAnimation(app_splash);
        app_title.startAnimation(btt);


        Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent gotoutama = new Intent(Splash.this, MainActivity.class);
                    startActivity(gotoutama);
                    finish();
                }
                }, 2000);
    }
}
