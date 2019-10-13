package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.Math;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.B);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 = (EditText) findViewById(R.id.ET1);
                EditText et2 = (EditText) findViewById(R.id.ET2);
                EditText et3 = (EditText) findViewById(R.id.ET3);

                Double principal = Double.parseDouble(et1.getText().toString());
                Double rate = Double.parseDouble(et2.getText().toString());
                Double months = Double.parseDouble(et3.getText().toString());

                Double num = Math.pow(1 + rate, months);
                Double dem = num - 1;
                Double res = principal * rate * (num / dem);
                Intent intent=new Intent(getApplicationContext(),EMIResult.class);
                intent.putExtra("id",res);
                startActivity(intent);
            }
        }
        );
    }
}