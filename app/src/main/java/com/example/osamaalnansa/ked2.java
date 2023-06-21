package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sked2 extends AppCompatActivity {
    TextView ked24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Kedibatmaz:");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_ked2);
        ked24 = (TextView) findViewById(R.id.ked24);
        ked24.setText("Adana’nın kendine özgü tatlıları arasında yer alan, adını belki de en çok duyurmuş olan\n" +
                "tatlardan biri de Kedi Batmaz lezzetidir. Kedi Batmaz kaz eti ve mısır unu ile yapılan\n" +
                "ilginç tatlılardan biri. Tatlının bile içinde et olması size Adana’da olduğunuzu çok daha\n" +
                "fazla hissettirebilir. Ancak cevizle süslenen ve oldukça ilginç bir tadı olan Kedi Batmaz\n" +
                "tatlısı içerisinde et olduğunu size unutturacak kadar hoş bir tada sahip. Kedi batmaz\n" +
                "deneyimlemek için Adana sokaklarında bulunan tatlıcılara uğrayabilirsiniz.\n" +
                "Adana tatlıları arasında ilginç bir yapılışa sahne olan Kedi Batmaz yiyeceği, kişilere\n" +
                "farklı tatlar sunarak vazgeçilmezleri arasına da girebilir. Bu bağlamda Kedi batmaz\n" +
                "tatlısını tercih edenler tariflerini de alarak evlerinde bu lezzeti yapmanın amacını da\n" +
                "taşımaktadır. Sizler de Adana’ya ziyarete geldiyseniz mutlaka bu tattan yararlanmalı ve\n" +
                "yeni lezzet olarak da değerlendirmelisiniz.");
    }
}