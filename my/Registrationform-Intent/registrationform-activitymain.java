package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText)findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3= (EditText) findViewById(R.id.e3);
        b1=(Button) findViewById(R.id.b1);
       b1.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               String name = e1.getText().toString();
               String gender = e2.getText().toString();
               String Age = e3.getText().toString();

               Intent intent = new Intent(MainActivity.this, Information.class);
               intent.putExtra("name",name);
               intent.putExtra("gender",gender);
               intent.putExtra("Age",Age);

               startActivity(intent);
           }
       });


 }
}