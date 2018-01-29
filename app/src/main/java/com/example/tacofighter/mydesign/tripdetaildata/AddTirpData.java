package com.example.tacofighter.mydesign.tripdetaildata;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by TacoFighter on 2018/1/30.
 */
//這是用來儲存新創資料
public class AddTirpData
{
    public class Tripadd {
        Context context;
        SQLiteDatabase db;
        String title; //標題
        String startdate; //開始日
        String enddate; //結束日
        String budget; //預算
        long check;

        public Tripadd(Context context, String title, String startdate, String enddate, String budget)   //新增資烙庫表格用
        {
            this.context = context;
            this.title = title;
            this.startdate = startdate;
            this.enddate = enddate;
            this.budget = budget;
            //要存的項目
        }

        public long addToDB()  //增加資料細項
        {
            TripaddHelper myhelper = new TripaddHelper(context); //上面的
            SQLiteDatabase sqLiteDatabase = myhelper.getWritableDatabase();//打開
            ContentValues cv = new ContentValues();

            cv.put("_tripTitle", title); //插入名稱
            cv.put("_tripStartdate", startdate); //插入開始日
            cv.put("_tripEnddate", enddate);//插入結束日
            cv.put("_tripBudget", budget);//插入預算
            check = sqLiteDatabase.insert("trip", null, cv); //選擇要存入的表
            myhelper.close(); //關閉
            return check;
        }
    }
}
