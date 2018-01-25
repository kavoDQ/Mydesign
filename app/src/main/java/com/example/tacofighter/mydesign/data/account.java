package com.example.tacofighter.mydesign.data;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by TacoFighter on 2018/1/21.
 */

//public class accountDAO {
//
//    public ArrayList<pay> travel;
//    Context context; //要getfile
//    public accountDAO(Context context)
//    {
//        this.context = context;
//        travel = new ArrayList<>();
//    }
//
//    public boolean add(pay s)
//    {
//        travel.add(s);
//        saveFile();
//
//    }
//
//    public void saveFile()  //存檔
//    {
//        File f = new File(context.getFilesDir(),"setact.txt"); //把活動資料都存在setact中
//        FileWriter fw = null;
//        try{
//            fw = new FileWriter(f);
//            Gson gson = new Gson();
//            String data =gson.toJson(travel);
//            fw.write(data);
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public void load()
//    {
//        File f = new File(context.getFilesDir(),"setact.txt");
//        FileReader fr = null;
//        try {
//            fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            String str = br.readLine(); //讀txt的整行資料
//            Gson gson = new Gson();
//            travel = gson.fromJson(str, new TypeToken<ArrayList<pay>>(){}.getType());
//            br.close();
//            fr.close();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    public ArrayList<pay> getList()
//    {
//        load();
//        return travel;
//    }
//
//    String year;    //年,從日曆開始
//    String month;   //月,從日曆開始
//    String day;     //日,從日曆開始
//    //   int Budget;     //預算,用於有活動？
//
//    ArrayList<ArrayList<String>> pay=new ArrayList<ArrayList<String>>();  //pay為~有活動~的付錢金額
//    ArrayList<ArrayList<String>> pay2=new ArrayList<ArrayList<String>>();  //pay2為~沒有~活動項目~的付錢金額
//
//    String kind;    //類別，為輸入金額的項目分類
//
////    String myself;  //沒活動類別
////   String travel;  //有活動類別
//
//    String receipt; //收據，為輸入金額，下方給商品拍照的圖檔
//    String notes;   //備註，為輸入金額，下方給商品輸入註解的文字
//
//
//
//    public accountDAO(String year, String month, String day, String kind, String receipt, String notes)
//    {
//        this.year=year;
//        this.month=month;
//        this.day=day;
//        this.kind=kind;
//        this.receipt=receipt;
//        this.notes=notes;
//    }
//
//
//}
