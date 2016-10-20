package com.wh2soft.browwser;

import android.app.Application;
import android.content.Context;

/**
 * Created by wilmer on 17/10/16.
 */

public class BrowwserApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Context getContext() {
        return getApplicationContext();
    }
}
