package com.example.tutorialapplication;

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

        Button btnAdd = (Button) findViewById(R.id.additionButton);

        //as the app is running, I want it to remember anytime this button is click do this thing
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNum = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNumberEditText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int sum = num1 + num2;

                result.setText(sum +"" );

            }
        });



    }
}