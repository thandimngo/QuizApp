package com.example.admin.quizapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void startActivityFaceBook(View v) {
        Intent objIntent = new Intent(MainActivity.this, Facebook.class);

        startActivity(objIntent);

    }


    public void startActivityWhatsApp(View v) {
        Intent objIntent = new Intent(MainActivity.this, WhatsApp.class);

        startActivity(objIntent);

    }

    public void startActivityInstagram(View v) {
        Intent objIntent = new Intent(MainActivity.this, Instagram.class);

        startActivity(objIntent);

    }

    public void exit(View view) {

onBackPressed();

    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
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