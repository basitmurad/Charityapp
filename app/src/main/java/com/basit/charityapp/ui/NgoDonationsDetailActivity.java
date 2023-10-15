package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityNgoDonationsDetailBinding;

public class NgoDonationsDetailActivity extends AppCompatActivity {

    private ActivityNgoDonationsDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNgoDonationsDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NgoDonationsDetailActivity.this,NgoRequestActivity.class));
            }
        });


    }
}