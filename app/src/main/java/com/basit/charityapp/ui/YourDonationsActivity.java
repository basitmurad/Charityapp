package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityYourDonationsBinding;

public class YourDonationsActivity extends AppCompatActivity {
    private ActivityYourDonationsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityYourDonationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}