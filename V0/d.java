package v0;

import android.os.Build.VERSION;
import androidx.work.l;
import u0.b;
import w0.h;
import x0.u;
import z3.k;

public final class d extends c {
    public d(h h0) {
        k.e(h0, "tracker");
        super(h0);
    }

    @Override  // v0.c
    public boolean b(u u0) {
        k.e(u0, "workSpec");
        return u0.j.d() == l.g;
    }

    @Override  // v0.c
    public boolean c(Object object0) {
        return this.i(((b)object0));
    }

    public boolean i(b b0) {
        k.e(b0, "value");
        return Build.VERSION.SDK_INT < 26 ? !b0.a() : !b0.a() || !b0.d();
    }
}

