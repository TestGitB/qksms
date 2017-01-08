package com.moez.QKSMS;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class QKSMS.pp extends QKSMS.ppBase {
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
    }
}
