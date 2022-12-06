package com.example.projek_4;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Date_picker extends AppCompatActivity {
    private TextView tvSelectDate;
    private EditText etSelectDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        tvSelectDate = findViewById(R.id.tvSelectDate);
        etSelectDate = findViewById (R.id.etSelectDate);

        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        tvSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(Date_picker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                        month = month=1;
                        String date = day+"/"+month+"/"+year;
                        tvSelectDate.setText(date);

                    }
                },year, month, day);
                dialog.show();


            }
        });
        etSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(Date_picker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                        month = month=1;
                        String date = day+"/"+month+"/"+year;
                        etSelectDate.setText(date);

                    }
                },year, month, day);
                dialog.show();


            }
        });


    }
}