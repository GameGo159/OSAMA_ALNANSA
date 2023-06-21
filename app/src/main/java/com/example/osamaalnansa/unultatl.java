package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class unultatl extends AppCompatActivity {
    TextView ked,bici;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unultatl);
        this.setTitle("ADANA'DAKİ ÜNLÜ TATLILAR");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        ked =(TextView) findViewById(R.id.ked);
        bici = (TextView) findViewById(R.id.bici);

        ked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kedd = new Intent(unultatl.this,ked2.class);
                startActivity(kedd);

            }
        });
        bici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kak = new Intent(unultatl.this,bici.class);
                startActivity(kak);
            }
        });
    }
}