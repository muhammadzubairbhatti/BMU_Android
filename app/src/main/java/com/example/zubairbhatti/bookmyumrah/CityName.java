package com.example.zubairbhatti.bookmyumrah;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class CityName extends Activity implements AdapterView.OnItemSelectedListener {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_name);
        String[] city;

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );

        // Create and populate a List of planet names.
        city = getResources().getStringArray(R.array.pkg_city);
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.addAll( Arrays.asList(city) );

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.row, cityList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView textView =(TextView)view.findViewById(R.id.rowTextView);
        String text = textView.getText().toString();
       // Toast.makeText(this,text,Toast.LENGTH_LONG);
        System.out.println("Choosen Country = : " + text);

//        Intent intent = new
//        Intent(getApplicationContext(), MainActivity.class);
//        intent.putExtra("myKey", text);
//        startActivity(intent);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}