package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondaryActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary_activity);
        textView = findViewById(R.id.tvView);
        Intent intent = getIntent();
        final String message = intent.getStringExtra("message");
        textView.setText("Your message: " + message);
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL  , new String[]{"Recipient"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Android task1");
                email.putExtra(Intent.EXTRA_TEXT   , message);
                Intent shareIntent = Intent.createChooser(email, null);
                startActivity(shareIntent);
            }
        });
    }
}
