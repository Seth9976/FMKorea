package J3;

import I3.B0;
import I3.S;
import I3.W;
import I3.u0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p3.j;
import z3.g;
import z3.k;

public final class c extends d implements S {
    private volatile c _immediate;
    private final Handler h;
    private final String i;
    private final boolean j;
    private final c k;

    public c(Handler handler0, String s) {
        this(handler0, s, false);
    }

    public c(Handler handler0, String s, int v, g g0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(handler0, s);
    }

    private c(Handler handler0, String s, boolean z) {
        c c0 = null;
        super(null);
        this.h = handler0;
        this.i = s;
        this.j = z;
        if(z) {
            c0 = this;
        }
        this._immediate = c0;
        c c1 = this._immediate;
        if(c1 == null) {
            c1 = new c(handler0, s, true);
            this._immediate = c1;
        }
        this.k = c1;
    }

    @Override  // I3.F
    public void e0(j j0, Runnable runnable0) {
        if(!this.h.post(runnable0)) {
            this.j0(j0, runnable0);
        }
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof c && ((c)object0).h == this.h;
    }

    // 去混淆评级： 低(20)
    @Override  // I3.F
    public boolean f0(j j0) {
        return !this.j || !k.a(Looper.myLooper(), this.h.getLooper());
    }

    @Override  // I3.B0
    public B0 h0() {
        return this.k0();
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.h);
    }

    private final void j0(j j0, Runnable runnable0) {
        u0.c(j0, new CancellationException("The task was rejected, the handler underlying the dispatcher \'" + this + "\' was closed"));
        W.b().e0(j0, runnable0);
    }

    public c k0() {
        return this.k;
    }

    @Override  // I3.F
    public String toString() {
        String s = this.i0();
        if(s == null) {
            s = this.i == null ? this.h.toString() : this.i;
            return this.j ? s + ".immediate" : s;
        }
        return s;
    }
}

