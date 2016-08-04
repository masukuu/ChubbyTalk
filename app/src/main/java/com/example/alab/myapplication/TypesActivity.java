package com.example.alab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class TypesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);

    }

    public void AskTheWay(View view) {
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }

    public void Greetings(View view) {
        Intent intent = new Intent(this, GreetingsActivity.class);
        startActivity(intent);
    }

    public void Shopping(View view) {
        Intent intent = new Intent(this, ShopFoodActivity.class);
        startActivity(intent);
    }

    public void Flirt(View view) {
        Intent intent = new Intent(this, FlirtActivity.class);
        startActivity(intent);
    }


    public void SwearWords(View view) {
        Intent intent = new Intent(this, SwearWordsActivity.class);
        startActivity(intent);
    }

    public void Extra(View view) {
        Intent intent = new Intent(this, ExtraActivity.class);
        startActivity(intent);
    }

}
