package com.example.clickeradvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Integer count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickAdd(View view){
        count++;
        TextView countView = (TextView)findViewById(R.id.counter);
        countView.setText(count.toString());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("count")){
            count = savedInstanceState.getInt("count");
            resetUI();
        }
    }
    private void resetUI(){
        ((TextView) findViewById(R.id.counter)).setText((count.toString()));
    }
}