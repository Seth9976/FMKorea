package K2;

import I3.F;
import M2.h;
import a2.e;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Map;
import l3.u;
import p3.f;
import r3.d;
import z3.g;

public final class k {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final e a;
    private final b b;
    private final h c;
    private final w d;
    private final r e;
    private final K2.h f;
    private final n g;
    public static final a h;

    static {
        k.h = new a(null);
    }

    public k(e e0, C2.e e1, F f0, F f1, B2.b b0) {
        public static final class c implements t {
            final k a;

            c(k k0) {
                this.a = k0;
                super();
            }

            @Override  // K2.t
            public Object a(o o0, f f0) {
                Object object0 = k.a(this.a, o0, f0);
                return object0 == q3.b.c() ? object0 : u.a;
            }
        }

        z3.k.e(e0, "firebaseApp");
        z3.k.e(e1, "firebaseInstallations");
        z3.k.e(f0, "backgroundDispatcher");
        z3.k.e(f1, "blockingDispatcher");
        z3.k.e(b0, "transportFactoryProvider");
        super();
        this.a = e0;
        b b1 = q.a.a(e0);
        this.b = b1;
        Context context0 = e0.j();
        z3.k.d(context0, "firebaseApp.applicationContext");
        h h0 = new h(context0, f1, f0, e1, b1);
        this.c = h0;
        v v0 = new v();
        this.d = v0;
        K2.h h1 = new K2.h(b0);
        this.f = h1;
        this.g = new n(e1, h1);
        r r0 = new r(this.d(), v0, null, 4, null);
        this.e = r0;
        K2.u u0 = new K2.u(v0, f0, new c(this), h0, r0);
        Context context1 = e0.j().getApplicationContext();
        if(context1 instanceof Application) {
            ((Application)context1).registerActivityLifecycleCallbacks(u0.d());
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + context1.getClass() + '.');
    }

    private final Object b(o o0, f f0) {
        static final class K2.k.b extends d {
            Object i;
            Object j;
            Object k;
            final k l;
            int m;

            K2.k.b(k k0, f f0) {
                this.l = k0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.k = object0;
                this.m |= 0x80000000;
                return this.l.b(null, this);
            }
        }

        k k0;
        K2.k.b k$b0;
        if(f0 instanceof K2.k.b) {
            k$b0 = (K2.k.b)f0;
            int v = k$b0.m;
            if((v & 0x80000000) == 0) {
                k$b0 = new K2.k.b(this, f0);
            }
            else {
                k$b0.m = v ^ 0x80000000;
            }
        }
        else {
            k$b0 = new K2.k.b(this, f0);
        }
        Object object0 = k$b0.k;
        Object object1 = q3.b.c();
        switch(k$b0.m) {
            case 0: {
                l3.o.b(object0);
                k$b0.i = this;
                k$b0.j = o0;
                k$b0.m = 1;
                object0 = L2.a.a.c(k$b0);
                if(object0 == object1) {
                    return object1;
                }
                k0 = this;
                goto label_27;
            }
            case 1: {
                o0 = (o)k$b0.j;
                k0 = (k)k$b0.i;
                l3.o.b(object0);
            label_27:
                if(((Map)object0).isEmpty()) {
                    Log.d("FirebaseSessions", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                    return u.a;
                }
                for(Object object2: ((Map)object0).values()) {
                    ((L2.b)object2).c(new L2.b.b(o0.b()));
                }
                Iterable iterable0 = ((Map)object0).values();
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object3: iterable0) {
                        if(!((L2.b)object3).a()) {
                            continue;
                        }
                        Log.d("FirebaseSessions", "Data Collection is enabled for at least one Subscriber");
                        k$b0.i = k0;
                        k$b0.j = o0;
                        k$b0.m = 2;
                        if(k0.c.g(k$b0) == object1) {
                            return object1;
                        }
                        goto label_52;
                    }
                }
                Log.d("FirebaseSessions", "Data Collection is disabled for all subscribers. Skipping this Session Event");
                return u.a;
            }
            case 2: {
                break;
            }
            case 3: {
                l3.o.b(object0);
                return u.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        o0 = (o)k$b0.j;
        k0 = (k)k$b0.i;
        l3.o.b(object0);
    label_52:
        if(!k0.c.d()) {
            Log.d("FirebaseSessions", "Sessions SDK disabled. Events will not be sent.");
            return u.a;
        }
        if(!k0.e.c()) {
            Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
            return u.a;
        }
        p p0 = q.a.c(k0.a, o0, k0.c);
        k$b0.i = null;
        k$b0.j = null;
        k$b0.m = 3;
        return k0.g.a(p0, k$b0) == object1 ? object1 : u.a;
    }

    public final void c(L2.b b0) {
        z3.k.e(b0, "subscriber");
        L2.a.a.e(b0);
        Log.d("FirebaseSessions", "Registering Sessions SDK subscriber with name: " + b0.b() + ", data collection enabled: " + b0.a());
        if(this.e.e()) {
            b0.c(new L2.b.b(this.e.d().b()));
        }
    }

    private final boolean d() {
        return Math.random() <= this.c.b();
    }
}

