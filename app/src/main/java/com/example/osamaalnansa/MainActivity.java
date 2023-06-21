package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView txtmin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("ADANA");
        txtmin1 = findViewById(R.id.lesttext);

        final List<String> buttonLabels = Arrays.asList("ADANA TARİHİ:", " ADANA'DAKİ TARİHİ YERLER:", "ADANA'DAKİ ÜNLÜ YEMEKLER:","ADANA'DAKİ ÜNLÜ TATLILAR:");

        ButtonListAdapter adapter = new ButtonListAdapter(this, buttonLabels, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                String label = buttonLabels.get(position);

                Toast.makeText(MainActivity.this, "Clicked " + label, Toast.LENGTH_SHORT).show();

                // Perform different tasks based on the clicked button
                switch (position) {
                    case 0:
                        Intent adnsh = new Intent(MainActivity.this,adnashyer.class);
                        startActivity(adnsh);
                        break;
                    case 1:
                        Intent adth = new Intent(MainActivity.this,adnath.class);
                        startActivity(adth);
                        break;
                    case 2:
                        Intent unek = new Intent(MainActivity.this,unulekmk.class);
                        startActivity(unek);
                        break;
                    case 3:
                        Intent untat = new Intent(MainActivity.this,unultatl.class);
                        startActivity(untat);
                        break;
                }
            }
        });

        txtmin1 .setAdapter(adapter);
    }

    private class ButtonListAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final List<String> buttonLabels;
        private final View.OnClickListener buttonClickListener;

        public ButtonListAdapter(Context context, List<String> buttonLabels, View.OnClickListener buttonClickListener) {
            super(context, -1, buttonLabels);
            this.context = context;
            this.buttonLabels = buttonLabels;
            this.buttonClickListener = buttonClickListener;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Button button;

            if (convertView == null) {
                button = new Button(context);
                button.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
            } else {
                button = (Button) convertView;
            }

            String label = getItem(position);
            button.setText(label);
            button.setTag(position);

            button.setOnClickListener(buttonClickListener);

            return button;
        }

    }
}