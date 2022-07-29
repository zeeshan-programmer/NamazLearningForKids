package com.makers.junaid.namazlearningforkids;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/**
 * Created by joni on 9/6/2019.
 */

public class Namaz_Opener extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        MobileAds.initialize(this,getString(R.string.app_id));
    }
}
