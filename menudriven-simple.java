package com.example.intrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Simpleintrest extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleintrest);
        e1=(EditText) findViewById(R.id.t1);
        e2=(EditText) findViewById(R.id.t2);
        e3=(EditText) findViewById(R.id.t3);
        b1=(Button) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int num3 = Integer.parseInt(e3.getText().toString());
                int result = num1*num2*num3;
                b1.setText(String.valueOf(result));

            }
        });


    }
}
