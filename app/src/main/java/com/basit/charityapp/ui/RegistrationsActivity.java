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


            if (binding.edittextUserName.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Name is Empty", Toast.LENGTH_SHORT).show();
            }
            if (binding.edittextUserNumber.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Number is Empty", Toast.LENGTH_SHORT).show();
            }
            if (binding.edittextUserEmail.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Email is Empty", Toast.LENGTH_SHORT).show();
            }
            if (binding.edittextUserPassword.getText().toString().isEmpty())
            {
                Toast.makeText(this, "password is Empty", Toast.LENGTH_SHORT).show();
            }
           if (!binding.btnNgo.isChecked() || !binding.btnResturant.isChecked())
           {
               Toast.makeText(this, "Check the box", Toast.LENGTH_SHORT).show();
           }

           else {
               Toast.makeText(this, "Account created Successfully", Toast.LENGTH_SHORT).show();

               usernName = binding.edittextUserName.getText().toString();
               usernName = binding.edittextUserNumber.getText().toString();
               userEmail = binding.edittextUserEmail.getText().toString();
               userPassword = binding.edittextUserPassword.getText().toString();

               startActivity(new Intent(RegistrationsActivity.this,NgoActivity.class));
           }


        });



    }
}