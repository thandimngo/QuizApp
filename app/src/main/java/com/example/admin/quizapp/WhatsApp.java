package com.example.admin.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class WhatsApp extends AppCompatActivity {
    private RadioButton radioTrue1;
    private RadioButton radioTrue2;
    private RadioButton radioTrue3;
    private RadioButton radioTrue4;
    private RadioButton radioTrue5;

    private RadioButton radioFalse1;
    private RadioButton radioFalse2;
    private RadioButton radioFalse3;
    private RadioButton radioFalse4;
    private RadioButton radioFalse5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);

        radioTrue1 = (RadioButton) findViewById(R.id.rdoTrue1);
        radioTrue2 = (RadioButton) findViewById(R.id.rdoTrue2);
        radioTrue3 = (RadioButton) findViewById(R.id.rdoTrue3);
        radioTrue4 = (RadioButton) findViewById(R.id.rdoTrue4);
        radioTrue5 = (RadioButton) findViewById(R.id.rdoTrue5);

        radioFalse1 = (RadioButton) findViewById(R.id.rdoFalse1);
        radioFalse2 = (RadioButton) findViewById(R.id.rdoFalse2);
        radioFalse3 = (RadioButton) findViewById(R.id.rdoFalse3);
        radioFalse4 = (RadioButton) findViewById(R.id.rdoFalse4);
        radioFalse5 = (RadioButton) findViewById(R.id.rdoFalse5);
    }


    public void score() {
        int totScore = 0;

        if (radioTrue1.isChecked()) {
            totScore += 1;

        }
        if (radioFalse2.isChecked()) {
            totScore += 1;


        }
        if (radioTrue3.isChecked()) {
            totScore += 1;


        }
        if (radioFalse4.isChecked()) {
            totScore += 1;


        }
        if (radioTrue5.isChecked()) {
            totScore += 1;


        }

        Toast.makeText(this, "YOUR SCORE IS :" + totScore, Toast.LENGTH_LONG).show();
    }

    public void display(View v) {
        score();
    }

    public void clear(View v) {

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.rGroup2);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.rGroup3);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.rGroup4);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.rGroup5);

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();

    }

    public void startActivity(View v) {

        Intent intent = new Intent(WhatsApp.this, MainActivity.class);
        startActivity(intent);
    }
}

