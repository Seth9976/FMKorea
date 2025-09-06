package u0;

import java.util.ArrayList;
import java.util.List;
import v0.b;
import v0.c.a;
import v0.f;
import v0.g;
import v0.h;
import w0.o;
import x0.u;
import z3.k;

public final class e implements d, a {
    private final c a;
    private final v0.c[] b;
    private final Object c;

    public e(c c0, v0.c[] arr_c) {
        k.e(arr_c, "constraintControllers");
        super();
        this.a = c0;
        this.b = arr_c;
        this.c = new Object();
    }

    public e(o o0, c c0) {
        k.e(o0, "trackers");
        this(c0, new v0.c[]{new v0.a(o0.a()), new b(o0.b()), new h(o0.d()), new v0.d(o0.c()), new g(o0.c()), new f(o0.c()), new v0.e(o0.c())});
    }

    @Override  // u0.d
    public void a(Iterable iterable0) {
        k.e(iterable0, "workSpecs");
        synchronized(this.c) {
            v0.c[] arr_c = this.b;
            for(int v2 = 0; v2 < arr_c.length; ++v2) {
                arr_c[v2].g(null);
            }
            v0.c[] arr_c1 = this.b;
            for(int v3 = 0; v3 < arr_c1.length; ++v3) {
                arr_c1[v3].e(iterable0);
            }
            v0.c[] arr_c2 = this.b;
            for(int v1 = 0; v1 < arr_c2.length; ++v1) {
                arr_c2[v1].g(this);
            }
        }
    }

    @Override  // v0.c$a
    public void b(List list0) {
        k.e(list0, "workSpecs");
        synchronized(this.c) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                if(this.e(((u)object1).a)) {
                    arrayList0.add(object1);
                }
            }
            for(Object object2: arrayList0) {
                androidx.work.k.e().a("WM-WorkConstraintsTrack", "Constraints met for " + ((u)object2));
            }
            c c0 = this.a;
            if(c0 != null) {
                c0.e(arrayList0);
            }
        }
    }

    @Override  // v0.c$a
    public void c(List list0) {
        k.e(list0, "workSpecs");
        synchronized(this.c) {
            c c0 = this.a;
            if(c0 != null) {
                c0.a(list0);
            }
        }
    }

    @Override  // u0.d
    public void d() {
        synchronized(this.c) {
            v0.c[] arr_c = this.b;
            for(int v1 = 0; v1 < arr_c.length; ++v1) {
                arr_c[v1].f();
            }
        }
    }

    public final boolean e(String s) {
        v0.c c0;
        k.e(s, "workSpecId");
        synchronized(this.c) {
            v0.c[] arr_c = this.b;
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                c0 = null;
                if(v1 >= arr_c.length) {
                    break;
                }
                v0.c c1 = arr_c[v1];
                if(c1.d(s)) {
                    c0 = c1;
                    break;
                }
            }
            if(c0 != null) {
                androidx.work.k.e().a("WM-WorkConstraintsTrack", "Work " + s + " constrained by " + c0.getClass().getSimpleName());
            }
            if(c0 == null) {
                z = true;
            }
            return z;
        }
    }
}

