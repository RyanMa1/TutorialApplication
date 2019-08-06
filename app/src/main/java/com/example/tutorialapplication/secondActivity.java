package com.example.tutorialapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class secondActivity extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        String[] items;
        items = res.getStringArray(R.array.items);


//        if(getIntent().hasExtra("com.example.tutorialapplication.SOMETHING")){
//            TextView tv = (TextView) findViewById(R.id.groceryListTextView);
//            String text = getIntent().getExtras().getString("com.example.tutorialapplication.SOMETHING");
//            tv.setText(text);
//        }

    }
}
