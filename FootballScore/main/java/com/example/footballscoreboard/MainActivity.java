package com.example.footballscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private Integer BearScore = 0;
    private Integer UsecScore = 0;
    public void BearPoint(View view){
        TextView bear = (TextView)findViewById(R.id.BearScore);
        BearScore++;
        bear.setText(BearScore.toString());
    }
    public void UsecPoint(View view){
        TextView usec =(TextView)findViewById(R.id.UsecScore);
        UsecScore++;
        usec.setText(UsecScore.toString());
    }
    public void Reset(View view){
        TextView bear = (TextView)findViewById(R.id.BearScore);
        TextView usec =(TextView)findViewById(R.id.UsecScore);
        UsecScore = 0;
        BearScore = 0;
        usec.setText(UsecScore.toString());
        bear.setText(BearScore.toString());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("useccount", UsecScore);
        outState.putInt("bearcount", BearScore);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("useccount") && savedInstanceState.containsKey("bearcount")){
            UsecScore = savedInstanceState.getInt("useccount");
            BearScore = savedInstanceState.getInt("bearcount");
            resetUI();
        }
    }
    private void resetUI(){
        ((TextView) findViewById(R.id.UsecScore)).setText((UsecScore.toString()));
        ((TextView) findViewById(R.id.BearScore)).setText((BearScore.toString()));
    }
}