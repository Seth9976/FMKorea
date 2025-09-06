package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

class p implements Application.ActivityLifecycleCallbacks {
    private final Set f;

    p() {
        this.f = Collections.newSetFromMap(new WeakHashMap());
    }

    // 检测为 Lambda 实现
    public static void a(p p0, Intent intent0) [...]

    private void b(Intent intent0) {
        this.c(intent0);
    }

    private void c(Intent intent0) {
        Bundle bundle0 = null;
        try {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 != null) {
                bundle0 = bundle1.getBundle("gcm.n.analytics_data");
            }
        }
        catch(RuntimeException runtimeException0) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", runtimeException0);
        }
        if(E.B(bundle0)) {
            E.u(bundle0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        Intent intent0 = activity0.getIntent();
        if(intent0 != null && this.f.add(intent0)) {
            if(Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(() -> this.b(intent0));
                return;
            }
            this.c(intent0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        if(activity0.isFinishing()) {
            Intent intent0 = activity0.getIntent();
            this.f.remove(intent0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
    }
}

