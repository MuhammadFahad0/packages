package com.fahad.packages;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


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
        onBackPressed();
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }

}
