package com.example.admin.instafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);
    }


    public void onClickGetStarted(View view) {
        Intent i = new Intent(this, RestaurantPicker.class);
        startActivity(i);
    }


}
