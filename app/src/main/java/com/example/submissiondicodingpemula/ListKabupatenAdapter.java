package com.example.submissiondicodingpemula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKabupatenAdapter extends RecyclerView.Adapter<ListKabupatenAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Kabupaten> listKabupaten;

    public ListKabupatenAdapter(Context context) {
        this.context = context;
    }


    public ArrayList<Kabupaten> getListKabupaten() {
        return listKabupaten;
    }

    public void setListKabupaten(ArrayList<Kabupaten> listKabupaten) {
        this.listKabupaten = listKabupaten;
    }



    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row,viewGroup,false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListKabupaten().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListKabupaten().get(position).getRemarks());

        Glide.with(context)
                .load(getListKabupaten().get(position).getPhoto())
                .apply(new RequestOptions().override(66,66))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListKabupaten().size();
    }

     class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvRemarks;
        ImageView imgPhoto;
        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvRemarks = itemView.findViewById(R.id.tv_remarks);
            imgPhoto = itemView.findViewById(R.id.img_photo);

        }
    }
}
