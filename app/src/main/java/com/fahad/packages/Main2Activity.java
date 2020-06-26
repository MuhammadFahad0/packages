package com.fahad.packages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.navigation.NavigationView;

public class Main2Activity extends AppCompatActivity {
    String message;
    String text;
    EditText edt;
    AlertDialog.Builder dialogBuilder;
    LayoutInflater inflater;
    View dialogView;
    AlertDialog b;
    private AdView mAdView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    View navHeaderView;
    ImageView imageView;
    ConstraintLayout cn;

    ConstraintLayout cn1;
    ConstraintLayout cn2;
    ConstraintLayout cn3;
    ConstraintLayout cn4;
    ConstraintLayout cn5;
    ConstraintLayout cn6;
    ConstraintLayout cn7;

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView);
        cn = findViewById(R.id.coon);
        cn1 = findViewById(R.id.constraintLayout7);
        cn2 = findViewById(R.id.constraintLayout8);
        cn3 = findViewById(R.id.constraintLayout9);
        cn4 = findViewById(R.id.constraintLayout10);
        cn5 = findViewById(R.id.constraintLayout11);
        cn6 = findViewById(R.id.constraintLayout81);
        cn7 = findViewById(R.id.constraintLayout115);

        text1 = findViewById(R.id.textView1);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        text5 = findViewById(R.id.textView5);
        text6 = findViewById(R.id.textView56);
        text7 = findViewById(R.id.textView11);

        drawerLayout=findViewById(R.id.drawer_layout2);
        navigationView=findViewById(R.id.nav_view2);
        toolbar=findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_toc_black_24dp);

        mAdView = findViewById(R.id.banner_container2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        cn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!drawerLayout.isDrawerOpen(GravityCompat.START)) drawerLayout.openDrawer(GravityCompat.START);
                else drawerLayout.closeDrawer(GravityCompat.END);
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.balance:
                        balance1();
                        return true;
                    case R.id.sms:
                        sms1();
                        return true;
                    case R.id.internet:
                        internet1();
                        return true;
                    case R.id.minuts:
                        minuts1();
                        return true;
                    case R.id.recharge:
                        recharge1();
                        return true;
                    case R.id.advance:
                        advance1();
                        return true;
                    case R.id.balanceshare:
                        balanceshare1();
                        return true;

                    default:
                        return false;
                }     }
        });

        navHeaderView = navigationView.inflateHeaderView(R.layout.headersecond);
        ImageView headerImage = navHeaderView.findViewById(R.id.headderpic);
        TextView headertitle = navHeaderView.findViewById(R.id.titleheadder);
        TextView headerdesc = navHeaderView.findViewById(R.id.descptionheadder);
        LinearLayout headerlayout = navHeaderView.findViewById(R.id.layoutheadder);

        Intent intent = getIntent();
        message = intent.getStringExtra("Key");

        switch (message)
        {
            case "zong":
                getSupportActionBar().setTitle("All Zong Packages Detail");
                navigationView.setBackgroundColor(Color.parseColor("#8073AB28"));
                headerImage.setImageResource(R.drawable.header_zong);
                headerlayout.setBackgroundColor(Color.parseColor("#73ab28"));
                headertitle.setText("All Zong Network Packages");
                headerdesc.setText("All Zong Network Packages 2020 Pakistan is one of the best network packages apps.");
                imageView.setImageResource(R.drawable.header_zong);
                cn.setBackgroundResource(R.drawable.roundzongmain);
                cn1.setBackgroundResource(R.drawable.roundzong);
                cn2.setBackgroundResource(R.drawable.roundzong);
                cn3.setBackgroundResource(R.drawable.roundzong);
                cn4.setBackgroundResource(R.drawable.roundzong);
                cn5.setBackgroundResource(R.drawable.roundzong);
                cn6.setBackgroundResource(R.drawable.roundzong);
                cn7.setBackgroundResource(R.drawable.roundzong);
                text1.setTextColor(Color.parseColor("#476A18"));
                text2.setTextColor(Color.parseColor("#476A18"));
                text3.setTextColor(Color.parseColor("#476A18"));
                text4.setTextColor(Color.parseColor("#476A18"));
                text5.setTextColor(Color.parseColor("#476A18"));
                text6.setTextColor(Color.parseColor("#476A18"));
                text7.setTextColor(Color.parseColor("#476A18"));

                break;

            case "ufone":
                getSupportActionBar().setTitle("All Ufone Packages Detail");
                navigationView.setBackgroundColor(Color.parseColor("#80FC6E00"));
                headerImage.setImageResource(R.drawable.header_ufone);
                headerlayout.setBackgroundColor(Color.parseColor("#fc6e00"));
                headertitle.setText("All Ufone Network Packages");
                headerdesc.setText("All Ufone Network Packages 2020 Pakistan is one of the best network packages apps.");
                imageView.setImageResource(R.drawable.header_ufone);
                cn.setBackgroundResource(R.drawable.roundufonemain);
                cn1.setBackgroundResource(R.drawable.roundufone);
                cn2.setBackgroundResource(R.drawable.roundufone);
                cn3.setBackgroundResource(R.drawable.roundufone);
                cn4.setBackgroundResource(R.drawable.roundufone);
                cn5.setBackgroundResource(R.drawable.roundufone);
                cn6.setBackgroundResource(R.drawable.roundufone);
                cn7.setBackgroundResource(R.drawable.roundufone);
                text1.setTextColor(Color.parseColor("#A54800"));
                text2.setTextColor(Color.parseColor("#A54800"));
                text3.setTextColor(Color.parseColor("#A54800"));
                text4.setTextColor(Color.parseColor("#A54800"));
                text5.setTextColor(Color.parseColor("#A54800"));
                text6.setTextColor(Color.parseColor("#A54800"));
                text7.setTextColor(Color.parseColor("#A54800"));
                break;

            case "telenor":
                getSupportActionBar().setTitle("All Telenor Packages Detail");
                navigationView.setBackgroundColor(Color.parseColor("#8000A4F0"));
                headerImage.setImageResource(R.drawable.header_telenor);
                headerlayout.setBackgroundColor(Color.parseColor("#00a4f0"));
                headertitle.setText("All Telenor Network Packages");
                headerdesc.setText("All Telenor Network Packages 2020 Pakistan is one of the best network packages apps.");
                imageView.setImageResource(R.drawable.header_telenor);
                cn.setBackgroundResource(R.drawable.roundtelenormain);
                cn1.setBackgroundResource(R.drawable.roundtelenor);
                cn2.setBackgroundResource(R.drawable.roundtelenor);
                cn3.setBackgroundResource(R.drawable.roundtelenor);
                cn4.setBackgroundResource(R.drawable.roundtelenor);
                cn5.setBackgroundResource(R.drawable.roundtelenor);
                cn6.setBackgroundResource(R.drawable.roundtelenor);
                cn7.setBackgroundResource(R.drawable.roundtelenor);
                text1.setTextColor(Color.parseColor("#006493"));
                text2.setTextColor(Color.parseColor("#006493"));
                text3.setTextColor(Color.parseColor("#006493"));
                text4.setTextColor(Color.parseColor("#006493"));
                text5.setTextColor(Color.parseColor("#006493"));
                text6.setTextColor(Color.parseColor("#006493"));
                text7.setTextColor(Color.parseColor("#006493"));
                break;

            case "jazz":
                getSupportActionBar().setTitle("All Jazz Packages Detail");
                navigationView.setBackgroundColor(Color.parseColor("#80610407"));
                headerImage.setImageResource(R.drawable.header_jazz);
                headerlayout.setBackgroundColor(Color.parseColor("#610407"));
                headertitle.setText("All Jazz Network Packages");
                headerdesc.setText("All Jazz Network Packages 2020 Pakistan is one of the best network packages apps.");
                imageView.setImageResource(R.drawable.header_jazz);
                cn.setBackgroundResource(R.drawable.roundjazzmain);
                cn1.setBackgroundResource(R.drawable.roundjazz);
                cn2.setBackgroundResource(R.drawable.roundjazz);
                cn3.setBackgroundResource(R.drawable.roundjazz);
                cn4.setBackgroundResource(R.drawable.roundjazz);
                cn5.setBackgroundResource(R.drawable.roundjazz);
                cn6.setBackgroundResource(R.drawable.roundjazz);
                cn7.setBackgroundResource(R.drawable.roundjazz);
                text1.setTextColor(Color.parseColor("#4C0305"));
                text2.setTextColor(Color.parseColor("#4C0305"));
                text3.setTextColor(Color.parseColor("#4C0305"));
                text4.setTextColor(Color.parseColor("#4C0305"));
                text5.setTextColor(Color.parseColor("#4C0305"));
                text6.setTextColor(Color.parseColor("#4C0305"));
                text7.setTextColor(Color.parseColor("#4C0305"));
                break;

    }
        text7.setPadding(5,5,5,5);
        text6.setPadding(5,5,5,5);
        text5.setPadding(5,5,5,5);
        text4.setPadding(5,5,5,5);
        text3.setPadding(5,5,5,5);
        text2.setPadding(5,5,5,5);
        text1.setPadding(5,5,5,5);
        cn.setPadding(10 ,10,10,10);

    }


    public void all(View view) { newwcativty("ALL IN ONE"); }

    public void call(View view)
    {
        newwcativty("CALL");
    }

    public void internet(View view)
    {
        newwcativty("INTERNET");
    }

    public void band(View view)
    {
        newwcativty("BROADBAND");
    }

    public void datasim(View view)
    {
        newwcativty("datasim");
    }

    public void sms(View view) { newwcativty("MESSAGE"); }

    void newwcativty(String PPosition)
    {


        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("Key1", message);
        intent.putExtra("Key2", PPosition);

            startActivity(intent);

        }



    void balance1()
    {
        switch (message)
        {
            case "zong":
                fuck("*222#");
                break;

            case "ufone":
                fuck("*124#");
                break;

            case "telenor":
                fuck("*444#");
                break;

            case "jazz":
                fuck("*111#");
                break;
        }
    }

    void sms1()
    {
        switch (message)
        {
            case "zong":
                fuck("*102*2#");
                break;

            case "ufone":
                fucksms("606","");
                Toast.makeText(this,"Sent Empty Message to 606",Toast.LENGTH_SHORT).show();
                break;

            case "telenor":
                fuck("*111#");
                break;

            case "jazz":
                fuck("*110#");
                break;
        }
    }

    void internet1()
    {
        switch (message)
        {
            case "zong":
                fuck("*102*4#");
                break;

            case "ufone":
                fuck("*706#");
                break;

            case "telenor":
                fuck("*999#");
                break;

            case "jazz":
                fuck("*110#");
                break;
        }
    }

    void minuts1()
    {
        switch (message)
        {
            case "zong":
                fuck("*102*3#");
                break;

            case "ufone":
                fuck("*707#");
                break;

            case "telenor":
                fuck("*222#");
                break;

            case "jazz":
                fuck("*110#");
                break;
        }
    }

    void recharge1()
    {
        dialogBuilder = new AlertDialog.Builder(this);

        dialogBuilder.setCancelable(false);
        inflater = this.getLayoutInflater();
        dialogView = inflater.inflate(R.layout.alartdailog, null);
        dialogBuilder.setView(dialogView);
        edt = dialogView.findViewById(R.id.editText);

        Button sent = dialogView.findViewById(R.id.button5);
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = edt.getText().toString();
                if(text.length() == 14)
                {
                    switch (message)
                    {
                        case "zong":
                            fuck("*101*"+ text +"#");
                            break;

                        case "ufone":
                            fuck("*123*"+ text +"#");
                            break;

                        case "telenor":
                            fuck("*555*"+ text +"#");
                            break;

                        case "jazz":
                            fuck("*123*"+ text +"#");
                            break;
                    }

                    b.dismiss();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please Enter 14 Digit Card Number",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button cancel = dialogView.findViewById(R.id.button6);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.dismiss();
            }
        });

        b = dialogBuilder.create();
        b.show();    }

    void advance1()
    {
        switch (message)
        {
            case "zong":
                fuck("*911#");
                break;

            case "ufone":
                fuck("*456#");
                break;

            case "telenor":
                fuck("*0#");
                break;

            case "jazz":
                fuck("*112#");
                break;
        }
    }

    void balanceshare1()
    {
        if(message.equals("zong"))
        {
            fuck("*828#");
            Toast.makeText(getApplicationContext(),"Dial *828# \n then Enter Number \n then Amount \n then Reply 1",Toast.LENGTH_LONG).show();
        }
        else
        {
            dialogBuilder = new AlertDialog.Builder(this);
            dialogBuilder.setCancelable(false);
            inflater = this.getLayoutInflater();
            dialogView = inflater.inflate(R.layout.alartdailoggift, null);
            dialogBuilder.setView(dialogView);
            final EditText num = dialogView.findViewById(R.id.editText4);
            final EditText amount = dialogView.findViewById(R.id.editText5);

            Button sent = dialogView.findViewById(R.id.button8);
            sent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text1 = num.getText().toString();
                    String text2 = amount.getText().toString();
                    switch (message)
                    {
                        case "ufone":
                            fuck("*828*"+text1+"*"+text2+"#");
                            break;

                        case "telenor":
                            fuck("*1*1*"+text1+"*"+text2+"#");
                            break;

                        case "jazz":
                            fuck("*100*"+text1+"*"+text2+"#");
                            break;
                    }

                }
            });

            Button cancel = dialogView.findViewById(R.id.button9);
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.dismiss();
                }
            });

            b = dialogBuilder.create();
            b.show();

        }

    }

    void fuck(String code)
    {
        Intent out = new Intent();
        out.setAction(Intent.ACTION_DIAL);
        out.setData(Uri.parse("tel:" + Uri.encode(code)));
        startActivity(out);

    }

    void fucksms(String number,String txt)
    {
        if(android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.Q)
        {

        }
        else
        {
            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
            smsIntent.setType("vnd.android-dir/mms-sms");
            smsIntent.putExtra("address", number);
            smsIntent.putExtra("sms_body",txt);
            startActivity(smsIntent);
        }

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawers();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
