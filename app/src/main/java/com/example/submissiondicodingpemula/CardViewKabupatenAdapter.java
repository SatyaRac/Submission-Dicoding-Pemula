package com.example.submissiondicodingpemula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewKabupatenAdapter extends RecyclerView.Adapter<CardViewKabupatenAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Kabupaten> listKabupaten;
    private ArrayList<Kabupaten> getListKabupaten(){
        return listKabupaten;
    }
    public void setListKabupaten(ArrayList<Kabupaten> listKabupaten){
        this.listKabupaten = listKabupaten;
    }
    public CardViewKabupatenAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_view,
                viewGroup,false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        Kabupaten k = getListKabupaten().get(i);

        Glide.with(context)
                .load(k.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvName.setText(k.getName());
        cardViewViewHolder.tvRemarks.setText(k.getRemarks());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new
                CustomOnItemClickListener.OnItemClickCallback(){
                @Override
                    public void onItemClicked(View view, int position){
                    Toast.makeText(context,"Favorite "+getListKabupaten().get(position).getName(),
                            Toast.LENGTH_SHORT).show();
                }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new
                CustomOnItemClickListener.OnItemClickCallback(){
                @Override
                    public void onItemClicked(View view, int position){
                    Toast.makeText(context,"Share "+getListKabupaten().get(position).getName(),
                            Toast.LENGTH_SHORT).show();
                }
        }));


    }

    @Override
    public int getItemCount() {
        return getListKabupaten().size();
    }

     class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName,tvRemarks;
        Button btnFavorite,btnShare;
        CardViewViewHolder(@NonNull View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo);
            tvName = itemView.findViewById(R.id.tv_name);
            tvRemarks = itemView.findViewById(R.id.tv_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_fav);
            btnShare = itemView.findViewById(R.id.btn_share);


        }
    }
}
