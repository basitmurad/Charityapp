package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;
    private String userName, userPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        binding.btnLogin.setOnClickListener(view -> {

            checkValidation();
        });



        binding.btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignInActivity.this,RegistrationsActivity.class));
            }
        });
    }

    private void checkValidation() {

        if (binding.edittextUserName.getText().toString().isEmpty()
         )
        {
            Toast.makeText(this, "User name is empty", Toast.LENGTH_SHORT).show();
        }

        if (   binding.edittextUserPassword.getText().toString().isEmpty())

        {
            Toast.makeText(this, "password is empty", Toast.LENGTH_SHORT).show();

        }

        else {

            userName = binding.edittextUserName.getText().toString();
            userPassword = binding.edittextUserPassword.getText().toString();
            startActivity(new Intent(SignInActivity.this, ResturantsLoginActivity.class));

        }
    }
}