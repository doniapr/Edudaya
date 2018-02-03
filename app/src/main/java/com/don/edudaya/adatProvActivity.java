package com.don.edudaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class adatProvActivity extends AppCompatActivity {

    RecyclerView rvv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_prov);


        rvv = findViewById(R.id.recyclervview);

        RecyclerAdapterAdat adapter = new RecyclerAdapterAdat(this);
        rvv.setAdapter(adapter);
        rvv.setLayoutManager(new LinearLayoutManager(this));
    }
}
