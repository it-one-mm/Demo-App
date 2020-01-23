package com.itonemm.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    final Fragment homeFrag = new HomeFragment();
    final Fragment notiFrag = new NotificationsFragment();
    final Fragment settingsFrag = new SettingsFragment();
    final FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment active = homeFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.menu_home:
                        fragmentManager.beginTransaction().hide(active).show(homeFrag).commit();
                        active = homeFrag;
                        return true;
                    case R.id.menu_notificatiions:
                        fragmentManager.beginTransaction().hide(active).show(notiFrag).commit();
                        active = notiFrag;
                        return true;
                    case R.id.menu_settings:
                        fragmentManager.beginTransaction().hide(active).show(settingsFrag).commit();
                        active = settingsFrag;
                        return true;
                }

                return false;
            }
        });

        fragmentManager.beginTransaction().add(R.id.fragment_container, notiFrag).hide(notiFrag).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, settingsFrag).hide(settingsFrag).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, homeFrag).commit();
    }
}
