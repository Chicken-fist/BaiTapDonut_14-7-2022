package com.example.baitapdonut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTietDonut extends AppCompatActivity {

    private TextView txtName, txtMoTa, txtGia;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_donut);

        txtName = findViewById(R.id.txtNameChiTiet);
        txtMoTa = findViewById(R.id.txtMoTaCT);
        txtGia = findViewById(R.id.txtGiaChiTiet);
        img = findViewById(R.id.imgDonutCT);

        Intent intent = getIntent();
        txtName.setText(intent.getExtras().getString("donutName"));
        txtMoTa.setText(intent.getExtras().getString("donutDecri"));
        txtGia.setText(intent.getExtras().getString("donutCost"));
        img.setImageResource(intent.getExtras().getInt("donutPic"));

    }
}