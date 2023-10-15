package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityDonarFormBinding;

public class DonarFormActivity extends AppCompatActivity {

    private ActivityDonarFormBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDonarFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSubmit.setOnClickListener(view -> {


            startActivity(new Intent(DonarFormActivity.this,NgoActivity.class));
        });

        String selectedCountryCode = binding.countryCodePicker.getSelectedCountryCode();

    }
}