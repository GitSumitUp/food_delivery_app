package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.zomato.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int image = getIntent().getIntExtra("image",0);

        String name = getIntent().getStringExtra("name");

        Intent intent = getIntent();
        String valueString = intent.getStringExtra("price"); // Replace "key" with the actual key used to put the extra.

        // Check if the valueString is not null before parsing it
        int price = 0; // Set a default value in case parsing fails
        if (valueString != null) {
            try {
                price = Integer.parseInt(valueString);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                // Handle the exception, such as showing an error message or logging the issue.
            }
        }

        //   int price = Integer.parseInt(getIntent().getStringExtra("Price"));

        String description = getIntent().getStringExtra("desc");

        binding.imageDetails.setImageResource(image);
        binding.priceDetails.setText(String.format("%s",price));
        binding.nameDetails.setText(name);
        binding.detailDescription.setText(description);
    }
}