package com.example.jaspreetsingh.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.util.Log.v;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create a ArrayList of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int index = 0;
        while(index < words.size()) {
            //Create a TextView called wordView
            TextView wordView = new TextView(this);
            //Display the Text on the Screen
            wordView.setText(words.get(index));
            //Add the TextView as a child to parent View called rootView using .addView method
            rootView.addView(wordView);
            //update the counter by index = index +1;
            index++;
        }
    }
}
