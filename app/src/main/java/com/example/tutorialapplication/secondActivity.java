package com.example.tutorialapplication;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class secondActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] description;
    String[] prices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Resources res = getResources();

        //edit text


        //views
        myListView = (ListView) findViewById(R.id.myListView);

        //get string array from resource file
        items = res.getStringArray(R.array.items);
        description = res.getStringArray(R.array.descriptions);
        prices = res.getStringArray(R.array.prices);

        //buttons
        final itemAdapter itemAdapter = new itemAdapter(this, items, description, prices);
        myListView.setAdapter(itemAdapter);

        //2-D array of strings

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showDetailPic = new Intent(getApplicationContext(), foodActivityPicture.class);
                showDetailPic.putExtra("com.example.tutorialapplication.ITEM_INDEX", position);
                startActivity(showDetailPic);

            }
        });
    }
//        if(getIntent().hasExtra("com.example.tutorialapplication.SOMETHING")){
//            TextView tv = (TextView) findViewById(R.id.groceryListTextView);
//            String text = getIntent().getExtras().getString("com.example.tutorialapplication.SOMETHING");
//            tv.setText(text);
//        }

    }

