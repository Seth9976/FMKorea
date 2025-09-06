package androidx.recyclerview.widget;

import C.A;
import C.z;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.Y;
import androidx.core.view.a;
import java.util.Map;
import java.util.WeakHashMap;

public class l extends a {
    public static class androidx.recyclerview.widget.l.a extends a {
        final l d;
        private Map e;

        public androidx.recyclerview.widget.l.a(l l0) {
            this.e = new WeakHashMap();
            this.d = l0;
        }

        @Override  // androidx.core.view.a
        public boolean a(View view0, AccessibilityEvent accessibilityEvent0) {
            a a0 = (a)this.e.get(view0);
            return a0 == null ? super.a(view0, accessibilityEvent0) : a0.a(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.a
        public A b(View view0) {
            a a0 = (a)this.e.get(view0);
            return a0 == null ? super.b(view0) : a0.b(view0);
        }

        @Override  // androidx.core.view.a
        public void f(View view0, AccessibilityEvent accessibilityEvent0) {
            a a0 = (a)this.e.get(view0);
            if(a0 != null) {
                a0.f(view0, accessibilityEvent0);
                return;
            }
            super.f(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.a
        public void g(View view0, z z0) {
            if(!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().S0(view0, z0);
                a a0 = (a)this.e.get(view0);
                if(a0 != null) {
                    a0.g(view0, z0);
                    return;
                }
                super.g(view0, z0);
                return;
            }
            super.g(view0, z0);
        }

        @Override  // androidx.core.view.a
        public void h(View view0, AccessibilityEvent accessibilityEvent0) {
            a a0 = (a)this.e.get(view0);
            if(a0 != null) {
                a0.h(view0, accessibilityEvent0);
                return;
            }
            super.h(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.a
        public boolean i(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            a a0 = (a)this.e.get(viewGroup0);
            return a0 == null ? super.i(viewGroup0, view0, accessibilityEvent0) : a0.i(viewGroup0, view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.a
        public boolean j(View view0, int v, Bundle bundle0) {
            if(!this.d.o() && this.d.d.getLayoutManager() != null) {
                a a0 = (a)this.e.get(view0);
                if(a0 != null) {
                    return a0.j(view0, v, bundle0) ? true : this.d.d.getLayoutManager().m1(view0, v, bundle0);
                }
                return super.j(view0, v, bundle0) ? true : this.d.d.getLayoutManager().m1(view0, v, bundle0);
            }
            return super.j(view0, v, bundle0);
        }

        @Override  // androidx.core.view.a
        public void l(View view0, int v) {
            a a0 = (a)this.e.get(view0);
            if(a0 != null) {
                a0.l(view0, v);
                return;
            }
            super.l(view0, v);
        }

        @Override  // androidx.core.view.a
        public void m(View view0, AccessibilityEvent accessibilityEvent0) {
            a a0 = (a)this.e.get(view0);
            if(a0 != null) {
                a0.m(view0, accessibilityEvent0);
                return;
            }
            super.m(view0, accessibilityEvent0);
        }

        a n(View view0) {
            return (a)this.e.remove(view0);
        }

        void o(View view0) {
            a a0 = Y.l(view0);
            if(a0 != null && a0 != this) {
                this.e.put(view0, a0);
            }
        }
    }

    final RecyclerView d;
    private final androidx.recyclerview.widget.l.a e;

    public l(RecyclerView recyclerView0) {
        this.d = recyclerView0;
        a a0 = this.n();
        if(a0 != null && a0 instanceof androidx.recyclerview.widget.l.a) {
            this.e = (androidx.recyclerview.widget.l.a)a0;
            return;
        }
        this.e = new androidx.recyclerview.widget.l.a(this);
    }

    @Override  // androidx.core.view.a
    public void f(View view0, AccessibilityEvent accessibilityEvent0) {
        super.f(view0, accessibilityEvent0);
        if(view0 instanceof RecyclerView && !this.o() && ((RecyclerView)view0).getLayoutManager() != null) {
            ((RecyclerView)view0).getLayoutManager().O0(accessibilityEvent0);
        }
    }

    @Override  // androidx.core.view.a
    public void g(View view0, z z0) {
        super.g(view0, z0);
        if(!this.o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().Q0(z0);
        }
    }

    @Override  // androidx.core.view.a
    public boolean j(View view0, int v, Bundle bundle0) {
        if(super.j(view0, v, bundle0)) {
            return true;
        }
        return this.o() || this.d.getLayoutManager() == null ? false : this.d.getLayoutManager().k1(v, bundle0);
    }

    public a n() {
        return this.e;
    }

    boolean o() {
        return this.d.m0();
    }
}

