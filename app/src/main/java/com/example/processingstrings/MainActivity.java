package com.example.processingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_phrase;
    private Button bu_gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_phrase = findViewById(R.id.tv_phrase);
        bu_gen = findViewById(R.id.bu_gen);

        tv_phrase.setText("Всё, что нам нужно – это " + (Phraser.PhraserGen()));
        bu_gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_phrase.setText("Всё, что нам нужно – это " + (Phraser.PhraserGen()));
            }
        });

    }
}
