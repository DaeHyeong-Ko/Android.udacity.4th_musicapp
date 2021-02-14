package com.example.musicapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class musicadapter extends ArrayAdapter {
    public musicadapter(Activity context, ArrayList<musicminder> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so    it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        musicminder currentWord = (musicminder) getItem(position);

        ImageView cover = (ImageView) listItemView.findViewById(R.id.image);
        cover.setImageResource(currentWord.getimage());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistname = (TextView) listItemView.findViewById(R.id.one);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        artistname.setText(currentWord.getmartistname());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songname = (TextView) listItemView.findViewById(R.id.two);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songname.setText(currentWord.getmsongname());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
