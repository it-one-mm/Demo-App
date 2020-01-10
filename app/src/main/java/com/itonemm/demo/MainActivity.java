package com.itonemm.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void goToActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

    public void goToCircleAreaActivity(View view) {
        goToActivity(CircleAreaActivity.class);
    }

    public void goToEvent(View view) {
        goToActivity(EventActivity.class);
    }

    public void goToMultipleButtonsActivity(View view) {
        goToActivity(MultipleButtonsActivity.class);
    }

    public void goToToastyActivity(View view) {
        goToActivity(ToastyActivity.class);
    }

    public void goToInputControls(View view) {
        goToActivity(InputControlsActivity.class);
    }

    public void goToPassingDataBetweenActivities(View view) {
        goToActivity(PassingDataBetweenActivities.class);
    }

    public void goToShapeActivity(View view) {
        goToActivity(ShapeActivity.class);
    }


    public void goToTabActivity(View view) {
        goToActivity(TabActivity.class);
    }

    void displayToast(String message) {
        if (toast != null)
            toast.cancel();

        toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_order:
                displayToast("You Selected Order");
                return true;
            case R.id.action_status:
                displayToast("You Selected Status");
                return true;
            case R.id.action_favourites:
                displayToast("You Selected Favourites");
                return true;
            case R.id.action_contact:
                displayToast("You Selected Contact");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
