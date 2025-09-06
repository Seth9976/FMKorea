package a2;

import android.os.SystemClock;

public abstract class m {
    public static m a(long v, long v1, long v2) {
        return new a(v, v1, v2);
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public static m e() {
        return m.a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }
}

