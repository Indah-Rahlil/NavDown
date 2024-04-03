package com.example.navdown;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Bangun_kod.Bangun_ruang;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    List<Bangun> listData;
    private LayoutInflater mInflater;
    Context context;
    private AdapterView.OnItemClickListener mListener;
    public Adapter(List<Bangun> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Bangun bangunan = listData.get(position);
        holder.gambar_bangun.setImageResource(bangunan.getImgBangun());
        holder.nama_bangun.setText(bangunan.getNamaBangun());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null)
                    mListener.onItemClick(position); // Teruskan posisi item yang diklik
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama_bangun;
        ImageView gambar_bangun;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_bangun = itemView.findViewById(R.id.nama_bangun);
            gambar_bangun = itemView.findViewById(R.id.gambar_bangun);
        }
    }
    // Antarmuka untuk menangani klik item RecyclerView
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    // Metode untuk mengatur listener klik dari luar kelas Adapter
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = (AdapterView.OnItemClickListener) listener;
    }

}
