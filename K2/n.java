package K2;

import C2.e;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import l3.o;
import l3.u;
import p3.f;
import r3.d;
import z3.g;
import z3.k;

public final class n {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final e a;
    private final i b;
    public static final a c;

    static {
        n.c = new a(null);
    }

    public n(e e0, i i0) {
        k.e(e0, "firebaseInstallations");
        k.e(i0, "eventGDTLogger");
        super();
        this.a = e0;
        this.b = i0;
    }

    public final Object a(p p0, f f0) {
        static final class b extends d {
            Object i;
            Object j;
            Object k;
            Object l;
            Object m;
            final n n;
            int o;

            b(n n0, f f0) {
                this.n = n0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.m = object0;
                this.o |= 0x80000000;
                return this.n.a(null, this);
            }
        }

        String s3;
        s s2;
        n n0;
        Exception exception1;
        s s1;
        p p1;
        Object object2;
        b n$b0;
        if(f0 instanceof b) {
            n$b0 = (b)f0;
            int v = n$b0.o;
            if((v & 0x80000000) == 0) {
                n$b0 = new b(this, f0);
            }
            else {
                n$b0.o = v ^ 0x80000000;
            }
        }
        else {
            n$b0 = new b(this, f0);
        }
        Object object0 = n$b0.m;
        Object object1 = q3.b.c();
        switch(n$b0.o) {
            case 0: {
                o.b(object0);
                s s0 = p0.c();
                try {
                    Task task0 = this.a.getId();
                    k.d(task0, "firebaseInstallations.id");
                    n$b0.i = this;
                    n$b0.j = p0;
                    n$b0.k = s0;
                    n$b0.l = s0;
                    n$b0.o = 1;
                    object2 = S3.b.a(task0, n$b0);
                }
                catch(Exception exception0) {
                    p1 = p0;
                    s1 = s0;
                    exception1 = exception0;
                    n0 = this;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                p1 = p0;
                s2 = s0;
                s1 = s2;
                object0 = object2;
                n0 = this;
                goto label_43;
            }
            case 1: {
                s2 = (s)n$b0.l;
                s1 = (s)n$b0.k;
                p1 = (p)n$b0.j;
                n0 = (n)n$b0.i;
                try {
                    o.b(object0);
                label_43:
                    k.d(object0, "{\n        firebaseInstallations.id.await()\n      }");
                    s3 = (String)object0;
                    goto label_50;
                }
                catch(Exception exception1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Log.e("SessionCoordinator", "Error getting Firebase Installation ID: " + exception1 + ". Using an empty ID");
        s3 = "";
        s2 = s1;
    label_50:
        s2.g(s3);
        try {
            n0.b.a(p1);
            Log.i("SessionCoordinator", "Successfully logged Session Start event: " + p1.c().e());
        }
        catch(RuntimeException runtimeException0) {
            Log.e("SessionCoordinator", "Error logging Session Start event to DataTransport: ", runtimeException0);
        }
        return u.a;
    }
}

