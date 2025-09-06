package N3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z3.g;

public final class s {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final int a(long v) {
            return (v & 0x2000000000000000L) == 0L ? 1 : 2;
        }

        public final long b(long v, int v1) {
            return v & 0xFFFFFFFFC0000000L | ((long)v1);
        }

        public final long c(long v, int v1) {
            return v & 0xF00000003FFFFFFFL | ((long)v1) << 30;
        }

        public final long d(long v, long v1) [...] // Inlined contents
    }

    public static final class b {
        public final int a;

        public b(int v) {
            this.a = v;
        }
    }

    private volatile Object _next;
    private volatile long _state;
    private final int a;
    private final boolean b;
    private final int c;
    private final AtomicReferenceArray d;
    public static final a e;
    private static final AtomicReferenceFieldUpdater f;
    private static final AtomicLongFieldUpdater g;
    public static final F h;

    static {
        s.e = new a(null);
        s.f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");
        s.g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");
        s.h = new F("REMOVE_FROZEN");
    }

    public s(int v, boolean z) {
        this.a = v;
        this.b = z;
        this.c = v - 1;
        this.d = new AtomicReferenceArray(v);
        if(v - 1 > 0x3FFFFFFF || (v & v - 1) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object object0) {
        int v2;
        int v1;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = s.g;
        do {
            while(true) {
                long v = atomicLongFieldUpdater0.get(this);
                if((0x3000000000000000L & v) != 0L) {
                    return s.e.a(v);
                }
                v1 = (int)((0xFFFFFFFC0000000L & v) >> 30);
                v2 = this.c;
                if((v1 + 2 & v2) == (((int)(0x3FFFFFFFL & v)) & v2)) {
                    return 1;
                }
                if(this.b || this.d.get(v1 & v2) == null) {
                    break;
                }
                if(this.a < 0x400 || (v1 - ((int)(0x3FFFFFFFL & v)) & 0x3FFFFFFF) > this.a >> 1) {
                    return 1;
                }
            }
        }
        while(!s.g.compareAndSet(this, v, s.e.c(v, v1 + 1 & 0x3FFFFFFF)));
        this.d.set(v1 & v2, object0);
        s s0 = this;
        while((s.g.get(s0) & 0x1000000000000000L) != 0L) {
            s0 = s0.i().e(v1, object0);
            if(s0 == null) {
                break;
            }
        }
        return 0;
    }

    private final s b(long v) {
        s s0 = new s(this.a * 2, this.b);
        for(int v1 = (int)(0x3FFFFFFFL & v); true; ++v1) {
            int v2 = this.c;
            if((v1 & v2) == (((int)((0xFFFFFFFC0000000L & v) >> 30)) & v2)) {
                break;
            }
            b s$b0 = this.d.get(v2 & v1);
            if(s$b0 == null) {
                s$b0 = new b(v1);
            }
            s0.d.set(s0.c & v1, s$b0);
        }
        s.g.set(s0, v & 0xEFFFFFFFFFFFFFFFL);
        return s0;
    }

    private final s c(long v) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = s.f;
        s s0;
        while((s0 = (s)atomicReferenceFieldUpdater0.get(this)) == null) {
            s s1 = this.b(v);
            androidx.concurrent.futures.b.a(s.f, this, null, s1);
        }
        return s0;
    }

    public final boolean d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = s.g;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            if(Long.compare(v & 0x2000000000000000L, 0L) != 0) {
                return true;
            }
            if((0x1000000000000000L & v) != 0L) {
                return false;
            }
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v, v | 0x2000000000000000L));
        return true;
    }

    private final s e(int v, Object object0) {
        Object object1 = this.d.get(this.c & v);
        if(object1 instanceof b && ((b)object1).a == v) {
            this.d.set(v & this.c, object0);
            return this;
        }
        return null;
    }

    public final int f() {
        long v = s.g.get(this);
        return ((int)((v & 0xFFFFFFFC0000000L) >> 30)) - ((int)(0x3FFFFFFFL & v)) & 0x3FFFFFFF;
    }

    public final boolean g() {
        long v = s.g.get(this);
        return ((int)(0x3FFFFFFFL & v)) == ((int)((v & 0xFFFFFFFC0000000L) >> 30));
    }

    private final long h() {
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = s.g;
        do {
            v = atomicLongFieldUpdater0.get(this);
            if((v & 0x1000000000000000L) != 0L) {
                return v;
            }
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v, v | 0x1000000000000000L));
        return v | 0x1000000000000000L;
    }

    public final s i() {
        return this.c(this.h());
    }

    public final Object j() {
        int v2;
        Object object0;
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = s.g;
        do {
            while(true) {
                v = atomicLongFieldUpdater0.get(this);
                if((0x1000000000000000L & v) != 0L) {
                    return s.h;
                }
                int v1 = this.c;
                if((((int)((0xFFFFFFFC0000000L & v) >> 30)) & v1) == (((int)(0x3FFFFFFFL & v)) & v1)) {
                    return null;
                }
                object0 = this.d.get(v1 & ((int)(0x3FFFFFFFL & v)));
                if(object0 != null) {
                    break;
                }
                if(this.b) {
                    return null;
                }
            }
            if(object0 instanceof b) {
                return null;
            }
            v2 = ((int)(0x3FFFFFFFL & v)) + 1 & 0x3FFFFFFF;
            if(s.g.compareAndSet(this, v, s.e.b(v, v2))) {
                this.d.set(this.c & ((int)(0x3FFFFFFFL & v)), null);
                return object0;
            }
        }
        while(!this.b);
        s s0 = this;
        do {
            s0 = s0.k(((int)(0x3FFFFFFFL & v)), v2);
        }
        while(s0 != null);
        return object0;
    }

    private final s k(int v, int v1) {
        int v3;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = s.g;
        do {
            long v2 = atomicLongFieldUpdater0.get(this);
            v3 = (int)(0x3FFFFFFFL & v2);
            if((0x1000000000000000L & v2) != 0L) {
                return this.i();
            }
        }
        while(!s.g.compareAndSet(this, v2, s.e.b(v2, v1)));
        this.d.set(this.c & v3, null);
        return null;
    }
}

