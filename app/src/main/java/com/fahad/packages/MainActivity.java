package com.fahad.packages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void zong(View view)
    {
        newwcativty("zong");
    }
    public void jazz(View view)
    {
        newwcativty("jazz");
    }
    public void telenor(View view)
    {
        newwcativty("telenor");
    }
    public void ufone(View view)
    {
        newwcativty("ufone");
    }
    void newwcativty(String PPosition)
    {
        Intent intent = new Intent(this, Main2Activity.class);
         intent.putExtra("Key", PPosition);
        startActivity(intent);
    }


    public void exit(View view)
    {
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
        Toast.makeText(getApplicationContext(),"Thanks For Using All Network Packages",Toast.LENGTH_SHORT).show();
    }


}
