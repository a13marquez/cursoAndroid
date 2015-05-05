package com.amarquez.toastmessage;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void showToastMessage(View v){
       Toast toast = Toast.makeText(MainActivity.this, "Mensaje Toast", Toast.LENGTH_LONG);
       toast.show();

   }
}
