package com.don.edudaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView nilai;
    Button btnhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        btnhome = findViewById(R.id.btnHome);
        nilai = findViewById(R.id.nilai);
        String nil = getIntent().getStringExtra("nilaii");
        nilai.setText(nil);

        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(HasilActivity.this, MainActivity.class);
        startActivity(i);
    }
}
