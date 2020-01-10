package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class PassingDataBetweenActivities extends AppCompatActivity {

    final String DATA = BuildConfig.APPLICATION_ID + ".data";
    EditText dataEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data_between);

        dataEditText = findViewById(R.id.et_data);
    }

    public void sendData(View view) {

        String data = dataEditText.getText().toString();

        Intent intent = new Intent(this, RecieveDataActivity.class);
        intent.putExtra(DATA, data);
        startActivity(intent);
    }
}
