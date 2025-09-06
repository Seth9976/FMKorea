package k;

import java.util.concurrent.Executor;

public class c extends e {
    private e a;
    private final e b;
    private static volatile c c;
    private static final Executor d;
    private static final Executor e;

    static {
        c.d = (Runnable runnable0) -> c.h(runnable0);
        c.e = (Runnable runnable0) -> c.i(runnable0);
    }

    private c() {
        d d0 = new d();
        this.b = d0;
        this.a = d0;
    }

    @Override  // k.e
    public void a(Runnable runnable0) {
        this.a.a(runnable0);
    }

    @Override  // k.e
    public boolean b() {
        return this.a.b();
    }

    @Override  // k.e
    public void c(Runnable runnable0) {
        this.a.c(runnable0);
    }

    // 检测为 Lambda 实现
    public static void d(Runnable runnable0) [...]

    // 检测为 Lambda 实现
    public static void e(Runnable runnable0) [...]

    public static Executor f() {
        return c.e;
    }

    public static c g() {
        if(c.c != null) {
            return c.c;
        }
        synchronized(c.class) {
            if(c.c == null) {
                c.c = new c();
            }
            return c.c;
        }
    }

    private static void h(Runnable runnable0) {
        c.g().c(runnable0);
    }

    private static void i(Runnable runnable0) {
        c.g().a(runnable0);
    }
}

