package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityNewDonationsBinding;

public class NewDonationsActivity extends AppCompatActivity {

    private ActivityNewDonationsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_donations);
    }
}