package com.example.mymusicservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declaring objects of Button class
         start = (Button) findViewById(R.id.startButton);
         stop = (Button) findViewById(R.id.stopButton);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == start)
        {

            // starting the service
               startService(new Intent(this, MusicService.class));
        }

        else {

            // stoping the service
            stopService(new Intent(this, MusicService.class));

        }


//        switch(v.getId()){
//
//
//            case R.id.startButton:
//
//                // starting the service
//                   startService(new Intent(this, MusicService.class));
//
//                break;
//
//            case R.id.stopButton:
//
//                // starting the service
//                stopService(new Intent(this, MusicService.class));
//
//                break;
//
//    }
    }


}