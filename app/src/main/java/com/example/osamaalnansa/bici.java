package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bici extends AppCompatActivity {
   TextView bic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Bici bici :");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_bici);
        bic = (TextView) findViewById(R.id.bic);
        bic.setText("Bici bici muhallebisi, yaz dönemlerinde yenilen, Adana iline özgü bir tür tatlı. Halk arasında\n" +
                "kısaca bici bici adıyla anılır. En bilinen şekliyle rendelenmiş buz, pişmiş nişasta, pudra şekeri ve\n" +
                "şerbetten oluşur.");

    }
}