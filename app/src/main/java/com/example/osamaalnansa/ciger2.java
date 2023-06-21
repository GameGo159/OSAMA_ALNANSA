package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ciger2 extends AppCompatActivity {
    TextView cig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Ciğer");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_ciger2);
        cig = (TextView) findViewById(R.id.cig);
        cig.setText("3.2Ciğer\n" +
                "Ciğer, Adana’da bir anlamda marka haline gelmiş bir lezzettir. Onu bu kadar özel\n" +
                "yapan ise kahvaltıda tüketiliyor olması. Daha önce hiç kahvaltıda ciğer yemediyseniz\n" +
                "bu size biraz tuhaf gelebilir. Ancak ciğer Adana’da sıkça kahvaltıda tüketiliyor.\n" +
                "Adana usulü ciğerin kahvaltıda tüketiliyor olması turistlerin de bir hayli ilgisini çeken\n" +
                "lezzetler arasına girmesini sağlıyor. Sadece kahvaltıda tüketilmesi değil aynı\n" +
                "zamanda insana yedikçe yediren lezzeti sayesinde her kahvaltıda ciğer yemek\n" +
                "isteyebilirsiniz.\n" +
                "Ciğeri kahvaltıda sunmak Adana için çok uzun zamandır gelenek haline gelmiş bir\n" +
                "alışkanlık. Her hafta Pazar günleri sokakların ara kesimlerinde kebapçıların\n" +
                "ocaklarında ciğer pişirdiğini görebilirsiniz. Geçmişten bugüne bir gelenek olarak\n" +
                "devam eden ve sokak aralarında hayat bulan kahvaltıda ciğer yeme alışkanlığı\n" +
                "şehre turist olarak gelenlerin en çok şaşırdığı geleneklerden biri. Ciğer\n" +
                "deneyimlemek isterseniz sokak aralarında bulunan ciğercilere uğrayabilir ve\n" +
                "taburede otururken yiyebilirsiniz.");
    }
}