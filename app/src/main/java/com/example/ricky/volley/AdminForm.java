package com.example.ricky.volley;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;
import android.content.res.Configuration;

/**
 * Created by Ricky on 11/29/2017.
 */

public class AdminForm extends TabActivity{
    final String[] tab_menu = {
            "Beranda",
            "Content",
            "Track"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost); // initiate TabHost
        TabHost.TabSpec spec; // Reusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab


        spec = tabHost.newTabSpec("beranda"); // Create a new TabSpec using tab host
        spec.setIndicator("Beranda"); // set the “HOME” as an indicator
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent(this, Beranda.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        //english to indonesia
        intent = new Intent().setClass(this, MainActivity.class);
        spec = tabHost.newTabSpec("Content").setIndicator(tab_menu[1]).setContent(intent);
        tabHost.addTab(spec);

        //indonesia to english
        intent = new Intent().setClass(this, MapsActivity.class);
        spec = tabHost.newTabSpec("Track").setIndicator(tab_menu[2]).setContent(intent);
        tabHost.addTab(spec);

        // select default tab
        tabHost.setCurrentTab(1);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                // display the name of the tab whenever a tab is changed
                Toast.makeText(getApplicationContext(), tabId, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
