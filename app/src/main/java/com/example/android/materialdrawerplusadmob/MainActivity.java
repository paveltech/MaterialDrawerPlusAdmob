package com.example.android.materialdrawerplusadmob;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.ads.InterstitialAd;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;

public class MainActivity extends MaterialNavigationDrawer{

    InterstitialAd interstitialAd;
    @Override
    public void init(Bundle savedInstanceState) {

        setDrawerHeaderImage(R.mipmap.ic_launcher);
        this.addSection(newSection("Section 1" , new Fragment_1()));
        this.addSection(newSection("Section 2" , new Fragment_2()));
        this.addSection(newSection("Section 2" , new Fragment_3()));

        this.addSection(newSection("Section 4", R.mipmap.ic_launcher,new Fragment_1()).setSectionColor(Color.parseColor("#9c27b0")));
        this.addSection(newSection("Section 5",R.mipmap.ic_launcher,new Fragment_2()).setSectionColor(Color.parseColor("#03a9f4")));


        this.setBackPattern(MaterialNavigationDrawer.BACKPATTERN_BACK_TO_FIRST);
    }
}
