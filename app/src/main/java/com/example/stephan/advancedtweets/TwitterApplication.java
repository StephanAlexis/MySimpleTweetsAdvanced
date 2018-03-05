package com.example.stephan.advancedtweets;

import android.content.Context;
import android.util.Log;

import com.activeandroid.ActiveAndroid;
import com.example.stephan.advancedtweets.util.TwitterClient;

/**
 * Created by stephan  .
 */

public class TwitterApplication extends com.activeandroid.app.Application {
    private static final String TAG = TwitterApplication.class.getSimpleName();
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterApplication.context = this;

        Log.d(TAG, "Initializing ActiveAndroid");
        ActiveAndroid.initialize(this);
    }

    public static TwitterClient getRestClient() {
        return (TwitterClient) TwitterClient.getInstance(TwitterClient.class, TwitterApplication.context);
    }
}
