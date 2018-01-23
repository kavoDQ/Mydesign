package com.example.tacofighter.mydesign.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Student on 2018/1/23.
 */

public class Tripadd {
    Context context;
    SQLiteDatabase db;
    public Tripadd (Context context)
    {
        this.context = context;
        TripDataBaseHelper helper = new TripDataBaseHelper(context);
        db = helper.getWritableDatabase();
    }

    public boolean add(Trip t)
    {

    }
}
