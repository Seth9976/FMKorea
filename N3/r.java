package N3;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class r {
    private volatile Object _cur;
    private static final AtomicReferenceFieldUpdater a;

    static {
        r.a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    }

    public r(boolean z) {
        this._cur = new s(8, z);
    }

    public final boolean a(Object object0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = r.a;
        while(true) {
            s s0 = (s)atomicReferenceFieldUpdater0.get(this);
            int v = s0.a(object0);
            switch(v) {
                case 0: {
                    return true;
                label_6:
                    if(v != 2) {
                        break;
                    }
                    return false;
                }
                case 1: {
                    s s1 = s0.i();
                    b.a(r.a, this, s0, s1);
                    break;
                }
                default: {
                    goto label_6;
                }
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = r.a;
        while(true) {
            s s0 = (s)atomicReferenceFieldUpdater0.get(this);
            if(s0.d()) {
                break;
            }
            s s1 = s0.i();
            b.a(r.a, this, s0, s1);
        }
    }

    public final int c() {
        return ((s)r.a.get(this)).f();
    }

    public final Object d() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = r.a;
        while(true) {
            s s0 = (s)atomicReferenceFieldUpdater0.get(this);
            object0 = s0.j();
            if(object0 != s.h) {
                break;
            }
            s s1 = s0.i();
            b.a(r.a, this, s0, s1);
        }
        return object0;
    }
}

