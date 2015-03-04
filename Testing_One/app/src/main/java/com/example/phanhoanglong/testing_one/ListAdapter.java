package com.example.phanhoanglong.testing_one;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

import java.util.ArrayList;

/**
 * Created by phanhoanglong on 3/3/15.
 */
public class ListAdapter extends BaseAdapter {

    private ArrayList<String> mListItems;
    private LayoutInflater mLayoutInflater;

    public ListAdapter(Context context, ArrayList<String> arrayList){
        mListItems = arrayList;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mListItems.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder vholder;

        if(view == null){
            vholder = new ViewHolder();
            view = mLayoutInflater.inflate(R.layout.list_item, null);

            vholder.txt_title = (TextView) view.findViewById(R.id.txt_title);
            view.setTag(vholder);
        }else{
            vholder = (ViewHolder) view.getTag();
        }

        String stringItem = mListItems.get(i);
        if(stringItem != null){
            if(vholder.txt_title != null){
                vholder.txt_title.setText(stringItem);
            }
        }

        return view;
    }

    private static class ViewHolder{
        protected ImageView image;
        protected TextView txt_title;
    }
}
