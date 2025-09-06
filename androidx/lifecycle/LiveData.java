package androidx.lifecycle;

import java.util.Map.Entry;
import l.b.d;

public abstract class LiveData {
    class LifecycleBoundObserver extends c implements l {
        final n j;
        final LiveData k;

        @Override  // androidx.lifecycle.l
        public void c(n n0, a h$a0) {
            b h$b0 = this.j.getLifecycle().b();
            if(h$b0 == b.f) {
                this.k.i(this.f);
                return;
            }
            b h$b1 = null;
            while(h$b1 != h$b0) {
                this.h(this.j());
                h$b1 = h$b0;
                h$b0 = this.j.getLifecycle().b();
            }
        }

        @Override  // androidx.lifecycle.LiveData$c
        void i() {
            this.j.getLifecycle().c(this);
        }

        @Override  // androidx.lifecycle.LiveData$c
        boolean j() {
            return this.j.getLifecycle().b().f(b.i);
        }
    }

    class androidx.lifecycle.LiveData.a implements Runnable {
        final LiveData f;

        @Override
        public void run() {
            Object object0;
            synchronized(LiveData.this.a) {
                object0 = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.j(object0);
        }
    }

    class androidx.lifecycle.LiveData.b extends c {
        final LiveData j;

        androidx.lifecycle.LiveData.b(t t0) {
            super(t0);
        }

        @Override  // androidx.lifecycle.LiveData$c
        boolean j() {
            return true;
        }
    }

    abstract class c {
        final t f;
        boolean g;
        int h;
        final LiveData i;

        c(t t0) {
            this.h = -1;
            this.f = t0;
        }

        void h(boolean z) {
            if(z == this.g) {
                return;
            }
            this.g = z;
            LiveData.this.b((z ? 1 : -1));
            if(this.g) {
                LiveData.this.d(this);
            }
        }

        void i() {
        }

        abstract boolean j();
    }

    final Object a;
    private l.b b;
    int c;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;
    static final Object k;

    static {
        LiveData.k = new Object();
    }

    public LiveData() {
        this.a = new Object();
        this.b = new l.b();
        this.c = 0;
        this.f = LiveData.k;
        this.j = new androidx.lifecycle.LiveData.a(this);
        this.e = LiveData.k;
        this.g = -1;
    }

    static void a(String s) {
        if(!k.c.g().b()) {
            throw new IllegalStateException("Cannot invoke " + s + " on a background thread");
        }
    }

    void b(int v) {
        int v1 = this.c;
        this.c = v + v1;
        if(this.d) {
            return;
        }
        this.d = true;
        while(true) {
            int v2 = this.c;
            if(v1 == v2) {
                break;
            }
            v1 = v2;
        }
        this.d = false;
    }

    private void c(c liveData$c0) {
        if(!liveData$c0.g) {
            return;
        }
        if(!liveData$c0.j()) {
            liveData$c0.h(false);
            return;
        }
        int v = this.g;
        if(liveData$c0.h >= v) {
            return;
        }
        liveData$c0.h = v;
        liveData$c0.f.a(this.e);
    }

    void d(c liveData$c0) {
        if(this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if(liveData$c0 == null) {
                d b$d0 = this.b.d();
                while(b$d0.hasNext()) {
                    Object object0 = b$d0.next();
                    this.c(((c)((Map.Entry)object0).getValue()));
                    if(this.i) {
                        break;
                    }
                }
            }
            else {
                this.c(liveData$c0);
                liveData$c0 = null;
            }
        }
        while(this.i);
        this.h = false;
    }

    public void e(t t0) {
        LiveData.a("observeForever");
        androidx.lifecycle.LiveData.b liveData$b0 = new androidx.lifecycle.LiveData.b(this, t0);
        c liveData$c0 = (c)this.b.i(t0, liveData$b0);
        if(liveData$c0 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if(liveData$c0 != null) {
            return;
        }
        liveData$b0.h(true);
    }

    protected void f() {
    }

    protected void g() {
    }

    protected void h(Object object0) {
        synchronized(this.a) {
            boolean z = this.f == LiveData.k;
            this.f = object0;
        }
        if(!z) {
            return;
        }
        k.c.g().c(this.j);
    }

    public void i(t t0) {
        LiveData.a("removeObserver");
        c liveData$c0 = (c)this.b.k(t0);
        if(liveData$c0 == null) {
            return;
        }
        liveData$c0.i();
        liveData$c0.h(false);
    }

    protected void j(Object object0) {
        LiveData.a("setValue");
        ++this.g;
        this.e = object0;
        this.d(null);
    }
}

