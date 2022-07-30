package com.example.aplikasipartai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login (View view){
        Intent intent = new Intent(login.this, MainActivity.class);
        startActivity (intent);
    }
    public void register (View view){
        Intent intent = new Intent (login.this, register.class);
        startActivity (intent);
    }
    public void lupa (View view) {
        Intent intent = new Intent (login.this, lupapassword.class);
        startActivity (intent);
    }

}