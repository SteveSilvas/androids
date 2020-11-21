package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cmMetro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_metro);

        getSupportActionBar().hide();

        Button vtr = (Button)findViewById(R.id.vtr0);
        vtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(cmMetro.this,MainActivity.class);
                startActivity(it);
            }
        });
        Button cal = (Button)findViewById(R.id.cal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtA = (EditText)findViewById(R.id.edt0001);
                EditText edtRes = (EditText)findViewById(R.id.edt0002);
                double a = Double.parseDouble(edtA.getText().toString());
                double b = a/100;
                edtRes.setText(String.valueOf(b));
            }
        });

    }
}