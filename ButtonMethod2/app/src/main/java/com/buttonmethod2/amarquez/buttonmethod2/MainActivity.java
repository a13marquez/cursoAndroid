package com.buttonmethod2.amarquez.buttonmethod2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    Button button_first;
    Button button_second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_first = (Button)findViewById(R.id.button1);
        button_second = (Button)findViewById(R.id.button2);

        button_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("a13marquez", "button1 has clicked");
            }
        });

        button_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("a13marquez", "button2 has clicked");
            }
        });
    }
}
