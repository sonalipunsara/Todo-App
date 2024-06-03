package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity implements View.OnClickListener {

    private TextView nextTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // Initialize the view
        nextTextView = findViewById(R.id.txtBtn_next);

        // Set click listener
        nextTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.txtBtn_next) {
            // Navigate to ConfirmPassword activity
            Toast.makeText(getApplicationContext(), "Next clicked", Toast.LENGTH_SHORT).show();
            Intent confirmPasswordIntent = new Intent(ForgotPassword.this, ConfirmPassword.class);
            startActivity(confirmPasswordIntent);
        }
    }
}


