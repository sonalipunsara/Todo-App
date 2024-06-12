package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class naw_drawer extends AppCompatActivity {

    ImageButton back;

    Button btn_dialog_ok, btn_dialog_cancel;

    Dialog dialog;

    TextView dash, user, developer, logout;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naw_drawer);
        back = findViewById(R.id.back);
        dialog = new Dialog(naw_drawer.this);
        dialog.setContentView(R.layout.custom_dialog_box);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.custom_dialog_bg));
        dialog.setCancelable(false);

        btn_dialog_ok = dialog.findViewById(R.id.btn_dialog_ok);
        btn_dialog_cancel = dialog.findViewById(R.id.btn_dialog_cancel);


        btn_dialog_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btn_dialog_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(naw_drawer.this, Welcome.class);
                startActivity(intent);
                finish();
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(naw_drawer.this, Home.class);
                startActivity(intent);
                finish();
            }
        });
// go  dashboard
        dash = (TextView) findViewById(R.id.dashborad);
        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(naw_drawer.this, Home.class);
                startActivity(intent);
            }
        });

        //user profile
        user = (TextView) findViewById(R.id.profile);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(naw_drawer.this, UserProfile.class);
                startActivity(intent);
                finish();
            }
        });

        //developer info
        developer = (TextView) findViewById(R.id.dev_pro);
        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(naw_drawer.this, DeveloperInfo.class);
                startActivity(intent);
            }
        });
//logout
        logout = (TextView) findViewById(R.id.out);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }
}