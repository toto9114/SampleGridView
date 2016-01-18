package com.example.tacademy.samplegridview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-01-18.
 */
public class ImageAdapter extends BaseAdapter{
    List<ImageTextData> items= new ArrayList<ImageTextData>();

    public void add(ImageTextData data){
        items.add(data);
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView view;
        if(convertView != null){
            view = (ItemView)convertView;
        }else{
            view = new ItemView(parent.getContext());
        }
        view.setImageTextData(items.get(position));
        return view;
    }
}
