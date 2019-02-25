package com.example.pojo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Base_Adapter extends BaseAdapter {
        Context context;
      List<Contact>contacts;
        LayoutInflater inflater;



    public Base_Adapter(MainActivity context, List<Contact> contacts) {
        this.context=context;
        this.contacts=contacts;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.item,null);
        TextView textView=convertView.findViewById(R.id.txt);

      //  DataModel dm=list.get(position);
        textView.setText(contacts.get(position).getPhone().getMobile());

        return convertView;
    }
}
