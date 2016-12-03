package com.example.admin.instafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class AddFriend extends AppCompatActivity {
    ListView list;
    String[] friends ={
            "Bill Grates",
            "Gabe Oldwell",
            "Richard FineMan",
            "Linux Torvolts",
            "Steve Bobs"
    };

    Integer[] imgIds={
            R.drawable.bill_gates,
            R.drawable.gaben,
            R.drawable.feynman,
            R.drawable.torvalds,
            R.drawable.jobs
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);
        RestaurantListAdapter adapter = new RestaurantListAdapter(this, friends, imgIds);
        list=(ListView)findViewById(R.id.friendsListView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(AddFriend.this, MainMenu.class);
                String Selecteditem = friends[+position];
                startActivity(i);
            }
        });
    }
}
