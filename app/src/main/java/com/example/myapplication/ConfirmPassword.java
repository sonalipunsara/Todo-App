package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmPassword extends AppCompatActivity implements View.OnClickListener {

    private Button changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_password);

        // Initialize the view
        changeButton = findViewById(R.id.btn_change);

        // Set click listener
        changeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_change) {
            // Navigate back to SignIn activity
            Toast.makeText(getApplicationContext(), "Password changed successfully", Toast.LENGTH_SHORT).show();
            Intent signInIntent = new Intent(ConfirmPassword.this, SignIn.class);
            startActivity(signInIntent);
        }
    }
}
