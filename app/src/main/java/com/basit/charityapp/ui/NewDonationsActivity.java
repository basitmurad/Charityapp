package com.basit.charityapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.basit.charityapp.R;
import com.basit.charityapp.databinding.ActivityNewDonationsBinding;

public class NewDonationsActivity extends AppCompatActivity {

    private ActivityNewDonationsBinding binding;
    private String itemName, itemTime, itemQuantity , itemAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding  = ActivityNewDonationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.btnSubmit.setOnClickListener(view -> {




            if (binding.editTextItemName.getText().toString().isEmpty())

            {
                Toast.makeText(this, "Name is empty", Toast.LENGTH_SHORT).show();
            }

            if (binding.editTextQuantity.getText().toString().isEmpty())

            {
                Toast.makeText(this, "Quantity is empty", Toast.LENGTH_SHORT).show();
            }

            if (binding.editTextAddress.getText().toString().isEmpty())

            {
                Toast.makeText(this, "Address is empty", Toast.LENGTH_SHORT).show();
            }

            if (binding.editTextTime.getText().toString().isEmpty())

            {
                Toast.makeText(this, "Name is empty", Toast.LENGTH_SHORT).show();
            }

            if (!binding.btnYes.isChecked() || !binding.btnNo.isChecked())
            {
                Toast.makeText(this, "choose 1", Toast.LENGTH_SHORT).show();
            }


            else {


                itemName = binding.editTextItemName.getText().toString();
                itemAddress = binding.editTextAddress.getText().toString();
                itemTime = binding.editTextTime.getText().toString();

                itemQuantity = binding.editTextQuantity.getText().toString();

            }
        });



    }
}