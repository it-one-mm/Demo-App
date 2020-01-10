package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveDataActivity extends AppCompatActivity {

    TextView dataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_data);

        dataTextView = findViewById(R.id.tv_data);

        Intent intent = getIntent();

        if (intent.hasExtra(BuildConfig.APPLICATION_ID + ".data")) {

            String data = intent.getStringExtra(BuildConfig.APPLICATION_ID + ".data");

            dataTextView.setText(data);
        }
    }
}
