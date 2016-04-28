package com.example.zubairbhatti.bookmyumrah;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayAdapter<CharSequence> adapter;
    Button mypak, mycity, day, search;
    String s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button a = (Button) findViewById(R.id.price);
        mypak = (Button) findViewById(R.id.pak_class);
        mycity = (Button) findViewById(R.id.city);
        day=(Button)findViewById(R.id.days);
        search = (Button) findViewById(R.id.search);
        mypak.setOnClickListener(this);
        mycity.setOnClickListener(this);
        day.setOnClickListener(this);
        search.setOnClickListener(this);

        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopup();

            }
        });

    }

    private void popCity() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ///  builder.setTitle("Pop Up");
        builder.setMessage("Select your Choice");
        LayoutInflater inflater = getLayoutInflater();
        View Layout = inflater.inflate(R.layout.activity_test12, null);
        final ListView mainListView;
        ArrayAdapter<String> listAdapter;

        String[] city;

        // Find the ListView resource.
        mainListView = (ListView) Layout.findViewById(R.id.mainListView);

        // Create and populate a List of planet names.
        city = getResources().getStringArray(R.array.pkg_city);
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.addAll(Arrays.asList(city));

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.row, cityList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {
                String selectedFromList = (String) (mainListView.getItemAtPosition(myItemInt));
                mycity.setText(selectedFromList);
                // Toast.makeText(getApplication(),selectedFromList,Toast.LENGTH_LONG).show();
            }
        });
        builder.setView(Layout);

        builder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener()

                {

                    public void onClick (DialogInterface dialog,int which){
                        // Do nothing but close the dialog

                    }
                }

        );

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = builder.create();
        helpDialog.show();
    }

    private void Package() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ///  builder.setTitle("Pop Up");
        builder.setMessage("Select your Choice");
        LayoutInflater inflater = getLayoutInflater();
        View Layout = inflater.inflate(R.layout.activity_test12, null);
        final ListView mainListView;
        ArrayAdapter<String> listAdapter;

        String[] pak_name;

        // Find the ListView resource.
        mainListView = (ListView) Layout.findViewById(R.id.mainListView);

        // Create and populate a List of planet names.
        pak_name = getResources().getStringArray(R.array.pkg_name);
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.addAll(Arrays.asList(pak_name));

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.row, cityList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {
                String selectedFromList = (String) (mainListView.getItemAtPosition(myItemInt));
                mypak.setText(selectedFromList);
                // Toast.makeText(getApplication(),selectedFromList,Toast.LENGTH_LONG).show();
            }
        });
        builder.setView(Layout);
        builder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener()

                {

                    public void onClick (DialogInterface dialog,int which){

                    }
                }

        );


        AlertDialog helpDialog = builder.create();
        helpDialog.show();
    }
    private void popDay() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Select your Choice");
        LayoutInflater inflater = getLayoutInflater();
        View Layout = inflater.inflate(R.layout.activity_test12, null);
        final ListView mainListView;
        ArrayAdapter<String> listAdapter;

        final String[] days;

        // Find the ListView resource.
        mainListView = (ListView) Layout.findViewById(R.id.mainListView);

        // Create and populate a List
        days = getResources().getStringArray(R.array.No_Days);
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.addAll(Arrays.asList(days));

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.row, cityList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {
                String selectedFromList = (String) (mainListView.getItemAtPosition(myItemInt));
                day.setText(selectedFromList);
                // Toast.makeText(getApplication(),selectedFromList,Toast.LENGTH_LONG).show();
            }
        });
        builder.setView(Layout);
        builder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener()

                {

                    public void onClick (DialogInterface dialog,int which){


                    }
                }

        );

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = builder.create();
        helpDialog.show();
    }

    private void showPopup() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Select your Choice");
        LayoutInflater inflater = getLayoutInflater();
        View Layout = inflater.inflate(R.layout.popup, null);
        final RadioButton b1 = (RadioButton) Layout.findViewById(R.id.bt3);
        RadioGroup rdg1 = (RadioGroup) Layout.findViewById(R.id.as);
        RadioGroup rdg2 = (RadioGroup) Layout.findViewById(R.id.ad);
        final RadioButton b3 = (RadioButton) Layout.findViewById(R.id.radioButton);
        final RadioButton b4 = (RadioButton) Layout.findViewById(R.id.radioButton1);
        final RadioButton b5 = (RadioButton) Layout.findViewById(R.id.radioButton2);
        final RadioButton b6 = (RadioButton) Layout.findViewById(R.id.radioButton3);
        final RadioButton b9 = (RadioButton) Layout.findViewById(R.id.radioButton4);
        final RadioButton b10 = (RadioButton) Layout.findViewById(R.id.radioButton5);
        final RadioButton b2 = (RadioButton) Layout.findViewById(R.id.bt2);
        final RadioButton b7 = (RadioButton) Layout.findViewById(R.id.bt4);
        final RadioButton b8 = (RadioButton) Layout.findViewById(R.id.bt5);
        final RadioButton b12 = (RadioButton) Layout.findViewById(R.id.bt6);
        final RadioButton b13 = (RadioButton) Layout.findViewById(R.id.bt7);
        final TextView e = (TextView) Layout.findViewById(R.id.editText);
        final TextView e1 = (TextView) Layout.findViewById(R.id.editText2);
        rdg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (b3.isChecked()) {
                    String st = "19000";
                    e1.setText(st);
                }
                if (b4.isChecked()) {
                    String st = "29000";
                    e1.setText(st);
                }
                if (b5.isChecked()) {
                    String st = "39000";
                    e1.setText(st);
                }
                if (b6.isChecked()) {
                    String st = "49000";
                    e1.setText(st);
                }
                if (b9.isChecked()) {
                    String st = "59000";
                    e1.setText(st);
                }
                if (b10.isChecked()) {
                    String st = "69000";
                    e1.setText(st);
                }


            }
        });

        rdg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (b2.isChecked()) {
                    String name3 = "20000";
                    e.setText(name3);
                }
                if (b1.isChecked()) {
                    String name3 = "30000";
                    e.setText(name3);
                }
                if (b7.isChecked()) {
                    String name3 = "40000";
                    e.setText(name3);
                }
                if (b8.isChecked()) {
                    String name3 = "50000";
                    e.setText(name3);
                }
                if (b12.isChecked()) {
                    String name3 = "60000";
                    e.setText(name3);
                }
                if (b13.isChecked()) {
                    String name3 = "70000";
                    e.setText(name3);
                }
            }
        });
        builder.setView(Layout);
        builder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog

                    }
                });

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = builder.create();
        helpDialog.show();
    }



    @Override
    public void onClick(View v) {
        if (v == mypak) {

            Package();
        }
        if(v==mycity){
            popCity();
        }
        if(v==day){
            popDay();
        }
        if (v == search){
            Intent intent = new Intent(getApplicationContext(),ListViewActivity.class);
            startActivity(intent);
        }

    }
}
