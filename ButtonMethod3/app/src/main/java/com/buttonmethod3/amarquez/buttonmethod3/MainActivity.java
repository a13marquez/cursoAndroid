package com.buttonmethod3.amarquez.buttonmethod3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performStuff(View v){
        switch (v.getId()){
            case R.id.button1:
                Log.d("a13marquez", "Button1 clicked");
                break;
            case R.id.button2:
                Log.d("a13marquez", "Button2 clicked");
                break;
        }
    }
}
