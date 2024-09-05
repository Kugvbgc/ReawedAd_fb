package com.khair.reawedad;

import android.app.Application;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

public class InasalistMobileAd extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
        AdSettings.addTestDevice("fb6bfe41-4772-4745-a97e-07088753ccab");

    }
}
