package com.itonemm.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuDialogActivity extends AppCompatActivity {

    static Toast toast = null;
    TextView articleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dialog);

        articleTextView = findViewById(R.id.tv_article);
        registerForContextMenu(articleTextView);
    }

    void displayToast(String message) {
        if (toast != null)
            toast.cancel();

        toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
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

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_edit:
                displayToast("Edit choice clicked.");
                break;
            case R.id.context_share:
                displayToast("Share choice clicked.");
                break;
            case R.id.context_delete:
                displayToast("Delete choice clicked.");
        }

        return super.onContextItemSelected(item);
    }

    public void displayAlertDialog(View view) {

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MenuDialogActivity.this);

        alertBuilder.setTitle("Alert");
        alertBuilder.setMessage("Click OK to continue, or Cancel to stop:");

        alertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast("Pressed Ok");
            }
        });

        alertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast("Pressed Cancel");
            }
        });

        alertBuilder.show();
    }
}
