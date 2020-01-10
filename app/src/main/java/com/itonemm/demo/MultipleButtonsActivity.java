package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MultipleButtonsActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_buttons);
    }

    public void handleMultipleButtonsClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                showToast("Button One Clicked");
                break;
            case R.id.btn_two:
                showToast("Button Two Clicked");
                break;
            case R.id.btn_three:
                showToast("Button Three Clicked");
                break;
            case R.id.btn_four:
                showToast("Button Four Clicked");
        }
    }

    void showToast(String msg) {
        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
}
