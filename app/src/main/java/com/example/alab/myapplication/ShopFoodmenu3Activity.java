package com.example.alab.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee4095 on 8/3/2016.
 */

public class ShopFoodmenu3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopfoodmenu3);
    }

    public void playSound(View v) {
        int id = v.getId();
        SoundPlayer.playSound(id, this);
    }
}
