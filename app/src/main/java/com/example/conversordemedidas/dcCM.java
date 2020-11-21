package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class dcCM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dc_c_m);

        getSupportActionBar().hide();

        Button volt00 = (Button)findViewById(R.id.vtr00);
        volt00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(dcCM.this, MainActivity.class);
                startActivity(it);
            }
        });
        Button calc01 = (Button)findViewById(R.id.calc001);
        calc01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText entr = (EditText)findViewById(R.id.edt001);
                EditText res = (EditText)findViewById(R.id.edt002);

                double a = Double.parseDouble(entr.getText().toString());
                double b = a/10;
                res.setText(String.valueOf(b));
            }
        });

    }
}