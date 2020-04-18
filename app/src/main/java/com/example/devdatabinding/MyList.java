package com.example.devdatabinding;

import android.util.Log;

import java.util.ArrayList;

public class MyList {

    private static final String TAG = "MyList";

    private ArrayList<String> names = new ArrayList<>();

    public MyList() {
        names.add("Shawn");
        names.add("Shannon");
        names.add("Alexa");

        Log.d(TAG, "MyList: " + names);
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }
}
