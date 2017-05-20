package com.example.admin.amazingfact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 14-07-2016.
 */
public class CustomList extends ArrayAdapter<String> {
    private final Context context;
    private final  String[] listitems;
    private final Integer[] image;

    public CustomList(Context context, String[] listitems, Integer[] image) {
        super(context, R.layout.listviewlayout,listitems);
        this.context=context;
        this.listitems=listitems;
        this.image=image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=convertView;
        if(v==null){
            v = LayoutInflater.from(this.context).inflate(R.layout.listviewlayout, parent, false);
        }
        TextView textfact=(TextView)v.findViewById(R.id.textviewlist);
        ImageView getimage=(ImageView)v.findViewById(R.id.imageview1);
        textfact.setText(listitems[position]);
        getimage.setImageResource(image[position]);
        return v;
    }
}
