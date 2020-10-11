package com.example.latihan5.indonesiaku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListProvinceAdapter extends RecyclerView.Adapter<ListProvinceAdapter.ListViewholder> {

    private ArrayList<Province> provinces;
    private ItemClickCallback itemClickCallback;

    public void setItemClickCallback(ItemClickCallback itemClickCallback){
        this.itemClickCallback = itemClickCallback;
    }


    public ListProvinceAdapter(ArrayList<Province> list){
        this.provinces = list;
    }

    @NonNull
    @Override
    public ListViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent, false);
        return new ListViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewholder holder, int position) {
        final Province province = provinces.get(position);
        Glide.with(holder.itemView.getContext())
                .load(province.getGambarLogo())
                .apply(new RequestOptions().override(70, 70))
                .into(holder.img);
        holder.name.setText(province.getProvinceName());
        holder.ibuKotaProvinsi.setText((province.getIbuKota()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickCallback.itemClicked(provinces.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return provinces.size();
    }

    public class ListViewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name,ibuKotaProvinsi;


        public ListViewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.item_gambar);
            name = itemView.findViewById(R.id.nama_provinsi);
            ibuKotaProvinsi = itemView.findViewById(R.id.nama_ibu_kota);
        }
    }

    public  interface  ItemClickCallback{
        void itemClicked(Province province);
    }

}
