package com.example.marcio.agenda2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by marcio on 27/01/2016.
 */
public class ContactAdapter  extends BaseAdapter{
    private LayoutInflater layoutInflater;
    private ArrayList<contact> contacts;

    public ContactAdapter(ArrayList<contact> contacts, Context context){
        this.contacts = contacts;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        contact contact = contacts.get(position);
        convertView = layoutInflater.inflate(R.layout.activity_contact, null);
        ((TextView)convertView.findViewById(R.id.tvNome)).setText(contact.getNome());
        ((TextView)convertView.findViewById(R.id.tvTelefone)).setText(contact.getTelefone());

        return convertView;
    }
}
