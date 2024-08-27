package com.example.quis1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText nim;
    EditText nama;
    EditText tanggalLahir;
    TextView nimHasil;
    TextView namaHasil;
    TextView tglHasil;
    TextView umurHasil;
    Button buttonTampil;
    Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = findViewById(R.id.nim);
        nama = findViewById(R.id.nama);
        tanggalLahir = findViewById(R.id.tanggalLahir);
        nimHasil = findViewById(R.id.nimHasil);
        namaHasil = findViewById(R.id.namaHasil);
        tglHasil = findViewById(R.id.tglHasil);
        umurHasil = findViewById(R.id.umurHasil);
        buttonTampil = findViewById(R.id.buttonTampil);
        buttonClear = findViewById(R.id.buttonClear);

        buttonTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nimstr = nim.getText().toString();
                String namastr = nama.getText().toString();
                String tanggalstr = tanggalLahir.getText().toString();
                nimHasil.setText(nimstr);
                namaHasil.setText(namastr);
                tglHasil.setText(tanggalstr);
                int tahunLahir = Integer.parseInt(tanggalstr);
                int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
                int umur = tahunSekarang - tahunLahir;
                umurHasil.setText(String.valueOf(umur));
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Menghapus teks dari semua EditText
                nim.setText("");
                nama.setText("");
                tanggalLahir.setText("");

                // Menghapus teks dari semua TextView hasil
                nimHasil.setText("data dibersihkan");
                namaHasil.setText("data dibersihkan");
                tglHasil.setText("data dibersihkan");
                umurHasil.setText("data dibersihkan");
            }
        });
    }

}