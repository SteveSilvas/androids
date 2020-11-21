package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class metroKM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_k_m);

        getSupportActionBar().hide();

        Button btnmKm = (Button)findViewById(R.id.btnConv10);
        btnmKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt1 = (EditText)findViewById(R.id.edt10);
                EditText edt2 = (EditText)findViewById(R.id.edt20);


                double a = Double.parseDouble(edt1.getText().toString());
                double b = a/1000;
                edt2.setText(String.valueOf(b));
            }
        });
        Button voltarp =(Button)findViewById(R.id.button2);
        voltarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(metroKM.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}