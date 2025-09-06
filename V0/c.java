package v0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import u0.a;
import w0.h;
import x0.u;
import z3.k;

public abstract class c implements a {
    public interface v0.c.a {
        void b(List arg1);

        void c(List arg1);
    }

    private final h a;
    private final List b;
    private final List c;
    private Object d;
    private v0.c.a e;

    public c(h h0) {
        k.e(h0, "tracker");
        super();
        this.a = h0;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override  // u0.a
    public void a(Object object0) {
        this.d = object0;
        this.h(this.e, object0);
    }

    public abstract boolean b(u arg1);

    public abstract boolean c(Object arg1);

    public final boolean d(String s) {
        k.e(s, "workSpecId");
        return this.d != null && this.c(this.d) && this.c.contains(s);
    }

    public final void e(Iterable iterable0) {
        k.e(iterable0, "workSpecs");
        this.b.clear();
        this.c.clear();
        Collection collection0 = this.b;
        for(Object object0: iterable0) {
            if(this.b(((u)object0))) {
                collection0.add(object0);
            }
        }
        Collection collection1 = this.c;
        for(Object object1: this.b) {
            collection1.add(((u)object1).a);
        }
        if(this.b.isEmpty()) {
            this.a.f(this);
        }
        else {
            this.a.c(this);
        }
        this.h(this.e, this.d);
    }

    public final void f() {
        if(!this.b.isEmpty()) {
            this.b.clear();
            this.a.f(this);
        }
    }

    public final void g(v0.c.a c$a0) {
        if(this.e != c$a0) {
            this.e = c$a0;
            this.h(c$a0, this.d);
        }
    }

    private final void h(v0.c.a c$a0, Object object0) {
        if(!this.b.isEmpty() && c$a0 != null) {
            if(object0 != null && !this.c(object0)) {
                c$a0.b(this.b);
                return;
            }
            c$a0.c(this.b);
        }
    }
}

