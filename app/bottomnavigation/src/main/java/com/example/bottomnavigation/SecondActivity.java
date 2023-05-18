package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bottomnavigation.databinding.ActivityMainBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        String fromMain = intent.getStringExtra("PASS_ME");

        textView.setText(fromMain);
    }
}