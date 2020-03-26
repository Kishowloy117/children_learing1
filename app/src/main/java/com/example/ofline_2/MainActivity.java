package com.example.ofline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void abc(View V)
    {
        Intent intent=new Intent(this,abcd_activity.class);
        startActivity(intent);

    }
    public void one_two(View V)
    {
        Intent  intent = new Intent(this,one_two.class);
        startActivity(intent);
    }
    public void word(View V)
    {
        Intent  intent = new Intent(this,words.class);
        startActivity(intent);
    }

}
