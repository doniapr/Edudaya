package com.don.edudaya;

/**
 * Created by don on 01/02/2018.
 */

public class soal {
    //soal
    public String pertanyaan[] = {
            "Angklung berasal dari provinsi?",
            "Alat musik tradisional DKI Jakarta?",
            "Tifa merupakan alat musik dari?",
            "Pakaian adat Aceh adalah yaitu?",
            "Kasatrian merupakan pakaian tradisional daerah?",
    };

    //jawaban
    private String piljawab[][] = {
            {"Banten","Jawa Barat","Jawa Tengah"},
            {"Tehyan","Saluang","Gendang"},
            {"Bali","Papua","Aceh"},
            {"Ulee Balang","Pangsi","Pesa'an"},
            {"Jawa Timur","Jawa Tengah","Yogyakarta"},
    };

    //jawabanBenar
    private String jwbBenar[]={
            "Jawa Barat",
            "Tehyan",
            "Papua",
            "Ulee Balang",
            "Yogyakarta",
    };

    //ambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //ambil pilihan 1
    public String getPilJawab1(int x){
        String jawaban1=piljawab[x][0];
        return jawaban1;
    }

    //ambil pilihan 2
    public String getPilJawab2(int x){
        String jawaban2=piljawab[x][1];
        return jawaban2;
    }

    //ambil pilihan 3
    public String getPilJawab3(int x){
        String jawaban3=piljawab[x][2];
        return jawaban3;
    }

    //ambil jawaban benar
    public String getJwabnBenar(int x){
        String jawab = jwbBenar[x];
        return jawab;
    }
}
