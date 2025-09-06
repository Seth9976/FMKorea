package K2;

import I3.I;
import I3.J;
import I3.i;
import M2.h;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import p3.f;
import p3.j;
import y3.p;
import z3.k;

public final class u {
    private final w a;
    private final j b;
    private final t c;
    private final h d;
    private final r e;
    private long f;
    private final Application.ActivityLifecycleCallbacks g;

    public u(w w0, j j0, t t0, h h0, r r0) {
        public static final class a implements Application.ActivityLifecycleCallbacks {
            final u f;

            a(u u0) {
                this.f = u0;
                super();
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity0, Bundle bundle0) {
                k.e(activity0, "activity");
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity0) {
                k.e(activity0, "activity");
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity0) {
                k.e(activity0, "activity");
                this.f.b();
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity0) {
                k.e(activity0, "activity");
                this.f.c();
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
                k.e(activity0, "activity");
                k.e(bundle0, "outState");
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity0) {
                k.e(activity0, "activity");
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity0) {
                k.e(activity0, "activity");
            }
        }

        k.e(w0, "timeProvider");
        k.e(j0, "backgroundDispatcher");
        k.e(t0, "sessionInitiateListener");
        k.e(h0, "sessionsSettings");
        k.e(r0, "sessionGenerator");
        super();
        this.a = w0;
        this.b = j0;
        this.c = t0;
        this.d = h0;
        this.e = r0;
        this.f = w0.a();
        this.e();
        this.g = new a(this);
    }

    public final void b() {
        this.f = this.a.a();
    }

    public final void c() {
        if(H3.a.i(H3.a.D(this.a.a(), this.f), this.d.c()) > 0) {
            this.e();
        }
    }

    public final Application.ActivityLifecycleCallbacks d() {
        return this.g;
    }

    private final void e() {
        static final class b extends r3.k implements p {
            int j;
            final u k;
            final o l;

            b(u u0, o o0, f f0) {
                this.k = u0;
                this.l = o0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((I)object0), ((f)object1));
            }

            @Override  // r3.a
            public final f q(Object object0, f f0) {
                return new b(this.k, this.l, f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                Object object1 = q3.b.c();
                switch(this.j) {
                    case 0: {
                        l3.o.b(object0);
                        this.j = 1;
                        return this.k.c.a(this.l, this) == object1 ? object1 : l3.u.a;
                    }
                    case 1: {
                        l3.o.b(object0);
                        return l3.u.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            public final Object w(I i0, f f0) {
                return ((b)this.q(i0, f0)).t(l3.u.a);
            }
        }

        o o0 = this.e.a();
        i.d(J.a(this.b), null, null, new b(this, o0, null), 3, null);
    }
}

