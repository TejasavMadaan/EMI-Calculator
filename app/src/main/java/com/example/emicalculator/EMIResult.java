package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EMIResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emiresult);
        displayResult();
    }
    public void displayResult()
    {
        Intent intent1=getIntent();
        Double res1=(Double) intent1.getDoubleExtra("id",0);
        String res=res1.toString();
        TextView resultTv=(TextView)findViewById(R.id.textView2);
        resultTv.setText(res);
    }
}
