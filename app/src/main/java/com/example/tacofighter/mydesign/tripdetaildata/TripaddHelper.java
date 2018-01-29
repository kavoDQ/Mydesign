package com.example.tacofighter.mydesign.tripdetaildata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/23.
 */

//創造資料庫的規則

public class TripaddHelper extends SQLiteOpenHelper {
    final static  String DB_NAME = "Trip.sqlite"; //資料庫名稱(旅行)
    final static int VERSION = 1 ;
    final static String _Trip = "tirp"; // 資料表名稱(活動)
    final static String _Payout = "payout"; //資料表名稱(活動紀錄細項)
    public  TripaddHelper (Context context)
    {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE \"trip\" ( `_id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `Title` TEXT, `startdate` TEXT, `enddate` TEXT, `budget` INTEGER )");
        final String tripSQL = "CREATE TABLE IF NOT EXISTS "+_Trip + "( " +
                "_tripTitle VARCHAR NOT NULL, " +
                "_tripStartdate DATE NOT NULL, " +
                "_tripEnddate DATE NOT NULL, " +
                "_tripBudget VARCHAR NOT NULL " +
                ");"; //標題 開始日 結束日 預算
        db.execSQL(tripSQL);
        final String trippaySQL = "CREATE TABLE IF NOT EXISTS "+_Payout + "( " +
                "_id INTEGER PRIMARY KEY NOT NULL  " +
                "_date VARCHAR NOT NULL, " +
                "_money INTEGER NOT NULL, " +
                "_subject VARCHAR NOT NULL "+
                "_currency VARCHAR NOT NULL, " +
                "_note VARCHAR NULL " + //預設可空白
                ");"; //id 日期 金額 項目 幣別 註記
        db.execSQL(trippaySQL);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        final String trippay = "DROP TABLE" +_Payout;
        db.execSQL(trippay);
    }
}
