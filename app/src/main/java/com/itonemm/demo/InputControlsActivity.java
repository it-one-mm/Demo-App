package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.itonemm.demo.utils.Utils;

public class InputControlsActivity extends AppCompatActivity {

    static Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_controls);
    }

    public void onRadioButtonClicked(View view) {

        boolean isChecked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.sameday:
                if (isChecked)
                    Utils.displayToast(this, toast, getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if (isChecked)
                    Utils.displayToast(this, toast, getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if (isChecked)
                    Utils.displayToast(this, toast, getString(R.string.pick_up));

        }
    }
}
