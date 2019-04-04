package com.example.prosp.paden.services;

/**
 * Created by prosp on 12/16/2018.
 */


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.prosp.paden.R;

import java.util.Collections;
import java.util.List;

//import com.example.prosp.offcampuslife.property.DataPro;

public class AdapterServices extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<DataServices> data = Collections.emptyList();
    DataServices current;
    int currentPos = 0;

    // create constructor to innitilize context and data sent from MainActivity
    public AdapterServices(Context context, List<DataServices> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.container_services, parent, false);
        com.example.prosp.paden.services.AdapterServices.MyHolder holder = new com.example.prosp.paden.services.AdapterServices.MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        // Get current position of item in recyclerview to bind data and assign values from list
        final com.example.prosp.paden.services.AdapterServices.MyHolder myHolder = (com.example.prosp.paden.services.AdapterServices.MyHolder) holder;
        final DataServices current = data.get(position);
        myHolder.textFishName.setText(current.name);
        // myHolder.textFishName.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary));
        myHolder.textSize.setText(current.email);
        myHolder.textType.setText(current.phone);
        myHolder.textPrice.setText(current.nationalId );
        myHolder.textDate.setText(current.date);
        // myHolder.textPrice.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));

        // load image into imageview using glide
        Glide.with(context).load("http://10.0.2.2/paden/images/" + current.image)
                .placeholder(R.drawable.ic_menu_camera)
                .error(R.drawable.ic_menu_camera)
                .into(myHolder.ivFish);


        myHolder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }





        });


    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{

        TextView textFishName;
        ImageView ivFish;
        TextView textSize;
        TextView textType;
        TextView textPrice;
        TextView textDate;
        RelativeLayout relative;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textFishName= (TextView) itemView.findViewById(R.id.name);
            ivFish= (ImageView) itemView.findViewById(R.id.ivFish);
            textSize = (TextView) itemView.findViewById(R.id.email);
            textType = (TextView) itemView.findViewById(R.id.phone);
            textPrice = (TextView) itemView.findViewById(R.id.nat);
            textDate = (TextView) itemView.findViewById(R.id.dat);
            relative=(RelativeLayout)itemView.findViewById(R.id.relative);
        }

    }

}