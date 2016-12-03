package com.example.admin.instafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onClickMyEvents(View view) {
        Intent i = new Intent(this, MyEvents.class);
        startActivity(i);
    }

    public void onClickMyFriends(View view) {
        Intent i = new Intent(this, FriendsPicker.class);
        i.putExtra("fromMain", true);
        startActivity(i);
    }

    public void onClickMyRestaurants(View view) {
        Intent i = new Intent(this, RestaurantPicker.class);
        startActivity(i);
    }

    public void onClickCreateNewEvent(View view) {
        Intent i = new Intent(this, RestaurantPicker.class);
        i.putExtra("fromMain", true);
        startActivity(i);
    }

}
