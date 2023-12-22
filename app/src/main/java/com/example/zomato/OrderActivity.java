package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.zomato.Adaptors.OrdersAdaptors;
import com.example.zomato.Modelss.OrdersModel;
import com.example.zomato.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
   ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burger_king, "Burger King", "297", "212200"));
        list.add(new OrdersModel(R.drawable.chicken_biryani, "Chicken Biryani", "180", "212201"));
        list.add(new OrdersModel(R.drawable.maharaja_burger, "MAHARAJA Burger", "350", "212202"));
        list.add(new OrdersModel(R.drawable.schezwan_noodles, "Hakka Noodles", "200", "212203"));
        list.add(new OrdersModel(R.drawable.chiken_burger, "Chicken Burger", "197", "212204"));
        list.add(new OrdersModel(R.drawable.cheese_veggi_pizza, "Double Cheese Pizza", "475", "212205"));
        list.add(new OrdersModel(R.drawable.panipuri, "Pani Puri", "30", "212206"));
        list.add(new OrdersModel(R.drawable.panjabi_thali, "Punjabi Dish", "250", "212207"));

        OrdersAdaptors adapter = new OrdersAdaptors(list, this);
        binding.ordersRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.ordersRecyclerView.setLayoutManager(layoutManager);
    }
}