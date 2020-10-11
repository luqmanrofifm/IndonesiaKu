package com.example.latihan5.indonesiaku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailProvinceActivity extends AppCompatActivity {

    private ImageView logoProvinsi,petawilayah;

    private TextView namaofProvinsi,ibuKota,luasWilayah,tanggal,posisiWilayah,jumlahjiwa,detail,judulPeta;

    public static final String LOGO = "extra_logo";
    public static final String PROVINCE_NAME = "extra_name_province";
    public static final String IBUKOTA = "extra_ibukota";
    public static final String LUAS = "extra_luas";
    public static final String TANGGAL_LAHIR = "extra_tangal";
    public static final String POSISI = "extra_posisi";
    public static final String JUMLAH_JIWA = "extra_jumlah_jiwa";
    public static final String DETAIL_LOGO = "extra_detail_logo";
    public static final String PETA = "extra_peta";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_province);

        logoProvinsi = findViewById(R.id.gambar_logo);
        namaofProvinsi = findViewById(R.id.nama_provinsi);
        ibuKota = findViewById(R.id.ibu_kota);
        luasWilayah = findViewById(R.id.luas_wilayah);
        tanggal = findViewById(R.id.tanggal_berdiri);
        posisiWilayah = findViewById(R.id.letak_posisi);
        jumlahjiwa = findViewById(R.id.jumlah_jiwa);
        petawilayah = findViewById(R.id.gambar_peta);
        detail = findViewById(R.id.makna_logo);
        judulPeta = findViewById(R.id.judul_peta);


        String namaProvinsi = getIntent().getStringExtra(PROVINCE_NAME);
        String ibukota = getIntent().getStringExtra(IBUKOTA);
        String luas = getIntent().getStringExtra(LUAS) + " km persegi";
        String tanggal_lahir = getIntent().getStringExtra(TANGGAL_LAHIR);
        String posisi = getIntent().getStringExtra(POSISI);
        String jumlah_jiwa = getIntent().getStringExtra(JUMLAH_JIWA) + " juta";
        String detail_logo = getIntent().getStringExtra(DETAIL_LOGO);
        int logo = getIntent().getIntExtra(LOGO,0);
        int peta = getIntent().getIntExtra(PETA, 0);

        logoProvinsi.setImageResource(logo);
        namaofProvinsi.setText(namaProvinsi);
        ibuKota.setText(ibukota);
        luasWilayah.setText(luas);
        tanggal.setText(tanggal_lahir);
        posisiWilayah.setText(posisi);
        jumlahjiwa.setText(jumlah_jiwa);

        String judulpeta_wilayah = "Peta "+namaProvinsi;
        judulPeta.setText(judulpeta_wilayah);
        petawilayah.setImageResource(peta);
        detail.setText(detail_logo);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(namaProvinsi);
        }
    }
}
