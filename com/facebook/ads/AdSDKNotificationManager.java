package com.facebook.ads;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Keep
public class AdSDKNotificationManager {
    private static final List sNotificationListeners;

    static {
        AdSDKNotificationManager.sNotificationListeners = Collections.synchronizedList(new ArrayList());
    }

    public static void addSDKNotificationListener(AdSDKNotificationListener adSDKNotificationListener0) {
        synchronized(AdSDKNotificationManager.sNotificationListeners) {
            AdSDKNotificationManager.sNotificationListeners.add(adSDKNotificationListener0);
        }
    }

    public static List getNotificationListeners() {
        return AdSDKNotificationManager.sNotificationListeners;
    }

    public static void removeSDKNotificationListener(AdSDKNotificationListener adSDKNotificationListener0) {
        synchronized(AdSDKNotificationManager.sNotificationListeners) {
            AdSDKNotificationManager.sNotificationListeners.remove(adSDKNotificationListener0);
        }
    }
}

