package com.example.tacofighter.mydesign.tripdetaildata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by TacoFighter on 2018/1/30.
 */


//這是用來刪除建立的活動,用資料表的tripTitle當索引


public class DeleteTripPayoutData
{
    Context context;
    int id;
    private String deleteQuery;


    public DeleteTripPayoutData(Context context, int id) {
        this.id = id;
        this.context = context;
    }
    public void DeleteData(){
        TripaddHelper myhelper = new TripaddHelper(context);
        SQLiteDatabase sqLiteDatabase = myhelper.getWritableDatabase();
        deleteQuery = "DELETE FROM target WHERE _id = '"+id+"'";
        sqLiteDatabase.execSQL(deleteQuery);
    }
}

