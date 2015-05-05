package com.explicitintent.amarquez.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class ActivityA extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity(View v){
        switch (v.getId()){
            case R.id.bMethod1:
                Intent i = new Intent(ActivityA.this, ActivityB.class);
                startActivity(i);
                break;
            case R.id.bMethod2:
                Intent j = new Intent("a13marquez.explicitintent.ActivityB");
                startActivity(j);
                break;
            case R.id.bMethod3:
                Intent k = new Intent();
                k.setClassName("com.explicitintent.amarquez.explicitintentt", " com.explicitintent.amarquez.explicitintent.ActivityB");
                startActivity(k);
                break;
        }
    }


}
