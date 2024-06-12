package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity implements View.OnClickListener {

    private TextView forgotPasswordTextView;
    private TextView signUpTextView;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Initialize the views
        forgotPasswordTextView = findViewById(R.id.forgotp);
        signUpTextView = findViewById(R.id.txtBtn_signup);
        signInButton = findViewById(R.id.txtBtn_signin);

        // Set click listeners
        forgotPasswordTextView.setOnClickListener(this);
        signUpTextView.setOnClickListener(this);
        signInButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.forgotp) {
            // Navigate to ForgotPassword activity
            Intent forgotPasswordIntent = new Intent(SignIn.this, ForgotPassword.class);
            startActivity(forgotPasswordIntent);
        } else if (id == R.id.txtBtn_signup) {
            // Navigate to SignUp activity
            Intent signUpIntent = new Intent(SignIn.this, SignUp.class);
            startActivity(signUpIntent);
        } else if (id == R.id.txtBtn_signin) {
            // Navigate to Home activity
            Toast.makeText(getApplicationContext(),  "You are log in successfully", Toast.LENGTH_SHORT).show();
            Intent homeIntent = new Intent(SignIn.this, Home.class);
            startActivity(homeIntent);
        }
    }
}
