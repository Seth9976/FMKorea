package com.facebook.ads.internal.settings;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
public class AdInternalSettings {
    private static final String BOOL_AUTOPLAY_ON_MOBILE_KEY = "BOOL_AUTOPLAY_ON_MOBILE_KEY";
    private static final String BOOL_DEBUGGER_STATE_KEY = "BOOL_DEBUGGER_STATE_KEY";
    private static final String BOOL_DEBUG_BUILD_KEY = "BOOL_DEBUG_BUILD_KEY";
    private static final String BOOL_EXPLICIT_TEST_MODE_KEY = "BOOL_EXPLICIT_TEST_MODE_KEY";
    public static final String BOOL_MIXED_AUDIENCE_KEY = "BOOL_MIXED_AUDIENCE_KEY";
    private static final String BOOL_VIDEO_AUTOPLAY_KEY = "BOOL_VIDEO_AUTOPLAY_KEY";
    private static final String BOOL_VISIBLE_ANIMATION_KEY = "BOOL_VISIBLE_ANIMATION_KEY";
    public static final String DATA_PROCESSING_OPTIONS_COUNTRY_KEY = "DATA_PROCESSING_OPTIONS_COUNTRY_KEY";
    public static final String DATA_PROCESSING_OPTIONS_KEY = "DATA_PROCESSING_OPTIONS_KEY";
    public static final String DATA_PROCESSING_OPTIONS_STATE_KEY = "DATA_PROCESSING_OPTIONS_STATE_KEY";
    private static final String LIST_TEST_DEVICES_KEY = "LIST_TEST_DEVICES_KEY";
    public static final String SRL_INTEGRATION_ERROR_MODE_KEY = "SRL_INTEGRATION_ERROR_MODE_KEY";
    private static final String STR_MEDIATION_SERVICE_KEY = "STR_MEDIATION_SERVICE_KEY";
    private static final String STR_URL_PREFIX_KEY = "STR_URL_PREFIX_KEY";
    public static final String TEST_AD_TYPE_KEY = "TEST_AD_TYPE_KEY";
    public static final AtomicBoolean sDataProcessingOptionsUpdate;
    public static final MultithreadedBundleWrapper sSettingsBundle;

    static {
        AdInternalSettings.sSettingsBundle = new MultithreadedBundleWrapper();
        AdInternalSettings.sDataProcessingOptionsUpdate = new AtomicBoolean(false);
    }

    public static void addTestDevice(String s) {
        AdInternalSettings.getTestDevicesList().add(s);
    }

    public static void addTestDevices(Collection collection0) {
        AdInternalSettings.getTestDevicesList().addAll(collection0);
    }

    public static void clearTestDevices() {
        AdInternalSettings.getTestDevicesList().clear();
    }

    public static String getMediationService() {
        return AdInternalSettings.sSettingsBundle.getString("STR_MEDIATION_SERVICE_KEY", null);
    }

    public static ArrayList getTestDevicesList() {
        MultithreadedBundleWrapper multithreadedBundleWrapper0 = AdInternalSettings.sSettingsBundle;
        ArrayList arrayList0 = multithreadedBundleWrapper0.getStringArrayList("LIST_TEST_DEVICES_KEY");
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            multithreadedBundleWrapper0.putStringArrayList("LIST_TEST_DEVICES_KEY", arrayList0);
        }
        return arrayList0;
    }

    public static String getUrlPrefix() {
        return AdInternalSettings.sSettingsBundle.getString("STR_URL_PREFIX_KEY", null);
    }

    public static boolean isDebugBuild() {
        return AdInternalSettings.sSettingsBundle.getBoolean("BOOL_DEBUG_BUILD_KEY", false);
    }

    public static boolean isDebuggerOn() {
        return AdInternalSettings.sSettingsBundle.getBoolean("BOOL_DEBUGGER_STATE_KEY", false);
    }

    public static boolean isExplicitTestMode() {
        return AdInternalSettings.sSettingsBundle.getBoolean("BOOL_EXPLICIT_TEST_MODE_KEY", false);
    }

    public static boolean isTestMode(Context context0) {
        return DynamicLoaderFactory.makeLoader(context0).createAdSettingsApi().isTestMode(context0);
    }

    public static boolean isVideoAutoplay() {
        return AdInternalSettings.sSettingsBundle.getBoolean("BOOL_VIDEO_AUTOPLAY_KEY");
    }

    public static boolean isVideoAutoplayOnMobile() {
        return AdInternalSettings.sSettingsBundle.getBoolean("BOOL_AUTOPLAY_ON_MOBILE_KEY", false);
    }

    public static boolean isVisibleAnimation() {
        return AdInternalSettings.sSettingsBundle.getBoolean("BOOL_VISIBLE_ANIMATION_KEY", false);
    }

    public static void setDataProcessingOptions(String[] arr_s, Integer integer0, Integer integer1) {
        synchronized(AdInternalSettings.sSettingsBundle) {
            AdInternalSettings.sDataProcessingOptionsUpdate.set(true);
            AdInternalSettings.sSettingsBundle.putStringArray("DATA_PROCESSING_OPTIONS_KEY", arr_s);
            AdInternalSettings.sSettingsBundle.putInteger("DATA_PROCESSING_OPTIONS_COUNTRY_KEY", integer0);
            AdInternalSettings.sSettingsBundle.putInteger("DATA_PROCESSING_OPTIONS_STATE_KEY", integer1);
        }
    }

    public static void setDebugBuild(boolean z) {
        DynamicLoader dynamicLoader0 = DynamicLoaderFactory.getDynamicLoader();
        if(dynamicLoader0 != null && z) {
            dynamicLoader0.createAdSettingsApi().turnOnDebugger();
        }
        AdInternalSettings.sSettingsBundle.putBoolean("BOOL_DEBUG_BUILD_KEY", z);
    }

    public static void setMediationService(String s) {
        AdInternalSettings.sSettingsBundle.putString("STR_MEDIATION_SERVICE_KEY", s);
    }

    public static void setTestMode(boolean z) {
        AdInternalSettings.sSettingsBundle.putBoolean("BOOL_EXPLICIT_TEST_MODE_KEY", z);
    }

    public static void setUrlPrefix(String s) {
        AdInternalSettings.sSettingsBundle.putString("STR_URL_PREFIX_KEY", s);
    }

    public static void setVideoAutoplay(boolean z) {
        AdInternalSettings.sSettingsBundle.putBoolean("BOOL_VIDEO_AUTOPLAY_KEY", z);
    }

    public static void setVideoAutoplayOnMobile(boolean z) {
        AdInternalSettings.sSettingsBundle.putBoolean("BOOL_AUTOPLAY_ON_MOBILE_KEY", z);
    }

    public static void setVisibleAnimation(boolean z) {
        AdInternalSettings.sSettingsBundle.putBoolean("BOOL_VISIBLE_ANIMATION_KEY", z);
    }

    public static void turnOnSDKDebugger(Context context0) {
        DynamicLoader dynamicLoader0 = DynamicLoaderFactory.getDynamicLoader();
        if(dynamicLoader0 != null) {
            dynamicLoader0.createAdSettingsApi().turnOnDebugger();
            return;
        }
        AdInternalSettings.sSettingsBundle.putBoolean("BOOL_DEBUGGER_STATE_KEY", true);
    }
}

