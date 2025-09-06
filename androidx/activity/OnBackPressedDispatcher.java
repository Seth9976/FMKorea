package androidx.activity;

import android.os.Build.VERSION;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.h.a;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.util.Collection;
import java.util.ListIterator;
import l3.u;
import z3.j;
import z3.k;

public final class OnBackPressedDispatcher {
    final class LifecycleOnBackPressedCancellable implements c, l {
        private final h f;
        private final v g;
        private c h;
        final OnBackPressedDispatcher i;

        public LifecycleOnBackPressedCancellable(h h0, v v0) {
            k.e(h0, "lifecycle");
            k.e(v0, "onBackPressedCallback");
            this.i = onBackPressedDispatcher0;
            super();
            this.f = h0;
            this.g = v0;
            h0.a(this);
        }

        @Override  // androidx.lifecycle.l
        public void c(n n0, a h$a0) {
            k.e(n0, "source");
            k.e(h$a0, "event");
            if(h$a0 == a.ON_START) {
                this.h = this.i.i(this.g);
                return;
            }
            if(h$a0 == a.ON_STOP) {
                c c0 = this.h;
                if(c0 != null) {
                    c0.cancel();
                }
            }
            else if(h$a0 == a.ON_DESTROY) {
                this.cancel();
            }
        }

        @Override  // androidx.activity.c
        public void cancel() {
            this.f.c(this);
            this.g.i(this);
            c c0 = this.h;
            if(c0 != null) {
                c0.cancel();
            }
            this.h = null;
        }
    }

    public static final class f {
        public static final f a;

        static {
            f.a = new f();
        }

        public final OnBackInvokedCallback b(y3.a a0) {
            k.e(a0, "onBackInvoked");
            return new w(a0);
        }

        private static final void c(y3.a a0) {
            k.e(a0, "$onBackInvoked");
            a0.a();
        }

        public final void d(Object object0, int v, Object object1) {
            k.e(object0, "dispatcher");
            k.e(object1, "callback");
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(v, ((OnBackInvokedCallback)object1));
        }

        public final void e(Object object0, Object object1) {
            k.e(object0, "dispatcher");
            k.e(object1, "callback");
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    public static final class g {
        public static final g a;

        static {
            g.a = new g();
        }

        public final OnBackInvokedCallback a(y3.l l0, y3.l l1, y3.a a0, y3.a a1) {
            public static final class androidx.activity.OnBackPressedDispatcher.g.a implements OnBackAnimationCallback {
                final y3.l a;
                final y3.l b;
                final y3.a c;
                final y3.a d;

                androidx.activity.OnBackPressedDispatcher.g.a(y3.l l0, y3.l l1, y3.a a0, y3.a a1) {
                    this.a = l0;
                    this.b = l1;
                    this.c = a0;
                    this.d = a1;
                    super();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    this.d.a();
                }

                @Override  // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    this.c.a();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent0) {
                    k.e(backEvent0, "backEvent");
                    b b0 = new b(backEvent0);
                    this.b.h(b0);
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent0) {
                    k.e(backEvent0, "backEvent");
                    b b0 = new b(backEvent0);
                    this.a.h(b0);
                }
            }

            k.e(l0, "onBackStarted");
            k.e(l1, "onBackProgressed");
            k.e(a0, "onBackInvoked");
            k.e(a1, "onBackCancelled");
            return new androidx.activity.OnBackPressedDispatcher.g.a(l0, l1, a0, a1);
        }
    }

    final class androidx.activity.OnBackPressedDispatcher.h implements c {
        private final v f;
        final OnBackPressedDispatcher g;

        public androidx.activity.OnBackPressedDispatcher.h(v v0) {
            k.e(v0, "onBackPressedCallback");
            this.g = onBackPressedDispatcher0;
            super();
            this.f = v0;
        }

        @Override  // androidx.activity.c
        public void cancel() {
            this.g.c.remove(this.f);
            if(k.a(this.g.d, this.f)) {
                this.g.d = null;
            }
            this.f.i(this);
            y3.a a0 = this.f.b();
            if(a0 != null) {
                a0.a();
            }
            this.f.k(null);
        }
    }

    private final Runnable a;
    private final B.a b;
    private final m3.h c;
    private v d;
    private OnBackInvokedCallback e;
    private OnBackInvokedDispatcher f;
    private boolean g;
    private boolean h;

    public OnBackPressedDispatcher(Runnable runnable0) {
        this(runnable0, null);
    }

    public OnBackPressedDispatcher(Runnable runnable0, B.a a0) {
        static final class androidx.activity.OnBackPressedDispatcher.a extends z3.l implements y3.l {
            final OnBackPressedDispatcher g;

            androidx.activity.OnBackPressedDispatcher.a(OnBackPressedDispatcher onBackPressedDispatcher0) {
                this.g = onBackPressedDispatcher0;
                super(1);
            }

            public final void b(b b0) {
                k.e(b0, "backEvent");
                this.g.m(b0);
            }

            @Override  // y3.l
            public Object h(Object object0) {
                this.b(((b)object0));
                return u.a;
            }
        }


        static final class androidx.activity.OnBackPressedDispatcher.b extends z3.l implements y3.l {
            final OnBackPressedDispatcher g;

            androidx.activity.OnBackPressedDispatcher.b(OnBackPressedDispatcher onBackPressedDispatcher0) {
                this.g = onBackPressedDispatcher0;
                super(1);
            }

            public final void b(b b0) {
                k.e(b0, "backEvent");
                this.g.l(b0);
            }

            @Override  // y3.l
            public Object h(Object object0) {
                this.b(((b)object0));
                return u.a;
            }
        }


        static final class androidx.activity.OnBackPressedDispatcher.c extends z3.l implements y3.a {
            final OnBackPressedDispatcher g;

            androidx.activity.OnBackPressedDispatcher.c(OnBackPressedDispatcher onBackPressedDispatcher0) {
                this.g = onBackPressedDispatcher0;
                super(0);
            }

            @Override  // y3.a
            public Object a() {
                this.b();
                return u.a;
            }

            public final void b() {
                this.g.k();
            }
        }


        static final class d extends z3.l implements y3.a {
            final OnBackPressedDispatcher g;

            d(OnBackPressedDispatcher onBackPressedDispatcher0) {
                this.g = onBackPressedDispatcher0;
                super(0);
            }

            @Override  // y3.a
            public Object a() {
                this.b();
                return u.a;
            }

            public final void b() {
                this.g.j();
            }
        }


        static final class e extends z3.l implements y3.a {
            final OnBackPressedDispatcher g;

            e(OnBackPressedDispatcher onBackPressedDispatcher0) {
                this.g = onBackPressedDispatcher0;
                super(0);
            }

            @Override  // y3.a
            public Object a() {
                this.b();
                return u.a;
            }

            public final void b() {
                this.g.k();
            }
        }

        OnBackInvokedCallback onBackInvokedCallback0;
        this.a = runnable0;
        this.b = a0;
        this.c = new m3.h();
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            if(v >= 34) {
                androidx.activity.OnBackPressedDispatcher.a onBackPressedDispatcher$a0 = new androidx.activity.OnBackPressedDispatcher.a(this);
                androidx.activity.OnBackPressedDispatcher.b onBackPressedDispatcher$b0 = new androidx.activity.OnBackPressedDispatcher.b(this);
                androidx.activity.OnBackPressedDispatcher.c onBackPressedDispatcher$c0 = new androidx.activity.OnBackPressedDispatcher.c(this);
                d onBackPressedDispatcher$d0 = new d(this);
                onBackInvokedCallback0 = g.a.a(onBackPressedDispatcher$a0, onBackPressedDispatcher$b0, onBackPressedDispatcher$c0, onBackPressedDispatcher$d0);
            }
            else {
                e onBackPressedDispatcher$e0 = new e(this);
                onBackInvokedCallback0 = f.a.b(onBackPressedDispatcher$e0);
            }
            this.e = onBackInvokedCallback0;
        }
    }

    public final void h(n n0, v v0) {
        final class i extends j implements y3.a {
            i(Object object0) {
                super(0, object0, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }

            @Override  // y3.a
            public Object a() {
                this.p();
                return u.a;
            }

            public final void p() {
                ((OnBackPressedDispatcher)this.g).p();
            }
        }

        k.e(n0, "owner");
        k.e(v0, "onBackPressedCallback");
        h h0 = n0.getLifecycle();
        if(h0.b() == androidx.lifecycle.h.b.f) {
            return;
        }
        v0.a(new LifecycleOnBackPressedCancellable(this, h0, v0));
        this.p();
        v0.k(new i(this));
    }

    public final c i(v v0) {
        final class androidx.activity.OnBackPressedDispatcher.j extends j implements y3.a {
            androidx.activity.OnBackPressedDispatcher.j(Object object0) {
                super(0, object0, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }

            @Override  // y3.a
            public Object a() {
                this.p();
                return u.a;
            }

            public final void p() {
                ((OnBackPressedDispatcher)this.g).p();
            }
        }

        k.e(v0, "onBackPressedCallback");
        this.c.add(v0);
        c c0 = new androidx.activity.OnBackPressedDispatcher.h(this, v0);
        v0.a(c0);
        this.p();
        v0.k(new androidx.activity.OnBackPressedDispatcher.j(this));
        return c0;
    }

    private final void j() {
        Object object0 = null;
        ListIterator listIterator0 = this.c.listIterator(this.c.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((v)object1).g()) {
                object0 = object1;
                break;
            }
        }
        this.d = null;
        boolean z = ((v)object0) == null;
    }

    public final void k() {
        Object object0 = null;
        ListIterator listIterator0 = this.c.listIterator(this.c.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((v)object1).g()) {
                object0 = object1;
                break;
            }
        }
        this.d = null;
        if(((v)object0) != null) {
            ((v)object0).d();
            return;
        }
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    private final void l(b b0) {
        Object object0 = null;
        ListIterator listIterator0 = this.c.listIterator(this.c.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((v)object1).g()) {
                object0 = object1;
                break;
            }
        }
        if(((v)object0) != null) {
            ((v)object0).e(b0);
        }
    }

    private final void m(b b0) {
        Object object0 = null;
        ListIterator listIterator0 = this.c.listIterator(this.c.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((v)object1).g()) {
                object0 = object1;
                break;
            }
        }
        this.d = (v)object0;
        if(((v)object0) != null) {
            ((v)object0).f(b0);
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher0) {
        k.e(onBackInvokedDispatcher0, "invoker");
        this.f = onBackInvokedDispatcher0;
        this.o(this.h);
    }

    private final void o(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.f;
        OnBackInvokedCallback onBackInvokedCallback0 = this.e;
        if(onBackInvokedDispatcher0 != null && onBackInvokedCallback0 != null) {
            if(z && !this.g) {
                f.a.d(onBackInvokedDispatcher0, 0, onBackInvokedCallback0);
                this.g = true;
                return;
            }
            if(!z && this.g) {
                f.a.e(onBackInvokedDispatcher0, onBackInvokedCallback0);
                this.g = false;
            }
        }
    }

    private final void p() {
        boolean z = this.h;
        m3.h h0 = this.c;
        boolean z1 = false;
        if(!(h0 instanceof Collection) || !h0.isEmpty()) {
            for(Object object0: h0) {
                if(((v)object0).g()) {
                    z1 = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        this.h = z1;
        if(z1 != z) {
            B.a a0 = this.b;
            if(a0 != null) {
                a0.a(Boolean.valueOf(z1));
            }
            if(Build.VERSION.SDK_INT >= 33) {
                this.o(z1);
            }
        }
    }
}

