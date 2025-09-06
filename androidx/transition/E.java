package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.d;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public class e extends C {
    @Override  // androidx.fragment.app.C
    public void a(Object object0, View view0) {
        if(object0 != null) {
            ((k)object0).c(view0);
        }
    }

    @Override  // androidx.fragment.app.C
    public void b(Object object0, ArrayList arrayList0) {
        int v = 0;
        if(((k)object0) == null) {
            return;
        }
        if(((k)object0) instanceof v) {
            int v1 = ((v)(((k)object0))).m0();
            while(v < v1) {
                this.b(((v)(((k)object0))).l0(v), arrayList0);
                ++v;
            }
            return;
        }
        if(!e.w(((k)object0)) && C.i(((k)object0).F())) {
            int v2 = arrayList0.size();
            while(v < v2) {
                ((k)object0).c(((View)arrayList0.get(v)));
                ++v;
            }
        }
    }

    @Override  // androidx.fragment.app.C
    public void c(ViewGroup viewGroup0, Object object0) {
        t.a(viewGroup0, ((k)object0));
    }

    @Override  // androidx.fragment.app.C
    public boolean e(Object object0) {
        return object0 instanceof k;
    }

    @Override  // androidx.fragment.app.C
    public Object f(Object object0) {
        return object0 != null ? ((k)object0).o() : null;
    }

    @Override  // androidx.fragment.app.C
    public Object j(Object object0, Object object1, Object object2) {
        k k0 = (k)object0;
        if(k0 != null && ((k)object1) != null) {
            k0 = new v().j0(k0).j0(((k)object1)).r0(1);
        }
        else if(k0 == null) {
            k0 = ((k)object1) == null ? null : ((k)object1);
        }
        if(((k)object2) != null) {
            v v0 = new v();
            if(k0 != null) {
                v0.j0(k0);
            }
            v0.j0(((k)object2));
            return v0;
        }
        return k0;
    }

    @Override  // androidx.fragment.app.C
    public Object k(Object object0, Object object1, Object object2) {
        v v0 = new v();
        if(object0 != null) {
            v0.j0(((k)object0));
        }
        if(object1 != null) {
            v0.j0(((k)object1));
        }
        if(object2 != null) {
            v0.j0(((k)object2));
        }
        return v0;
    }

    @Override  // androidx.fragment.app.C
    public void m(Object object0, View view0, ArrayList arrayList0) {
        class b implements f {
            final View a;
            final ArrayList b;
            final e c;

            b(View view0, ArrayList arrayList0) {
                this.a = view0;
                this.b = arrayList0;
                super();
            }

            @Override  // androidx.transition.k$f
            public void a(k k0) {
                k0.U(this);
                k0.b(this);
            }

            @Override  // androidx.transition.k$f
            public void b(k k0) {
            }

            @Override  // androidx.transition.k$f
            public void c(k k0, boolean z) {
                l.a(this, k0, z);
            }

            @Override  // androidx.transition.k$f
            public void d(k k0) {
                k0.U(this);
                this.a.setVisibility(8);
                int v = this.b.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((View)this.b.get(v1)).setVisibility(0);
                }
            }

            @Override  // androidx.transition.k$f
            public void e(k k0) {
            }

            @Override  // androidx.transition.k$f
            public void f(k k0, boolean z) {
                l.b(this, k0, z);
            }

            @Override  // androidx.transition.k$f
            public void g(k k0) {
            }
        }

        ((k)object0).b(new b(this, view0, arrayList0));
    }

    @Override  // androidx.fragment.app.C
    public void n(Object object0, Object object1, ArrayList arrayList0, Object object2, ArrayList arrayList1, Object object3, ArrayList arrayList2) {
        class c extends s {
            final Object a;
            final ArrayList b;
            final Object c;
            final ArrayList d;
            final Object e;
            final ArrayList f;
            final e g;

            c(Object object0, ArrayList arrayList0, Object object1, ArrayList arrayList1, Object object2, ArrayList arrayList2) {
                this.a = object0;
                this.b = arrayList0;
                this.c = object1;
                this.d = arrayList1;
                this.e = object2;
                this.f = arrayList2;
                super();
            }

            @Override  // androidx.transition.s
            public void a(k k0) {
                Object object0 = this.a;
                if(object0 != null) {
                    e.this.y(object0, this.b, null);
                }
                Object object1 = this.c;
                if(object1 != null) {
                    e.this.y(object1, this.d, null);
                }
                Object object2 = this.e;
                if(object2 != null) {
                    e.this.y(object2, this.f, null);
                }
            }

            @Override  // androidx.transition.k$f
            public void d(k k0) {
                k0.U(this);
            }
        }

        ((k)object0).b(new c(this, object1, arrayList0, object2, arrayList1, object3, arrayList2));
    }

    @Override  // androidx.fragment.app.C
    public void o(Object object0, Rect rect0) {
        class androidx.transition.e.e extends androidx.transition.k.e {
            final Rect a;
            final e b;

            androidx.transition.e.e(Rect rect0) {
                this.a = rect0;
                super();
            }
        }

        if(object0 != null) {
            ((k)object0).a0(new androidx.transition.e.e(this, rect0));
        }
    }

    @Override  // androidx.fragment.app.C
    public void p(Object object0, View view0) {
        class a extends androidx.transition.k.e {
            final Rect a;
            final e b;

            a(Rect rect0) {
                this.a = rect0;
                super();
            }
        }

        if(view0 != null) {
            Rect rect0 = new Rect();
            this.h(view0, rect0);
            ((k)object0).a0(new a(this, rect0));
        }
    }

    @Override  // androidx.fragment.app.C
    public void q(Fragment fragment0, Object object0, d d0, Runnable runnable0) {
        this.z(fragment0, object0, d0, null, runnable0);
    }

    @Override  // androidx.fragment.app.C
    public void s(Object object0, View view0, ArrayList arrayList0) {
        List list0 = ((v)object0).F();
        list0.clear();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            C.d(list0, ((View)arrayList0.get(v1)));
        }
        list0.add(view0);
        arrayList0.add(view0);
        this.b(((v)object0), arrayList0);
    }

    @Override  // androidx.fragment.app.C
    public void t(Object object0, ArrayList arrayList0, ArrayList arrayList1) {
        if(((v)object0) != null) {
            ((v)object0).F().clear();
            ((v)object0).F().addAll(arrayList1);
            this.y(((v)object0), arrayList0, arrayList1);
        }
    }

    @Override  // androidx.fragment.app.C
    public Object u(Object object0) {
        if(object0 == null) {
            return null;
        }
        v v0 = new v();
        v0.j0(((k)object0));
        return v0;
    }

    // 去混淆评级： 低(30)
    private static boolean w(k k0) {
        return !C.i(k0.C()) || !C.i(k0.D()) || !C.i(k0.E());
    }

    // 检测为 Lambda 实现
    private static void x(Runnable runnable0, k k0, Runnable runnable1) [...]

    public void y(Object object0, ArrayList arrayList0, ArrayList arrayList1) {
        int v = 0;
        if(((k)object0) instanceof v) {
            int v1 = ((v)(((k)object0))).m0();
            while(v < v1) {
                this.y(((v)(((k)object0))).l0(v), arrayList0, arrayList1);
                ++v;
            }
            return;
        }
        if(!e.w(((k)object0))) {
            List list0 = ((k)object0).F();
            if(list0.size() == arrayList0.size() && list0.containsAll(arrayList0)) {
                int v2 = arrayList1 == null ? 0 : arrayList1.size();
                while(v < v2) {
                    ((k)object0).c(((View)arrayList1.get(v)));
                    ++v;
                }
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    ((k)object0).V(((View)arrayList0.get(v3)));
                }
            }
        }
    }

    public void z(Fragment fragment0, Object object0, d d0, Runnable runnable0, Runnable runnable1) {
        class androidx.transition.e.d implements f {
            final Runnable a;
            final e b;

            androidx.transition.e.d(Runnable runnable0) {
                this.a = runnable0;
                super();
            }

            @Override  // androidx.transition.k$f
            public void a(k k0) {
            }

            @Override  // androidx.transition.k$f
            public void b(k k0) {
            }

            @Override  // androidx.transition.k$f
            public void c(k k0, boolean z) {
                l.a(this, k0, z);
            }

            @Override  // androidx.transition.k$f
            public void d(k k0) {
                this.a.run();
            }

            @Override  // androidx.transition.k$f
            public void e(k k0) {
            }

            @Override  // androidx.transition.k$f
            public void f(k k0, boolean z) {
                l.b(this, k0, z);
            }

            @Override  // androidx.transition.k$f
            public void g(k k0) {
            }
        }

        d0.b(() -> {
            if(runnable0 == null) {
                ((k)object0).g();
                runnable1.run();
                return;
            }
            runnable0.run();
        });
        ((k)object0).b(new androidx.transition.e.d(this, runnable1));
    }
}

