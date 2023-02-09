package com.example.calculator_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hsl;
    EditText b01, b02;
    Button tmb, tmb2, tmb3;

    int a1, a2, a3;
    float a5, a6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b01 = (EditText) findViewById(R.id.bil01);
        b02 = (EditText) findViewById(R.id.bil02);

        hsl = (TextView) findViewById(R.id.hasil);
        tmb = (Button) findViewById(R.id.tombol_add);
        tmb2 = (Button) findViewById(R.id.tombol_sub);
        tmb3 = (Button) findViewById(R.id.tombol_mul);

        if (b01.getText() != null  || b02.getText() != null ){
            a1 = Integer.parseInt(b01.getText().toString());
            a2 = Integer.parseInt(b02.getText().toString());
            a5 = Float.parseFloat(b01.getText().toString());
            a6 = Float.parseFloat(b02.getText().toString());

        } else {
            a1 = 0;
            a2 = 0;
            a5 = 0;
            a6 = 0;

        }


        tmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3 = a1 + a2;
                hsl.setText("Hasilnya : " +String.valueOf(a3));
            }
        });

        tmb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                a1 = Integer.parseInt(b01.getText().toString());
//                a2 = Integer.parseInt(b02.getText().toString());
                a3 = a1 - a2;
                hsl.setText("Hasilnya : "+String.valueOf(a3));
            }
        });

        tmb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                a1 = Integer.parseInt(b01.getText().toString());
//                a2 = Integer.parseInt(b02.getText().toString());
                a3 = a1 * a2;
                hsl.setText("Hasilnya : "+String.valueOf(a3));
            }
        });




    }

    public void aksiBagi(View view){

        Float a4;
        a4 = a5 / a6;
        hsl.setText("Hasilnya : " +String.valueOf(a4));
    }
}