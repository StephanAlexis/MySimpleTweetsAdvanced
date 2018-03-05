package com.example.stephan.advancedtweets.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by stephan  .
 */

public class ErrorHandler {
    private static final String TAG = ErrorHandler.class.getSimpleName();

    public static void logAppError(String errorMessage) {
        Log.e(TAG, errorMessage);
    }

    public static void handleAppException(Exception exc, String addlErrorInfo) {
        String errorMessage = exc.getMessage().toString() + " -- " + addlErrorInfo;
        Log.e(TAG, errorMessage);
    }

    public static void displayError(Context context, String errorMessage) {
        Toast.makeText(context, errorMessage, Toast.LENGTH_LONG).show();
    }
}
