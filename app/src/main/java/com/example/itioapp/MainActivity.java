package com.example.itioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT= 5000;

    //Hooks
    View first, second, third, fourth, fifth, sixth, seventh;
    TextView logo, slogan;

    //Animations
    Animation topAnimation, midAnimation, bottomAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        midAnimation= AnimationUtils.loadAnimation(this,R.anim.mid_animation);
        bottomAnimation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks

        first= findViewById(R.id.first_line);
        second= findViewById(R.id.second_line);
        third= findViewById(R.id.third_line);
        fourth= findViewById(R.id.forth_line);
        fifth= findViewById(R.id.fifth_line);
        sixth= findViewById(R.id.sixth_line);
        seventh= findViewById(R.id.seventh_line);

        logo= findViewById(R.id.logo);
        slogan= findViewById(R.id.slogan);

        //Setting Animation
        first.setAnimation(topAnimation);
        second.setAnimation(topAnimation);
        third.setAnimation(topAnimation);
        fourth.setAnimation(topAnimation);
        fifth.setAnimation(topAnimation);
        sixth.setAnimation(topAnimation);
        seventh.setAnimation(topAnimation);

        logo.setAnimation(midAnimation);
        slogan.setAnimation(bottomAnimation);

        //Splash Screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
