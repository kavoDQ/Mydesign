package com.example.tacofighter.mydesign;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class start_act2 extends AppCompatActivity //繼承頁面
{
    EditText ed4 = findViewById(R.id.editText4); // 新增預算金
    EditText ed5 = findViewById(R.id.editText6); // 新增成員
    TextView namebar = findViewById(R.id.textView8); //抓新增成員
    ArrayList<String> member ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_act2);

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

        @SuppressLint("ResourceType")

        public void CLadd(View v) {

            namebar.setText((CharSequence) ed5);
            namebar.setText("");

            Bundle act = new Bundle();
            act.putString("member", String.valueOf(ed5)); //儲存自訂的成員

        }
}
