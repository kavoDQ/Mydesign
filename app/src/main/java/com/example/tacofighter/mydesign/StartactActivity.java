package com.example.tacofighter.mydesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Toast;


public class StartactActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startact);

    }



    public void CL1 (View v)
    {
        Intent it = new Intent(StartactActivity.this,start_act2.class); //跳頁
        startActivity(it);
//        EditText ed2;
//        ed2 = findViewById(R.id.editText2);
//        String name = ed2.getText().toString();
//
//        if (name.matches(""))
//        {
//            Toast toast = Toast.makeText(this,"不能是空白!!",Toast.LENGTH_SHORT);
//            toast.show();
//        }
//        else{
//            Intent it = new Intent(StartactActivity.this,start_act2.class); //跳頁
//
//           // Bundle act = new Bundle();
//            //act.putString("actname",ed.getText().toString() ); //儲存自訂的活動名
//            //it.putExtras(act); //要用s...
//            startActivity(it);
//        }


    }
}

