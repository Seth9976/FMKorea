package androidx.work;

import android.net.Uri;
import android.os.Build.VERSION;
import java.util.LinkedHashSet;
import java.util.Set;
import m3.L;
import m3.o;
import z3.g;
import z3.k;

public final class c {
    public static final class a {
        private boolean a;
        private boolean b;
        private l c;
        private boolean d;
        private boolean e;
        private long f;
        private long g;
        private Set h;

        public a() {
            this.c = l.f;
            this.f = -1L;
            this.g = -1L;
            this.h = new LinkedHashSet();
        }

        public final c a() {
            Set set0;
            if(Build.VERSION.SDK_INT >= 24) {
                set0 = o.I(this.h);
                return new c(this.c, this.a, this.b, this.d, this.e, this.f, this.g, set0);
            }
            set0 = L.e();
            return new c(this.c, this.a, this.b, this.d, this.e, -1L, -1L, set0);
        }

        public final a b(l l0) {
            k.e(l0, "networkType");
            this.c = l0;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public b(g g0) {
        }
    }

    public static final class androidx.work.c.c {
        private final Uri a;
        private final boolean b;

        public androidx.work.c.c(Uri uri0, boolean z) {
            k.e(uri0, "uri");
            super();
            this.a = uri0;
            this.b = z;
        }

        public final Uri a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            Class class0 = object0 == null ? null : object0.getClass();
            if(!k.a(androidx.work.c.c.class, class0)) {
                return false;
            }
            k.c(object0, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            return k.a(this.a, ((androidx.work.c.c)object0).a) ? this.b == ((androidx.work.c.c)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + androidx.privacysandbox.ads.adservices.topics.a.a(this.b);
        }
    }

    private final l a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final long g;
    private final Set h;
    public static final b i;
    public static final c j;

    static {
        c.i = new b(null);
        c.j = new c(null, false, false, false, false, 0L, 0L, null, 0xFF, null);
    }

    public c(c c0) {
        k.e(c0, "other");
        this(c0.a, c0.b, c0.c, c0.d, c0.e, c0.f, c0.g, c0.h);
    }

    public c(l l0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, Set set0) {
        k.e(l0, "requiredNetworkType");
        k.e(set0, "contentUriTriggers");
        super();
        this.a = l0;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = v;
        this.g = v1;
        this.h = set0;
    }

    public c(l l0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, Set set0, int v2, g g0) {
        this(((v2 & 1) == 0 ? l0 : l.f), ((v2 & 2) == 0 ? z : false), ((v2 & 4) == 0 ? z1 : false), ((v2 & 8) == 0 ? z2 : false), ((v2 & 16) == 0 ? z3 : false), ((v2 & 0x20) == 0 ? v : -1L), ((v2 & 0x40) == 0 ? v1 : -1L), ((v2 & 0x80) == 0 ? set0 : L.e()));
    }

    public final long a() {
        return this.g;
    }

    public final long b() {
        return this.f;
    }

    public final Set c() {
        return this.h;
    }

    public final l d() {
        return this.a;
    }

    public final boolean e() {
        return !this.h.isEmpty();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!k.a(c.class, class0) || this.b != ((c)object0).b) {
                return false;
            }
            if(this.c != ((c)object0).c) {
                return false;
            }
            if(this.d != ((c)object0).d) {
                return false;
            }
            if(this.e != ((c)object0).e) {
                return false;
            }
            if(this.f != ((c)object0).f) {
                return false;
            }
            if(this.g != ((c)object0).g) {
                return false;
            }
            return this.a == ((c)object0).a ? k.a(this.h, ((c)object0).h) : false;
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return ((((((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + ((int)(this.f ^ this.f >>> 0x20))) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + this.h.hashCode();
    }

    public final boolean i() {
        return this.e;
    }
}

