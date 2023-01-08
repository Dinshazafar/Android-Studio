package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;

   import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Lion");
        arrayList.add("cheetah");
        arrayList.add("Dog");
        arrayList.add("cat");
        arrayList.add("buffalo");
        arrayList.add("Horse");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Hello " + arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}