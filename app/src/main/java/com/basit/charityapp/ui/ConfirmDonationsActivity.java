package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityConfirmDonationsBinding;

public class ConfirmDonationsActivity extends AppCompatActivity {


    private ActivityConfirmDonationsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConfirmDonationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}