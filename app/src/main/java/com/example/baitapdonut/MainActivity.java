package com.example.baitapdonut;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ListView lvDonut;
    private DonutAdapter donutAdapter;
    private List<Donut> listDonut;
    private TextView txtTim;
    private Button  btnDonut, btnFloating, btnPinkDonut;
    private ImageButton btnSearch;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDonut = (ListView) findViewById(R.id.lv);
        txtTim = (TextView) findViewById(R.id.txtTim);
        btnDonut = findViewById(R.id.btnDonut);
        btnPinkDonut = findViewById(R.id.btnPink);
        btnFloating = findViewById(R.id.btnFloating);
        btnSearch =  findViewById(R.id.btnSearch);
        listDonut = new ArrayList<>();

        listDonut.add(new Donut("Tasty Donut", "spciy tasty donut family","$10.00", R.drawable.donut_yellow_1));
        listDonut.add(new Donut("Pink Donut", "spciy tasty donut family","$10.00", R.drawable.tasty_donut_1));
        listDonut.add(new Donut("Floating Donut", "spciy tasty donut family","$10.00", R.drawable.green_donut_1));
        listDonut.add(new Donut("Tasty Donut", "spciy tasty donut family","$10.00", R.drawable.donut_red_1));

        donutAdapter = new DonutAdapter(this, R.layout.motdong_donut, listDonut);
        lvDonut.setAdapter(donutAdapter);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Donut> donutSearchList = new ArrayList<>();

                String dongCanTim = txtTim.getText().toString().trim().toLowerCase(Locale.ROOT);
                if(dongCanTim.equals("")){
                    Toast.makeText (getApplicationContext(), "Nhap Ten Donut Can Tim", Toast.LENGTH_SHORT).show();
                }
                else{
                    for (Donut donut: listDonut) {
                        if(donut.getNameDonut().toLowerCase(Locale.ROOT).contains(dongCanTim)){
                            donutSearchList.add(donut);
                        }

                    }
                    lvDonut.setAdapter(new DonutAdapter(MainActivity.this, R.layout.motdong_donut, donutSearchList));

                }
            }
        });

        btnFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Donut> donutSearchList = new ArrayList<>();

                String dongCanTim = "Floating".toLowerCase(Locale.ROOT);


                    for (Donut donut: listDonut) {
                        if(donut.getNameDonut().toLowerCase(Locale.ROOT).contains(dongCanTim)){
                            donutSearchList.add(donut);
                        }


                    lvDonut.setAdapter(new DonutAdapter(MainActivity.this, R.layout.motdong_donut, donutSearchList));

                }
            }
        });

        btnDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Donut> donutSearchList = new ArrayList<>();

                String dongCanTim = "Donut".toLowerCase(Locale.ROOT);

                    for (Donut donut: listDonut) {
                        if(donut.getNameDonut().toLowerCase(Locale.ROOT).contains(dongCanTim)){
                            donutSearchList.add(donut);
                        }


                    lvDonut.setAdapter(new DonutAdapter(MainActivity.this, R.layout.motdong_donut, donutSearchList));

                }
            }
        });

        btnPinkDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Donut> donutSearchList = new ArrayList<>();

                String dongCanTim = "Pink Donut".toLowerCase(Locale.ROOT);

                    for (Donut donut: listDonut) {
                        if(donut.getNameDonut().toLowerCase(Locale.ROOT).contains(dongCanTim)){
                            donutSearchList.add(donut);
                        }

                    lvDonut.setAdapter(new DonutAdapter(MainActivity.this, R.layout.motdong_donut, donutSearchList));

                }
            }
        });

    }
}