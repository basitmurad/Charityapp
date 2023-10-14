package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.btnShare.setOnClickListener(view -> {


        });

    }

    public void shareApp() {
        // Create an Intent with ACTION_SEND
        Intent shareIntent = new Intent(Intent.ACTION_SEND);

        // Set the type of content you want to share (text, URL, etc.)
        shareIntent.setType("text/plain");

        // Set the text to be shared (you can customize this)
        String shareText = "Check out my awesome app: https://play.google.com/store/apps/details?id=com.basit.charityapp.ui";
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

        // Start the sharing activity
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

}