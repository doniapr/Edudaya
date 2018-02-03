package com.don.edudaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KuisActivity extends AppCompatActivity {
    TextView mOutSoal;
    RadioGroup mOutPilihanJawaban;
    RadioButton mOutPilihanJawaban1,mOutPilihanJawaban2,mOutPilihanJawaban3;
    Button mbtnJawab;
    int nilai;
    int arr;    //untuk menampung nilai panjang array
    int x=0;      //menunjukkan konten sekarang
    String jawaban; //menampung jawaban benar

    /*buat soal dari soal pretest*/
    soal soal = new soal();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("KUIS");
        setContentView(R.layout.activity_kuis);

        mOutSoal=findViewById(R.id.outSoal);
        mOutPilihanJawaban=findViewById(R.id.outPilihanJawaban);
        mOutPilihanJawaban1= findViewById(R.id.outPilihanJawaban1);
        mOutPilihanJawaban2= findViewById(R.id.outPilihanJawaban2);
        mOutPilihanJawaban3= findViewById(R.id.outPilihanJawaban3);
        mbtnJawab=findViewById(R.id.btnJawab);

        //setnilai
        setKonten();

        mbtnJawab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cekJawaban();
            }
        });
    }

    public void setKonten(){
        mOutPilihanJawaban.clearCheck();
        arr=soal.pertanyaan.length;
        if (x>=arr){
            String jmlNilai= String.valueOf(nilai);
            Intent in = new Intent(KuisActivity.this,HasilActivity.class);
            in.putExtra("nilaii", jmlNilai);
            startActivity(in);
        }else{
            mOutSoal.setText(soal.getPertanyaan(x));
            mOutPilihanJawaban1.setText(soal.getPilJawab1(x));
            mOutPilihanJawaban2.setText(soal.getPilJawab2(x));
            mOutPilihanJawaban3.setText(soal.getPilJawab3(x));
            jawaban = soal.getJwabnBenar(x);
        }
        x++;
    }

    public void cekJawaban() {
        if (mOutPilihanJawaban1.isChecked()) {
            if (mOutPilihanJawaban1.getText().toString().equals(jawaban)) {
                nilai = nilai + 20;
                setKonten();
            } else {
                setKonten();
            }
        } else if (mOutPilihanJawaban2.isChecked()) {
            if (mOutPilihanJawaban2.getText().toString().equals(jawaban)) {
                nilai = nilai + 20;
                setKonten();
            } else {
                setKonten();
            }
        } else if (mOutPilihanJawaban3.isChecked()) {
            if (mOutPilihanJawaban3.getText().toString().equals(jawaban)) {
                nilai = nilai + 20;
                setKonten();
            } else {
                setKonten();
            }
        } else {
            Toast.makeText(this, "Silakan Pilih Jawaban", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Silakan Selesaikan Kuis",Toast.LENGTH_SHORT).show();
    }

}
