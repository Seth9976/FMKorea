package v0;

import android.os.Build.VERSION;
import androidx.work.l;
import u0.b;
import w0.h;
import x0.u;
import z3.g;
import z3.k;

public final class e extends c {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public static final a f;
    private static final String g;

    static {
        e.f = new a(null);
        k.d("WM-NetworkMeteredCtrlr", "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        e.g = "WM-NetworkMeteredCtrlr";
    }

    public e(h h0) {
        k.e(h0, "tracker");
        super(h0);
    }

    @Override  // v0.c
    public boolean b(u u0) {
        k.e(u0, "workSpec");
        return u0.j.d() == l.j;
    }

    @Override  // v0.c
    public boolean c(Object object0) {
        return this.i(((b)object0));
    }

    public boolean i(b b0) {
        k.e(b0, "value");
        if(Build.VERSION.SDK_INT < 26) {
            androidx.work.k.e().a("WM-NetworkMeteredCtrlr", "Metered network constraint is not supported before API 26, only checking for connected state.");
            return !b0.a();
        }
        return !b0.a() || !b0.b();
    }
}

