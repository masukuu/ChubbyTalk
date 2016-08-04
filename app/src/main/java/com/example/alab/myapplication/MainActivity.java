package com.example.alab.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cover(View view){

        int btnId = view.getId();

        switch (btnId) {
            case R.id.imageButton:
                Intent Intent_page2 = new Intent(this, TypesActivity.class);
                startActivity(Intent_page2);
                break;
        }
    }
}
