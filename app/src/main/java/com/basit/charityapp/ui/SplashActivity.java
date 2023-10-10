package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;
    private int currentImageIndex = 0; // Variable to keep track of the current image index
    private int currentTextIndex = 0; // Variable to keep track of the current image index
    private int count =0;
    private int[] imageArray;
    private String [] textArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        imageArray = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};
        textArray = new String[]{getString(R.string.text1),
                getString(R.string.text2),
                getString(R.string.text3),
                getString(R.string.text4)};


        binding.text.setText(R.string.text1);
        binding.images.setImageResource(R.drawable.image1);
        count=0;
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < imageArray.length) {
                    // Change the image and text

//                    imageView.setImageResource(imageArray[count]);
                    binding.images.setImageResource(imageArray[count]);

//                    TextView textView = findViewById(R.id.text);
//                    textView.setText(textArray[count]);
                    binding.text.setText(textArray[count]);

                    count++;

                    // Check if count equals the array length
                    if (count == 3) {
                        // Show btnStart and hide btnNext
                        binding.btnNext.setVisibility(View.GONE);
                        binding.btnStart.setVisibility(View.VISIBLE);
                    }
                }
            }
        });




        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashActivity.this, SignInActivity.class));
            }
        });

    }


}