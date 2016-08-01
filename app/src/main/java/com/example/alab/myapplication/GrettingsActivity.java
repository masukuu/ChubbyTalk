package com.example.alab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class GrettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
    }

    /**
     * This method is called when the GoodMorning button is clicked.
     */
    public void GoodMorning(View view) {
        Intent intent = new Intent(GrettingsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Thank button is clicked.
     */

    public void Thank(View view) {
        Intent intent = new Intent(GrettingsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the GoodBye button is clicked.
     */
    public void GoodBye(View view) {
        Intent intent = new Intent(GrettingsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Sorry button is clicked.
     */

    public void Sorry(View view) {
        Intent intent = new Intent(GrettingsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Excuse button is clicked.
     */

    public void Excuse(View view) {
        Intent intent = new Intent(GrettingsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Never button is clicked.
     */

    public void Never(View view) {
        Intent intent = new Intent(GrettingsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Time button is clicked.
     */

    public void Time(View view) {
        Intent intent = new Intent(GrettingsActivity.this, Activity.class);
        startActivity(intent);
    }

}
