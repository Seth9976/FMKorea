package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import k.c;
import l.b.d;
import z3.g;
import z3.k;

public class o extends h {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final b a(b h$b0, b h$b1) {
            k.e(h$b0, "state1");
            return h$b1 == null || h$b1.compareTo(h$b0) >= 0 ? h$b0 : h$b1;
        }
    }

    public static final class androidx.lifecycle.o.b {
        private b a;
        private l b;

        public androidx.lifecycle.o.b(m m0, b h$b0) {
            k.e(h$b0, "initialState");
            super();
            k.b(m0);
            this.b = q.f(m0);
            this.a = h$b0;
        }

        public final void a(n n0, androidx.lifecycle.h.a h$a0) {
            k.e(h$a0, "event");
            b h$b0 = h$a0.f();
            this.a = o.j.a(this.a, h$b0);
            l l0 = this.b;
            k.b(n0);
            l0.c(n0, h$a0);
            this.a = h$b0;
        }

        public final b b() {
            return this.a;
        }
    }

    private final boolean b;
    private l.a c;
    private b d;
    private final WeakReference e;
    private int f;
    private boolean g;
    private boolean h;
    private ArrayList i;
    public static final a j;

    static {
        o.j = new a(null);
    }

    public o(n n0) {
        k.e(n0, "provider");
        this(n0, true);
    }

    private o(n n0, boolean z) {
        this.b = z;
        this.c = new l.a();
        this.d = b.g;
        this.i = new ArrayList();
        this.e = new WeakReference(n0);
    }

    @Override  // androidx.lifecycle.h
    public void a(m m0) {
        k.e(m0, "observer");
        this.f("addObserver");
        androidx.lifecycle.o.b o$b0 = new androidx.lifecycle.o.b(m0, (this.d == b.f ? b.f : b.g));
        if(((androidx.lifecycle.o.b)this.c.i(m0, o$b0)) != null) {
            return;
        }
        n n0 = (n)this.e.get();
        if(n0 == null) {
            return;
        }
        boolean z = this.f != 0 || this.g;
        b h$b0 = this.e(m0);
        ++this.f;
        while(o$b0.b().compareTo(h$b0) < 0 && this.c.contains(m0)) {
            this.l(o$b0.b());
            androidx.lifecycle.h.a h$a0 = androidx.lifecycle.h.a.Companion.b(o$b0.b());
            if(h$a0 == null) {
                throw new IllegalStateException("no event up from " + o$b0.b());
            }
            o$b0.a(n0, h$a0);
            this.k();
            h$b0 = this.e(m0);
        }
        if(!z) {
            this.n();
        }
        --this.f;
    }

    @Override  // androidx.lifecycle.h
    public b b() {
        return this.d;
    }

    @Override  // androidx.lifecycle.h
    public void c(m m0) {
        k.e(m0, "observer");
        this.f("removeObserver");
        this.c.k(m0);
    }

    private final void d(n n0) {
        Iterator iterator0 = this.c.descendingIterator();
        k.d(iterator0, "observerMap.descendingIterator()");
        while(iterator0.hasNext() && !this.h) {
            Object object0 = iterator0.next();
            k.d(((Map.Entry)object0), "next()");
            m m0 = (m)((Map.Entry)object0).getKey();
            androidx.lifecycle.o.b o$b0 = (androidx.lifecycle.o.b)((Map.Entry)object0).getValue();
            while(o$b0.b().compareTo(this.d) > 0 && !this.h && this.c.contains(m0)) {
                androidx.lifecycle.h.a h$a0 = androidx.lifecycle.h.a.Companion.a(o$b0.b());
                if(h$a0 == null) {
                    throw new IllegalStateException("no event down from " + o$b0.b());
                }
                this.l(h$a0.f());
                o$b0.a(n0, h$a0);
                this.k();
            }
        }
    }

    private final b e(m m0) {
        b h$b1;
        Map.Entry map$Entry0 = this.c.l(m0);
        b h$b0 = null;
        if(map$Entry0 == null) {
            h$b1 = null;
        }
        else {
            androidx.lifecycle.o.b o$b0 = (androidx.lifecycle.o.b)map$Entry0.getValue();
            h$b1 = o$b0 == null ? null : o$b0.b();
        }
        if(!this.i.isEmpty()) {
            h$b0 = (b)this.i.get(this.i.size() - 1);
        }
        b h$b2 = o.j.a(this.d, h$b1);
        return o.j.a(h$b2, h$b0);
    }

    private final void f(String s) {
        if(this.b && !c.g().b()) {
            throw new IllegalStateException(("Method " + s + " must be called on the main thread").toString());
        }
    }

    private final void g(n n0) {
        d b$d0 = this.c.d();
        k.d(b$d0, "observerMap.iteratorWithAdditions()");
        while(b$d0.hasNext() && !this.h) {
            Object object0 = b$d0.next();
            m m0 = (m)((Map.Entry)object0).getKey();
            androidx.lifecycle.o.b o$b0 = (androidx.lifecycle.o.b)((Map.Entry)object0).getValue();
            while(o$b0.b().compareTo(this.d) < 0 && !this.h && this.c.contains(m0)) {
                this.l(o$b0.b());
                androidx.lifecycle.h.a h$a0 = androidx.lifecycle.h.a.Companion.b(o$b0.b());
                if(h$a0 == null) {
                    throw new IllegalStateException("no event up from " + o$b0.b());
                }
                o$b0.a(n0, h$a0);
                this.k();
            }
        }
    }

    public void h(androidx.lifecycle.h.a h$a0) {
        k.e(h$a0, "event");
        this.f("handleLifecycleEvent");
        this.j(h$a0.f());
    }

    private final boolean i() {
        if(this.c.size() == 0) {
            return true;
        }
        Map.Entry map$Entry0 = this.c.a();
        k.b(map$Entry0);
        b h$b0 = ((androidx.lifecycle.o.b)map$Entry0.getValue()).b();
        Map.Entry map$Entry1 = this.c.e();
        k.b(map$Entry1);
        b h$b1 = ((androidx.lifecycle.o.b)map$Entry1.getValue()).b();
        return h$b0 == h$b1 && this.d == h$b1;
    }

    private final void j(b h$b0) {
        b h$b1 = this.d;
        if(h$b1 == h$b0) {
            return;
        }
        if(h$b1 == b.g && h$b0 == b.f) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = h$b0;
        if(!this.g && this.f == 0) {
            this.g = true;
            this.n();
            this.g = false;
            if(this.d == b.f) {
                this.c = new l.a();
            }
            return;
        }
        this.h = true;
    }

    private final void k() {
        this.i.remove(this.i.size() - 1);
    }

    private final void l(b h$b0) {
        this.i.add(h$b0);
    }

    public void m(b h$b0) {
        k.e(h$b0, "state");
        this.f("setCurrentState");
        this.j(h$b0);
    }

    private final void n() {
        n n0 = (n)this.e.get();
        if(n0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while(!this.i()) {
            this.h = false;
            b h$b0 = this.d;
            Map.Entry map$Entry0 = this.c.a();
            k.b(map$Entry0);
            if(h$b0.compareTo(((androidx.lifecycle.o.b)map$Entry0.getValue()).b()) < 0) {
                this.d(n0);
            }
            Map.Entry map$Entry1 = this.c.e();
            if(!this.h && map$Entry1 != null && this.d.compareTo(((androidx.lifecycle.o.b)map$Entry1.getValue()).b()) > 0) {
                this.g(n0);
            }
        }
        this.h = false;
    }
}

