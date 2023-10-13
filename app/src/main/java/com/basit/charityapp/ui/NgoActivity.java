package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityNgoBinding;

public class NgoActivity extends AppCompatActivity {

    private ActivityNgoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNgoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}