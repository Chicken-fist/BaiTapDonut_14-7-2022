package com.example.baitapdonut;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class DonutAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Donut> list;
    private int positionSelected = -1;

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout, null);

        ImageView imgPic = (ImageView) view.findViewById(R.id.imgHinh);
        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtMoTa = (TextView) view.findViewById(R.id.txtMoTa);
        TextView txtGia = (TextView) view.findViewById(R.id.txtGia);

        Donut donut = list.get(i);
        imgPic.setImageResource(donut.getPiture());
        txtName.setText(donut.getNameDonut());
        txtMoTa.setText(donut.getDecribetion());
        txtGia.setText(donut.getCost());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                positionSelected = i;
               Intent intent = new Intent(context, ChiTietDonut.class);
               Donut donut1 = list.get(positionSelected);
               intent.putExtra("donutName", donut1.getNameDonut());
               intent.putExtra("donutDecri", donut1.getDecribetion());
               intent.putExtra("donutCost", donut1.getCost());
               intent.putExtra("donutPic", donut1.getPiture());
               context.startActivity(intent);
            }
        });

        final ConstraintLayout layout1 =(ConstraintLayout)view.findViewById(R.id.motDonut);
        if(positionSelected == i){
            layout1.setBackgroundColor(Color.YELLOW);
        }
        else{
            layout1.setBackgroundColor(Color.WHITE);
        }

        return view;
    }

    public DonutAdapter(Context context, int layout, List<Donut> list){

        this.context = context;
        this.layout = layout;
        this.list = list;
    }
}
