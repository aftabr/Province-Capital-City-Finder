package com.example.assignment3_rida_aftab;

import android.widget.ArrayAdapter;
import java.util.List;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


public class MyAdapter extends ArrayAdapter<Provincial> {



   List<Provincial> provincialList;
    public MyAdapter(Context context, int resource, List<Provincial> objects) {
        super(context,resource,objects);
        this.provincialList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.customlist, null);
        }


        TextView province = (TextView) view.findViewById(R.id.province);
        TextView city = (TextView) view.findViewById(R.id.city);
        ImageView flag = (ImageView) view.findViewById(R.id.flag);
        province.setText(provincialList.get(position).getName());
        city.setText("Capital: "+provincialList.get(position).capital);
        flag.setBackgroundResource(provincialList.get(position).getArmid());

        return view;
    }
}
