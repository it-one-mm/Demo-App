package com.itonemm.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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

                Fragment selectedFragment = null;

                switch (menuItem.getItemId()) {
                    case R.id.menu_home:
                        selectedFragment = homeFrag;
                        break;
                    case R.id.menu_notificatiions:
                        selectedFragment = notiFrag;
                        break;
                    case R.id.menu_settings:
                        selectedFragment = settingsFrag;
                }

                fragmentManager.beginTransaction().hide(active).show(selectedFragment).commit();
                active = selectedFragment;
                return true;

            }
        });

        fragmentManager.beginTransaction().add(R.id.fragment_container, notiFrag).hide(notiFrag).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, settingsFrag).hide(settingsFrag).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, homeFrag).commit();
    }
}
