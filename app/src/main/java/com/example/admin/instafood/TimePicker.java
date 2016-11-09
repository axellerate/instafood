package com.example.admin.instafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TimePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
    }

    public void onClickConfirmTime(View view) {
        Intent i = new Intent(this, FoodPicker.class);
        startActivity(i);
    }
}
