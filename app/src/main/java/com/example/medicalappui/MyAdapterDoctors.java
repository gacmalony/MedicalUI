package com.example.medicalappui;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MyAdapterDoctors extends RecyclerView.Adapter<MyAdapterDoctors.MyViewHolder> {

    private ArrayList<row2> data;
    private Context context;

    public MyAdapterDoctors(Context context, ArrayList<row2> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item2, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ImageView image = holder.getImageView();

        Glide.with(context)
                .load(data.get(position).getImag())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(20)))
                .into(image);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView_item2);
            itemView.setOnClickListener(this);

        }
        public ImageView getImageView() {
            return imageView;
        }
        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        @Override
        public void onClick(View v) {
            if(getLayoutPosition()==0){
                Toast.makeText(context,"You clicked first Doctor", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
