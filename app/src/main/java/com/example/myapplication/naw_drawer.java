package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class naw_drawer extends AppCompatActivity {

    ImageButton back;

    TextView dash, user, developer, logout;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naw_drawer);

        back = findViewById(R.id.back);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(naw_drawer.this,Home.class);
                startActivity(intent);
                finish();
            }
        });
// go  dashboard
        dash =(TextView)findViewById(R.id.dashborad);
        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(naw_drawer.this,Home.class);
                startActivity(intent);

                Toast.makeText(naw_drawer.this, "You are in the home", Toast.LENGTH_SHORT).show();
            }
        });

        //user profile
        user =(TextView)findViewById(R.id.profile);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(naw_drawer.this,UserProfile.class);
                startActivity(intent);
                finish();

                Toast.makeText(naw_drawer.this, "you are in the your profile", Toast.LENGTH_SHORT).show();
            }
        });

        //developer info
        developer =(TextView)findViewById(R.id.dev_pro);
        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(naw_drawer.this, DeveloperInfo.class);
                startActivity(intent);

                Toast.makeText(naw_drawer.this, "You are in the developer profile", Toast.LENGTH_SHORT).show();
            }
        });
//logout
        logout =(TextView)findViewById(R.id.out);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showLogoutDialog();



            }
        });




    }



    private void showLogoutDialog() {
        // Create an AlertDialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.CustomAlertDialog);

        // Set the title
        builder.setTitle("Logout");

        builder.setMessage("Really want to logout ?");

        // Add action buttons
        builder.setPositiveButton("Yes", (dialog, which) -> {

            Intent intent=new Intent(naw_drawer.this,SignIn.class);
            startActivity(intent);
            finish();

        });

        builder.setNegativeButton("No", (dialog, which) -> {
            // Handle the "Cancel" button click
            dialog.cancel();
        });

        // Create and show the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();

        dialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.dialogTitleColor));
        dialog.getButton(DialogInterface.BUTTON_POSITIVE).setBackground(getResources().getDrawable(R.drawable.rounded_rectangle));
        dialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.dialogTitleColor));
        dialog.getButton(DialogInterface.BUTTON_NEGATIVE).setBackground(getResources().getDrawable(R.drawable.rounded_rectangle));
    }

}