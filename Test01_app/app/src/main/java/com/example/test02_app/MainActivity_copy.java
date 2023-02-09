package com.example.test02_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_copy extends AppCompatActivity {

    EditText etIsian;
    Button btnTombol, btnTombol2, btnHome, btnName;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIsian = (EditText) findViewById(R.id.nama);

        btnHome = (Button) findViewById(R.id.homeButton);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main);
                return;
            }
        });

//        btnName = (Button) findViewById(R.id.clickname);
//        btnName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = etIsian.getText().toString();
//                setContentView(R.layout.tampilan1);
//                TextView tampilNama = (TextView) findViewById(R.id.tampilNama);
//                tampilNama.setText("Hai, "+name+ " Boleh Minta Wasap?");
//
//                btnHome = (Button) findViewById(R.id.homeButton);
//                btnHome.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        setContentView(R.layout.activity_main);
//                        return;
//                    }
//                });
//
//                btnTombol = (Button) findViewById(R.id.tombol3);
//                btnTombol.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        setContentView(R.layout.tampilan2);
//                        TextView test = (TextView) findViewById(R.id.hasil);
//                        test.setText("Okee tinggal masukin aja disini yh");
//                        btnHome = (Button) findViewById(R.id.homeButton);
//                        btnHome.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                setContentView(R.layout.activity_main);
//                                return;
//                            }
//                        });
//                    }
//                });
//
//                btnTombol2 = (Button) findViewById(R.id.tombol4);
//                btnTombol2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        setContentView(R.layout.tampilan2);
//                        TextView test = (TextView) findViewById(R.id.hasil);
//                        test.setText("Lah bodo amat harus mau");
//                        btnHome = (Button) findViewById(R.id.homeButton);
//                        btnHome.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                setContentView(R.layout.activity_main);
//                                return;
//                            }
//                        });
//                    }
//                });


//            }
//        });







    }

}

