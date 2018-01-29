package com.example.tacofighter.mydesign.tripdetaildata;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by TacoFighter on 2018/1/30.
 */
//這是用來儲存新創資料
public class AddTripPayoutDATA
{
    public class TripPayoutDATA {
        Context context;
        SQLiteDatabase db;
        int id;             //id
        String date;        //日期
        int money;       //金額
        String subject;     //項目
        String currency;    //幣別
        String note;        //註記
        long check;

        public TripPayoutDATA(Context context, int id, String date, int money, String subject,String currency,String note)   //新增資烙庫表格用
        {
            this.context = context;
            this.id = id ;             //id
            this.date = date;        //日期
            this.money = money;       //金額
            this.subject= subject;     //項目
            this.currency = currency;    //幣別
            this.note = note;        //註記
            //要存的項目
        }

        public long addToDB()  //增加資料細項
        {
            TripaddHelper myhelper = new TripaddHelper(context); //上面的
            SQLiteDatabase sqLiteDatabase = myhelper.getWritableDatabase();//打開
            ContentValues cv = new ContentValues();

            cv.put("_id",id); //插入id   但是似乎該用trip表也有的title當共同變數?
            cv.put("_date", date); //插入日
            cv.put("_money", money);//插入$
            cv.put("_subject", subject);//插入項目
            cv.put("_currency", currency); //插入幣別
            cv.put("_note", note); //插入自己的註記
            check = sqLiteDatabase.insert("payout", null, cv); //選擇要存入的表
            myhelper.close(); //關閉
            return check;
        }
    }
}
