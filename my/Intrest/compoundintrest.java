package com.example.intrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Compoundintrest extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compoundintrest);
        e1=(EditText) findViewById(R.id.t1);
        e2=(EditText) findViewById(R.id.t2);
        e3=(EditText) findViewById(R.id.t3);
        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(e1.getText().toString());
                double num2=Double.parseDouble(e2.getText().toString());
                double num3=Double.parseDouble(e3.getText().toString());
                double result=Math.pow(1+num3/100,num2);

                double A = num1*result;
                b2.setText(String.valueOf(A));
            }
        });
    }
}