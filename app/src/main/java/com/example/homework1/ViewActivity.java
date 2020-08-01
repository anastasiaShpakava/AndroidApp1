package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);
        textView = findViewById(R.id.tvView);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        textView.setText("Your message: " + message);
    }
}
