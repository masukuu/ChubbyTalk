package com.example.alab.myapplication;

/**
 * Created by alab on 8/1/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class SwearWordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swearwords);
    }

    /**
     * This method is called when the GoTheHell button is clicked.
     */
    public void GoTheHell(View view) {
        Intent intent = new Intent(SwearWordsActivity.this, Activity.class);
        startActivity(intent);
    }


    /**
     * This method is called when the Shit button is clicked.
     */
    public void Shit(View view) {
        Intent intent = new Intent(SwearWordsActivity.this, Activity.class);
        startActivity(intent);
    }


    /**
     * This method is called when the Idiot button is clicked.
     */
    public void Idiot(View view) {
        Intent intent = new Intent(SwearWordsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the FuckOff button is clicked.
     */
    public void FuckOff(View view) {
        Intent intent = new Intent(SwearWordsActivity.this, Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the WTF button is clicked.
     */
    public void WTF(View view) {
        Intent intent = new Intent(SwearWordsActivity.this, Activity.class);
        startActivity(intent);
    }
}
