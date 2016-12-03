package com.example.admin.instafood;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.HashMap;

import static com.example.admin.instafood.R.id.item;
import static java.lang.System.in;

public class RestaurantPicker extends AppCompatActivity {

    private ListView restaurantListView;

    ListView list;
    String[] restaurantNames ={
            "Canoe",
            "CN Tower Restaurant",
            "The Keg",
            "The Mandarin"
    };

    Integer[] imgIds={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4
    };

    HashMap<Integer, Boolean> clickedMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_picker);

        RestaurantListAdapter adapter = new RestaurantListAdapter(this, restaurantNames, imgIds);
        list=(ListView)findViewById(R.id.restaurantsListView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent i = new Intent(RestaurantPicker.this, FriendsPicker.class);
                String Selecteditem = restaurantNames[+position];
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
                Button button = (Button) findViewById(R.id.find_restaurant_btn);
                button.setText("Confirm Restaurant");
            }
        }

    }

    public void onClickFindRestaurant(View view) {
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            if(extras.getBoolean("fromMain")){
                Intent i = new Intent(this, FriendsPicker.class);
                startActivity(i);
                return;
            }
        }

        Intent i = new Intent(this, AddRestaurant.class);
        startActivity(i);
    }


}


