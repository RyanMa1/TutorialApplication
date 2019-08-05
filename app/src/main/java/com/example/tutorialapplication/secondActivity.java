package com.example.tutorialapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.tutorialapplication.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.groceryListTextView);
            String text = getIntent().getExtras().getString("com.example.tutorialapplication.SOMETHING");
            tv.setText(text);
        }
    }
}
