package w0;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import m3.o;
import u0.a;
import z0.c;
import z3.k;

public abstract class h {
    private final c a;
    private final Context b;
    private final Object c;
    private final LinkedHashSet d;
    private Object e;

    protected h(Context context0, c c0) {
        k.e(context0, "context");
        k.e(c0, "taskExecutor");
        super();
        this.a = c0;
        Context context1 = context0.getApplicationContext();
        k.d(context1, "context.applicationContext");
        this.b = context1;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    private static final void b(List list0, h h0) {
        k.e(list0, "$listenersList");
        k.e(h0, "this$0");
        for(Object object0: list0) {
            ((a)object0).a(h0.e);
        }
    }

    public final void c(a a0) {
        k.e(a0, "listener");
        synchronized(this.c) {
            if(this.d.add(a0)) {
                if(this.d.size() == 1) {
                    this.e = this.e();
                    androidx.work.k.e().a("WM-ConstraintTracker", this.getClass().getSimpleName() + ": initial state = " + this.e);
                    this.h();
                }
                a0.a(this.e);
            }
        }
    }

    protected final Context d() {
        return this.b;
    }

    public abstract Object e();

    public final void f(a a0) {
        k.e(a0, "listener");
        synchronized(this.c) {
            if(this.d.remove(a0) && this.d.isEmpty()) {
                this.i();
            }
        }
    }

    public final void g(Object object0) {
        synchronized(this.c) {
            if(this.e != null && k.a(this.e, object0)) {
                return;
            }
            this.e = object0;
            List list0 = o.F(this.d);
            this.a.a().execute(new g(list0, this));
        }
    }

    public abstract void h();

    public abstract void i();
}

