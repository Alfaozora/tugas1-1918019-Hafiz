package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuItemImpl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayoutMediator;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText)findViewById(R.id.txt_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.txt_tinggi);
        final TextView hasil =
                (TextView)findViewById(R.id.txt_hasil);
        final Button hitung =
                (Button)findViewById(R.id.btn_hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan tinggi belum diinputkan nilai",Toast.LENGTH_LONG).show();
                }else if(alas.length()==0){
                    Toast.makeText(getApplication(),"Alas belum diinputkan nilai",Toast.LENGTH_LONG).show();
                }else if(tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi belum diinputkan nilai", Toast.LENGTH_LONG).show();
                }
                else{
                    String inputAlas =alas.getText().toString();
                    String inputTinggi =tinggi.getText().toString();

                    double alas = Double.parseDouble(inputAlas);
                    double tinggi = Double.parseDouble(inputTinggi);
                    double h = alas*tinggi/2;
                   String output = String.valueOf(h);
                    hasil.setText(output.toString());
                }
            }
        });
    }
}