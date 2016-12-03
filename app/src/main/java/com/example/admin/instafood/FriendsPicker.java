package com.example.admin.instafood;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

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

    HashMap<Integer, Boolean> clickedMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_picker);

        FriendsListAdapter adapter = new FriendsListAdapter(this, friends, imgIds);
        list=(ListView)findViewById(R.id.friendsListView);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Selecteditem = friends[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
                if(clickedMap.containsKey(position)) {
                    if (clickedMap.get(position)) {
                        view.setBackgroundColor(Color.parseColor("#000000"));
                        clickedMap.put(position, false);
                    } else {
                        view.setBackgroundColor(Color.parseColor("#999999"));
                        clickedMap.put(position, true);
                    }
                } else {
                    view.setBackgroundColor(Color.parseColor("#999999"));
                    clickedMap.put(position, true);
                }

            }
        });
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            if(extras.getBoolean("fromMain")){
                Button button = (Button) findViewById(R.id.confirm_friend_btn);
                button.setText("Add New Friend");
            }
        }
    }

    public void onClickConfirmFriends(View view) {
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            Boolean fromMain = extras.getBoolean("fromMain");
            if(extras.getBoolean("fromMain")){
                Intent i = new Intent(this, AddFriend.class);
                startActivity(i);
                return;
            }
        }
        Intent i = new Intent(this, DatePicker.class);
        startActivity(i);
    }

}
