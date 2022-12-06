package com.example.projek_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class finish_registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_registration);
    }
    public void TAKE(View view) {
        Intent intent = new Intent(finish_registration.this, Home.class);
        startActivity(intent);
    }

}