package com.example.projek_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Setup_phone_number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_phone_number);
    }

    public void SAVE (View view) {
        Intent intent = new Intent(Setup_phone_number.this, finish_registration.class);
        startActivity(intent);
        }

}