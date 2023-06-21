package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sunulekmk extends AppCompatActivity {
   TextView adanakebap1,ciger,sırdan,fellah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unulekmk);
        this.setTitle("ADANA'DAKİ ÜNLÜ YEMEKLER");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        adanakebap1 = (TextView) findViewById(R.id.adanakebap1);
        ciger = (TextView) findViewById(R.id.ciger);
        sırdan = (TextView) findViewById(R.id.sırdan);
        fellah = (TextView) findViewById(R.id.fellah);
        adanakebap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ak = new Intent(unulekmk.this,adanakebap.class);
                startActivity(ak);

            }
        });
        ciger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ci = new Intent(unulekmk.this,ciger2.class);
                startActivity(ci);

            }
        });
        sırdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(unulekmk.this,sirdan2.class);
                startActivity(si);

            }
        });
        fellah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fe = new Intent(unulekmk.this,fellah2.class);
                startActivity(fe);

            }
        });
    }
}