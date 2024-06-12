package com.example.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile extends AppCompatActivity {

    private TextView usernameTextView, emailTextView;
    private Dialog dialog;
    private Button btnEdit, btnDialogCancel, btnDialogOk;
    private EditText editUsername, editEmail;

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        back = findViewById(R.id.back);
        usernameTextView = findViewById(R.id.textView8);
        emailTextView = findViewById(R.id.textView9);
        btnEdit = findViewById(R.id.btn_edit);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        dialog = new Dialog(UserProfile.this);
        dialog.setContentView(R.layout.custom_dialog_edit_info);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        editUsername = dialog.findViewById(R.id.edit_username);
        editEmail = dialog.findViewById(R.id.edit_email);
        btnDialogCancel = dialog.findViewById(R.id.btn_dialog_cancel);
        btnDialogOk = dialog.findViewById(R.id.btn_dialog_ok);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

        btnDialogCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btnDialogOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newUsername = editUsername.getText().toString().trim();
                String newEmail = editEmail.getText().toString().trim();

                if (!newUsername.isEmpty()) {
                    usernameTextView.setText("User name: " + newUsername);
                }

                if (!newEmail.isEmpty()) {
                    emailTextView.setText("Email: " + newEmail);
                }

                dialog.dismiss();
            }
        });
    }
}
