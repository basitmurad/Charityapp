package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityRegistrationsBinding;

public class RegistrationsActivity extends AppCompatActivity {

    private ActivityRegistrationsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}