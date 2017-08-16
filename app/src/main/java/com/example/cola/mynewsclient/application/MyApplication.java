package com.example.cola.mynewsclient.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by Cola on 2017/8/11.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getMyContext(){
        return context;
    }
}
