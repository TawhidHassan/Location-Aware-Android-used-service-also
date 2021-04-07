package com.example.locationawareandroiduserservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonGetLocation, buttonStopLocation;
    TextView textViewLatitude, textViewLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetLocation = (Button)findViewById(R.id.buttonGetLocation);
        buttonStopLocation = (Button)findViewById(R.id.buttonStopLocation);

        textViewLatitude = (TextView)findViewById(R.id.textViewLatitude);
        textViewLongitude = (TextView)findViewById(R.id.textViewLongitude);


        buttonGetLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonStopLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               
            }
        });

    }
}