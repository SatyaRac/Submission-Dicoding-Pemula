package com.example.submissiondicodingpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class Detail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        Kabupaten kabupaten = intent.getParcelableExtra("KIRIM");

        String remarks = kabupaten.getRemarks();
        String ultah = kabupaten.getUltah();
        String penduduk = kabupaten.getPenduduk();
        String keterangan = kabupaten.getKeterangan();
        String title = kabupaten.getName();


        ImageView imgPhoto = findViewById(R.id.img_photo);

        Glide.with(this)
                .load(kabupaten.getPhoto())
                .into(imgPhoto);

        TextView tvName = findViewById(R.id.tv_name);
        tvName.setText(title);

        TextView tvRemarks = findViewById(R.id.tv_remarks);
        tvRemarks.setText(remarks);

        TextView tvKeterangan = findViewById(R.id.tv_keterangan);
        tvKeterangan.setText(keterangan);

        TextView tvUltah = findViewById(R.id.tv_ultah);
        tvUltah.setText(ultah);

        TextView tvPenduduk = findViewById(R.id.tv_penduduk);
        tvPenduduk.setText(penduduk);



    }
}
