package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Information extends AppCompatActivity {
TextView name,gender,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        name = findViewById(R.id.t2);
        gender = findViewById(R.id.t3);
        age = findViewById(R.id.t4);


       String e1 =getIntent().getStringExtra("name");
       String e2=getIntent().getStringExtra("gender");
       String e3= getIntent().getStringExtra("Age");

       name.setText(e1);
       gender.setText(e2);
       age.setText(e3);



    }
}
