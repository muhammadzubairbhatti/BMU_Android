package com.example.zubairbhatti.bookmyumrah;

/**
 * Created by Zubair Bhatti on 4/12/2016.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PackageAdapter extends ArrayAdapter {

    List list = new ArrayList();


    public PackageAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class DataHandler{
        ImageView Poster;
        TextView title;
        TextView rating;
        TextView customer_rating;
    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;
        if (convertView == null){

            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);
            handler = new DataHandler();
            //    handler.Poster = (ImageView) row.findViewById(R.id.package_poster);
            handler.title = (TextView) row.findViewById(R.id.package_title);
            handler.rating = (TextView) row.findViewById(R.id.package_rating);
            handler.customer_rating = (TextView) row.findViewById(R.id.package_customer_rating);
            row.setTag(handler);

        }else {
            handler = (DataHandler) row.getTag();
        }
        PackageDataProvider dataProvider;
        dataProvider = (PackageDataProvider) this.getItem(position);
        // handler.Poster.setImageResource(dataProvider.getPackage_poster_resource());
        handler.title.setText(dataProvider.getPackage_title());
        handler.rating.setText(dataProvider.getPackage_rating());
        handler.customer_rating.setText(dataProvider.getPackage_customer_rating());

        return row;
    }

}
