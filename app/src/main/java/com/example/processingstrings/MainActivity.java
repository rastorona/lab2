package com.example.processingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_phrase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_phrase = findViewById(R.id.tv_phrase);


        tv_phrase.setText("Всё, что нам нужно – это " + (Phraser.PhraserGen()));

    }

}