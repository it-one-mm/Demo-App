package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

    public void goToButtonEvent(View view) {
        goToActivity(ButtonEventActivity.class);
    }

    public void goToMultipleButtonsActivity(View view) {
        goToActivity(MultipleButtonsActivity.class);
    }

    public void goToToastyActivity(View view) {
        goToActivity(ToastyActivity.class);
    }

    public void goToMenuAndDialog(View view) {
        goToActivity(MenuDialogActivity.class);
    }

    public void goToBottomNavigation(View view) {
        goToActivity(BottomNavigationActivity.class);
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

    public void goToLayoutInflator(View view) {
        goToActivity(LayoutInflaterActivity.class);
    }

    public void goToListView(View view) {
        goToActivity(SimpleListViewActivity.class);
    }

    public void goToCustomListView(View view) {
        goToActivity(CustomListViewActivity.class);
    }

    public void goToICustomListView(View view) {
        goToActivity(ICustomListViewActivity.class);
    }

    public void goToRecyclerView(View view) {
        goToActivity(RecyclerViewActivity.class);
    }
}
