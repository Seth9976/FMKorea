package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class v extends k {
    static class b extends s {
        v a;

        b(v v0) {
            this.a = v0;
        }

        @Override  // androidx.transition.s
        public void a(k k0) {
            v v0 = this.a;
            if(!v0.U) {
                v0.f0();
                this.a.U = true;
            }
        }

        @Override  // androidx.transition.k$f
        public void d(k k0) {
            v v0 = this.a;
            int v1 = v0.T - 1;
            v0.T = v1;
            if(v1 == 0) {
                v0.U = false;
                v0.r();
            }
            k0.U(this);
        }
    }

    ArrayList R;
    private boolean S;
    int T;
    boolean U;
    private int V;

    public v() {
        this.R = new ArrayList();
        this.S = true;
        this.U = false;
        this.V = 0;
    }

    @Override  // androidx.transition.k
    public void S(View view0) {
        super.S(view0);
        int v = this.R.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((k)this.R.get(v1)).S(view0);
        }
    }

    @Override  // androidx.transition.k
    public k U(f k$f0) {
        return this.n0(k$f0);
    }

    @Override  // androidx.transition.k
    public k V(View view0) {
        return this.o0(view0);
    }

    @Override  // androidx.transition.k
    public void W(View view0) {
        super.W(view0);
        int v = this.R.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((k)this.R.get(v1)).W(view0);
        }
    }

    @Override  // androidx.transition.k
    protected void Y() {
        class a extends s {
            final k a;
            final v b;

            a(k k0) {
                this.a = k0;
                super();
            }

            @Override  // androidx.transition.k$f
            public void d(k k0) {
                this.a.Y();
                k0.U(this);
            }
        }

        if(this.R.isEmpty()) {
            this.f0();
            this.r();
            return;
        }
        this.t0();
        if(this.S) {
            for(Object object0: this.R) {
                ((k)object0).Y();
            }
        }
        else {
            for(int v = 1; v < this.R.size(); ++v) {
                ((k)this.R.get(v - 1)).b(new a(this, ((k)this.R.get(v))));
            }
            k k0 = (k)this.R.get(0);
            if(k0 != null) {
                k0.Y();
            }
        }
    }

    @Override  // androidx.transition.k
    public k Z(long v) {
        return this.p0(v);
    }

    @Override  // androidx.transition.k
    public void a0(e k$e0) {
        super.a0(k$e0);
        this.V |= 8;
        int v = this.R.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((k)this.R.get(v1)).a0(k$e0);
        }
    }

    @Override  // androidx.transition.k
    public k b(f k$f0) {
        return this.h0(k$f0);
    }

    @Override  // androidx.transition.k
    public k b0(TimeInterpolator timeInterpolator0) {
        return this.q0(timeInterpolator0);
    }

    @Override  // androidx.transition.k
    public k c(View view0) {
        return this.i0(view0);
    }

    @Override  // androidx.transition.k
    public void c0(g g0) {
        super.c0(g0);
        this.V |= 4;
        if(this.R != null) {
            for(int v = 0; v < this.R.size(); ++v) {
                ((k)this.R.get(v)).c0(g0);
            }
        }
    }

    @Override  // androidx.transition.k
    public Object clone() {
        return this.o();
    }

    @Override  // androidx.transition.k
    public void d0(u u0) {
        super.d0(u0);
        this.V |= 2;
        int v = this.R.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((k)this.R.get(v1)).d0(u0);
        }
    }

    @Override  // androidx.transition.k
    public k e0(long v) {
        return this.s0(v);
    }

    @Override  // androidx.transition.k
    protected void g() {
        super.g();
        int v = this.R.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((k)this.R.get(v1)).g();
        }
    }

    @Override  // androidx.transition.k
    String g0(String s) {
        String s1 = super.g0(s);
        for(int v = 0; v < this.R.size(); ++v) {
            s1 = s1 + "\n" + ((k)this.R.get(v)).g0(s + "  ");
        }
        return s1;
    }

    public v h0(f k$f0) {
        return (v)super.b(k$f0);
    }

    @Override  // androidx.transition.k
    public void i(x x0) {
        if(this.J(x0.b)) {
            for(Object object0: this.R) {
                k k0 = (k)object0;
                if(k0.J(x0.b)) {
                    k0.i(x0);
                    x0.c.add(k0);
                }
            }
        }
    }

    public v i0(View view0) {
        for(int v = 0; v < this.R.size(); ++v) {
            ((k)this.R.get(v)).c(view0);
        }
        return (v)super.c(view0);
    }

    public v j0(k k0) {
        this.k0(k0);
        long v = this.h;
        if(v >= 0L) {
            k0.Z(v);
        }
        if((this.V & 1) != 0) {
            k0.b0(this.u());
        }
        if((this.V & 2) != 0) {
            k0.d0(null);
        }
        if((this.V & 4) != 0) {
            k0.c0(this.x());
        }
        if((this.V & 8) != 0) {
            k0.a0(this.t());
        }
        return this;
    }

    @Override  // androidx.transition.k
    void k(x x0) {
        super.k(x0);
        int v = this.R.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((k)this.R.get(v1)).k(x0);
        }
    }

    private void k0(k k0) {
        this.R.add(k0);
        k0.w = this;
    }

    @Override  // androidx.transition.k
    public void l(x x0) {
        if(this.J(x0.b)) {
            for(Object object0: this.R) {
                k k0 = (k)object0;
                if(k0.J(x0.b)) {
                    k0.l(x0);
                    x0.c.add(k0);
                }
            }
        }
    }

    public k l0(int v) {
        return v < 0 || v >= this.R.size() ? null : ((k)this.R.get(v));
    }

    public int m0() {
        return this.R.size();
    }

    public v n0(f k$f0) {
        return (v)super.U(k$f0);
    }

    @Override  // androidx.transition.k
    public k o() {
        k k0 = (v)super.o();
        k0.R = new ArrayList();
        int v = this.R.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((v)k0).k0(((k)this.R.get(v1)).o());
        }
        return k0;
    }

    public v o0(View view0) {
        for(int v = 0; v < this.R.size(); ++v) {
            ((k)this.R.get(v)).V(view0);
        }
        return (v)super.V(view0);
    }

    public v p0(long v) {
        super.Z(v);
        if(this.h >= 0L) {
            ArrayList arrayList0 = this.R;
            if(arrayList0 != null) {
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((k)this.R.get(v2)).Z(v);
                }
            }
        }
        return this;
    }

    @Override  // androidx.transition.k
    void q(ViewGroup viewGroup0, y y0, y y1, ArrayList arrayList0, ArrayList arrayList1) {
        long v = this.B();
        int v1 = this.R.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            k k0 = (k)this.R.get(v2);
            if(v > 0L && (this.S || v2 == 0)) {
                long v3 = k0.B();
                if(v3 > 0L) {
                    k0.e0(v3 + v);
                }
                else {
                    k0.e0(v);
                }
            }
            k0.q(viewGroup0, y0, y1, arrayList0, arrayList1);
        }
    }

    public v q0(TimeInterpolator timeInterpolator0) {
        this.V |= 1;
        ArrayList arrayList0 = this.R;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((k)this.R.get(v1)).b0(timeInterpolator0);
            }
        }
        return (v)super.b0(timeInterpolator0);
    }

    public v r0(int v) {
        switch(v) {
            case 0: {
                this.S = true;
                return this;
            }
            case 1: {
                this.S = false;
                return this;
            }
            default: {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + v);
            }
        }
    }

    public v s0(long v) {
        return (v)super.e0(v);
    }

    private void t0() {
        b v$b0 = new b(this);
        for(Object object0: this.R) {
            ((k)object0).b(v$b0);
        }
        this.T = this.R.size();
    }
}

