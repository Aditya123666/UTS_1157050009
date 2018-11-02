package com.aditya.lenovo.kopigunungtilu.Activity;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.aditya.lenovo.kopigunungtilu.Adapter.AdapterDaftarHarga;
import com.aditya.lenovo.kopigunungtilu.Model.ModelHarga;
import com.aditya.lenovo.kopigunungtilu.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DaftarHarga extends AppCompatActivity {
    @BindView(R.id.recycler_view)
    RecyclerView rvHarga;

    private AdapterDaftarHarga mAdapter;

    List<ModelHarga> listHarga = new ArrayList<>();

//    private RecyclerView recyclerView;
//    private AdapterDaftarHarga adapter;
 //   private ArrayList<ModelHarga> ModelHargaArrayList;
//    List<ModelHarga> listHarga = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_harga);
        ButterKnife.bind(this);

        initHargaData();
        initRecyclerView();




//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarHarga.this);
//
//        recyclerView.setLayoutManager(layoutManager);
//
//        recyclerView.setAdapter(adapter);
    }
    private void initRecyclerView() {
        rvHarga.setHasFixedSize(true);
        rvHarga.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new AdapterDaftarHarga(this, listHarga);
        rvHarga.setAdapter(mAdapter);
    }
    private void initHargaData() {
        //ModelHargaArrayList = new ArrayList<>();
        //arabica,gb,natural
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Natural","100gr","3000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Natural","250gr","6000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Natural","500gr","9000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Natural","1000gr","10000"));
        //arabica,gb,honey
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Honey","100gr","8000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Honey","250gr","13000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Honey","500gr","18000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Honey","1000gr","25000"));
        //arabica,gb,wet
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Wet","100gr","4000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Wet","250gr","8000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Wet","500gr","14000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Wet","1000gr","20000"));
        //arabica,gb,Dry
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Dry","100gr","5000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Dry","250gr","10000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Dry","500gr","15000"));
        listHarga.add(new ModelHarga("Arabica", "Grean Bean", "Dry","1000gr","24000"));

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent i = new Intent(DaftarHarga.this, ProfileActivity.class);
                startActivity(i);
                break;
            case R.id.language:
                Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);
                break;
        }
        return true;
    }
}
