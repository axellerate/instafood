package com.example.admin.instafood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class FoodPicker extends AppCompatActivity {
    private ListView friendsListView;

    ListView list;
    Button nextButton;
    String[] friends ={
            "Chicken Nuggets",
            "Chicken Parmesan",
            "1/4 Chicken",
            "Chicken Arribiata",
            "A Piece of Cake"
    };

    Integer[] imgIds={
            R.drawable.nuggets,
            R.drawable.nuggets,
            R.drawable.nuggets,
            R.drawable.nuggets,
            R.drawable.nuggets
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_picker);
        nextButton = (Button)findViewById(R.id.menu_button);

        RestaurantListAdapter adapter = new RestaurantListAdapter(this, friends, imgIds);
        list=(ListView)findViewById(R.id.foodList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Selecteditem = friends[+position];
                if(position == 4)
                {
                    Toast.makeText(getApplicationContext(), "Like this assignment", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
                }
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodPicker.this, ConfirmationActivity.class));
            }
        });
    }

}
