package com.example.user.customer1;

/**
 * Created by user on 1/22/2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Items> ItemsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView Image;
        public TextView Name;
        public TextView Price;

        public MyViewHolder(View view) {
            super(view);
            Image = (ImageView) view.findViewById(R.id.Image);
            Name = (TextView) view.findViewById(R.id.Name);
            Price = (TextView) view.findViewById(R.id.Price);
        }
    }


    public Adapter(List<Items> ItemsList) {
        this.ItemsList = ItemsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Items items = ItemsList.get(position);
        holder.Image.setImageResource(items.getImage());
        holder.Name.setText(items.getName());
        holder.Price.setText(items.getPrice());
    }

    @Override
    public int getItemCount() {
        return ItemsList.size();
    }
