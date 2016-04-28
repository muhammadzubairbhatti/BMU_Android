package com.example.zubairbhatti.bookmyumrah;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {


    ListView listView;
   /* int[] package_poster_resource = {R.drawable.a, R.drawable.b,
            R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.home,
            R.drawable.me, R.drawable.logo,
            R.drawable.message, R.drawable.settings};*/
    String[] package_title;
    String[] package_title1;
    String[] package_rating;
    String[] package_rating1;
    String[] package_customer_rating;
    String[] package_customer_rating1;
    PackageAdapter adapter;
    int pageCount;
    View footer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listView);

        listView.setBackgroundResource(R.drawable.border);

        package_rating = getResources().getStringArray(R.array.package_expert_rating);
        package_title = getResources().getStringArray(R.array.package_titles);
        package_customer_rating = getResources().getStringArray(R.array.package_customer_rating);

        int i =0;

        adapter = new PackageAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        for (String titles: package_title){
            PackageDataProvider dataProvider = new PackageDataProvider(
                    titles,package_rating[i],package_customer_rating[i]);
            adapter.add(dataProvider);
            i++;
        }

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getApplicationContext(), UmrahPackages.class);
        startActivity(intent);
    }
});



}}