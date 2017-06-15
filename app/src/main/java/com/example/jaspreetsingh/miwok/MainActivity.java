package com.example.jaspreetsingh.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void numbersActivity(View view)  {
        //Executed in an Activity, so 'this' is the context
        Intent i = new Intent(this, NumbersActivity.class);
        //It takes the object 'i' to start new activity
        startActivity(i);
    }
}
