package com.example.prak3_form;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button bTampil;
    EditText eNim, eNama, eTempatLahir, eTglLahir;
    RadioGroup rgKelamin;
    Spinner sProdi, sAgama;
    TextView teksOut;

    DatePickerDialog datePicker;
    SimpleDateFormat dataFormat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTampil = (Button) findViewById(R.id.tampil);
        eNim = (EditText) findViewById(R.id.nim);
        eNama = (EditText) findViewById(R.id.nama);
        eTempatLahir = (EditText) findViewById(R.id.tmplahir);
        teksOut = (TextView) findViewById(R.id.textout);
        rgKelamin = (RadioGroup) findViewById(R.id.jeniskelamin);
        sProdi = (Spinner) findViewById(R.id.prodi);
        sAgama = (Spinner) findViewById(R.id.agama);

        eTglLahir = (EditText) findViewById(R.id.tgllahir);
        dataFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.JAPAN);

        eTglLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDataDialog();
            }
        });



        bTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nim = String.valueOf(eNim.getText().toString());
                String nama = String.valueOf(eNama.getText().toString());
                String tempatlahir = String.valueOf(eTempatLahir.getText().toString());

                int idKelamin = rgKelamin.getCheckedRadioButtonId();
                RadioButton jkelamin = (RadioButton) findViewById(idKelamin);
                String kelamin = String.valueOf(jkelamin.getText().toString());

                String prodi = sProdi.getSelectedItem().toString();
                String agama = sAgama.getSelectedItem().toString();

                String tgl = String.valueOf(eTglLahir.getText().toString());




                String inputnya = "NIM\t\t\t\t\t\t: "+nim+"\nNama\t\t\t\t\t: "+nama+"\nKelamin\t\t\t\t: "+kelamin+"\nProgram Studi\t\t: "+prodi+"\nAgama\t\t\t\t\t: "+agama+"\nTempat Lahir\t\t: "+tempatlahir+"\nTanggal Lahir\t: "+tgl;
                teksOut.setText(inputnya);

            }
        });

    }

    void showDataDialog() {
        Calendar newCalender = Calendar.getInstance();
        datePicker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int i, int i1, int i2) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(i, i1, i2);
                eTglLahir.setText(dataFormat.format(newDate.getTime()));
            }
        },
                newCalender.get(Calendar.YEAR),
                newCalender.get(Calendar.MONTH),
                newCalender.get(Calendar.DAY_OF_MONTH)
        );

        datePicker.show();
    }
}