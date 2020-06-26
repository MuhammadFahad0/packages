package com.fahad.packages;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    Cursor c = null;
    ProgressBar pb;
    ProgressBar pbm;
    List<product> list;
    RecyclerView RC;
    LinearLayoutManager manager;
    adrapter adp;
    String networkselection;
    String typeselection;
    ConstraintLayout back;
    TextView txt;
    int BBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt = findViewById(R.id.textView22);
        back = findViewById(R.id.back0);

        RC = findViewById(R.id.vvvvvv);
        manager = new LinearLayoutManager(this);
        RC.setLayoutManager(manager);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mAdView = findViewById(R.id.banner_container3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        list = new ArrayList<>();

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


        Intent intent = getIntent();
        networkselection = intent.getStringExtra("Key1");
        typeselection = intent.getStringExtra("Key2");

        switch (networkselection)
        {
            case "zong":

                back.setBackgroundResource(R.drawable.roundzongmain);
                txt.setTextColor(Color.parseColor("#73ab28"));
                BBack=R.drawable.roundzongmain;

                switch (typeselection)
                {
                    case "ALL IN ONE":
                        c = myDbHelper.query("zongallinone", null, null, null, null, null, null);
                        txt.setText("Zong All in One");
                        break;

                    case "CALL":
                        c = myDbHelper.query("zongcall", null, null, null, null, null, null);
                        txt.setText("Zong Call");
                        break;

                    case "MESSAGE":
                        c = myDbHelper.query("zongmessage", null, null, null, null, null, null);
                        txt.setText("Zong Message");
                        break;

                    case "INTERNET":
                        c = myDbHelper.query("zonginternet", null, null, null, null, null, null);
                        txt.setText("Zong Internet");
                        break;

                    case "BROADBAND":
                        c = myDbHelper.query("zongbroadband", null, null, null, null, null, null);
                        txt.setText("Zong Broadband");
                        break;

                    case "datasim":
                        c = myDbHelper.query("zongdatasim", null, null, null, null, null, null);
                        txt.setText("Zong Data Sim");
                        break;

                }
                break;

            case "ufone":

                back.setBackgroundResource(R.drawable.roundufonemain);
                txt.setTextColor(Color.parseColor("#fc6e00"));
                BBack=R.drawable.roundufonemain;

                switch (typeselection)
                {
                    case "ALL IN ONE":
                        c = myDbHelper.query("ufoneallinone", null, null, null, null, null, null);
                        txt.setText("Ufone All in One");
                        break;

                    case "CALL":
                        c = myDbHelper.query("ufonecall", null, null, null, null, null, null);
                        txt.setText("Ufone Call");
                        break;

                    case "MESSAGE":
                        c = myDbHelper.query("ufonemessage", null, null, null, null, null, null);
                        txt.setText("Ufone Message");
                        break;

                    case "INTERNET":
                        c = myDbHelper.query("ufoneinternet", null, null, null, null, null, null);
                        txt.setText("ufone Internet");
                        break;

                    case "BROADBAND":
                        c = myDbHelper.query("ufonebroadband", null, null, null, null, null, null);
                        txt.setText("EVO Wireless Broadband");
                        back.setBackgroundResource(R.drawable.roundptclmain);
                        txt.setTextColor(Color.parseColor("#006029"));
                        BBack=R.drawable.roundptclmain;
                        break;

                    case "datasim":
                        c = myDbHelper.query("ufonedatasim", null, null, null, null, null, null);
                        txt.setText("ufone Data Sim");
                        break;
                }

                break;

            case "telenor":

                back.setBackgroundResource(R.drawable.roundtelenormain);
                txt.setTextColor(Color.parseColor("#00a4f0"));
                BBack=R.drawable.roundtelenormain;

                switch (typeselection)
                {
                    case "ALL IN ONE":
                        txt.setText("Telenor All in One");
                        c = myDbHelper.query("telenorallinone", null, null, null, null, null, null);
                        break;

                    case "CALL":
                        txt.setText("Telenor Call");
                        c = myDbHelper.query("telenorcall", null, null, null, null, null, null);
                        break;

                    case "MESSAGE":
                        txt.setText("Telenor Message");
                        c = myDbHelper.query("telenormessage", null, null, null, null, null, null);
                        break;

                    case "INTERNET":
                        txt.setText("Telenor Internet");
                        c = myDbHelper.query("telenorinternet", null, null, null, null, null, null);
                        break;

                    case "BROADBAND":
                        txt.setText("Telenor Broadband");
                        c = myDbHelper.query("telenorbroadband", null, null, null, null, null, null);
                        break;

                    case "datasim":
                        c = myDbHelper.query("telenordatasim", null, null, null, null, null, null);
                        txt.setText("Zong Data Sim");
                        break;

                }
                break;

            case "jazz":

                back.setBackgroundResource(R.drawable.roundjazzmain);
                txt.setTextColor(Color.parseColor("#610407"));
                BBack=R.drawable.roundjazzmain;

                switch (typeselection)
                {

                    case "ALL IN ONE":
                        c = myDbHelper.query("jazzallinone", null, null, null, null, null, null);
                        txt.setText("Jazz All in One");
                        break;

                    case "CALL":
                        txt.setText("Jazz Call");
                        c = myDbHelper.query("jazzcall", null, null, null, null, null, null);
                        break;

                    case "MESSAGE":
                        txt.setText("Jazz Message");
                        c = myDbHelper.query("jazzmessage", null, null, null, null, null, null);
                        break;

                    case "INTERNET":
                        txt.setText("Jazz Internet");
                        c = myDbHelper.query("jazzinternet", null, null, null, null, null, null);
                        break;

                    case "BROADBAND":
                        txt.setText("Jazz Broadband");
                        c = myDbHelper.query("jazzbroadband", null, null, null, null, null, null);
                        break;

                    case "datasim":
                        c = myDbHelper.query("jazzdatasim", null, null, null, null, null, null);
                        txt.setText("Jazz Data Sim");
                        break;
                }
                break;
        }

                txt.setPadding(4,0,4,0);


        if (c.moveToFirst()) {
            do {
                list.add(new product(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),c.getString(6),c.getString(7)));
            } while (c.moveToNext());
        }

        adp = new adrapter(Main3Activity.this,list,BBack);
        RC.setAdapter(adp);

    }
    @Override
    public void onBackPressed() {
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
            super.onBackPressed();
}}