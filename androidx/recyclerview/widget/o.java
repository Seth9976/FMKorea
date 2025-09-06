package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class o extends q {
    class a extends s {
        boolean a;
        final o b;

        a() {
            this.a = false;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$s
        public void a(RecyclerView recyclerView0, int v) {
            super.a(recyclerView0, v);
            if(v == 0 && this.a) {
                this.a = false;
                o.this.k();
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$s
        public void b(RecyclerView recyclerView0, int v, int v1) {
            if(v != 0 || v1 != 0) {
                this.a = true;
            }
        }
    }

    RecyclerView a;
    private Scroller b;
    private final s c;

    public o() {
        this.c = new a(this);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$q
    public boolean a(int v, int v1) {
        androidx.recyclerview.widget.RecyclerView.o recyclerView$o0 = this.a.getLayoutManager();
        if(recyclerView$o0 == null) {
            return false;
        }
        if(this.a.getAdapter() == null) {
            return false;
        }
        int v2 = this.a.getMinFlingVelocity();
        return (Math.abs(v1) > v2 || Math.abs(v) > v2) && this.j(recyclerView$o0, v, v1);
    }

    public void b(RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.a;
        if(recyclerView1 == recyclerView0) {
            return;
        }
        if(recyclerView1 != null) {
            this.f();
        }
        this.a = recyclerView0;
        if(recyclerView0 != null) {
            this.i();
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            this.k();
        }
    }

    public abstract int[] c(androidx.recyclerview.widget.RecyclerView.o arg1, View arg2);

    protected x d(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0) {
        return this.e(recyclerView$o0);
    }

    protected abstract g e(androidx.recyclerview.widget.RecyclerView.o arg1);

    private void f() {
        this.a.Z0(this.c);
        this.a.setOnFlingListener(null);
    }

    public abstract View g(androidx.recyclerview.widget.RecyclerView.o arg1);

    public abstract int h(androidx.recyclerview.widget.RecyclerView.o arg1, int arg2, int arg3);

    private void i() {
        if(this.a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.a.k(this.c);
        this.a.setOnFlingListener(this);
    }

    private boolean j(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0, int v, int v1) {
        if(!(recyclerView$o0 instanceof b)) {
            return false;
        }
        x recyclerView$x0 = this.d(recyclerView$o0);
        if(recyclerView$x0 == null) {
            return false;
        }
        int v2 = this.h(recyclerView$o0, v, v1);
        if(v2 == -1) {
            return false;
        }
        recyclerView$x0.p(v2);
        recyclerView$o0.N1(recyclerView$x0);
        return true;
    }

    void k() {
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0 == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.o recyclerView$o0 = recyclerView0.getLayoutManager();
        if(recyclerView$o0 == null) {
            return;
        }
        View view0 = this.g(recyclerView$o0);
        if(view0 == null) {
            return;
        }
        int[] arr_v = this.c(recyclerView$o0, view0);
        int v = arr_v[0];
        if(v != 0 || arr_v[1] != 0) {
            this.a.m1(v, arr_v[1]);
        }
    }
}

