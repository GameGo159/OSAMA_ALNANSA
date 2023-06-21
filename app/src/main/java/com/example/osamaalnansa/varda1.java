package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class varda1 extends AppCompatActivity {
   TextView varder2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varda1);
        this.setTitle("Varda Köprüsü (Alman Köprüsü - Koca Köprü): ");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        varder2 = (TextView) findViewById(R.id.varder2);
        varder2.setText("Adana-Ankara istikametinde, Karaisalı İlçesi Hacıkırı Köyünün yaklaşık 2 km. kuzeyinde bulunan Varda\n" +
                "Köprüsü'nü halk Koca Köprü diye bilir. Sultan 2. Abdülhamit zamanında Bağdat demiryolu projesi\n" +
                "kapsamında Almanlar tarafından 1912'da inşa edilen Göksu Viyadüğü (Alman köprüsü) 99 m.\n" +
                "yüksekliğinde ve 172 m. uzunluğunda olup derin bir vadiyi birbirine bağlar.");
    }
