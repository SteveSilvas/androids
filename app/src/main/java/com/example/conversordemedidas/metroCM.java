package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class metroCM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_c_m);

        getSupportActionBar().hide();

        Button volt = (Button)findViewById(R.id.volt);
        volt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(metroCM.this, MainActivity.class);
                startActivity(it);
            }
        });
        Button cal2 = (Button)findViewById(R.id.cal2);
        cal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edta1 = (EditText)findViewById(R.id.edt100);
                EditText edta2 = (EditText)findViewById(R.id.edt200);
                double a = Double.parseDouble(edta1.getText().toString());
                double b = a*100;
                edta2.setText(String.valueOf(b));

            }
        });

    }
}