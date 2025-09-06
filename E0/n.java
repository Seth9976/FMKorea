package e0;

import I3.m;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.t;
import l3.u;
import p3.f;
import q3.b;
import r3.h;
import z3.g;
import z3.k;

public abstract class n {
    static final class a extends n {
        private final MeasurementManager b;

        public a(MeasurementManager measurementManager0) {
            k.e(measurementManager0, "mMeasurementManager");
            super();
            this.b = measurementManager0;
        }

        public a(Context context0) {
            k.e(context0, "context");
            Object object0 = context0.getSystemService(MeasurementManager.class);
            k.d(object0, "context.getSystemService…:class.java\n            )");
            this(((MeasurementManager)object0));
        }

        @Override  // e0.n
        public Object a(e0.a a0, f f0) {
            m m0 = new m(b.b(f0), 1);
            m0.B();
            this.b.deleteRegistrations(this.k(a0), new e0.m(), t.a(m0));
            Object object0 = m0.y();
            if(object0 == b.c()) {
                h.c(f0);
            }
            return object0 == b.c() ? object0 : u.a;
        }

        @Override  // e0.n
        public Object b(f f0) {
            m m0 = new m(b.b(f0), 1);
            m0.B();
            this.b.getMeasurementApiStatus(new e0.m(), t.a(m0));
            Object object0 = m0.y();
            if(object0 == b.c()) {
                h.c(f0);
            }
            return object0;
        }

        @Override  // e0.n
        public Object c(Uri uri0, InputEvent inputEvent0, f f0) {
            m m0 = new m(b.b(f0), 1);
            m0.B();
            this.b.registerSource(uri0, inputEvent0, new e0.m(), t.a(m0));
            Object object0 = m0.y();
            if(object0 == b.c()) {
                h.c(f0);
            }
            return object0 == b.c() ? object0 : u.a;
        }

        @Override  // e0.n
        public Object d(Uri uri0, f f0) {
            m m0 = new m(b.b(f0), 1);
            m0.B();
            this.b.registerTrigger(uri0, new e0.m(), t.a(m0));
            Object object0 = m0.y();
            if(object0 == b.c()) {
                h.c(f0);
            }
            return object0 == b.c() ? object0 : u.a;
        }

        @Override  // e0.n
        public Object e(o o0, f f0) {
            m m0 = new m(b.b(f0), 1);
            m0.B();
            this.b.registerWebSource(this.l(o0), new e0.m(), t.a(m0));
            Object object0 = m0.y();
            if(object0 == b.c()) {
                h.c(f0);
            }
            return object0 == b.c() ? object0 : u.a;
        }

        @Override  // e0.n
        public Object f(p p0, f f0) {
            m m0 = new m(b.b(f0), 1);
            m0.B();
            this.b.registerWebTrigger(this.m(p0), new e0.m(), t.a(m0));
            Object object0 = m0.y();
            if(object0 == b.c()) {
                h.c(f0);
            }
            return object0 == b.c() ? object0 : u.a;
        }

        private final DeletionRequest k(e0.a a0) {
            e0.k.a();
            throw null;
        }

        private final WebSourceRegistrationRequest l(o o0) {
            throw null;
        }

        private final WebTriggerRegistrationRequest m(p p0) {
            throw null;
        }
    }

    public static final class e0.n.b {
        private e0.n.b() {
        }

        public e0.n.b(g g0) {
        }

        public final n a(Context context0) {
            k.e(context0, "context");
            Log.d("MeasurementManager", "AdServicesInfo.version=" + a0.b.a.a());
            return a0.b.a.a() >= 5 ? new a(context0) : null;
        }
    }

    public static final e0.n.b a;

    static {
        n.a = new e0.n.b(null);
    }

    public abstract Object a(e0.a arg1, f arg2);

    public abstract Object b(f arg1);

    public abstract Object c(Uri arg1, InputEvent arg2, f arg3);

    public abstract Object d(Uri arg1, f arg2);

    public abstract Object e(o arg1, f arg2);

    public abstract Object f(p arg1, f arg2);
}

