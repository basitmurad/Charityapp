package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityResturantsLoginBinding;

public class ResturantsLoginActivity extends AppCompatActivity {

    private ActivityResturantsLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResturantsLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}