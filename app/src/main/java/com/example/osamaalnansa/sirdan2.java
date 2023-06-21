package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sirdan2 extends AppCompatActivity {
    TextView sirda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirdan2);
        this.setTitle("Şırdan Dolması");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        sirda =(TextView) findViewById(R.id.sirda);
        sirda.setText("Şırdan dolması, Adana dendiğinde akla ilk gelen yöresel lezzetlerden biri olarak\n" +
                "biliniyor. Yöre halkının sürekli tükettiği ve genellikle kuzu şırdanından yapılan bu\n" +
                "dolmanın tarifi de yine Adana’ya özel olan bir tariftir. Yolunuz düşer de Adana’da\n" +
                "bulunursanız mutlaka şırdan dolması deneyimleyebileceğiniz restoranlara\n" +
                "uğramalısınız.\n" +
                "Şırdan dolmasının görüntüsü oldukça ilginçtir. Yediğiniz birçok yöresel lezzetten\n" +
                "farklı olarak ilk bakışta hoş bir görünümü olmasa da lezzeti ile görüntüsünü telafi\n" +
                "ediyor. Şırdan dolması yerken mutlaka üzerine kimyon ve pul biber serpin. Şırdanın\n" +
                "asıl lezzetine Adana baharatları ile erişmeniz mümkün. Adana’da şırdan o kadar çok\n" +
                "seviliyor ki şehirdeki şırdan miktarı yöre halkının taleplerini karşılamak konusunda\n" +
                "yetersiz kalıyor. Yakın şehirlerden getirilen şırdanlar ile yapılan şırdan dolmalarını\n" +
                "şehrin herhangi bir köşesinde deneyebilirsiniz. Bir hayli yaygın olarak bulunan\n" +
                "lezzetlerden biridir.");
    }
}