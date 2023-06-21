package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class fellah2 extends AppCompatActivity {
    TextView fellh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Fellah Köftesi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_fellah2);
        fellh = (TextView) findViewById(R.id.fellh);
        fellh.setText("Fellah köftesi, yine temel maddesi bulgur olan yöresel bir lezzettir. Adana’ya özgü\n" +
                "olmasının ana nedenleri ise kullanılan biber salçası ve sarımsaklardır. Doğal\n" +
                "zeytinyağı ile yapılan Fellah köftesini her yerde yeme fırsatı bulabilirsiniz. Ancak\n" +
                "Adana usulü Fellah köftesi yemek için mutlaka Adana’ya gitmeniz gerekir. Tarifte\n" +
                "kullanılan baharatlardan tutun da biber salçasına kadar doğal olması şart.\n" +
                "Adana restoranlarında servis edilen Fellah köftesini yedikten sonra bir porsiyon daha\n" +
                "istememek için kendinizi tutmanız gerekir. Çünkü bulgur ile yapılan onlarca lezzet\n" +
                "arasında kendini üst sıralara taşıyacak kadar büyük bir lezzeti var. Ülkemizin birçok\n" +
                "bölgesinde yapılan Fellah köftesini Adana usulü deneyimlemek isterseniz yöresel\n" +
                "restoranları ziyaret edebilirsiniz.");
    }
}