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
    public void playSound(View v) {
        int id = v.getId();
        SoundPlayer.playSound(id, this);
    }

    /**
     * This method is called when the mean button is clicked.
     */
    public void mean(View view) {
        Intent intent = new Intent(ExtraActivity.this, Extramenu1Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Got button is clicked.
     */
    public void Got(View view) {
        Intent intent = new Intent(ExtraActivity.this, Extramenu2Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the DonnotKnow button is clicked.
     */
    public void DonnotKnow(View view) {
        Intent intent = new Intent(ExtraActivity.this, Extramenu3Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Really button is clicked.
     */
    public void Really(View view) {
        Intent intent = new Intent(ExtraActivity.this, Extramenu4Activity.class);
        startActivity(intent);
    }
}


