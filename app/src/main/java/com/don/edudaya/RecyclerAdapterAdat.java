package com.don.edudaya;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by don on 23/01/2018.
 */

public class RecyclerAdapterAdat extends RecyclerView.Adapter<RecyclerViewHolderAdat> {
    private final Context contextt;

    aset data = new aset();

    LayoutInflater lii;

    public RecyclerAdapterAdat(Context contextt){
        this.contextt = contextt;
        lii = LayoutInflater.from(contextt);
    }

    @Override
    public RecyclerViewHolderAdat onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=lii.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolderAdat viewHolder=new RecyclerViewHolderAdat(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(RecyclerViewHolderAdat holder, int position) {

        holder.tv1.setText(data.data[position][0]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setImageResource(data.daftarIcon[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
    //member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolderAdat vholder = (RecyclerViewHolderAdat) v.getTag();

            int position = vholder.getPosition();

            Intent i = new Intent(contextt.getApplicationContext(), AdatActivity.class);
            i.putExtra("key", data.data[position]);
            contextt.startActivity(i);
            //Toast.makeText(context, "Menu ini berada di posisi " + position, Toast.LENGTH_LONG).show();


        }
    };



    @Override
    public int getItemCount() {
        return data.data.length;
    }
}
