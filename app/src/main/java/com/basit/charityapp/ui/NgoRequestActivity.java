package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityNgoRequestBinding;

public class NgoRequestActivity extends AppCompatActivity {
    private ActivityNgoRequestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNgoRequestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}