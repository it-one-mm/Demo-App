package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonEventActivity extends AppCompatActivity {

    EditText nameEditText;
    TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_event);

        nameEditText = findViewById(R.id.et_name);
        nameTextView = findViewById(R.id.tv_name);
    }

    public void greet(View view) {
        String name = nameEditText.getText().toString();
        nameTextView.setText("Welcome " + name);
    }
}
