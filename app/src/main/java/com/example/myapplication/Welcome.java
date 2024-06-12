package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity implements View.OnClickListener {

    private Button button, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button2);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button) {
            // Navigate to SignIn activity
            Intent signInIntent = new Intent(Welcome.this, SignIn.class);
            startActivity(signInIntent);
        } else if (id == R.id.button2) {
            // Navigate to SignUp activity
            Intent signUpIntent = new Intent(Welcome.this, SignUp.class);
            startActivity(signUpIntent);
        }
    }
}
