package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityNgoBinding;

public class NgoActivity extends AppCompatActivity {

    private ActivityNgoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNgoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnDonationRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NgoActivity.this,NgoDonationsDetailActivity.class));
            }
        });

    }
}