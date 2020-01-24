package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListViewActivity extends AppCompatActivity {

    String[] friendList = new String[20];
    ListView friendListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        for (int i=0; i<20; i++) {
            friendList[i] = "Friend #" + (i + 1);
        }

        friendListView = findViewById(R.id.friend_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.simple_list_item, friendList);

        friendListView.setAdapter(adapter);

    }
}
