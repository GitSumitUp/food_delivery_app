package com.example.zomato;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.zomato.Adaptors.MainAdaptor;
import com.example.zomato.Modelss.MainModel;
import com.example.zomato.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger_king, "Burger King", "297", "Experience the mouthwatering Burger King - Fresh veggies, melted cheese and creamy sauce."));
        list.add(new MainModel(R.drawable.cheese_pizza, "Double Cheese Pizza", "595", "Cheesy Veggie Pizza - fresh veggies, melted cheese and flavorful sauce!"));
        list.add(new MainModel(R.drawable.veg_grill_sandwitch, "Veg Grill Sandwich", "35", "Grilled Veggie Delight - Fresh veggies, melted cheese, and smooth spread."));
        list.add(new MainModel(R.drawable.chiken_burger, "Chicken Burger", "197", "Delectable Chicken Burger - Juicy grilled chicken, fresh veggies, and savory sauce."));
        list.add(new MainModel(R.drawable.cheese_veggi_pizza, "Cheesy Pizza", "394", "\"Cheesy Pizza: Irresistibly gooey, satisfying, and bursting with cheesy goodness!\""));
        list.add(new MainModel(R.drawable.idli_dosa, "Idli And Dosa", "80", "\"South Indian Delights: Rich, aromatic, and a delectable journey of flavors!\""));
        list.add(new MainModel(R.drawable.chicken_biryani, "Chicken Biryani", "180", "\"Scrumptious Dum Biryani: Fragrant, flavorful, and a true feast for the senses!\""));
        list.add(new MainModel(R.drawable.red_sauce_pasta, "Red Chilly Pasta", "120", "\"Red Chilly Pasta: A spicy, lip-smacking fusion of Italian and Indian flavors!\""));
        list.add(new MainModel(R.drawable.maharaja_burger, "MAHARAJA Burger", "350", "Maharaja Burger - A royal treat with grill chicken, fresh veggies with sauce!"));
        list.add(new MainModel(R.drawable.panjabi_thali, "Punjabi Thali", "250", "Tandoori Paneer Pizza - tandoori paneer with fresh veggies, and melted cheese"));
        list.add(new MainModel(R.drawable.panipuri, "Pani Puri", "30", "\"Irresistible panipuri: Bursting with tangy, spicy, and flavorful street food delight!\""));
        list.add(new MainModel(R.drawable.schezwan_noodles, "Veg Hakka Noodles", "200", "\"Delectable Chinese Noodles - Savory, flavorful, and utterly satisfying comfort food!\""));


        MainAdaptor adaptor = new MainAdaptor(list, this);
        binding.recycleview.setAdapter(adaptor);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recycleview.setLayoutManager(layoutManager);

    }
}