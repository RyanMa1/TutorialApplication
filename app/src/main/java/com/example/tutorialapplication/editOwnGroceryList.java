package com.example.tutorialapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
=======
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
>>>>>>> a166e82c8b99e36fd639c4477d3f1b9670519537

public class editOwnGroceryList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_own_grocery_list);
<<<<<<< HEAD
=======

        //views
        final EditText add2ListView = (EditText) findViewById(R.id.addEditText);
        final ListView listViewItems = (ListView) findViewById(R.id.groceryListView);

        //button
        Button btnAddItem = (Button) findViewById(R.id.btnAddItem);

        //Array list
        final ArrayList<String> listItems;
        final ArrayAdapter<String> adapter;
        listItems = new ArrayList<String>();

        listItems.add("First Item - added on Activity Create");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems );
        listViewItems.setAdapter(adapter);

        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listItems.add(add2ListView.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        listViewItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(editOwnGroceryList.this, "You clicked this.", Toast.LENGTH_LONG).show();
            }
        });


>>>>>>> a166e82c8b99e36fd639c4477d3f1b9670519537
    }
}
