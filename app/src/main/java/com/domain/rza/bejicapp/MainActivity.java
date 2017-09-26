package com.domain.rza.bejicapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private FancyButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.time_picker);
        button = (FancyButton) findViewById(R.id.btn_calculate);
        button.setIconResource(R.drawable.ic_av_timer_white_24dp);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hour = String.valueOf(timePicker.getCurrentHour()); //deprecated ali mora da se koristi
                String minute = String.valueOf(timePicker.getCurrentMinute());
                Intent i = new Intent(MainActivity.this, TimeCalculatedActivity.class);
                Log.d("Info", hour + " " + minute);

                if (Integer.parseInt(hour) < 12) {
                    i.putExtra("hour", hour);
                    i.putExtra("minute", minute);
                    startActivity(i);
                }
                else {
                    Toasty.error(MainActivity.this, "Nisi valjda ovako kasno doruckovala?", Toast.LENGTH_SHORT, true).show();
                }
            }
        });
    }

}
