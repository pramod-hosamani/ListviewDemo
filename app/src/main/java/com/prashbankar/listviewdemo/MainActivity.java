package com.prashbankar.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    //single row structure i.e. image,text,description
    //create datasource text,image,description
    //create custom adapter

    ListView lst;
    String[] fruitname={"Mango","Banana","WaterMelon","Grapes","Kivi","Apple"};
    String[] desc={"This is mango","This is Banana","This is Watermelon","this is grapes","this is kivi","this is apple"};
    Integer[] imgid={R.drawable.bank,R.drawable.controls,R.drawable.dhoni,R.drawable.help,R.drawable.dhoni,R.drawable.bank};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst=(ListView)findViewById(R.id.listview);
        CustomListView customListView=new CustomListView(this,fruitname,desc,imgid);
        lst.setAdapter(customListView);
    }
}
