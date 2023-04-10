package com.example.newsapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.R;
import com.example.newsapp.activities.BanTinActivity;
import com.example.newsapp.models.DanhMuc;

import java.util.ArrayList;

public class DanhMucAdaper extends RecyclerView.Adapter<DanhMucAdaper.ViewHolder> {

    private Context mContext;
    private ArrayList<DanhMuc> mListDanhMuc;

    public DanhMucAdaper(Context mContext, ArrayList<DanhMuc> mListDanhMuc) {
        this.mContext = mContext;
        this.mListDanhMuc = mListDanhMuc;
    }

    @Override
    public DanhMucAdaper.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_danh_muc, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DanhMucAdaper.ViewHolder holder, int position) {
        DanhMuc danhMuc = mListDanhMuc.get(position);
        holder.txtDanhMuc.setText(danhMuc.getTenDanhMuc());

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, BanTinActivity.class);
                intent.putExtra("url", danhMuc.getUrl());
                mContext.startActivity(intent);
            }
        });

    }
public class DanhMucAdaper {

}
