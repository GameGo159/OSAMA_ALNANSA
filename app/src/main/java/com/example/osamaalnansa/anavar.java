package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class anavar extends AppCompatActivity {
   TextView varder2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anavar);
        this.setTitle(" Anavarza Kalesi ve Antik Kenti :");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        varder2 = (TextView) findViewById(R.id.anavar2);
        varder2.setText("Adana'nın Kozan ilçesi Dilekkaya Mahallesi'nde bulunan ve tarihte \"yenilmez şehir\"\n" +
                "adıyla da tanınan Anavarza Antik Kenti; Helenistik, Roma, Bizans, Sasani ve Osmanlı\n" +
                "medeniyetlerine yaptığı ev sahipliğiyle önemli kültür izleri barındırır. 1143 dönüm olan\n" +
                "büyüklüğü ve diğer özellikleriyle dünyanın en büyük antik kentleri arasında gösterilen\n" +
                "Anavarza’da, sur duvarı, sütunlu yol, hamam ve kilise, antik tiyatro, stadyum, su\n" +
                "yolları, kaya mezarları, mozaikler, su kemerleri, kaya mezarları, stadyum, tiyatro ve\n" +
                "kale yer alır.");
}