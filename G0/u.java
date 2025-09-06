package g0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k0.g;
import k0.h.c;
import k0.h;
import k0.j;
import l0.f;
import m3.F;
import m3.L;
import m3.o;
import z3.k;
import z3.l;

public abstract class u {
    public static class a {
        private final Context a;
        private final Class b;
        private final String c;
        private final List d;
        private final List e;
        private List f;
        private Executor g;
        private Executor h;
        private c i;
        private boolean j;
        private d k;
        private Intent l;
        private boolean m;
        private boolean n;
        private long o;
        private TimeUnit p;
        private final e q;
        private Set r;
        private Set s;
        private String t;
        private File u;
        private Callable v;

        public a(Context context0, Class class0, String s) {
            k.e(context0, "context");
            k.e(class0, "klass");
            super();
            this.a = context0;
            this.b = class0;
            this.c = s;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.k = d.f;
            this.m = true;
            this.o = -1L;
            this.q = new e();
            this.r = new LinkedHashSet();
        }

        public a a(b u$b0) {
            k.e(u$b0, "callback");
            this.d.add(u$b0);
            return this;
        }

        public a b(h0.b[] arr_b) {
            k.e(arr_b, "migrations");
            if(this.s == null) {
                this.s = new HashSet();
            }
            for(int v = 0; v < arr_b.length; ++v) {
                h0.b b0 = arr_b[v];
                Set set0 = this.s;
                k.b(set0);
                set0.add(b0.a);
                Set set1 = this.s;
                k.b(set1);
                set1.add(b0.b);
            }
            h0.b[] arr_b1 = (h0.b[])Arrays.copyOf(arr_b, arr_b.length);
            this.q.b(arr_b1);
            return this;
        }

        public a c() {
            this.j = true;
            return this;
        }

        public u d() {
            Executor executor0 = this.g;
            if(executor0 == null && this.h == null) {
                Executor executor1 = k.c.f();
                this.h = executor1;
                this.g = executor1;
            }
            else if(executor0 != null && this.h == null) {
                this.h = executor0;
            }
            else if(executor0 == null) {
                this.g = this.h;
            }
            Set set0 = this.s;
            if(set0 != null) {
                k.b(set0);
                for(Object object0: set0) {
                    int v = ((Number)object0).intValue();
                    if(this.r.contains(v)) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + v).toString());
                    }
                    if(false) {
                        break;
                    }
                }
            }
            c h$c0 = this.i;
            if(h$c0 == null) {
                h$c0 = new f();
            }
            if(h$c0 == null) {
                h$c0 = null;
            }
            else {
                if(this.o > 0L) {
                    if(this.c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long v1 = this.o;
                    TimeUnit timeUnit0 = this.p;
                    if(timeUnit0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.g;
                    if(executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    h$c0 = new g0.e(h$c0, new g0.c(v1, timeUnit0, executor2));
                }
                int v2 = 0;
                String s = this.t;
                if(s != null || this.u != null || this.v != null) {
                    if(this.c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    File file0 = this.u;
                    Callable callable0 = this.v;
                    if(callable0 != null) {
                        v2 = 1;
                    }
                    if((s == null ? 0 : 1) + (file0 == null ? 0 : 1) + v2 != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    h$c0 = new z(s, file0, callable0, h$c0);
                }
            }
            if(h$c0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context0 = this.a;
            String s1 = this.c;
            e u$e0 = this.q;
            List list0 = this.d;
            boolean z = this.j;
            d u$d0 = this.k.g(context0);
            Executor executor3 = this.g;
            if(executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.h;
            if(executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            g0.f f0 = new g0.f(context0, s1, h$c0, u$e0, list0, z, u$d0, executor3, executor4, this.l, this.m, this.n, this.r, this.t, this.u, this.v, null, this.e, this.f);
            u u0 = (u)t.b(this.b, "_Impl");
            u0.r(f0);
            return u0;
        }

        public a e() {
            this.m = false;
            this.n = true;
            return this;
        }

        public a f(c h$c0) {
            this.i = h$c0;
            return this;
        }

        public a g(Executor executor0) {
            k.e(executor0, "executor");
            this.g = executor0;
            return this;
        }
    }

    public static abstract class b {
        public void a(g g0) {
            k.e(g0, "db");
        }

        public void b(g g0) {
            k.e(g0, "db");
        }

        public void c(g g0) {
            k.e(g0, "db");
        }
    }

    public static final class g0.u.c {
        private g0.u.c() {
        }

        public g0.u.c(z3.g g0) {
        }
    }

    public static enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static final d[] b() [...] // Inlined contents

        private final boolean f(ActivityManager activityManager0) {
            return k0.c.b(activityManager0);
        }

        public final d g(Context context0) {
            k.e(context0, "context");
            if(this != d.f) {
                return this;
            }
            Object object0 = context0.getSystemService("activity");
            k.c(object0, "null cannot be cast to non-null type android.app.ActivityManager");
            return this.f(((ActivityManager)object0)) ? d.g : d.h;
        }
    }

    public static class e {
        private final Map a;

        public e() {
            this.a = new LinkedHashMap();
        }

        private final void a(h0.b b0) {
            int v = b0.b;
            Map map0 = this.a;
            Integer integer0 = b0.a;
            TreeMap treeMap0 = map0.get(integer0);
            if(treeMap0 == null) {
                treeMap0 = new TreeMap();
                map0.put(integer0, treeMap0);
            }
            if(treeMap0.containsKey(v)) {
                Log.w("ROOM", "Overriding migration " + treeMap0.get(v) + " with " + b0);
            }
            treeMap0.put(v, b0);
        }

        public void b(h0.b[] arr_b) {
            k.e(arr_b, "migrations");
            for(int v = 0; v < arr_b.length; ++v) {
                this.a(arr_b[v]);
            }
        }

        public final boolean c(int v, int v1) {
            Map map0 = this.f();
            if(map0.containsKey(v)) {
                Map map1 = (Map)map0.get(v);
                if(map1 == null) {
                    map1 = F.h();
                }
                return map1.containsKey(v1);
            }
            return false;
        }

        public List d(int v, int v1) {
            if(v == v1) {
                return o.i();
            }
            return v1 <= v ? this.e(new ArrayList(), false, v, v1) : this.e(new ArrayList(), true, v, v1);
        }

        // This method was un-flattened
        private final List e(List list0, boolean z, int v, int v1) {
            while(true) {
                if(!z) {
                    if(v > v1) {
                        goto label_4;
                    }
                    return list0;
                }
                else if(v >= v1) {
                    return list0;
                }
            label_4:
                TreeMap treeMap0 = (TreeMap)this.a.get(v);
                if(treeMap0 == null) {
                    return null;
                }
                Set set0 = z ? treeMap0.descendingKeySet() : treeMap0.keySet();
                Iterator iterator0 = set0.iterator();
            label_12:
                if(!iterator0.hasNext()) {
                    return null;
                }
                Object object0 = iterator0.next();
                Integer integer0 = (Integer)object0;
                if(z) {
                    k.d(integer0, "targetVersion");
                    int v2 = (int)integer0;
                    if(v + 1 > v2 || v2 > v1) {
                        break;
                    }
                }
                else {
                    k.d(integer0, "targetVersion");
                    int v3 = (int)integer0;
                    if(v1 <= v3 && v3 < v) {
                        goto label_23;
                    }
                    break;
                }
            label_23:
                Object object1 = treeMap0.get(integer0);
                k.b(object1);
                list0.add(object1);
                v = (int)integer0;
            }
            goto label_12;
        }

        public Map f() {
            return this.a;
        }
    }

    public static abstract class g0.u.f {
    }

    protected volatile g a;
    private Executor b;
    private Executor c;
    private h d;
    private final g0.o e;
    private boolean f;
    private boolean g;
    protected List h;
    private Map i;
    private final ReentrantReadWriteLock j;
    private g0.c k;
    private final ThreadLocal l;
    private final Map m;
    private final Map n;
    public static final g0.u.c o;

    static {
        u.o = new g0.u.c(null);
    }

    public u() {
        this.e = this.g();
        this.i = new LinkedHashMap();
        this.j = new ReentrantReadWriteLock();
        this.l = new ThreadLocal();
        Map map0 = Collections.synchronizedMap(new LinkedHashMap());
        k.d(map0, "synchronizedMap(mutableMapOf())");
        this.m = map0;
        this.n = new LinkedHashMap();
    }

    public void A() {
        this.m().G().y();
    }

    private final Object B(Class class0, h h0) {
        if(class0.isInstance(h0)) {
            return h0;
        }
        return h0 instanceof g0.g ? this.B(class0, ((g0.g)h0).a()) : null;
    }

    public void c() {
        if(this.f) {
            return;
        }
        if(this.v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if(!this.q() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        static final class g0.u.g extends l implements y3.l {
            final u g;

            g0.u.g(u u0) {
                this.g = u0;
                super(1);
            }

            public final Object b(g g0) {
                k.e(g0, "it");
                this.g.s();
                return null;
            }

            @Override  // y3.l
            public Object h(Object object0) {
                return this.b(((g)object0));
            }
        }

        this.c();
        g0.c c0 = this.k;
        if(c0 == null) {
            this.s();
            return;
        }
        c0.g(new g0.u.g(this));
    }

    public k0.k f(String s) {
        k.e(s, "sql");
        this.c();
        this.d();
        return this.m().G().n(s);
    }

    protected abstract g0.o g();

    protected abstract h h(g0.f arg1);

    public void i() {
        static final class g0.u.h extends l implements y3.l {
            final u g;

            g0.u.h(u u0) {
                this.g = u0;
                super(1);
            }

            public final Object b(g g0) {
                k.e(g0, "it");
                this.g.t();
                return null;
            }

            @Override  // y3.l
            public Object h(Object object0) {
                return this.b(((g)object0));
            }
        }

        g0.c c0 = this.k;
        if(c0 == null) {
            this.t();
            return;
        }
        c0.g(new g0.u.h(this));
    }

    public List j(Map map0) {
        k.e(map0, "autoMigrationSpecs");
        return o.i();
    }

    public final Lock k() {
        Lock lock0 = this.j.readLock();
        k.d(lock0, "readWriteLock.readLock()");
        return lock0;
    }

    public g0.o l() {
        return this.e;
    }

    public h m() {
        h h0 = this.d;
        if(h0 == null) {
            k.p("internalOpenHelper");
            return null;
        }
        return h0;
    }

    public Executor n() {
        Executor executor0 = this.b;
        if(executor0 == null) {
            k.p("internalQueryExecutor");
            return null;
        }
        return executor0;
    }

    public Set o() {
        return L.e();
    }

    protected Map p() {
        return F.h();
    }

    public boolean q() {
        return this.m().G().T();
    }

    public void r(g0.f f0) {
        boolean z = false;
        k.e(f0, "configuration");
        this.d = this.h(f0);
        Set set0 = this.o();
        BitSet bitSet0 = new BitSet();
        for(Object object0: set0) {
            Class class0 = (Class)object0;
            int v = f0.r.size() - 1;
            if(v >= 0) {
                while(true) {
                    if(class0.isAssignableFrom(f0.r.get(v).getClass())) {
                        bitSet0.set(v);
                        goto label_18;
                    }
                    if(v - 1 < 0) {
                        break;
                    }
                    --v;
                }
            }
            v = -1;
        label_18:
            if(v < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + class0.getCanonicalName() + ") is missing in the database configuration.").toString());
            }
            this.i.put(class0, f0.r.get(v));
        }
        int v1 = f0.r.size() - 1;
        if(v1 >= 0) {
            while(bitSet0.get(v1)) {
                if(v1 - 1 < 0) {
                    goto label_29;
                }
                --v1;
            }
            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
        }
    label_29:
        for(Object object1: this.j(this.i)) {
            h0.b b0 = (h0.b)object1;
            if(!f0.d.c(b0.a, b0.b)) {
                f0.d.b(new h0.b[]{b0});
            }
        }
        h h0 = this.m();
        y y0 = (y)this.B(y.class, h0);
        if(y0 != null) {
            y0.g(f0);
        }
        h h1 = this.m();
        g0.d d0 = (g0.d)this.B(g0.d.class, h1);
        if(d0 != null) {
            this.k = d0.g;
            this.l().o(d0.g);
        }
        if(f0.g == d.h) {
            z = true;
        }
        this.m().setWriteAheadLoggingEnabled(z);
        this.h = f0.e;
        this.b = f0.h;
        this.c = new C(f0.i);
        this.f = f0.f;
        this.g = z;
        if(f0.j != null) {
            if(f0.b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.l().p(f0.a, f0.b, f0.j);
        }
        Map map0 = this.p();
        BitSet bitSet1 = new BitSet();
        for(Object object2: map0.entrySet()) {
            Class class1 = (Class)((Map.Entry)object2).getKey();
            for(Object object3: ((List)((Map.Entry)object2).getValue())) {
                Class class2 = (Class)object3;
                int v2 = f0.q.size() - 1;
                if(v2 >= 0) {
                    while(true) {
                        if(class2.isAssignableFrom(f0.q.get(v2).getClass())) {
                            bitSet1.set(v2);
                            goto label_77;
                        }
                        if(v2 - 1 < 0) {
                            break;
                        }
                        --v2;
                    }
                }
                v2 = -1;
            label_77:
                if(v2 < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + class2 + ") for " + class1.getCanonicalName() + " is missing in the database configuration.").toString());
                }
                Object object4 = f0.q.get(v2);
                this.n.put(class2, object4);
            }
        }
        int v3 = f0.q.size() - 1;
        if(v3 >= 0) {
            while(bitSet1.get(v3)) {
                if(v3 - 1 < 0) {
                    return;
                }
                --v3;
            }
            throw new IllegalArgumentException("Unexpected type converter " + f0.q.get(v3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
        }
    }

    private final void s() {
        this.c();
        g g0 = this.m().G();
        this.l().t(g0);
        if(g0.W()) {
            g0.A();
            return;
        }
        g0.c();
    }

    private final void t() {
        this.m().G().I();
        if(!this.q()) {
            this.l().l();
        }
    }

    protected void u(g g0) {
        k.e(g0, "db");
        this.l().i(g0);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean w() {
        g0.c c0 = this.k;
        if(c0 != null) {
            return k.a(Boolean.valueOf(c0.l()), Boolean.TRUE);
        }
        g g0 = this.a;
        return g0 == null ? k.a(null, Boolean.TRUE) : k.a(Boolean.valueOf(g0.h()), Boolean.TRUE);
    }

    public Cursor x(j j0, CancellationSignal cancellationSignal0) {
        k.e(j0, "query");
        this.c();
        this.d();
        return cancellationSignal0 == null ? this.m().G().C(j0) : this.m().G().p(j0, cancellationSignal0);
    }

    public static Cursor y(u u0, j j0, CancellationSignal cancellationSignal0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if((v & 2) != 0) {
            cancellationSignal0 = null;
        }
        return u0.x(j0, cancellationSignal0);
    }

    public Object z(Callable callable0) {
        k.e(callable0, "body");
        this.e();
        try {
            Object object0 = callable0.call();
            this.A();
            return object0;
        }
        finally {
            this.i();
        }
    }
}

