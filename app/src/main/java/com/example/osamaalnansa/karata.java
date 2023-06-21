package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class karata extends AppCompatActivity {
      TextView karata2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Karataş Magarsus Antik Kenti :");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_karata);
        karata2 = (TextView) findViewById(R.id.karata2);
        karata2.setText("Adana’ya 49 km. uzaklıktaki ilçede, Magarsus Antik Kenti, Anfi Tiyatro ve Athena\n" +
                "Tapınakları Helenistik döneme ait Magarsus Antik Kentinin önemli kalıntılarıdır. Biri\n" +
                "han, diğeri menzil olmak üzere iki Osmanlı eseri bulunmaktadır. Örenyeri, Akyatan\n" +
                "Gölündeki kuş cenneti görülmeye değerdir. Akyatan Gölünde (Lagün) caretta caretta\n" +
                "ve chelonia mydas kaplumbağa türleri bulunmaktadır. Ayrıca ilçede çeşitli balık\n" +
                "türlerinin bulunduğu Tuzla ve Karataş Dalyanı vardır. Adana merkezden Karataş'a\n" +
                "dolmuşla gidilebilir.");
    }
}