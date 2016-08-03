package com.example.alab.myapplication;

/**
 * Created by alab on 8/1/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ShopFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopfood);
    }
    public void playSound(View v) {
        int id = v.getId();
        SoundPlayer.playSound(id, this);
    }

    /**
     * This method is called when the Menu button is clicked.
     */
    public void Menu(View view) {
        Intent intent = new Intent(ShopFoodActivity.this, ShopFoodmenu1Activity.class);
        startActivity(intent);
    }


    /**
     * This method is called when the Recommed button is clicked.
     */
    public void Recommed(View view) {
        Intent intent = new Intent(ShopFoodActivity.this, ShopFoodmenu2Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the HowMuch button is clicked.
     */
    public void HowMuch(View view) {
        Intent intent = new Intent(ShopFoodActivity.this, ShopFoodmenu3Activity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Discount button is clicked.
     */
    public void Discount(View view) {
        Intent intent = new Intent(ShopFoodActivity.this, ShopFoodmenu4Activity.class);
        startActivity(intent);
    }
}


