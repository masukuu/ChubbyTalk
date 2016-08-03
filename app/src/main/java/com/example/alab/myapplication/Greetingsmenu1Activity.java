package com.example.alab.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;


/**
 * Created by Alab on 8/3/2016.
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;




public class Greetingsmenu1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
    }

    public void playSound(View v) {
        int id = v.getId();
        SoundPlayer.playSound(id, this);
    }
}

