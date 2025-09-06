package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;
import y3.a;
import z3.k;

public abstract class v {
    private boolean a;
    private final CopyOnWriteArrayList b;
    private a c;

    public v(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(c c0) {
        k.e(c0, "cancellable");
        this.b.add(c0);
    }

    public final a b() {
        return this.c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(b b0) {
        k.e(b0, "backEvent");
    }

    public void f(b b0) {
        k.e(b0, "backEvent");
    }

    public final boolean g() {
        return this.a;
    }

    public final void h() {
        for(Object object0: this.b) {
            ((c)object0).cancel();
        }
    }

    public final void i(c c0) {
        k.e(c0, "cancellable");
        this.b.remove(c0);
    }

    public final void j(boolean z) {
        this.a = z;
        a a0 = this.c;
        if(a0 != null) {
            a0.a();
        }
    }

    public final void k(a a0) {
        this.c = a0;
    }
}

