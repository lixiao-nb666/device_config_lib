package com.newbee.device_config;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
