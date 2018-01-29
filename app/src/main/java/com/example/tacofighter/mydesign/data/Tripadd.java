/*
package com.example.tacofighter.mydesign.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.tacofighter.mydesign.tripdetaildata.TripaddHelper;

import java.util.ArrayList;


/**
 * Created by Student on 2018/1/23.


public class Tripadd  {
    Context context;
    SQLiteDatabase db;
    String title; //標題
    String startdate; //開始日
    String enddate; //結束日
    String budget; //預算
    long check;

    public Tripadd (Context context,String title,String startdate,String enddate,String budget)   //新增資烙庫表格用
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

        cv.put("_tripTitle",title); //插入名稱
        cv.put("_tripStartdate",startdate); //插入開始日
        cv.put("_tripEnddate",enddate);//插入結束日
        cv.put("_tripBudget",budget);//插入預算
        check = sqLiteDatabase.insert("trip",null,cv); //選擇插入的表
        myhelper.close(); //關閉
        return check;
    }

    //抓取清單
    @Override
    public ArrayList<trip> getList()
    {
        mytrip = new ArrayList<>();
        Cursor c = db.query("trip", new String[]{"_id","title","startdate","enddate","budget"},null,null,null,null,null);
        if(c.moveToFirst())
        {
            //用於獲取指定欄位名稱的int 型別的值
            trip t1 = new trip(Integer.valueOf(c.getInt(0)),c.getString(1),c.getString(2),c.getString(3),c.getInt(4));
            mytrip.add(t1);
            while (c.moveToFirst())
            {
                t1 = new trip(Integer.valueOf(c.getInt(0)),c.getString(1),c.getString(2),c.getString(3),c.getInt(4));
                mytrip.add(t1);
            }
        }
        return mytrip;
    }

    @Override
    public trip gettrip(int id)//透過ID來找
        {
            return  gettripByid(id);
        }

    private trip gettripByid(int id)

    {
        Cursor c =db.query("trip", new String[]{"_id","title","startdate","enddate","budget"},"_id=?",new String[]{String.valueOf(id)},null,null,null);
        if(c.moveToFirst())
        {
            trip t1 = new trip(Integer.valueOf(c.getInt(0)),c.getString(1),c.getString(2),c.getString(3),c.getInt(4));
            return  t1;
        }
        return  null;

    }

    public boolean update(trip t) //更新資料
    {
        ContentValues cv = new ContentValues();
        cv.put("title",t.title);
        cv.put("startdate",t.startdate);
        cv.put("enddate",t.enddate);
        cv.put("budget",t.budget);
        db.update("trip",cv,"_id=?",new String[]{String.valueOf(t.id)});
        return  true;
    }

    @Override
    public boolean delete(int id) {
        db.delete("trip","_id=?",new String[]{String.valueOf(id)});
        return true;
    }


}
*/