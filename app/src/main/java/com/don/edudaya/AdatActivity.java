package com.don.edudaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class AdatActivity extends AppCompatActivity {

    TextView judul,deck;
    ImageView gmbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat);

        Intent intent = getIntent();
        Bundle bun = intent.getExtras();
        String[] info = bun.getStringArray("key");

        judul = findViewById(R.id.judul_adat);
        gmbr = findViewById(R.id.gbr_adat);
        deck = findViewById(R.id.desc_adat);

        judul.setText(info[4]);
        gmbr.setImageResource(AdatActivity.this.getResources().getIdentifier("drawable/"+info[5],null,AdatActivity.this.getPackageName()));
        deck.setText(info[6]);
    }
}

