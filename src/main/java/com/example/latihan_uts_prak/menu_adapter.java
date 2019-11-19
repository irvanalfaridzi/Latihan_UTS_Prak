package com.example.latihan_uts_prak;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class menu_adapter extends RecyclerView.Adapter<menu_adapter.MyViewHolder> {
    private Context context;
    private ArrayList<menu> list_menu = new ArrayList<>();

    public menu_adapter(Context context, ArrayList<menu> list_menu ){
        this.context=context;
        this.list_menu=list_menu;
    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_menu,parent,false);
        return new menu_adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        menu mn = list_menu.get(position);
        holder.nama.setText(String.valueOf(mn.getNama()));
        holder.harga.setText(String.valueOf(mn.getHarga()));
        holder.gambar.setImageResource(Integer.valueOf(mn.getGambar()));
    }

    @Override
    public int getItemCount() {
        return list_menu.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView nama, harga;
        public MyViewHolder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.ivGambar);
            nama = itemView.findViewById(R.id.tvNama);
            harga = itemView.findViewById(R.id.tvHarga);
        }
    }
}
