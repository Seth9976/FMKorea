package M2;

import I3.I;
import I3.h;
import J.f;
import L3.d;
import M.d.a;
import android.util.Log;
import java.io.IOException;
import l3.o;
import l3.u;
import r3.k;
import y3.p;
import z3.g;

public final class i {
    static final class b {
        private b() {
        }

        public b(g g0) {
        }
    }

    private final f a;
    private M2.g b;
    private static final b c;
    private static final a d;
    private static final a e;
    private static final a f;
    private static final a g;
    private static final a h;

    static {
        i.c = new b(null);
        i.d = M.f.a("firebase_sessions_enabled");
        i.e = M.f.b("firebase_sessions_sampling_rate");
        i.f = M.f.d("firebase_sessions_restart_timeout");
        i.g = M.f.d("firebase_sessions_cache_duration");
        i.h = M.f.e("firebase_sessions_cache_updated_time");
    }

    public i(f f0) {
        static final class M2.i.a extends k implements p {
            Object j;
            int k;
            final i l;

            M2.i.a(i i0, p3.f f0) {
                this.l = i0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((I)object0), ((p3.f)object1));
            }

            @Override  // r3.a
            public final p3.f q(Object object0, p3.f f0) {
                return new M2.i.a(this.l, f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                i i1;
                Object object1 = q3.b.c();
                switch(this.k) {
                    case 0: {
                        o.b(object0);
                        i i0 = this.l;
                        L3.b b0 = i.a(i0).getData();
                        this.j = i0;
                        this.k = 1;
                        Object object2 = d.d(b0, this);
                        if(object2 == object1) {
                            return object1;
                        }
                        i1 = i0;
                        object0 = object2;
                        break;
                    }
                    case 1: {
                        i1 = (i)this.j;
                        o.b(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                i.c(i1, ((M.d)object0).d());
                return u.a;
            }

            public final Object w(I i0, p3.f f0) {
                return ((M2.i.a)this.q(i0, f0)).t(u.a);
            }
        }

        z3.k.e(f0, "dataStore");
        super();
        this.a = f0;
        h.b(null, new M2.i.a(this, null), 1, null);
    }

    public static final f a(i i0) {
        return i0.a;
    }

    public final boolean d() {
        M2.g g0 = this.b;
        M2.g g1 = null;
        if(g0 == null) {
            z3.k.p("sessionConfigs");
            g0 = null;
        }
        Long long0 = g0.b();
        M2.g g2 = this.b;
        if(g2 == null) {
            z3.k.p("sessionConfigs");
        }
        else {
            g1 = g2;
        }
        Integer integer0 = g1.a();
        return long0 == null || integer0 == null || (System.currentTimeMillis() - ((long)long0)) / 1000L >= ((long)(((int)integer0)));
    }

    public final Integer e() {
        M2.g g0 = this.b;
        if(g0 == null) {
            z3.k.p("sessionConfigs");
            g0 = null;
        }
        return g0.d();
    }

    public final Double f() {
        M2.g g0 = this.b;
        if(g0 == null) {
            z3.k.p("sessionConfigs");
            g0 = null;
        }
        return g0.e();
    }

    public final Boolean g() {
        M2.g g0 = this.b;
        if(g0 == null) {
            z3.k.p("sessionConfigs");
            g0 = null;
        }
        return g0.c();
    }

    private final Object h(a d$a0, Object object0, p3.f f0) {
        static final class c extends r3.d {
            Object i;
            final i j;
            int k;

            c(i i0, p3.f f0) {
                this.j = i0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.i = object0;
                this.k |= 0x80000000;
                return this.j.h(null, null, this);
            }
        }


        static final class M2.i.d extends k implements p {
            int j;
            Object k;
            final Object l;
            final a m;
            final i n;

            M2.i.d(Object object0, a d$a0, i i0, p3.f f0) {
                this.l = object0;
                this.m = d$a0;
                this.n = i0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((M.a)object0), ((p3.f)object1));
            }

            @Override  // r3.a
            public final p3.f q(Object object0, p3.f f0) {
                p3.f f1 = new M2.i.d(this.l, this.m, this.n, f0);
                f1.k = object0;
                return f1;
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                if(this.j != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                o.b(object0);
                M.a a0 = (M.a)this.k;
                Object object1 = this.l;
                if(object1 == null) {
                    a0.h(this.m);
                }
                else {
                    a0.i(this.m, object1);
                }
                this.n.l(a0);
                return u.a;
            }

            public final Object w(M.a a0, p3.f f0) {
                return ((M2.i.d)this.q(a0, f0)).t(u.a);
            }
        }

        c i$c0;
        if(f0 instanceof c) {
            i$c0 = (c)f0;
            int v = i$c0.k;
            if((v & 0x80000000) == 0) {
                i$c0 = new c(this, f0);
            }
            else {
                i$c0.k = v ^ 0x80000000;
            }
        }
        else {
            i$c0 = new c(this, f0);
        }
        Object object1 = i$c0.i;
        Object object2 = q3.b.c();
        switch(i$c0.k) {
            case 0: {
                o.b(object1);
                try {
                    M2.i.d i$d0 = new M2.i.d(object0, d$a0, this, null);
                    i$c0.k = 1;
                    if(M.g.a(this.a, i$d0, i$c0) == object2) {
                        return object2;
                    }
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to update cache config value: " + iOException0);
                }
                return u.a;
            }
            case 1: {
                try {
                    o.b(object1);
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to update cache config value: " + iOException0);
                }
                return u.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object i(Double double0, p3.f f0) {
        Object object0 = this.h(i.e, double0, f0);
        return object0 == q3.b.c() ? object0 : u.a;
    }

    public final Object j(Integer integer0, p3.f f0) {
        Object object0 = this.h(i.g, integer0, f0);
        return object0 == q3.b.c() ? object0 : u.a;
    }

    public final Object k(Long long0, p3.f f0) {
        Object object0 = this.h(i.h, long0, f0);
        return object0 == q3.b.c() ? object0 : u.a;
    }

    private final void l(M.d d0) {
        this.b = new M2.g(((Boolean)d0.b(i.d)), ((Double)d0.b(i.e)), ((Integer)d0.b(i.f)), ((Integer)d0.b(i.g)), ((Long)d0.b(i.h)));
    }

    public final Object m(Integer integer0, p3.f f0) {
        Object object0 = this.h(i.f, integer0, f0);
        return object0 == q3.b.c() ? object0 : u.a;
    }

    public final Object n(Boolean boolean0, p3.f f0) {
        Object object0 = this.h(i.d, boolean0, f0);
        return object0 == q3.b.c() ? object0 : u.a;
    }
}

