package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.h;
import androidx.work.r;

public class d implements r {
    private final Handler a;

    public d() {
        this.a = h.a(Looper.getMainLooper());
    }

    @Override  // androidx.work.r
    public void a(long v, Runnable runnable0) {
        this.a.postDelayed(runnable0, v);
    }

    @Override  // androidx.work.r
    public void b(Runnable runnable0) {
        this.a.removeCallbacks(runnable0);
    }
}

