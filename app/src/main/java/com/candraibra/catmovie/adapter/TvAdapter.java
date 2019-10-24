package com.candraibra.catmovie.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.candraibra.catmovie.R;
import com.candraibra.catmovie.data.Tv;

import java.util.ArrayList;

public class TvAdapter extends RecyclerView.Adapter<TvAdapter.MyViewHolder> {

    Context context;
    private ArrayList<Tv> tvArrayList;

    public TvAdapter(Context mContext) {
        this.tvArrayList = new ArrayList<>();
    }

    public void setMovieList(ArrayList<Tv> tvArrayList) {
        this.tvArrayList = tvArrayList;
    }

    @NonNull
    @Override
    public TvAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_item_rv, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TvAdapter.MyViewHolder holder, int i) {
        holder.tvTitle.setText(tvArrayList.get(i).getTitle());
        holder.tvDesc.setText(tvArrayList.get(i).getDesc());
        holder.imgPhoto.setImageResource(tvArrayList.get(i).getImage());

    }

    @Override
    public int getItemCount() {
        return tvArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvDesc;
        ImageView imgPhoto;

        MyViewHolder(View view) {
            super(view);

            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
            imgPhoto = itemView.findViewById(R.id.iv_poster);

        }
    }
}
