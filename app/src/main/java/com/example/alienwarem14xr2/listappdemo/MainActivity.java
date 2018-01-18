package com.example.alienwarem14xr2.listappdemo;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    //Step - define data source: string array
    String brands[]={
            "Apple",
            "Samsung",
            "HTC",
            "Huawei",
            "Asus",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "LAST ITEM"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Define adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                brands);

        //update list's adapter
        setListAdapter(adapter);
    }
}
