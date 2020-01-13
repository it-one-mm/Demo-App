package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LayoutInflaterActivity extends AppCompatActivity {

    LinearLayout containerLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflator);

        containerLinearLayout = findViewById(R.id.linear_container);

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        for (int i=0; i<10; i++) {
            View view = inflater.inflate(R.layout.row_item, containerLinearLayout, false);
            containerLinearLayout.addView(view);
        }

    }

    public void showCustomToast(View view) {

        LayoutInflater inflater = getLayoutInflater();

        View view1 = inflater.inflate(R.layout.custom_toast, null, false);
        TextView titleTextView = view1.findViewById(R.id.tv_title);
        titleTextView.setText("Welcome from IT ONE MM");

        Toast toast = new Toast(this);
        toast.setView(view1);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0 , 0);
        toast.show();
    }
}
