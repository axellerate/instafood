package com.example.admin.instafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DatePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
    }

    public void onClickConfirmDate(View view) {
        Intent i = new Intent(this, TimePicker.class);
        startActivity(i);
    }
}
