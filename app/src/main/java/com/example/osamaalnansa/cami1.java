package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class cami1 extends AppCompatActivity {
   TextView cami22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cami1);
        this.setTitle("Yeşil cami (Köprüköy cami) :");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        cami22 = (TextView) findViewById(R.id.cami22);
        cami22.setText("Dış duvar ve minaresini kaplayan sarmaşıklar ve bahçesindeki çok sayıda çiçekle\n" +
                "\"Yeşil Cami\" olarak bilinen Köprüköy Camisi, sıcak yaz günlerinde serinliğiyle tanınıyor.\n" +
                "Merkez Yüreğir ilçesi Köprülü Mahallesi'nde, Bosnalı Salih Efendi öncülüğünde\n" +
                "yapımına başlanan ve 89 yıl önce ibadete açılan Köprüköy Camisi, baharın\n" +
                "gelmesiyle yeşile bürünen, yaz aylarında da bu özelliğini koruyan cami, bahçesindeki\n" +
                "ağaçların oluşturduğu gölgelik alanlarıyla kentte 40 dereceyi bulan sıcaklarda\n" +
                "cemaatin namaz saatleri dışında da vakit geçirdiği yerler arasında yer alıyor.");

    }
}