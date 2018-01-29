package com.example.tacofighter.mydesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.tacofighter.mydesign.data.TripDAO;
import com.example.tacofighter.mydesign.data.trip;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public static TripDAO dao;
    TextView tv1;
    ListView lv;
    ArrayList<String> tripname;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testmain2);

        tv1 = findViewById(R.id.textView2);

//        Spinner spinner = findViewById(R.id.pick);
//        ArrayAdapter<CharSequence> pickList = ArrayAdapter.createFromResource(MainActivity.this,
//                R.array.select,android.R.layout.simple_list_item_1);
//        spinner.setAdapter(pickList);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date dt = new Date();
        String dts = sdf.format(dt);
        tv1.setText(dts);

       tripname = new ArrayList<>();
       //載入資料
       adapter = new ArrayAdapter<String>(
               MainActivity.this,android.R.layout.simple_list_item_1,tripname);
       lv = findViewById(R.id.listview);
       lv.setAdapter(adapter);
//       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() { //點擊的話跳的位子
//           @Override
//           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               Intent it = new Intent(MainActivity.this,StartactActivity.class);
//               it.putExtra("id",addatrip.getList().get(position).id);
//               startActivity(it);
//           }
       }



    @Override
    protected void onResume() {
        super.onResume();
        //refreshData();
    }
//    public void refreshData()
//    {
//        tripname.clear();
//        for (trip t : addatrip.getList())
//        {
//            tripname.add(t.title);
//        }
//        adapter.notifyDataSetChanged();
//    }  這邊因為還沒有資料 一打開就會是錯誤

    public void clickgo (View v)
    {
        Intent it = new Intent(MainActivity.this,StartactActivity.class);
        startActivity(it);
    }



}

