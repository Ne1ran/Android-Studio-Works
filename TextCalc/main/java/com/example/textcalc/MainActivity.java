package com.example.textcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCalculating(View view){
        EditText firstNumET = findViewById(R.id.firstNum);
        EditText secondNumET = findViewById(R.id.secondNum);
        try {
            String firstNumStr = String.valueOf(firstNumET.getText());
            String secondNumStr = String.valueOf(secondNumET.getText());
            int firstNumInt = Integer.parseInt(firstNumStr);
            int secondNumInt = Integer.parseInt(secondNumStr);
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("firstNumInt", firstNumInt);
            intent.putExtra("secondNumInt", secondNumInt);
            startActivity(intent);
        } catch (Exception e){
            Toast.makeText(this, "Введены неправильные данные", Toast.LENGTH_LONG).show();
        }
    }
}

