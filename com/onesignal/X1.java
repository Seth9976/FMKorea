package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

class x1 extends HandlerThread {
    private final Handler f;
    private static final String g = "com.onesignal.x1";
    private static final Object h;
    private static x1 i;

    static {
        x1.h = new Object();
    }

    private x1() {
        super("com.onesignal.x1");
        this.start();
        this.f = new Handler(this.getLooper());
    }

    void a(Runnable runnable0) {
        synchronized(x1.h) {
            I1.a(C.k, "Running destroyTimeout with runnable: " + runnable0.toString());
            this.f.removeCallbacks(runnable0);
        }
    }

    static x1 b() {
        if(x1.i == null) {
            Object object0 = x1.h;
            synchronized(object0) {
                if(x1.i == null) {
                    x1.i = new x1();
                }
            }
        }
        return x1.i;
    }

    void c(long v, Runnable runnable0) {
        synchronized(x1.h) {
            this.a(runnable0);
            I1.a(C.k, "Running startTimeout with timeout: " + v + " and runnable: " + runnable0.toString());
            this.f.postDelayed(runnable0, v);
        }
    }
}

