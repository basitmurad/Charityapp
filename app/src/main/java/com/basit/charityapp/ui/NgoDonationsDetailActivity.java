package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityNgoDonationsDetailBinding;

public class NgoDonationsDetailActivity extends AppCompatActivity {

    private ActivityNgoDonationsDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNgoDonationsDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}