package com.don.edudaya;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by don on 21/01/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<ReyclerViewHolder> {
    private final Context context;

    aset data = new aset();

    LayoutInflater li;

    public RecyclerAdapter(Context context){
        this.context = context;
        li = LayoutInflater.from(context);
    }

    @Override
    public ReyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=li.inflate(R.layout.item_list, parent, false);
        ReyclerViewHolder viewHolder=new ReyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ReyclerViewHolder holder, int position) {

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
            ReyclerViewHolder vholder = (ReyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            Intent i = new Intent(context.getApplicationContext(), musik.class);
            i.putExtra("key", data.data[position]);
            context.startActivity(i);
            //Toast.makeText(context, "Menu ini berada di posisi " + position, Toast.LENGTH_LONG).show();


        }
    };



    @Override
    public int getItemCount() {
        return data.data.length;
    }
}
