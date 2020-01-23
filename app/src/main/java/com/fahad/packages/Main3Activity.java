package com.fahad.packages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    Cursor c = null;
     ListView listView;


    String key0;
    String key1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        ConstraintLayout back = findViewById(R.id.back0);
        TextView ttxt = findViewById(R.id.textView2);

        listView = findViewById(R.id.listview);

        Intent intent = getIntent();
        key0  = intent.getStringExtra("Key1");
        key1  = intent.getStringExtra("Key2");

        ttxt.setText(key1+" PACKAGES");
        switch (key0)
        {
            case "zong":
                back.setBackgroundColor(Color.parseColor("#73ab28"));
                break;

            case "ufone":
                back.setBackgroundColor(Color.parseColor("#fc6e00"));
                break;

            case "telenor":
                back.setBackgroundColor(Color.parseColor("#00a4f0"));
                break;

            case "jazz":
                back.setBackgroundColor(Color.parseColor("#610407"));
                break;
        }



        DatabaseHelper myDbHelper = new DatabaseHelper(this);
        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }
        try {
            myDbHelper.openDataBase();
        } catch (SQLException sqle) {
            throw sqle;
       }
        ArrayList<product> Kaam = new ArrayList<>();
        if( key0.equals("zong") && key1.equals("ALL IN ONE"))
        {
            c = myDbHelper.query("ZongAll");
        }
        if( key0.equals("zong") && key1.equals("CALL"))
        {
            c = myDbHelper.query("ZongCall");
        }
        if( key0.equals("zong") && key1.equals("INTERNET"))
        {
            c = myDbHelper.query("ZongNet");
        }
        if( key0.equals("zong") && key1.equals("BROADBAND"))
        {
            c = myDbHelper.query("ZongBroad");
        }
        if( key0.equals("zong") && key1.equals("MESSAGE"))
        {
            c = myDbHelper.query("ZongSMS");
        }





        if( key0.equals("ufone") && key1.equals("ALL IN ONE"))
        {
            c = myDbHelper.query("UfoneAll");
        }
        if( key0.equals("ufone") && key1.equals("CALL"))
        {
            c = myDbHelper.query("UfoneCall");
        }
        if( key0.equals("ufone") && key1.equals("INTERNET"))
        {
            c = myDbHelper.query("UfoneNet");
        }
        if( key0.equals("ufone") && key1.equals("MESSAGE"))
        {
            c = myDbHelper.query("UfoneSMS");
        }





        if( key0.equals("telenor") && key1.equals("ALL IN ONE"))
        {
            c = myDbHelper.query("TelenorAll");
        }
        if( key0.equals("telenor") && key1.equals("CALL"))
        {
            c = myDbHelper.query("TelenorCall");
        }
        if( key0.equals("telenor") && key1.equals("INTERNET"))
        {
            c = myDbHelper.query("TelenorNet");
        }
        if( key0.equals("telenor") && key1.equals("BROADBAND"))
        {
            c = myDbHelper.query("TelenorBroad");
        }
        if( key0.equals("telenor") && key1.equals("MESSAGE"))
        {
            c = myDbHelper.query("ZongSMS");
        }





        if( key0.equals("jazz") && key1.equals("ALL IN ONE"))
        {
            c = myDbHelper.query("JazzAll");
        }
        if( key0.equals("jazz") && key1.equals("CALL"))
        {
            c = myDbHelper.query("JazzCall");
        }
        if( key0.equals("jazz") && key1.equals("INTERNET"))
        {
            c = myDbHelper.query("JazzNet");
        }
        if( key0.equals("jazz") && key1.equals("BROADBAND"))
        {
            c = myDbHelper.query("JazzBroad");
        }
        if( key0.equals("jazz") && key1.equals("MESSAGE"))
        {
            c = myDbHelper.query("JazzSMS");
        }



        if (c.moveToFirst()) {
            do {
                Kaam.add(new product(c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),c.getString(6),c.getString(7),c.getString(8)));
            } while (c.moveToNext());
        }
       ListAdapter adapter = new Listadrapter(this,Kaam);
        this.listView.setAdapter(adapter);

    }

    public void bback(View view)
    {
        onBackPressed();
    }

    }
