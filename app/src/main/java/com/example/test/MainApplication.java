package com.example.test;

import android.app.Application;

import com.onesignal.OneSignal;

public class MainApplication extends Application {
private static final String ONESIGNAL_APP_ID = "df7a7e2e-da07-42d5-85b1-feec9346e02a";

@Override
public void onCreate() {
    super.onCreate();

    // Enable verbose OneSignal logging to debug issues if needed.
    OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

    // OneSignal Initialization
    OneSignal.initWithContext(this);
    OneSignal.setAppId(ONESIGNAL_APP_ID);
}
}
