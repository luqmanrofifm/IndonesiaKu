package com.example.latihan5.indonesiaku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private RecyclerView recyclerView;
   private ArrayList<Province> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_provinsi);
        recyclerView.setHasFixedSize(true);

        list.addAll(ProvinceData.getData());
        showRecyclerView();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent aboutMeIntent = new Intent(MainActivity.this,AboutMeActivity.class);
        startActivity(aboutMeIntent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_me,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListProvinceAdapter listProvinceAdapter = new ListProvinceAdapter(list);
        recyclerView.setAdapter(listProvinceAdapter);

        listProvinceAdapter.setItemClickCallback(new ListProvinceAdapter.ItemClickCallback() {
            @Override
            public void itemClicked(Province province) {
                Intent intent = new Intent(MainActivity.this, DetailProvinceActivity.class );
                intent.putExtra(DetailProvinceActivity.LOGO, province.getGambarLogo());
                intent.putExtra(DetailProvinceActivity.PETA, province.getGambarPeta());
                intent.putExtra(DetailProvinceActivity.PROVINCE_NAME, province.getProvinceName());
                intent.putExtra(DetailProvinceActivity.IBUKOTA, province.getIbuKota());
                intent.putExtra(DetailProvinceActivity.JUMLAH_JIWA, province.getJumlahJiwa());
                intent.putExtra(DetailProvinceActivity.TANGGAL_LAHIR, province.getTanggalLahir());
                intent.putExtra(DetailProvinceActivity.LUAS, province.getLuas());
                intent.putExtra(DetailProvinceActivity.POSISI, province.getLetakPosisi());
                intent.putExtra(DetailProvinceActivity.DETAIL_LOGO, province.getDetailLogo());
                startActivity(intent);
            }
        });
    }
}
