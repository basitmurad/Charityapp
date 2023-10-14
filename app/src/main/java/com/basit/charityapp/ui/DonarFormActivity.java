package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityDonarFormBinding;

public class DonarFormActivity extends AppCompatActivity {

    private ActivityDonarFormBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDonarFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}