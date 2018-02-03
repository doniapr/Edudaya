package com.don.edudaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class musik extends AppCompatActivity {

    TextView jdl,des;
    ImageView gbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musik);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String[] info = b.getStringArray("key");

        jdl = findViewById(R.id.judul_musik);
        gbr = findViewById(R.id.gbr_musik);
        des = findViewById(R.id.desc_musik);

        jdl.setText(info[1]);
        gbr.setImageResource(musik.this.getResources().getIdentifier("drawable/"+info[2],null,musik.this.getPackageName()));
        des.setText(info[3]);
    }
}
