package com.itonemm.demo.utils;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    private static Toast toast = null;

    public static void displayToast(Context context, String message) {
        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
