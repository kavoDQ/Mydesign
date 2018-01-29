package com.example.tacofighter.mydesign.data;

/**
 * Created by TacoFighter on 2018/1/21.
 */

public class trip {  //這邊放有活動中的建構式
    public int id; //活動名
    public String title; //人員
    public String startdate;// 旅遊開始時間
    public String enddate;//   旅遊結束時間
    public int budget; //預算


    public trip( int id, String title,String startdate,String enddate,int budget)
    {
        this.id = id ;
        this.title = title ;
        this.startdate = startdate ;
        this.enddate=enddate ;
        this.budget=budget;


    }

}
