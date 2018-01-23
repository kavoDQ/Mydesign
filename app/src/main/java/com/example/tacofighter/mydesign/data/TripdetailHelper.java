package com.example.tacofighter.mydesign.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/23.
 */

public class TripdetailHelper extends SQLiteOpenHelper { //活動細項
    final static  String DB_NAME = "Trip.sqlite";
    final static int VERSION = 1 ;
    public TripdetailHelper(Context context)
    {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE `trip_detail` ( `_id` INTEGER NOT NULL, `Time` INTEGER, `_tripid` INTEGER, `subject` INTEGER, `Money` INTEGER, `Currency` TEXT, `Note` TEXT, PRIMARY KEY(`_id`) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
