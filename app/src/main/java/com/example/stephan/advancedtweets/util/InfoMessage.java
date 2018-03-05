package com.example.stephan.advancedtweets.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by stephan  .
 */

public class InfoMessage {
    private Context context;

    public InfoMessage(Context context) {
        this.context = context;
    }

    public void showMessage(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}