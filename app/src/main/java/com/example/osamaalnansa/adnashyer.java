package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class adnashyer extends AppCompatActivity {
    TextView shir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adnashyer);
        this.setTitle("ADANA TARİHİ");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        shir= (TextView) findViewById(R.id.shir);
        shir.setText("\n" +
                "Adana, Türkiye'nin bir ili ve en kalabalık yedinci şehridir. 2021 yılı verilerine göre 2.263.373 nüfusa\n" +
                "sahiptir. İlin yüzölçümü 13.844 km2dir. İlde km2ye 163 kişi düşmektedir en yüksek Seyhan ilçesinde 1.785\n" +
                "kişi\n" +
                "04.02.2021 TÜİK verilerine göre 5'i merkez ilçe (Seyhan, Yüreğir, Çukurova, Sarıçam, Karaisalı) olmak\n" +
                "üzere toplam 15 ilçesi ve belediyesi vardır. Bu ilçelerde 831 mahalle bulunmaktadır. Adana; kuzeyinde\n" +
                "Kayseri, doğusunda Osmaniye, kuzeydoğusunda Kahramanmaraş, güneydoğusunda Hatay,\n" +
                "kuzeybatısında Niğde ve batısında Mersin illeri ve güneyinde Akdeniz ile çevrilidir.[3]\n" +
                "Türkiye'deki altıncı büyük metropolitan alan olup ülkenin önde gelen tarım, ticaret ve kültür\n" +
                "merkezlerinden biridir. Türkiye'deki maden zengini 4. bölge olan Adana; krom, demir, manganez, kurşun\n" +
                "ve çinko yatakları açısından önem taşımaktadır.\n" +
                "Adana'nın merkezi; Mersin, Adana, Osmaniye ve Hatay illerini kapsayan coğrafi, ekonomik ve kültürel bir\n" +
                "bölge olan Çukurova'nın merkezinde bulunur. Yaklaşık 6,33 milyon insana ev sahipliği yapan bölgenin\n" +
                "büyük bir bölümü, tarıma oldukça elverişli, geniş ve düz bir arazidir.");
    }
}