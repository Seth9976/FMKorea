package w0;

import android.content.Context;
import z3.g;
import z3.k;

public final class o {
    private final h a;
    private final c b;
    private final h c;
    private final h d;

    public o(Context context0, z0.c c0) {
        k.e(context0, "context");
        k.e(c0, "taskExecutor");
        this(context0, c0, null, null, null, null, 60, null);
    }

    public o(Context context0, z0.c c0, h h0, c c1, h h1, h h2) {
        k.e(context0, "context");
        k.e(c0, "taskExecutor");
        k.e(h0, "batteryChargingTracker");
        k.e(c1, "batteryNotLowTracker");
        k.e(h1, "networkStateTracker");
        k.e(h2, "storageNotLowTracker");
        super();
        this.a = h0;
        this.b = c1;
        this.c = h1;
        this.d = h2;
    }

    public o(Context context0, z0.c c0, h h0, c c1, h h1, h h2, int v, g g0) {
        h h5;
        h h4;
        c c2;
        h h3;
        if((v & 4) == 0) {
            h3 = h0;
        }
        else {
            Context context1 = context0.getApplicationContext();
            k.d(context1, "context.applicationContext");
            h3 = new a(context1, c0);
        }
        if((v & 8) == 0) {
            c2 = c1;
        }
        else {
            Context context2 = context0.getApplicationContext();
            k.d(context2, "context.applicationContext");
            c2 = new c(context2, c0);
        }
        if((v & 16) == 0) {
            h4 = h1;
        }
        else {
            Context context3 = context0.getApplicationContext();
            k.d(context3, "context.applicationContext");
            h4 = w0.k.a(context3, c0);
        }
        if((v & 0x20) == 0) {
            h5 = h2;
        }
        else {
            Context context4 = context0.getApplicationContext();
            k.d(context4, "context.applicationContext");
            h5 = new m(context4, c0);
        }
        this(context0, c0, h3, c2, h4, h5);
    }

    public final h a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final h c() {
        return this.c;
    }

    public final h d() {
        return this.d;
    }
}

