package z3;

import E3.a;
import java.io.Serializable;
import x3.b;

public abstract class c implements a, Serializable {
    static class z3.c.a implements Serializable {
        private static final z3.c.a f;

        static {
            z3.c.a.f = new z3.c.a();
        }

        static z3.c.a a() {
            return z3.c.a.f;
        }

        private Object readResolve() {
            return z3.c.a.f;
        }
    }

    private transient a f;
    protected final Object g;
    private final Class h;
    private final String i;
    private final String j;
    private final boolean k;
    public static final Object l;

    static {
        c.l = z3.c.a.a();
    }

    protected c(Object object0, Class class0, String s, String s1, boolean z) {
        this.g = object0;
        this.h = class0;
        this.i = s;
        this.j = s1;
        this.k = z;
    }

    public a b() {
        a a0 = this.f;
        if(a0 == null) {
            a0 = this.d();
            this.f = a0;
        }
        return a0;
    }

    protected abstract a d();

    public Object e() {
        return this.g;
    }

    public String i() {
        return this.i;
    }

    public E3.c l() {
        Class class0 = this.h;
        if(class0 == null) {
            return null;
        }
        return this.k ? v.c(class0) : v.b(class0);
    }

    protected a m() {
        a a0 = this.b();
        if(a0 == this) {
            throw new b();
        }
        return a0;
    }

    public String o() {
        return this.j;
    }
}

