package com.facebook.ads.internal.util.common;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
public class ANActivityLifecycleCallbacksListener implements Application.ActivityLifecycleCallbacks {
    public static final int ACTIVITY_CREATED = 1;
    public static final int ACTIVITY_DESTROYED = 6;
    public static final int ACTIVITY_PAUSED = 4;
    public static final int ACTIVITY_RESUMED = 3;
    public static final int ACTIVITY_STARTED = 2;
    public static final int ACTIVITY_STOPPED = 5;
    private static ANActivityLifecycleCallbacksListener sANActivityLifecycleCallbacksListener;
    private static final Map sActivityStateMap;

    static {
        ANActivityLifecycleCallbacksListener.sActivityStateMap = Collections.synchronizedMap(new WeakHashMap());
    }

    public static ANActivityLifecycleCallbacksListener getANActivityLifecycleCallbacksListener() {
        synchronized(ANActivityLifecycleCallbacksListener.class) {
        }
        return ANActivityLifecycleCallbacksListener.sANActivityLifecycleCallbacksListener;
    }

    public Map getActivityStateMap() {
        return ANActivityLifecycleCallbacksListener.sActivityStateMap;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        ANActivityLifecycleCallbacksListener.sActivityStateMap.put(activity0, 1);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
        ANActivityLifecycleCallbacksListener.sActivityStateMap.put(activity0, 6);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        ANActivityLifecycleCallbacksListener.sActivityStateMap.put(activity0, 4);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        ANActivityLifecycleCallbacksListener.sActivityStateMap.put(activity0, 3);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        ANActivityLifecycleCallbacksListener.sActivityStateMap.put(activity0, 2);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        ANActivityLifecycleCallbacksListener.sActivityStateMap.put(activity0, 5);
    }

    public static void registerActivityCallbacks(Context context0) {
        Context context1 = context0.getApplicationContext();
        synchronized(ANActivityLifecycleCallbacksListener.class) {
            if(context1 instanceof Application && ANActivityLifecycleCallbacksListener.sANActivityLifecycleCallbacksListener == null) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener0 = new ANActivityLifecycleCallbacksListener();
                ANActivityLifecycleCallbacksListener.sANActivityLifecycleCallbacksListener = aNActivityLifecycleCallbacksListener0;
                ((Application)context1).registerActivityLifecycleCallbacks(aNActivityLifecycleCallbacksListener0);
            }
        }
    }

    public static void unregisterActivityCallbacks(Context context0) {
        Context context1 = context0.getApplicationContext();
        synchronized(ANActivityLifecycleCallbacksListener.class) {
            if(context1 instanceof Application) {
                ((Application)context1).unregisterActivityLifecycleCallbacks(ANActivityLifecycleCallbacksListener.sANActivityLifecycleCallbacksListener);
                ANActivityLifecycleCallbacksListener.sANActivityLifecycleCallbacksListener = null;
            }
        }
    }
}

