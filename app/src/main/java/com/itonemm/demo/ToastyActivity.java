package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ToastyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);
    }

    public void displayToasty(View view) {
        switch (view.getId()) {
            case R.id.btn_normal:
                Toasty.normal(this, "This is normal toasty!", Toasty.LENGTH_LONG).show();
                break;
            case R.id.btn_info:
                Toasty.info(this, "This is info toasty!", Toasty.LENGTH_LONG).show();
                break;
            case R.id.btn_warning:
                Toasty.warning(this, "This is warning toasty!", Toasty.LENGTH_LONG).show();
                break;
            case R.id.btn_success:
                Toasty.success(this, "This is success toasty!", Toasty.LENGTH_LONG).show();
                break;
            case R.id.btn_error:
                Toasty.error(this, "This is error toasty!", Toasty.LENGTH_LONG).show();
                break;
        }
    }

}
