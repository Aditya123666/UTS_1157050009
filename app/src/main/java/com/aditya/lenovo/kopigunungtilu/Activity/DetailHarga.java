package com.aditya.lenovo.kopigunungtilu.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.aditya.lenovo.kopigunungtilu.Model.ModelHarga;
import com.aditya.lenovo.kopigunungtilu.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailHarga extends AppCompatActivity {
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

    ModelHarga modelharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_harga);
        ButterKnife.bind(this);

        modelharga = (ModelHarga) getIntent().getSerializableExtra("modelharga");

        initToolbar();
        initUI();

    }
    private void initToolbar() {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(getString(R.string.detail_harga_kopi));
        getSupportActionBar().setSubtitle(modelharga.getBahan());
    }

    private void initUI() {
        //Glide.with(this).load(santri.getImage()).into(imageSantri);
        tvbahan.setText(modelharga.getBahan());
        tvjenis.setText(modelharga.getJenis());
        tvproses.setText(modelharga.getProcessing());
        tvberat.setText(modelharga.getSize());
        tvtotalharga.setText(modelharga.getHarga());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home : {
                finish();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
