package com.example.projectresep;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepHolder>{
    List<IsiResep>resepnya;
    Activity activity;

    public ResepAdapter(List<IsiResep> resepnya, Activity activity) {
        this.resepnya = resepnya;
        this.activity = activity;
    }


    @NonNull
    @Override
    public ResepHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.rv_item, parent,false);
        return new ResepHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResepHolder holder, final int position) {
        holder.txtTitle.setText(resepnya.get(position).getTitle());
        Picasso.with(activity).load(resepnya.get(position).getThumb()).into(holder.imgNya);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kirim=new Intent(activity,ResepActivity.class);
                kirim.putExtra("Paket",resepnya.get(position));
                v.getContext().startActivity(kirim);
            }
        });


    }

    @Override
    public int getItemCount() {
        return resepnya.size();
    }

    static class ResepHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        ImageView imgNya;

        public ResepHolder(@NonNull View itemView) {
                       super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
            imgNya=(ImageView)itemView.findViewById(R.id.img_resep);


        }
    }
}
