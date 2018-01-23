package com.example.tacofighter.mydesign.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/23.
 */

public class TripDataBaseHelper extends SQLiteOpenHelper {
    final static  String DB_NAME = "Trip.sqlite";
    final static int VERSION = 1 ;
    public  TripDataBaseHelper(Context context)
    {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE `trip` ( `_ID` INTEGER, `Title` TEXT NOT NULL, `Time` INTEGER NOT NULL, `budget` INTEGER, `member` TEXT, `money` INTEGER, `subject` TEXT, `Note` TEXT, PRIMARY KEY(`_ID`) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
