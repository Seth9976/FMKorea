package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.BuildConfig;

@Keep
public class BuildConfigApi {
    static final String UNITY_SHARED_PREFERENCES_SUFIX = ".v2.playerprefs";
    static final String UNITY_TAG = "an_isUnitySDK";
    static final String UNITY_VERSION_SUFIX = "-unity";

    // 去混淆评级： 中等(80)
    public static String getVersionName(Context context0) {
        return BuildConfigApi.isUnity(context0) ? "6.16.0-unity" : "6.16.0";
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    // 去混淆评级： 低(40)
    private static boolean isUnity(Context context0) {
        return context0.getSharedPreferences("com.fmkorea.m.fmk.v2.playerprefs", 0).contains("an_isUnitySDK") || context0.getSharedPreferences("com.fmkorea.m.fmk", 0).contains("an_isUnitySDK");
    }
}

