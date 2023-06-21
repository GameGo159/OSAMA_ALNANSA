package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class adnath extends AppCompatActivity {
    TextView varda,anavarza,karata,ramazn,cami;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adnath);
        this.setTitle("ADANA'DAKİ TARİHİ YERLER");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        varda = (TextView) findViewById(R.id.varda);
        anavarza = (TextView) findViewById(R.id.anavarza);
        karata = (TextView) findViewById(R.id.karata);
        ramazn = (TextView) findViewById(R.id.ramazn);
        cami = (TextView) findViewById(R.id.cami);
        varda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(adnath.this,varda1.class);
                startActivity(var);
            }
        });
        anavarza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ana = new Intent(adnath.this,anavar.class);
                startActivity(ana);
            }
        });
        karata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kat = new Intent(adnath.this,karata.class);
                startActivity(kat);
            }
        });
        ramazn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ra = new Intent(adnath.this,ramzan1.class);
                startActivity(ra);
            }
        });
        cami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cami = new Intent(adnath.this,cami1.class);
                startActivity(cami);
            }
        });


    }

}