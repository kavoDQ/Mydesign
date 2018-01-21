package com.example.tacofighter.mydesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);

        Spinner spinner = findViewById(R.id.pick);
        ArrayAdapter<CharSequence> pickList = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.select,android.R.layout.simple_list_item_1);
        spinner.setAdapter(pickList);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date dt = new Date();
        String dts = sdf.format(dt);
        tv1.setText(dts);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void clickgo (View v)
    {
        Intent it = new Intent(MainActivity.this,StartactActivity.class);
        startActivity(it);
    }

}

