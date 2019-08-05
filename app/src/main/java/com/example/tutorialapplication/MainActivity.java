package com.example.tutorialapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        //buttons here
        Button btnAdd = (Button) findViewById(R.id.additionButton);
        Button btnSecondActivity = (Button) findViewById(R.id.btn2ndActivity);
        Button btnGoogleSearch = (Button) findViewById(R.id.btnGoogleSearch);


        //example to start another activity!
        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivityView = new Intent(getApplicationContext(), secondActivity.class);
                //show how to pass information into second activity
                secondActivityView.putExtra("com.example.tutorialapplication.SOMETHING", "Grocery List");
                startActivity(secondActivityView);
            }
        });


        //as the app is running, I want it to remember anytime this button is click do this thing
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //views stated here
                EditText firstNum = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNumberEditText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int sum = num1 + num2;

                result.setText(sum +"" );

            }
        });

        //Attempt to launch an activity outside our app
        btnGoogleSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.google.com";
                Uri webAddress = Uri.parse(google);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webAddress);

                if (goToGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(goToGoogle);
                }
            }
        });

    }
}