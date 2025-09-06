package P3;

import D3.d;
import N3.I;
import java.util.concurrent.TimeUnit;

public abstract class l {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static g f;
    public static final i g;
    public static final i h;

    static {
        l.a = "DefaultDispatcher";
        l.b = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        l.c = I.e("kotlinx.coroutines.scheduler.core.pool.size", d.a(8, 2), 1, 0, 8, null);
        l.d = I.e("kotlinx.coroutines.scheduler.max.pool.size", 0x1FFFFE, 0, 0x1FFFFE, 4, null);
        l.e = TimeUnit.SECONDS.toNanos(I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        l.f = e.a;
        l.g = new j(0);
        l.h = new j(1);
    }
}

