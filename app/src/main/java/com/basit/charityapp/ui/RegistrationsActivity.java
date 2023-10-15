package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityRegistrationsBinding;

public class RegistrationsActivity extends AppCompatActivity {

    private ActivityRegistrationsBinding binding;
    private String usernName , userNumber, userEmail, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.btnSubmit.setOnClickListener(view -> {
            if (binding.edittextUserName.getText().toString().isEmpty()) {
                // Handle name empty case
                Toast.makeText(this, "Name is Empty", Toast.LENGTH_SHORT).show();
            } else if (binding.edittextUserNumber.getText().toString().isEmpty()) {
                // Handle number empty case
                Toast.makeText(this, "Number is Empty", Toast.LENGTH_SHORT).show();
            } else if (binding.edittextUserEmail.getText().toString().isEmpty()) {
                // Handle email empty case
                Toast.makeText(this, "Email is Empty", Toast.LENGTH_SHORT).show();
            } else if (binding.edittextUserPassword.getText().toString().isEmpty()) {
                // Handle password empty case
                Toast.makeText(this, "Password is Empty", Toast.LENGTH_SHORT).show();
            } else if (!binding.btnNgo.isChecked() && !binding.btnDonar.isChecked()) {
                // Handle radio button not selected case
                Toast.makeText(this, "Please select a radio button", Toast.LENGTH_SHORT).show();
            } else {
                // Account created successfully, and radio button is selected
                Toast.makeText(this, "Account created Successfully", Toast.LENGTH_SHORT).show();
                usernName = binding.edittextUserName.getText().toString();
                userNumber = binding.edittextUserNumber.getText().toString();
                userEmail = binding.edittextUserEmail.getText().toString();
                userPassword = binding.edittextUserPassword.getText().toString();

                // Check which radio button is selected and start the corresponding activity
                if (binding.btnNgo.isChecked()) {
                    startActivity(new Intent(RegistrationsActivity.this, OrganizationFormActivity.class));
                } else if (binding.btnDonar.isChecked()) {
                    startActivity(new Intent(RegistrationsActivity.this, DonarFormActivity.class));
                }
            }
        });


    }
}