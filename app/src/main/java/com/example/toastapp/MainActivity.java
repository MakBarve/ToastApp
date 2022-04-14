package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.toastlib.SimpleToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SimpleToast.success(getApplicationContext(), "This is an Info Message");
    }
}