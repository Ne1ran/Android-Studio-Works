package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Red(View view){
        View trafficbg = (View)findViewById(R.id.traffic);
        trafficbg.setBackgroundColor(Color.parseColor("#FF0000"));
    }
    public void Yellow(View view){
        View trafficbg = (View)findViewById(R.id.traffic);
        trafficbg.setBackgroundColor(Color.parseColor("#FFFF33"));
    }
    public void Green(View view){
        View trafficbg = (View)findViewById(R.id.traffic);
        trafficbg.setBackgroundColor(Color.parseColor("#00FF33"));
    }
}