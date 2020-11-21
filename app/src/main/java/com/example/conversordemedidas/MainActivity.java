package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Button mKmLink = (Button)findViewById(R.id.mkmLink);
        mKmLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,metroKM.class);
                startActivity(it);

            }
        });
        Button kmMLink = (Button)findViewById(R.id.kmMLink);
        kmMLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, kmMetro.class);
                startActivity(it);

            }
        });

        Button cmMetro = (Button)findViewById(R.id.cmMLink);
        cmMetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, cmMetro.class);
                startActivity(it);
            }
        });
        Button mCm = (Button)findViewById(R.id.mCmLink);
        mCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, metroCM.class);
                startActivity(it);
            }
        });

        Button dcCM = (Button)findViewById(R.id.dcCLink1);
        dcCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, dcCM.class);
                startActivity(it);
            }
        });

        Button cmDcm = (Button)findViewById(R.id.cmDcLink);
        cmDcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CMDc.class);
                startActivity(it);
            }
        });
    }
}