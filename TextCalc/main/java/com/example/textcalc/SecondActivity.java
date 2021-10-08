package com.example.textcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        try {
            TextView textView = (TextView) findViewById(R.id.answerText);
            Integer firstNumInt = getIntent().getIntExtra("firstNumInt", 0);
            Integer secondNumInt = getIntent().getIntExtra("secondNumInt", 0);
            Integer answer = firstNumInt + secondNumInt;
            String textAnswer;
            if (secondNumInt < 0){
                textAnswer = firstNumInt.toString() + "+(" + secondNumInt.toString() + ")=" + answer.toString();
            } else {
                textAnswer = firstNumInt.toString() + "+" + secondNumInt.toString() + "=" + answer.toString();
            }
            textView.setText(textAnswer);
        } catch (Exception e){
            Toast.makeText(this, "Что-то пошло не так...", Toast.LENGTH_LONG);
        }
    }
}
