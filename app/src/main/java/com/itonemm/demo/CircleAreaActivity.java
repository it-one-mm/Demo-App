package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class CircleAreaActivity extends AppCompatActivity {

    final static double PI = 3.142d;

    EditText etRadius;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_area);

        etRadius = findViewById(R.id.et_radius);
        tvResult = findViewById(R.id.tv_result);

        etRadius.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() != 0) {
                    int radius = Integer.parseInt(etRadius.getText().toString());
                    double area = radius * PI;
                    tvResult.setText("A = " + String.valueOf(area));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
