package com.example.projek_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_welcome);
    }
    public void GOOGLE (View view) {
        Intent intent = new Intent(login_welcome.this, Setup_phone_number.class);
        startActivity(intent);
    }
}