package com.onesignal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;

class b implements Application.ActivityLifecycleCallbacks {
    private static b f;
    private static a g;
    private static ComponentCallbacks h;

    public static a b() {
        return b.g;
    }

    static void c(Application application0) {
        class com.onesignal.b.a implements ComponentCallbacks {
            com.onesignal.b.a() {
                super();
            }

            @Override  // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration0) {
                b.g.p(configuration0, b.g.e());
            }

            @Override  // android.content.ComponentCallbacks
            public void onLowMemory() {
            }
        }

        if(b.f == null) {
            b b0 = new b();
            b.f = b0;
            application0.registerActivityLifecycleCallbacks(b0);
        }
        if(b.g == null) {
            b.g = new a(new OSFocusHandler());
        }
        if(b.h == null) {
            com.onesignal.b.a b$a0 = new com.onesignal.b.a();
            b.h = b$a0;
            application0.registerComponentCallbacks(b$a0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
        a a0 = b.g;
        if(a0 != null) {
            a0.k(activity0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        a a0 = b.g;
        if(a0 != null) {
            a0.l(activity0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        a a0 = b.g;
        if(a0 != null) {
            a0.m(activity0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        a a0 = b.g;
        if(a0 != null) {
            a0.n(activity0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        a a0 = b.g;
        if(a0 != null) {
            a0.o(activity0);
        }
    }
}

