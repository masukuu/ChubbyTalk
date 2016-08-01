package com.example.alab.myapplication;

/**
 * Created by alab on 8/1/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ExtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
    }

    /**
     * This method is called when the mean button is clicked.
     */
    public void mean(View view) {
        Intent intent = new Intent(ExtraActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Got button is clicked.
     */
    public void Got(View view) {
        Intent intent = new Intent(ExtraActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the DonnotKnow button is clicked.
     */
    public void DonnotKnow(View view) {
        Intent intent = new Intent(ExtraActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Really button is clicked.
     */
    public void Really(View view) {
        Intent intent = new Intent(ExtraActivity.this, Activity.class);
        startActivity(intent);
    }
}


