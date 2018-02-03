package com.don.edudaya;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by don on 23/01/2018.
 */

public class RecyclerViewHolderAdat extends RecyclerView.ViewHolder {
    // ViewHolder akan mendeskripisikan item view yang ditempatkan di dalam RecyclerView.
    TextView tv1; //deklarasi textview
    ImageView imageView;  //deklarasi imageview

    public RecyclerViewHolderAdat(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
        //menampilkan text dari widget CardView pada id daftar_judul
        imageView = (ImageView) itemView.findViewById(R.id.daftar_icon);
        //menampilkan gambar atau icon pada widget Cardview pada id daftar_icon
    }
}
