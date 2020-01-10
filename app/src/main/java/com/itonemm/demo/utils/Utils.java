package com.itonemm.demo.utils;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    public static void displayToast(Context context, Toast toast, String message) {
        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
