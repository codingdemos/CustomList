package com.example.customlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ListView mListView;

    String[] countryNames = {"Australia", "Brazil", "China", "France", "Germany", "India", "Ireland", "Italy"
            , "Mexico", "Poland", "Russia", "Spain", "US"};
    int[] countryFlags = {R.drawable.flag_australia,
            R.drawable.flag_brazil,
            R.drawable.flag_china,
            R.drawable.flag_france,
            R.drawable.flag_germany,
            R.drawable.flag_india,
            R.drawable.flag_ireland,
            R.drawable.flag_italy,
            R.drawable.flag_maxico,
            R.drawable.flag_poland,
            R.drawable.flag_russia,
            R.drawable.flag_spain,
            R.drawable.flag_us};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, countryNames, countryFlags);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(MainActivity.this, DetailActivity.class);
                mIntent.putExtra("countryName", countryNames[i]);
                mIntent.putExtra("countryFlag", countryFlags[i]);
                startActivity(mIntent);
            }
        });
    }
}
