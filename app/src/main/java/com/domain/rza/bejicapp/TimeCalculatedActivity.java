package com.domain.rza.bejicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

public class TimeCalculatedActivity extends AppCompatActivity {
    private TextView textPrvaUzina;
    private TextView textRucak;
    private TextView textDrugaUzina;
    private TextView textVecera;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_calculated);
        viewInject();
        intent = getIntent();
        int hour = Integer.parseInt(intent.getStringExtra("hour"));
        String minute = intent.getStringExtra("minute");


        int prvaUzina = hour + 3;
        int rucak = hour + 6;
        int drugaUzina = hour + 9;
        int vecera = hour + 12;

        textPrvaUzina.setText(String.valueOf(prvaUzina + ":" + minute + "h"));
        textRucak.setText(String.valueOf(rucak + ":" + minute + "h"));
        textDrugaUzina.setText(String.valueOf(drugaUzina + ":" + minute + "h"));
        textVecera.setText(String.valueOf(vecera + ":" + minute + "h"));

    }





















    public void viewInject() {
        textPrvaUzina = (TextView) findViewById(R.id.tv_prva_uzina);
        textRucak = (TextView) findViewById(R.id.tv_rucak);
        textDrugaUzina = (TextView) findViewById(R.id.tv_druga_uzina);
        textVecera = (TextView) findViewById(R.id.tv_vecera);
    }
}
