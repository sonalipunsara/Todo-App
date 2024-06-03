
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    private Button SignUp;

    private TextView SignInTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        // Initialize the views
        SignInTextView = findViewById(R.id.txtBtn_signin);
        SignUp = findViewById(R.id.txtBtn_signup);

        // Set click listeners
        SignInTextView.setOnClickListener(this);
        SignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.txtBtn_signin) {
            // Navigate to ForgotPassword activity
            Toast.makeText(getApplicationContext(), "Sign In clicked", Toast.LENGTH_SHORT).show();
            Intent forgotPasswordIntent = new Intent(SignUp.this, SignIn.class);
            startActivity(forgotPasswordIntent);
        } else if (id == R.id.txtBtn_signup) {
            // Navigate to SignUp activity
            Toast.makeText(getApplicationContext(), "Sign Up clicked", Toast.LENGTH_SHORT).show();
            Intent signUpIntent = new Intent(SignUp.this, Home.class);
            startActivity(signUpIntent);
        }

    }
}