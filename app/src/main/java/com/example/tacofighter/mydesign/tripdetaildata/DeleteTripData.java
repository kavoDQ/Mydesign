package com.example.tacofighter.mydesign.tripdetaildata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by TacoFighter on 2018/1/30.
 */


//這是用來刪除建立的活動,用資料表的tripTitle當索引


public class DeleteTripData {
    Context context;
    String tripTitle;
    private String deleteQuery;


    public DeleteTripData(Context context, String tripTitle) {
        this.tripTitle = tripTitle;
        this.context = context;
    }
    public void DeleteData(){
        TripaddHelper myhelper = new TripaddHelper(context);
        SQLiteDatabase sqLiteDatabase = myhelper.getWritableDatabase();
        deleteQuery = "DELETE FROM target WHERE _tripTitle = '"+tripTitle+"'";
        sqLiteDatabase.execSQL(deleteQuery);
    }
}

