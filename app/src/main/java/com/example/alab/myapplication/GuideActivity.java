package com.example.alab.myapplication;

/**
 * Created by alab on 8/1/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
    }

    /**
     * This method is called when the Where button is clicked.
     */
    public void Where(View view) {
        Intent intent = new Intent(GuideActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the GetOff button is clicked.
     */

    public void GetOff(View view) {
        Intent intent = new Intent(GuideActivity.this, Activity.class);
        startActivity(intent);
    }


}
