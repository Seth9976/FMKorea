package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

abstract class d0 {
    static final long a;
    private static final Object b;
    private static WakeLock c;

    static {
        d0.a = TimeUnit.MINUTES.toMillis(1L);
        d0.b = new Object();
    }

    // 检测为 Lambda 实现
    public static void a(Intent intent0, Task task0) [...]

    private static void b(Context context0) {
        if(d0.c == null) {
            WakeLock wakeLock0 = new WakeLock(context0, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            d0.c = wakeLock0;
            wakeLock0.setReferenceCounted(true);
        }
    }

    static void c(Intent intent0) {
        synchronized(d0.b) {
            if(d0.c != null && d0.d(intent0)) {
                d0.g(intent0, false);
                d0.c.release();
            }
        }
    }

    static boolean d(Intent intent0) {
        return intent0.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void e(Intent intent0, Task task0) {
        d0.c(intent0);
    }

    static void f(Context context0, i0 i00, Intent intent0) {
        synchronized(d0.b) {
            d0.b(context0);
            boolean z = d0.d(intent0);
            d0.g(intent0, true);
            if(!z) {
                d0.c.acquire(d0.a);
            }
            i00.c(intent0).addOnCompleteListener((Task task0) -> d0.e(intent0, task0));
        }
    }

    private static void g(Intent intent0, boolean z) {
        intent0.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static ComponentName h(Context context0, Intent intent0) {
        synchronized(d0.b) {
            d0.b(context0);
            boolean z = d0.d(intent0);
            d0.g(intent0, true);
            ComponentName componentName0 = context0.startService(intent0);
            if(componentName0 == null) {
                return null;
            }
            if(!z) {
                d0.c.acquire(d0.a);
            }
            return componentName0;
        }
    }
}

