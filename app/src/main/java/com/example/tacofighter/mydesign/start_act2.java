package com.example.tacofighter.mydesign;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tacofighter.mydesign.data.trip;

import java.util.ArrayList;

public class start_act2 extends AppCompatActivity //繼承頁面
{
    EditText ed4; // 新增預算金
  //  EditText ed5 = findViewById(R.id.editText6); // 新增成員
  //  TextView namebar = findViewById(R.id.textView8); //抓新增成員
    ArrayList<String> member ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_act2);

    }

    public void clickok (View v)
    {
       ed4 = findViewById(R.id.editText4);
       int budget = Integer.valueOf(ed4.getText().toString());
       MainActivity.addatrip.add(new trip(budget));   //我不知道怎麼把這邊打的資料放到上一頁新增的trip中
        //試了很多方法 幫括新增建構式也無法
       finish();
    }
//
//    public void  addman(TextView textView,ArrayList member)
//
//    {
//        if (member.size() != 0)
//        {
//            arrayList.remove(arrayList.size() - 1);
//            textView.setText(TextUtils.join(", ", arrayList));
//        }
//
//    }



}
