package com.example.yogesh.birthdaycardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void appear(View view){

        ImageView b1 =(ImageView) findViewById(R.id.b1);
        ImageView b2 =(ImageView) findViewById(R.id.b2);
        ImageView b3 =(ImageView) findViewById(R.id.b3);
        ImageView b4 =(ImageView) findViewById(R.id.b4);

        b1.animate().translationYBy(-1000f).setDuration(2500);
        b2.animate().translationYBy(-1000f).setDuration(2500);
        b3.animate().translationYBy(-1000f).setDuration(2500);
        b4.animate().translationYBy(-1000f).setDuration(2500);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView b1 =(ImageView) findViewById(R.id.b1);
        ImageView b2 =(ImageView) findViewById(R.id.b2);
        ImageView b3 =(ImageView) findViewById(R.id.b3);
        ImageView b4 =(ImageView) findViewById(R.id.b4);

        b1.setTranslationY(1000f);
        b2.setTranslationY(1000f);
        b3.setTranslationY(1000f);
        b4.setTranslationY(1000f);

    }
}
