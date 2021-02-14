package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class edmlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edmlist);

        ArrayList<musicminder> edmmusic = new ArrayList<musicminder>();
        edmmusic.add(new musicminder(R.drawable.onemore, "SG Lewis, Nile Rodgers", "One More"));
        edmmusic.add(new musicminder(R.drawable.getlost, "Marcus Cito", "Get Lost"));
        edmmusic.add(new musicminder(R.drawable.stay, "LOUD ABOUT US!", "Stay"));
        edmmusic.add(new musicminder(R.drawable.flywithme, "yuma., Liad", "Fly With Me"));
        edmmusic.add(new musicminder(R.drawable.thecloudsfleetinglikeourillusions, "Behind Cloud, Kindbrew", "the clouds fleeting like our illusions"));


        musicadapter Adapter = new musicadapter(this, edmmusic);

        ListView listView = (ListView) findViewById(R.id.listedm);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                Intent playmove = new Intent(edmlist.this,player.class);
                playmove.putExtra("img_res", edmmusic.get(position).getimage());
                startActivity(playmove);
            }
        });

        listView.setAdapter(Adapter);
    }
}