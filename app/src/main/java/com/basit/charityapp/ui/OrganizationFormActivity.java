package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityOrganizationFormBinding;

public class OrganizationFormActivity extends AppCompatActivity {


    private ActivityOrganizationFormBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOrganizationFormBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        String[] items = {"Select your organizations", "Item 2", "Item 3", "Item 4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerOrganization.setAdapter(adapter);
        binding.spinnerMission.setAdapter(adapter);
        binding.spinnerAccountType.setAdapter(adapter);

        binding.spinnerOrganization.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = binding.spinnerOrganization.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        binding.btnAccountSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OrganizationFormActivity.this,ResturantsLoginActivity.class));
            }
        });
    }
}