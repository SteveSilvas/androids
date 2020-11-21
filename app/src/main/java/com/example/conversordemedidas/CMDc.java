package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CMDc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_m_dc);

        getSupportActionBar().hide();

        Button volte = (Button)findViewById(R.id.volte);
        volte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CMDc.this, MainActivity.class);
                startActivity(it);
            }
        });
        Button calc1 = (Button)findViewById(R.id.calc1);
        calc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt0 = (EditText)findViewById(R.id.edt11);
                EditText edt01 = (EditText)findViewById(R.id.edt21);
                double a = Double.parseDouble(edt0.getText().toString());
                double b = a*10;
                edt01.setText(String.valueOf(b));

            }
        });
    }
}