package com.example.admin.instafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MyEvents extends AppCompatActivity {
    private ListView restaurantListView;

    ListView list;
    String[] restaurantNames ={
            "Canoe",
            "The Mandarin"
    };

    Integer[] imgIds={
            R.drawable.pic1,
            R.drawable.pic4
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);

        MyEventsListAdapter adapter = new MyEventsListAdapter(this, restaurantNames, imgIds);
        list=(ListView)findViewById(R.id.restaurantsListView);
        list.setAdapter(adapter);

    }
}
