package androidx.core.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

abstract class d {
    static final class androidx.core.app.d.d implements Application.ActivityLifecycleCallbacks {
        Object f;
        private Activity g;
        private final int h;
        private boolean i;
        private boolean j;
        private boolean k;

        androidx.core.app.d.d(Activity activity0) {
            this.i = false;
            this.j = false;
            this.k = false;
            this.g = activity0;
            this.h = activity0.hashCode();
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity0, Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity0) {
            if(this.g == activity0) {
                this.g = null;
                this.j = true;
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity0) {
            if(this.j && !this.k && !this.i && d.h(this.f, this.h, activity0)) {
                this.k = true;
                this.f = null;
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
            if(this.g == activity0) {
                this.i = true;
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity0) {
        }
    }

    protected static final Class a;
    protected static final Field b;
    protected static final Field c;
    protected static final Method d;
    protected static final Method e;
    protected static final Method f;
    private static final Handler g;

    static {
        d.g = new Handler(Looper.getMainLooper());
        Class class0 = d.a();
        d.a = class0;
        d.b = d.b();
        d.c = d.f();
        d.d = d.d(class0);
        d.e = d.c(class0);
        d.f = d.e(class0);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field field0 = Activity.class.getDeclaredField("mMainThread");
            field0.setAccessible(true);
            return field0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Method c(Class class0) {
        if(class0 == null) {
            return null;
        }
        try {
            Method method0 = class0.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            method0.setAccessible(true);
            return method0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Method d(Class class0) {
        if(class0 == null) {
            return null;
        }
        try {
            Method method0 = class0.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            method0.setAccessible(true);
            return method0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    // 去混淆评级： 低(30)
    private static Method e(Class class0) {
        return null;
    }

    private static Field f() {
        try {
            Field field0 = Activity.class.getDeclaredField("mToken");
            field0.setAccessible(true);
            return field0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static boolean g() [...] // 潜在的解密器

    protected static boolean h(Object object0, int v, Activity activity0) {
        class c implements Runnable {
            final Object f;
            final Object g;

            c(Object object0, Object object1) {
                this.g = object1;
                super();
            }

            @Override
            public void run() {
                try {
                    Method method0 = d.d;
                    if(method0 != null) {
                        method0.invoke(this.f, this.g, Boolean.FALSE, "AppCompat recreation");
                        return;
                    }
                    d.e.invoke(this.f, this.g, Boolean.FALSE);
                    return;
                }
                catch(RuntimeException runtimeException0) {
                }
                catch(Throwable throwable0) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", throwable0);
                    return;
                }
                if(runtimeException0.getClass() == RuntimeException.class && runtimeException0.getMessage() != null && runtimeException0.getMessage().startsWith("Unable to stop")) {
                    throw runtimeException0;
                }
            }
        }

        try {
            Object object1 = d.c.get(activity0);
            if(object1 == object0 && activity0.hashCode() == v) {
                c d$c0 = new c(d.b.get(activity0), object1);
                d.g.postAtFrontOfQueue(d$c0);
                return true;
            }
        }
        catch(Throwable throwable0) {
            Log.e("ActivityRecreator", "Exception while fetching field values", throwable0);
        }
        return false;
    }

    static boolean i(Activity activity0) {
        class a implements Runnable {
            final androidx.core.app.d.d f;
            final Object g;

            a(androidx.core.app.d.d d$d0, Object object0) {
                this.g = object0;
                super();
            }

            @Override
            public void run() {
                this.f.f = this.g;
            }
        }


        class b implements Runnable {
            final Application f;
            final androidx.core.app.d.d g;

            b(Application application0, androidx.core.app.d.d d$d0) {
                this.g = d$d0;
                super();
            }

            @Override
            public void run() {
                this.f.unregisterActivityLifecycleCallbacks(this.g);
            }
        }

        Handler handler0;
        androidx.core.app.d.d d$d0;
        Application application0;
        if(Build.VERSION.SDK_INT >= 28) {
            activity0.recreate();
            return true;
        }
        if(d.e == null && d.d == null) {
            return false;
        }
        try {
            Object object0 = d.c.get(activity0);
            if(object0 == null) {
                return false;
            }
            if(d.b.get(activity0) == null) {
                return false;
            }
            application0 = activity0.getApplication();
            d$d0 = new androidx.core.app.d.d(activity0);
            application0.registerActivityLifecycleCallbacks(d$d0);
            handler0 = d.g;
            handler0.post(new a(d$d0, object0));
        }
        catch(Throwable unused_ex) {
            return false;
        }
        try {
            activity0.recreate();
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        try {
            b d$b0 = new b(application0, d$d0);
            d.g.post(d$b0);
            throw throwable0;
        label_21:
            handler0.post(new b(application0, d$d0));
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

