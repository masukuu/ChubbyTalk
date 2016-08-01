package com.example.alab.myapplication;

/**
 * Created by alab on 8/1/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class FlirtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flirt);
    }

    /**
     * This method is called when the AvailableTonight button is clicked.
     */
    public void AvailableTonight(View view) {
        Intent intent = new Intent(FlirtActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the HaveLunch button is clicked.
     */

    public void HaveLunch(View view) {
        Intent intent = new Intent(FlirtActivity.this, Activity.class);
        startActivity(intent);
    }


    /**
     * This method is called when the Beautiful button is clicked.
     */

    public void Beautiful(View view) {
        Intent intent = new Intent(FlirtActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the PhoneNumber button is clicked.
     */

    public void PhoneNumber(View view) {
        Intent intent = new Intent(FlirtActivity.this, Activity.class);
        startActivity(intent);
    }


}

