package com.example.musicapp;

import android.graphics.drawable.Drawable;

public class musicminder {
    private String martistname;
    private String msongname;
    private int mcover;

    public musicminder(int cover, String artistname, String songename)  {
        martistname = artistname;
        msongname = songename;
        mcover = cover;
    }

    public int getimage()
    {
        return mcover;
    }

    public String getmartistname()
    {
        return martistname;
    }

    public String getmsongname() {
        return msongname;
    }

}
