package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.itonemm.demo.utils.Utils;

public class InputControlsActivity extends AppCompatActivity {

    Spinner phoneTypeSpinner;
    String[] types = {"Home", "Work", "Mobile", "Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_controls);

        phoneTypeSpinner = findViewById(R.id.spinner_phone_type);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, types);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        phoneTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Utils.displayToast(getApplicationContext(), types[position] + "is Choose");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        phoneTypeSpinner.setAdapter(adapter);

//        phoneTypeSpinner.setSelection(1);

    }

    public void onRadioButtonClicked(View view) {

        boolean isChecked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.sameday:
                if (isChecked)
                    Utils.displayToast(this, getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if (isChecked)
                    Utils.displayToast(this, getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if (isChecked)
                    Utils.displayToast(this, getString(R.string.pick_up));

        }
    }
}
