package androidx.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import y3.a;
import z3.k;

public final class t {
    private final Executor a;
    private final a b;
    private final Object c;
    private int d;
    private boolean e;
    private boolean f;
    private final List g;
    private final Runnable h;

    public t(Executor executor0, a a0) {
        k.e(executor0, "executor");
        k.e(a0, "reportFullyDrawn");
        super();
        this.a = executor0;
        this.b = a0;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = () -> {
            k.e(this, "this$0");
            synchronized(this.c) {
                this.e = false;
                if(this.d == 0 && !this.f) {
                    this.b.a();
                    this.b();
                }
            }
        };
    }

    public final void b() {
        synchronized(this.c) {
            this.f = true;
            for(Object object1: this.g) {
                ((a)object1).a();
            }
            this.g.clear();
        }
    }

    public final boolean c() {
        synchronized(this.c) {
        }
        return this.f;
    }

    // 检测为 Lambda 实现
    private static final void d(t t0) [...]
}

