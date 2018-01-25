package com.example.tacofighter.mydesign.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Student on 2018/1/23.
 */

public class Tripadd {
    Context context;
    SQLiteDatabase db;
    public Tripadd (Context context)   //新增資烙用
    {
        this.context = context;
        TripaddHelper helper = new TripaddHelper(context);
        db = helper.getWritableDatabase();
    }

    public boolean add(trip t)  //增加資料細項
    {
        ContentValues cv = new ContentValues();
        cv.put("_id",t.id);
        cv.put("title",t.title);
        cv.put("startdate",t.startdate);
        cv.put("enddate",t.enddate);
        cv.put("budget",t.budget);
        db.insert("trip",null,cv);
        return true;
    }

    public ArrayList<trip> getList(){
        ArrayList<trip> mytrip = new ArrayList<>();
        Cursor c = db.query("trip", new String[]{"_id","title","startdate","enddate","budget"},null,null,null,null,null);
        if(c.moveToFirst())
        {
            //用於獲取指定欄位名稱的int 型別的值
            trip t1 = new trip(c.getInt(1),c.getString(2),c.getString(3),c.getString(4),c.getInt(5));
            mytrip.add(t1);
            while (c.moveToFirst())
            {
                trip t = new trip(c.getInt(1),c.getString(2),c.getString(3),c.getString(4),c.getInt(5));
                mytrip.add(t);
            }
        }
        return mytrip;
    }

    public trip gettrip(int id)//透過ID來找 不知道能不能用其他
    {
        Cursor c =db.query("trip", new String[]{"_id","title","startdate","enddate","budget"},"_id=?",new String[]{String.valueOf(id)},null,null,null);
        if(c.moveToFirst())
        {
            trip t1 = new trip(c.getInt(1),c.getString(2),c.getString(3),c.getString(4),c.getInt(5));
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


    public boolean delete(int id)  //照ID刪除資料
    {
        db.delete("trip","_id=?",new String[]{String.valueOf(id)});
        return true;
    }
}
