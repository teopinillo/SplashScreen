package com.teopinillo.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

/*
Notice that we do not have setContentView() for this SplashActivity. View is displaying from
 the theme and this way it is faster than creating a layout.
 If you look at the time splash screen displays is exactly the same with the time taken by app
  to configure itself because of a cold launch (very first launch). If the app is cached,
   the splash screen will go away almost immediately.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //start home activity
        startActivity( new Intent(SplashActivity.this,HomeActivity.class));
        //close splash activity
        finish();
    }
}
