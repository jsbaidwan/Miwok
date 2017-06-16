package com.example.jaspreetsingh.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.jaspreetsingh.miwok.R.id.numbers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that show numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            //This code in this method is executed when the number View is clicked on
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }

        });

    }
}
