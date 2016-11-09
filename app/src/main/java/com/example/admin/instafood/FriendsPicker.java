package com.example.admin.instafood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class FriendsPicker extends AppCompatActivity {

    private ListView friendsListView;

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
        setContentView(R.layout.activity_friends_picker);

        RestaurantListAdapter adapter = new RestaurantListAdapter(this, friends, imgIds);
        list=(ListView)findViewById(R.id.friendsListView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Selecteditem = friends[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickConfirmFriends(View view) {
        Intent i = new Intent(this, DatePicker.class);
        startActivity(i);
    }

}
