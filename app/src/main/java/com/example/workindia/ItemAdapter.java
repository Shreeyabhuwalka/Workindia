package com.example.workindia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {
    Context context;
    int img[];
    String name[];
    String price[];
    String extra[];

    public ItemAdapter(Context context, int[] img) {
        this.context = context;
        this.img = img;
//        this.name = name;
//        this.price = price;
//        this.extra = extra;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.mImageView.setImageResource(img[position]);
        holder.name.setText("Item"+position+1);
        holder.extra.setText("extra");
        holder.price.setText("Rs 100");
    }
    @Override
    public int getItemCount() {
        return img.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView price;
        TextView extra;
        ImageView mImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            extra = itemView.findViewById(R.id.extra);
        }
    }
}
