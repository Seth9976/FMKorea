package p3;

import java.io.Serializable;
import l3.u;
import y3.p;
import z3.g;
import z3.k;
import z3.t;

public final class e implements Serializable, j {
    static final class a implements Serializable {
        public static final class p3.e.a.a {
            private p3.e.a.a() {
            }

            public p3.e.a.a(g g0) {
            }
        }

        private final j[] f;
        public static final p3.e.a.a g;
        private static final long serialVersionUID;

        static {
            a.g = new p3.e.a.a(null);
        }

        public a(j[] arr_j) {
            k.e(arr_j, "elements");
            super();
            this.f = arr_j;
        }

        private final Object readResolve() {
            j[] arr_j = this.f;
            j j0 = p3.k.f;
            for(int v = 0; v < arr_j.length; ++v) {
                j0 = j0.N(arr_j[v]);
            }
            return j0;
        }
    }

    private final j f;
    private final b g;

    public e(j j0, b j$b0) {
        k.e(j0, "left");
        k.e(j$b0, "element");
        super();
        this.f = j0;
        this.g = j$b0;
    }

    @Override  // p3.j
    public j N(j j0) {
        return p3.j.a.b(this, j0);
    }

    @Override  // p3.j
    public j U(c j$c0) {
        k.e(j$c0, "key");
        if(this.g.a(j$c0) != null) {
            return this.f;
        }
        j j0 = this.f.U(j$c0);
        if(j0 == this.f) {
            return this;
        }
        return j0 == p3.k.f ? this.g : new e(j0, this.g);
    }

    @Override  // p3.j
    public Object Y(Object object0, p p0) {
        k.e(p0, "operation");
        return p0.k(this.f.Y(object0, p0), this.g);
    }

    @Override  // p3.j
    public b a(c j$c0) {
        j j0;
        k.e(j$c0, "key");
        for(e e0 = this; true; e0 = (e)j0) {
            b j$b0 = e0.g.a(j$c0);
            if(j$b0 != null) {
                return j$b0;
            }
            j0 = e0.f;
            if(!(j0 instanceof e)) {
                break;
            }
        }
        return j0.a(j$c0);
    }

    // 检测为 Lambda 实现
    public static String b(String s, b j$b0) [...]

    // 检测为 Lambda 实现
    public static u c(j[] arr_j, t t0, u u0, b j$b0) [...]

    private final boolean d(b j$b0) {
        return k.a(this.a(j$b0.getKey()), j$b0);
    }

    private final boolean e(e e0) {
        j j0;
        while(true) {
            if(!this.d(e0.g)) {
                return false;
            }
            j0 = e0.f;
            if(!(j0 instanceof e)) {
                break;
            }
            e0 = (e)j0;
        }
        k.c(j0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return this.d(((b)j0));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return this == object0 || object0 instanceof e && ((e)object0).h() == this.h() && ((e)object0).e(this);
    }

    private final int h() {
        int v = 2;
        e e0 = this;
        while(true) {
            e0 = e0.f instanceof e ? ((e)e0.f) : null;
            if(e0 == null) {
                break;
            }
            ++v;
        }
        return v;
    }

    @Override
    public int hashCode() {
        return this.f.hashCode() + this.g.hashCode();
    }

    private static final String i(String s, b j$b0) {
        k.e(s, "acc");
        k.e(j$b0, "element");
        return s.length() == 0 ? j$b0.toString() : s + ", " + j$b0;
    }

    private static final u k(j[] arr_j, t t0, u u0, b j$b0) {
        k.e(u0, "<unused var>");
        k.e(j$b0, "element");
        int v = t0.f;
        t0.f = v + 1;
        arr_j[v] = j$b0;
        return u.a;
    }

    @Override
    public String toString() {
        return '[' + ((String)this.Y("", (String s, b j$b0) -> e.i(s, j$b0))) + ']';
    }

    private final Object writeReplace() {
        int v = this.h();
        j[] arr_j = new j[v];
        t t0 = new t();
        p3.c c0 = (u u0, b j$b0) -> e.k(arr_j, t0, u0, j$b0);
        this.Y(u.a, c0);
        if(t0.f != v) {
            throw new IllegalStateException("Check failed.");
        }
        return new a(arr_j);
    }
}

