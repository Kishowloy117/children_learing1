package com.example.ofline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class one_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_two);
    }
    public void one(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.one);
        mp.start();
    }
    public void two(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.two);
        mp.start();
    }
    public void three(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.three);
        mp.start();
    }
    public void four(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.four);
        mp.start();
    }
    public void five(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.five);
        mp.start();
    }
    public void six(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.six);
        mp.start();
    }
    public void seven(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.seven);
        mp.start();
    }
    public void eight(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.eight);
        mp.start();
    }
    public void nine(View V)
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.nine);
        mp.start();
    }
}
