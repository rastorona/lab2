package com.example.processingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_phrase;
    private Button bu_gen;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_phrase = findViewById(R.id.tv_phrase);
        bu_gen = findViewById(R.id.bu_gen);
        tv_result = findViewById(R.id.tv_result);

        tv_phrase.setText("Всё, что нам нужно – это " + (Phraser.PhraserGen()));
        tv_result.setText(reverse());
        bu_gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_phrase.setText("Всё, что нам нужно – это " + (Phraser.PhraserGen()));
                tv_result.setText(reverse());
            }
        });

    }
    public String reverse () {
        String s = tv_phrase.getText().toString();
        String left = s.substring(0,s.indexOf("– это")-1);
        String right = s.substring(s.indexOf("– это")+7);
        return  Character.toUpperCase(s.charAt(s.indexOf("– это")+6))  + (right+" - это "+left+".").toLowerCase();
    }
}
