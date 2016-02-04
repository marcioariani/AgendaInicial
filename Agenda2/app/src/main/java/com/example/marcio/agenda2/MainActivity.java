package com.example.marcio.agenda2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView contactView;
    private ArrayList<contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactView = (ListView)findViewById(R.id.listItens);
        contacts = new ArrayList<contact>();
        Popula();
        ContactAdapter contactAdapter = new ContactAdapter(contacts, getApplicationContext());
        contactView.setAdapter(contactAdapter);
    }

    private void Popula(){
        contacts.add(new contact("Marcio Ariani", "9943-3334"));
        contacts.add(new contact("Ana Paula", "9976-9086"));
        contacts.add(new contact("Mark Roger", "8193-2231"));
        contacts.add(new contact("Chinelo Almeida", "9970-7055"));
        contacts.add(new contact("Carlos Antonio", "9678-3211"));
        contacts.add(new contact("Mario Bros", "8122-3452"));
        contacts.add(new contact("Juliana Pum", "9987-0011"));
        contacts.add(new contact("Thais Chupeta", "3291-2286"));
        contacts.add(new contact("Schneider", "9605-3211"));
    }


}
