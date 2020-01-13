package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonEventActivity extends AppCompatActivity {

    EditText etName;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_event);

        etName = findViewById(R.id.et_name);
        tvName = findViewById(R.id.tv_name);
    }

    public void greet(View view) {
        String name = etName.getText().toString();
        tvName.setText(String.format("Welcome %s", name));
    }
}
