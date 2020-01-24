package com.fahad.packages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent intent = getIntent();
        message = intent.getStringExtra("Key");

        ConstraintLayout back = findViewById(R.id.back);
        ImageView title = findViewById(R.id.title);
        switch (message)
        {
            case "zong":
                back.setBackgroundColor(Color.parseColor("#73ab28"));
                title.setImageResource(R.drawable.header_zong);
                break;

            case "ufone":
                back.setBackgroundColor(Color.parseColor("#fc6e00"));
                title.setImageResource(R.drawable.header_ufone);
                break;

            case "telenor":
                title.setImageResource(R.drawable.header_telenor);
                back.setBackgroundColor(Color.parseColor("#00a4f0"));
                break;

            case "jazz":
                title.setImageResource(R.drawable.header_jazz);
                back.setBackgroundColor(Color.parseColor("#610407"));
                break;


        }


    }

    public void back(View view)
    {
        onBackPressed();

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

    public void sms(View view) { newwcativty("MESSAGE"); }

    void newwcativty(String PPosition)
    {
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("Key1", message);
        intent.putExtra("Key2", PPosition);

        if( message.equals("ufone") && PPosition.equals("BROADBAND"))
        {
            Toast.makeText(this,"Sorry !! "+System.getProperty("line.separator")+" Not Available from Ufone Company",Toast.LENGTH_SHORT).show();
        }else
        {
            startActivity(intent);
        }

        }


}
