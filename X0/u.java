package x0;

import androidx.appcompat.app.E;
import androidx.work.c;
import androidx.work.d;
import androidx.work.o;
import androidx.work.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z3.g;
import z3.k;

public final class u {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public static final class b {
        public String a;
        public t b;

        public b(String s, t t0) {
            k.e(s, "id");
            k.e(t0, "state");
            super();
            this.a = s;
            this.b = t0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            return k.a(this.a, ((b)object0).a) ? this.b == ((b)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }

        @Override
        public String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    public final String a;
    public t b;
    public String c;
    public String d;
    public d e;
    public d f;
    public long g;
    public long h;
    public long i;
    public c j;
    public int k;
    public androidx.work.a l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public o r;
    private int s;
    private final int t;
    public static final a u;
    private static final String v;
    public static final m.a w;

    static {
        u.u = new a(null);
        k.d("WM-WorkSpec", "tagWithPrefix(\"WorkSpec\")");
        u.v = "WM-WorkSpec";
        u.w = (List list0) -> u.b(list0);
    }

    public u(String s, t t0, String s1, String s2, d d0, d d1, long v, long v1, long v2, c c0, int v3, androidx.work.a a0, long v4, long v5, long v6, long v7, boolean z, o o0, int v8, int v9) {
        k.e(s, "id");
        k.e(t0, "state");
        k.e(s1, "workerClassName");
        k.e(d0, "input");
        k.e(d1, "output");
        k.e(c0, "constraints");
        k.e(a0, "backoffPolicy");
        k.e(o0, "outOfQuotaPolicy");
        super();
        this.a = s;
        this.b = t0;
        this.c = s1;
        this.d = s2;
        this.e = d0;
        this.f = d1;
        this.g = v;
        this.h = v1;
        this.i = v2;
        this.j = c0;
        this.k = v3;
        this.l = a0;
        this.m = v4;
        this.n = v5;
        this.o = v6;
        this.p = v7;
        this.q = z;
        this.r = o0;
        this.s = v8;
        this.t = v9;
    }

    public u(String s, t t0, String s1, String s2, d d0, d d1, long v, long v1, long v2, c c0, int v3, androidx.work.a a0, long v4, long v5, long v6, long v7, boolean z, o o0, int v8, int v9, int v10, g g0) {
        d d3;
        d d2;
        t t1 = (v10 & 2) == 0 ? t0 : t.f;
        if((v10 & 16) == 0) {
            d2 = d0;
        }
        else {
            k.d(d.c, "EMPTY");
            d2 = d.c;
        }
        if((v10 & 0x20) == 0) {
            d3 = d1;
        }
        else {
            k.d(d.c, "EMPTY");
            d3 = d.c;
        }
        this(s, t1, s1, ((v10 & 8) == 0 ? s2 : null), d2, d3, ((v10 & 0x40) == 0 ? v : 0L), ((v10 & 0x80) == 0 ? v1 : 0L), ((v10 & 0x100) == 0 ? v2 : 0L), ((v10 & 0x200) == 0 ? c0 : c.j), ((v10 & 0x400) == 0 ? v3 : 0), ((v10 & 0x800) == 0 ? a0 : androidx.work.a.f), ((v10 & 0x1000) == 0 ? v4 : 30000L), ((v10 & 0x2000) == 0 ? v5 : 0L), ((v10 & 0x4000) == 0 ? v6 : 0L), ((0x8000 & v10) == 0 ? v7 : -1L), ((0x10000 & v10) == 0 ? z : false), ((0x20000 & v10) == 0 ? o0 : o.f), ((0x40000 & v10) == 0 ? v8 : 0), ((v10 & 0x80000) == 0 ? v9 : 0));
    }

    public u(String s, String s1) {
        k.e(s, "id");
        k.e(s1, "workerClassName_");
        this(s, null, s1, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0xFFFFA, null);
    }

    public u(String s, u u0) {
        k.e(s, "newId");
        k.e(u0, "other");
        this(s, u0.b, u0.c, u0.d, new d(u0.e), new d(u0.f), u0.g, u0.h, u0.i, new c(u0.j), u0.k, u0.l, u0.m, u0.n, u0.o, u0.p, u0.q, u0.r, u0.s, 0, 0x80000, null);
    }

    // 检测为 Lambda 实现
    public static List a(List list0) [...]

    private static final List b(List list0) {
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(m3.o.n(list0, 10));
            Iterator iterator0 = list0.iterator();
            if(!iterator0.hasNext()) {
                return arrayList0;
            }
            Object object0 = iterator0.next();
            E.a(object0);
            throw null;
        }
        return null;
    }

    public final long c() {
        long v = 0L;
        if(this.i()) {
            return this.l == androidx.work.a.g ? this.n + D3.d.c(this.m * ((long)this.k), 18000000L) : this.n + D3.d.c(((long)Math.scalb(this.m, this.k - 1)), 18000000L);
        }
        if(this.j()) {
            int v1 = this.s;
            long v2 = v1 == 0 ? this.n + this.g : this.n;
            long v3 = this.i;
            long v4 = this.h;
            if(v3 != v4) {
                if(v1 == 0) {
                    v = -v3;
                }
                return v2 + v4 + v;
            }
            return v1 == 0 ? v2 : v2 + v4;
        }
        return (this.n == 0L ? System.currentTimeMillis() : this.n) + this.g;
    }

    public final u d(String s, t t0, String s1, String s2, d d0, d d1, long v, long v1, long v2, c c0, int v3, androidx.work.a a0, long v4, long v5, long v6, long v7, boolean z, o o0, int v8, int v9) {
        k.e(s, "id");
        k.e(t0, "state");
        k.e(s1, "workerClassName");
        k.e(d0, "input");
        k.e(d1, "output");
        k.e(c0, "constraints");
        k.e(a0, "backoffPolicy");
        k.e(o0, "outOfQuotaPolicy");
        return new u(s, t0, s1, s2, d0, d1, v, v1, v2, c0, v3, a0, v4, v5, v6, v7, z, o0, v8, v9);
    }

    public static u e(u u0, String s, t t0, String s1, String s2, d d0, d d1, long v, long v1, long v2, c c0, int v3, androidx.work.a a0, long v4, long v5, long v6, long v7, boolean z, o o0, int v8, int v9, int v10, Object object0) {
        String s3 = (v10 & 1) == 0 ? s : u0.a;
        t t1 = (v10 & 2) == 0 ? t0 : u0.b;
        String s4 = (v10 & 4) == 0 ? s1 : u0.c;
        String s5 = (v10 & 8) == 0 ? s2 : u0.d;
        d d2 = (v10 & 16) == 0 ? d0 : u0.e;
        d d3 = (v10 & 0x20) == 0 ? d1 : u0.f;
        long v11 = (v10 & 0x40) == 0 ? v : u0.g;
        long v12 = (v10 & 0x80) == 0 ? v1 : u0.h;
        long v13 = (v10 & 0x100) == 0 ? v2 : u0.i;
        c c1 = (v10 & 0x200) == 0 ? c0 : u0.j;
        int v14 = (v10 & 0x400) == 0 ? v3 : u0.k;
        androidx.work.a a1 = (v10 & 0x800) == 0 ? a0 : u0.l;
        long v15 = (v10 & 0x1000) == 0 ? v4 : u0.m;
        long v16 = (v10 & 0x2000) == 0 ? v5 : u0.n;
        long v17 = (v10 & 0x4000) == 0 ? v6 : u0.o;
        long v18 = (v10 & 0x8000) == 0 ? v7 : u0.p;
        boolean z1 = (v10 & 0x10000) == 0 ? z : u0.q;
        o o1 = (0x20000 & v10) == 0 ? o0 : u0.r;
        int v19 = (v10 & 0x40000) == 0 ? v8 : u0.s;
        return (v10 & 0x80000) == 0 ? u0.d(s3, t1, s4, s5, d2, d3, v11, v12, v13, c1, v14, a1, v15, v16, v17, v18, z1, o1, v19, v9) : u0.d(s3, t1, s4, s5, d2, d3, v11, v12, v13, c1, v14, a1, v15, v16, v17, v18, z1, o1, v19, u0.t);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        u u0 = (u)object0;
        if(!k.a(this.a, u0.a)) {
            return false;
        }
        if(this.b != u0.b) {
            return false;
        }
        if(!k.a(this.c, u0.c)) {
            return false;
        }
        if(!k.a(this.d, u0.d)) {
            return false;
        }
        if(!k.a(this.e, u0.e)) {
            return false;
        }
        if(!k.a(this.f, u0.f)) {
            return false;
        }
        if(this.g != u0.g) {
            return false;
        }
        if(this.h != u0.h) {
            return false;
        }
        if(this.i != u0.i) {
            return false;
        }
        if(!k.a(this.j, u0.j)) {
            return false;
        }
        if(this.k != u0.k) {
            return false;
        }
        if(this.l != u0.l) {
            return false;
        }
        if(this.m != u0.m) {
            return false;
        }
        if(this.n != u0.n) {
            return false;
        }
        if(this.o != u0.o) {
            return false;
        }
        if(this.p != u0.p) {
            return false;
        }
        if(this.q != u0.q) {
            return false;
        }
        if(this.r != u0.r) {
            return false;
        }
        return this.s == u0.s ? this.t == u0.t : false;
    }

    public final int f() {
        return this.t;
    }

    public final int g() {
        return this.s;
    }

    public final boolean h() {
        return !k.a(c.j, this.j);
    }

    @Override
    public int hashCode() {
        int v = ((((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + androidx.privacysandbox.ads.adservices.topics.d.a(this.g)) * 0x1F + androidx.privacysandbox.ads.adservices.topics.d.a(this.h)) * 0x1F + androidx.privacysandbox.ads.adservices.topics.d.a(this.i)) * 0x1F + this.j.hashCode()) * 0x1F + this.k) * 0x1F;
        int v1 = this.l.hashCode();
        int v2 = androidx.privacysandbox.ads.adservices.topics.d.a(this.m);
        int v3 = androidx.privacysandbox.ads.adservices.topics.d.a(this.n);
        int v4 = androidx.privacysandbox.ads.adservices.topics.d.a(this.o);
        int v5 = androidx.privacysandbox.ads.adservices.topics.d.a(this.p);
        int v6 = this.q;
        if(v6) {
            v6 = 1;
        }
        return ((((((((v + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + this.r.hashCode()) * 0x1F + this.s) * 0x1F + this.t;
    }

    public final boolean i() {
        return this.b == t.f && this.k > 0;
    }

    public final boolean j() {
        return this.h != 0L;
    }

    @Override
    public String toString() {
        return "{WorkSpec: " + this.a + '}';
    }
}

