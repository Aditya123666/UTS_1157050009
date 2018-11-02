package com.aditya.lenovo.kopigunungtilu.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//import 'com.aditya.lenovo.kopigunungtilu.ModelHarga';

import com.aditya.lenovo.kopigunungtilu.Activity.DetailHarga;
import com.aditya.lenovo.kopigunungtilu.Model.ModelHarga;
import com.aditya.lenovo.kopigunungtilu.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterDaftarHarga extends RecyclerView.Adapter<AdapterDaftarHarga.ModelHargaViewHolder> {
    private List<ModelHarga> dataList;
    private Context context;

    public AdapterDaftarHarga(Context context, List<ModelHarga> dataList) {
        this.context = context;
        this.dataList = dataList;
    }




    @Override
    public ModelHargaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cvdaftarharga, parent, false);
        return new ModelHargaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final ModelHargaViewHolder holder, int position) {
        final ModelHarga modelharga = dataList.get(position);

        holder.tvbahan.setText(modelharga.getBahan());
        holder.tvjenis.setText(modelharga.getJenis());
        holder.tvproses.setText(modelharga.getProcessing());
        holder.tvberat.setText(modelharga.getSize());
        holder.tvtotalharga.setText(modelharga.getHarga());


        holder.cvharganew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailHarga.class);
                i.putExtra("harga", modelharga);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return dataList.size();
    }

    class ModelHargaViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvbahan)
        TextView tvbahan;
        @BindView(R.id.tvjenis)
        TextView tvjenis;
        @BindView(R.id.tvproses)
        TextView tvproses;
        @BindView(R.id.tvukuran)
        TextView tvberat;
        @BindView(R.id.tvtotalharga)
        TextView tvtotalharga;

        @BindView(R.id.cvharga)
        CardView cvharganew;

        ModelHargaViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
