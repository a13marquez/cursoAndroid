package com.buttonmethod1.amarquez.buttonmethod1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button button_first, button_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_first = (Button) findViewById(R.id.button1);
        button_second = (Button) findViewById(R.id.button2);
        button_first.setOnClickListener(this);
        button_second.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Log.d("a13marquez", "Button1 clicked");
                break;
            case R.id.button2:
                Log.d("a13marquez", "Button2 clicked");
        }


    }
}
