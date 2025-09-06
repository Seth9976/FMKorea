package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.io.Serializable;
import java.util.Collection;

@Keep
public class AdSettings {
    @Keep
    public static enum IntegrationErrorMode {
        INTEGRATION_ERROR_CRASH_DEBUG_MODE,
        INTEGRATION_ERROR_CALLBACK_MODE;

        public static final long serialVersionUID = 1L;

    }

    @Keep
    public static enum TestAdType implements Serializable {
        DEFAULT("DEFAULT", "Default"),
        IMG_16_9_APP_INSTALL("IMG_16_9_APP_INSTALL", "Image App install"),
        IMG_16_9_LINK("IMG_16_9_LINK", "Image link"),
        VIDEO_HD_16_9_46S_APP_INSTALL("VID_HD_16_9_46S_APP_INSTALL", "Video 46 sec App install"),
        VIDEO_HD_16_9_46S_LINK("VID_HD_16_9_46S_LINK", "Video 46 sec link"),
        VIDEO_HD_16_9_15S_APP_INSTALL("VID_HD_16_9_15S_APP_INSTALL", "Video 15 sec App install"),
        VIDEO_HD_16_9_15S_LINK("VID_HD_16_9_15S_LINK", "Video 15 sec link"),
        VIDEO_HD_9_16_39S_APP_INSTALL("VID_HD_9_16_39S_APP_INSTALL", "Video 39 sec App install"),
        VIDEO_HD_9_16_39S_LINK("VID_HD_9_16_39S_LINK", "Video 39 sec link"),
        CAROUSEL_IMG_SQUARE_APP_INSTALL("CAROUSEL_IMG_SQUARE_APP_INSTALL", "Carousel App install"),
        CAROUSEL_IMG_SQUARE_LINK("CAROUSEL_IMG_SQUARE_LINK", "Carousel link"),
        PLAYABLE("PLAYABLE", "Playable ad");

        private final String adTypeString;
        private final String humanReadable;
        public static final long serialVersionUID = 1L;

        private TestAdType(String s1, String s2) {
            this.adTypeString = s1;
            this.humanReadable = s2;
        }

        public String getAdTypeString() {
            return this.adTypeString;
        }

        public String getHumanReadable() {
            return this.humanReadable;
        }
    }

    public static final boolean DEBUG = false;

    public static void addTestDevice(String s) {
        AdInternalSettings.addTestDevice(s);
    }

    public static void addTestDevices(Collection collection0) {
        AdInternalSettings.addTestDevices(collection0);
    }

    public static void clearTestDevices() {
        AdInternalSettings.clearTestDevices();
    }

    public static String getMediationService() {
        return AdInternalSettings.getMediationService();
    }

    public static TestAdType getTestAdType() {
        MultithreadedBundleWrapper multithreadedBundleWrapper0 = AdInternalSettings.sSettingsBundle;
        Serializable serializable0 = multithreadedBundleWrapper0.getSerializable("TEST_AD_TYPE_KEY");
        if(!(serializable0 instanceof TestAdType)) {
            multithreadedBundleWrapper0.putSerializable("TEST_AD_TYPE_KEY", TestAdType.DEFAULT);
            return TestAdType.DEFAULT;
        }
        return (TestAdType)serializable0;
    }

    public static String getUrlPrefix() {
        return AdInternalSettings.getUrlPrefix();
    }

    public static boolean isMixedAudience() {
        return AdInternalSettings.sSettingsBundle.getBoolean("BOOL_MIXED_AUDIENCE_KEY", false);
    }

    public static boolean isTestMode(Context context0) {
        return AdInternalSettings.isTestMode(context0);
    }

    public static boolean isVideoAutoplay() {
        return AdInternalSettings.isVideoAutoplay();
    }

    public static boolean isVideoAutoplayOnMobile() {
        return AdInternalSettings.isVideoAutoplayOnMobile();
    }

    public static void setDataProcessingOptions(String[] arr_s) {
        AdInternalSettings.setDataProcessingOptions(arr_s, null, null);
    }

    public static void setDataProcessingOptions(String[] arr_s, int v, int v1) {
        AdInternalSettings.setDataProcessingOptions(arr_s, v, v1);
    }

    public static void setDebugBuild(boolean z) {
        AdInternalSettings.setDebugBuild(z);
    }

    public static void setIntegrationErrorMode(IntegrationErrorMode adSettings$IntegrationErrorMode0) {
        AdInternalSettings.sSettingsBundle.putSerializable("SRL_INTEGRATION_ERROR_MODE_KEY", adSettings$IntegrationErrorMode0);
    }

    public static void setMediationService(String s) {
        AdInternalSettings.setMediationService(s);
    }

    public static void setMixedAudience(boolean z) {
        AdInternalSettings.sSettingsBundle.putBoolean("BOOL_MIXED_AUDIENCE_KEY", z);
    }

    public static void setTestAdType(TestAdType adSettings$TestAdType0) {
        AdInternalSettings.sSettingsBundle.putSerializable("TEST_AD_TYPE_KEY", adSettings$TestAdType0);
    }

    public static void setTestMode(boolean z) {
        AdInternalSettings.setTestMode(z);
    }

    public static void setUrlPrefix(String s) {
        AdInternalSettings.setUrlPrefix(s);
    }

    public static void setVideoAutoplay(boolean z) {
        AdInternalSettings.setVideoAutoplay(z);
    }

    public static void setVideoAutoplayOnMobile(boolean z) {
        AdInternalSettings.setVideoAutoplayOnMobile(z);
    }

    public static void setVisibleAnimation(boolean z) {
        AdInternalSettings.setVisibleAnimation(z);
    }

    public static void turnOnSDKDebugger(Context context0) {
        AdInternalSettings.turnOnSDKDebugger(context0);
    }
}

