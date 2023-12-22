package com.example.zomato.Adaptors;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zomato.DetailsActivity;
import com.example.zomato.Modelss.MainModel;
import com.example.zomato.R;

import java.util.ArrayList;

public class MainAdaptor extends RecyclerView.Adapter<MainAdaptor.viewholder> {
    ArrayList<MainModel> list ;
    Context context;

    public MainAdaptor(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_mainfood, parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final MainModel model = list.get(position);
        holder.foodimage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());

      /*  holder.itemView.setOnClickListener((View view) -> {
            Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("image", model.getImage());
                    intent.putExtra("name", model.getName());
                    intent.putExtra("price", model.getPrice());
                    intent.putExtra("desc", model.getDescription());
                    context.startActivity(intent);
        }); */
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewholder extends RecyclerView.ViewHolder {

        ImageView foodimage;
        TextView mainName, price, description;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            foodimage = itemView.findViewById(R.id.imageView);
            mainName = itemView.findViewById(R.id.name) ;
            price = itemView.findViewById(R.id.orderPrice)  ;
            description = itemView.findViewById(R.id.description);
        }
    }
}

