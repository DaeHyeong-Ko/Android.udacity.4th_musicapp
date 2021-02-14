package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class poplist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poplist);

        ArrayList<musicminder> popmusic = new ArrayList<musicminder>();
        popmusic.add(new musicminder(R.drawable.crowhurstsmeme,"Ben Howard","Crowhurst's Meme"));
        popmusic.add(new musicminder(R.drawable.thesekidsweknew,"Rostam","These Kids We Knew"));
        popmusic.add(new musicminder(R.drawable.alreadyfalling,"Puma Blue","Already Falling"));
        popmusic.add(new musicminder(R.drawable.allineed,"Verzache","All I Need"));
        popmusic.add(new musicminder(R.drawable.slide,"Chase Atlantic","SLIDE"));

        musicadapter Adapter = new musicadapter(this, popmusic);

        ListView listView = (ListView) findViewById(R.id.listp);

        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                Intent playmove = new Intent(poplist.this,player.class);
                playmove.putExtra("img_res", popmusic.get(position).getimage());
                startActivity(playmove);
            }
        });
    }
}