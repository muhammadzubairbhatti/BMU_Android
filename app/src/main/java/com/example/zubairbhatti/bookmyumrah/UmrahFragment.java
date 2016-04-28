package com.example.zubairbhatti.bookmyumrah;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class UmrahFragment extends Fragment  {

   // Button umrahSearch;

    public UmrahFragment() {
        // Required empty public constructor
    }
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_umrah, container, false);

        View rootView = inflater.inflate(R.layout.fragment_umrah, container, false);
        context = rootView.getContext(); // Assign your rootView to context



        final Button button = (Button) rootView.findViewById(R.id.umrahSearch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
                Intent intent = new Intent(context, SearchActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }



}





