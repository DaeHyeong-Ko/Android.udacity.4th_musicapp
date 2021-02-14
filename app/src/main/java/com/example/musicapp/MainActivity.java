package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView edmlist = (TextView) findViewById(R.id.edmbutton);
        edmlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the edmlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent edmIntent = new Intent(MainActivity.this, edmlist.class);
                startActivity(edmIntent);
            }
        });

        TextView poplist = (TextView) findViewById(R.id.popbutton);
        poplist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the poplist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, poplist.class);
                startActivity(popIntent);
            }
        });
    }
}