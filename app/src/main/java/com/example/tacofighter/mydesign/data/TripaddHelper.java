package com.example.tacofighter.mydesign.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/23.
 */

public class TripaddHelper extends SQLiteOpenHelper {
    final static  String DB_NAME = "Trip.sqlite";
    final static int VERSION = 1 ;
    public  TripaddHelper (Context context)
    {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE `trip` ( `_id` INTEGER NOT NULL, `tital` TEXT, `startdate` INTEGER, `enddate` INTEGER, `budget` TEXT, PRIMARY KEY(`_id`) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
