package com.example.zubairbhatti.bookmyumrah;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HajjFragment extends Fragment implements View.OnClickListener {

Button hajjSearch;
    public HajjFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hajj, container, false);

        hajjSearch = (Button) view.findViewById(R.id.hajjSearch);
        hajjSearch.setOnClickListener(this);
return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(),SearchActivity.class);
        startActivity(intent);
    }
}
