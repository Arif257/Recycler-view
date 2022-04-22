package com.arif.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String[] title, desc;
    int[] images;

    public MyAdapter(Context context, String[] title, String[] desc, int[] images) {
        this.context = context;
        this.title = title;
        this.desc = desc;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.titleTextView.setText(title[i]);
        myViewHolder.descriptionTextView.setText(desc[i]);
        myViewHolder.flagImageView.setImageResource(images[i]);


    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titleTextView, descriptionTextView;
        ImageView flagImageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextViewId);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextViewId);
            flagImageView = itemView.findViewById(R.id.myImageViewId);
        }
    }
}
