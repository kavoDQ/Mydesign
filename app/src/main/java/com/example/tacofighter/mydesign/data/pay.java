package com.example.tacofighter.mydesign.data;

/**
 * Created by TacoFighter on 2018/1/21.
 */

public class pay {  //這邊放有活動中的建構式
    public String actname; //活動名
    public String member; //人員
    public int budget; //預算
    public String note; //備忘錄

    public pay( String actname, String member,int budget,String note )
    {
        this.actname=actname;
        this.member=member;
        this.budget=budget;
        this.note=note;

    }


}
