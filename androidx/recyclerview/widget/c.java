package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.Y;
import java.util.ArrayList;
import java.util.List;

public class c extends n {
    static class i {
        public B a;
        public B b;
        public int c;
        public int d;
        public int e;
        public int f;

        private i(B recyclerView$B0, B recyclerView$B1) {
            this.a = recyclerView$B0;
            this.b = recyclerView$B1;
        }

        i(B recyclerView$B0, B recyclerView$B1, int v, int v1, int v2, int v3) {
            this(recyclerView$B0, recyclerView$B1);
            this.c = v;
            this.d = v1;
            this.e = v2;
            this.f = v3;
        }

        @Override
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    static class j {
        public B a;
        public int b;
        public int c;
        public int d;
        public int e;

        j(B recyclerView$B0, int v, int v1, int v2, int v3) {
            this.a = recyclerView$B0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }
    }

    private ArrayList h;
    private ArrayList i;
    private ArrayList j;
    private ArrayList k;
    ArrayList l;
    ArrayList m;
    ArrayList n;
    ArrayList o;
    ArrayList p;
    ArrayList q;
    ArrayList r;
    private static TimeInterpolator s;

    public c() {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    void Q(B recyclerView$B0) {
        class e extends AnimatorListenerAdapter {
            final B a;
            final View b;
            final ViewPropertyAnimator c;
            final c d;

            e(B recyclerView$B0, View view0, ViewPropertyAnimator viewPropertyAnimator0) {
                this.a = recyclerView$B0;
                this.b = view0;
                this.c = viewPropertyAnimator0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                this.b.setAlpha(1.0f);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.c.setListener(null);
                c.this.A(this.a);
                c.this.o.remove(this.a);
                c.this.V();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }

        ViewPropertyAnimator viewPropertyAnimator0 = recyclerView$B0.a.animate();
        this.o.add(recyclerView$B0);
        viewPropertyAnimator0.alpha(1.0f).setDuration(this.l()).setListener(new e(this, recyclerView$B0, recyclerView$B0.a, viewPropertyAnimator0)).start();
    }

    void R(i c$i0) {
        class g extends AnimatorListenerAdapter {
            final i a;
            final ViewPropertyAnimator b;
            final View c;
            final c d;

            g(i c$i0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
                this.a = c$i0;
                this.b = viewPropertyAnimator0;
                this.c = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.b.setListener(null);
                this.c.setAlpha(1.0f);
                this.c.setTranslationX(0.0f);
                this.c.setTranslationY(0.0f);
                c.this.C(this.a.a, true);
                c.this.r.remove(this.a.a);
                c.this.V();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }


        class h extends AnimatorListenerAdapter {
            final i a;
            final ViewPropertyAnimator b;
            final View c;
            final c d;

            h(i c$i0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
                this.a = c$i0;
                this.b = viewPropertyAnimator0;
                this.c = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.b.setListener(null);
                this.c.setAlpha(1.0f);
                this.c.setTranslationX(0.0f);
                this.c.setTranslationY(0.0f);
                c.this.C(this.a.b, false);
                c.this.r.remove(this.a.b);
                c.this.V();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }

        View view0 = null;
        View view1 = c$i0.a == null ? null : c$i0.a.a;
        B recyclerView$B0 = c$i0.b;
        if(recyclerView$B0 != null) {
            view0 = recyclerView$B0.a;
        }
        if(view1 != null) {
            ViewPropertyAnimator viewPropertyAnimator0 = view1.animate().setDuration(this.m());
            this.r.add(c$i0.a);
            viewPropertyAnimator0.translationX(((float)(c$i0.e - c$i0.c)));
            viewPropertyAnimator0.translationY(((float)(c$i0.f - c$i0.d)));
            viewPropertyAnimator0.alpha(0.0f).setListener(new g(this, c$i0, viewPropertyAnimator0, view1)).start();
        }
        if(view0 != null) {
            ViewPropertyAnimator viewPropertyAnimator1 = view0.animate();
            this.r.add(c$i0.b);
            viewPropertyAnimator1.translationX(0.0f).translationY(0.0f).setDuration(this.m()).alpha(1.0f).setListener(new h(this, c$i0, viewPropertyAnimator1, view0)).start();
        }
    }

    void S(B recyclerView$B0, int v, int v1, int v2, int v3) {
        class f extends AnimatorListenerAdapter {
            final B a;
            final int b;
            final View c;
            final int d;
            final ViewPropertyAnimator e;
            final c f;

            f(B recyclerView$B0, int v, View view0, int v1, ViewPropertyAnimator viewPropertyAnimator0) {
                this.a = recyclerView$B0;
                this.b = v;
                this.c = view0;
                this.d = v1;
                this.e = viewPropertyAnimator0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                if(this.b != 0) {
                    this.c.setTranslationX(0.0f);
                }
                if(this.d != 0) {
                    this.c.setTranslationY(0.0f);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.e.setListener(null);
                c.this.E(this.a);
                c.this.p.remove(this.a);
                c.this.V();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }

        View view0 = recyclerView$B0.a;
        int v4 = v2 - v;
        int v5 = v3 - v1;
        if(v4 != 0) {
            view0.animate().translationX(0.0f);
        }
        if(v5 != 0) {
            view0.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimator0 = view0.animate();
        this.p.add(recyclerView$B0);
        viewPropertyAnimator0.setDuration(this.n()).setListener(new f(this, recyclerView$B0, v4, view0, v5, viewPropertyAnimator0)).start();
    }

    private void T(B recyclerView$B0) {
        class d extends AnimatorListenerAdapter {
            final B a;
            final ViewPropertyAnimator b;
            final View c;
            final c d;

            d(B recyclerView$B0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
                this.a = recyclerView$B0;
                this.b = viewPropertyAnimator0;
                this.c = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.b.setListener(null);
                this.c.setAlpha(1.0f);
                c.this.G(this.a);
                c.this.q.remove(this.a);
                c.this.V();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }

        ViewPropertyAnimator viewPropertyAnimator0 = recyclerView$B0.a.animate();
        this.q.add(recyclerView$B0);
        viewPropertyAnimator0.setDuration(this.o()).alpha(0.0f).setListener(new d(this, recyclerView$B0, viewPropertyAnimator0, recyclerView$B0.a)).start();
    }

    void U(List list0) {
        for(int v = list0.size() - 1; v >= 0; --v) {
            ((B)list0.get(v)).a.animate().cancel();
        }
    }

    void V() {
        if(!this.p()) {
            this.i();
        }
    }

    private void W(List list0, B recyclerView$B0) {
        for(int v = list0.size() - 1; v >= 0; --v) {
            i c$i0 = (i)list0.get(v);
            if(this.Y(c$i0, recyclerView$B0) && c$i0.a == null && c$i0.b == null) {
                list0.remove(c$i0);
            }
        }
    }

    private void X(i c$i0) {
        B recyclerView$B0 = c$i0.a;
        if(recyclerView$B0 != null) {
            this.Y(c$i0, recyclerView$B0);
        }
        B recyclerView$B1 = c$i0.b;
        if(recyclerView$B1 != null) {
            this.Y(c$i0, recyclerView$B1);
        }
    }

    private boolean Y(i c$i0, B recyclerView$B0) {
        boolean z = false;
        if(c$i0.b == recyclerView$B0) {
            c$i0.b = null;
        }
        else if(c$i0.a == recyclerView$B0) {
            c$i0.a = null;
            z = true;
        }
        else {
            return false;
        }
        recyclerView$B0.a.setAlpha(1.0f);
        recyclerView$B0.a.setTranslationX(0.0f);
        recyclerView$B0.a.setTranslationY(0.0f);
        this.C(recyclerView$B0, z);
        return true;
    }

    private void Z(B recyclerView$B0) {
        if(c.s == null) {
            c.s = new ValueAnimator().getInterpolator();
        }
        recyclerView$B0.a.animate().setInterpolator(c.s);
        this.j(recyclerView$B0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public boolean g(B recyclerView$B0, List list0) {
        return !list0.isEmpty() || super.g(recyclerView$B0, list0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public void j(B recyclerView$B0) {
        View view0 = recyclerView$B0.a;
        view0.animate().cancel();
        for(int v = this.j.size() - 1; v >= 0; --v) {
            if(((j)this.j.get(v)).a == recyclerView$B0) {
                view0.setTranslationY(0.0f);
                view0.setTranslationX(0.0f);
                this.E(recyclerView$B0);
                this.j.remove(v);
            }
        }
        this.W(this.k, recyclerView$B0);
        if(this.h.remove(recyclerView$B0)) {
            view0.setAlpha(1.0f);
            this.G(recyclerView$B0);
        }
        if(this.i.remove(recyclerView$B0)) {
            view0.setAlpha(1.0f);
            this.A(recyclerView$B0);
        }
        for(int v1 = this.n.size() - 1; v1 >= 0; --v1) {
            ArrayList arrayList0 = (ArrayList)this.n.get(v1);
            this.W(arrayList0, recyclerView$B0);
            if(arrayList0.isEmpty()) {
                this.n.remove(v1);
            }
        }
        for(int v2 = this.m.size() - 1; v2 >= 0; --v2) {
            ArrayList arrayList1 = (ArrayList)this.m.get(v2);
            for(int v3 = arrayList1.size() - 1; v3 >= 0; --v3) {
                if(((j)arrayList1.get(v3)).a == recyclerView$B0) {
                    view0.setTranslationY(0.0f);
                    view0.setTranslationX(0.0f);
                    this.E(recyclerView$B0);
                    arrayList1.remove(v3);
                    if(arrayList1.isEmpty()) {
                        this.m.remove(v2);
                    }
                    break;
                }
            }
        }
        for(int v4 = this.l.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList2 = (ArrayList)this.l.get(v4);
            if(arrayList2.remove(recyclerView$B0)) {
                view0.setAlpha(1.0f);
                this.A(recyclerView$B0);
                if(arrayList2.isEmpty()) {
                    this.l.remove(v4);
                }
            }
        }
        this.q.remove(recyclerView$B0);
        this.o.remove(recyclerView$B0);
        this.r.remove(recyclerView$B0);
        this.p.remove(recyclerView$B0);
        this.V();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public void k() {
        for(int v = this.j.size() - 1; v >= 0; --v) {
            j c$j0 = (j)this.j.get(v);
            View view0 = c$j0.a.a;
            view0.setTranslationY(0.0f);
            view0.setTranslationX(0.0f);
            this.E(c$j0.a);
            this.j.remove(v);
        }
        for(int v1 = this.h.size() - 1; v1 >= 0; --v1) {
            this.G(((B)this.h.get(v1)));
            this.h.remove(v1);
        }
        for(int v2 = this.i.size() - 1; v2 >= 0; --v2) {
            B recyclerView$B0 = (B)this.i.get(v2);
            recyclerView$B0.a.setAlpha(1.0f);
            this.A(recyclerView$B0);
            this.i.remove(v2);
        }
        for(int v3 = this.k.size() - 1; v3 >= 0; --v3) {
            this.X(((i)this.k.get(v3)));
        }
        this.k.clear();
        if(!this.p()) {
            return;
        }
        for(int v4 = this.m.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList0 = (ArrayList)this.m.get(v4);
            for(int v5 = arrayList0.size() - 1; v5 >= 0; --v5) {
                j c$j1 = (j)arrayList0.get(v5);
                View view1 = c$j1.a.a;
                view1.setTranslationY(0.0f);
                view1.setTranslationX(0.0f);
                this.E(c$j1.a);
                arrayList0.remove(v5);
                if(arrayList0.isEmpty()) {
                    this.m.remove(arrayList0);
                }
            }
        }
        for(int v6 = this.l.size() - 1; v6 >= 0; --v6) {
            ArrayList arrayList1 = (ArrayList)this.l.get(v6);
            for(int v7 = arrayList1.size() - 1; v7 >= 0; --v7) {
                B recyclerView$B1 = (B)arrayList1.get(v7);
                recyclerView$B1.a.setAlpha(1.0f);
                this.A(recyclerView$B1);
                arrayList1.remove(v7);
                if(arrayList1.isEmpty()) {
                    this.l.remove(arrayList1);
                }
            }
        }
        for(int v8 = this.n.size() - 1; v8 >= 0; --v8) {
            ArrayList arrayList2 = (ArrayList)this.n.get(v8);
            for(int v9 = arrayList2.size() - 1; v9 >= 0; --v9) {
                this.X(((i)arrayList2.get(v9)));
                if(arrayList2.isEmpty()) {
                    this.n.remove(arrayList2);
                }
            }
        }
        this.U(this.q);
        this.U(this.p);
        this.U(this.o);
        this.U(this.r);
        this.i();
    }

    // 去混淆评级： 中等(110)
    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public boolean p() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public void u() {
        class a implements Runnable {
            final ArrayList f;
            final c g;

            a(ArrayList arrayList0) {
                this.f = arrayList0;
                super();
            }

            @Override
            public void run() {
                for(Object object0: this.f) {
                    c.this.S(((j)object0).a, ((j)object0).b, ((j)object0).c, ((j)object0).d, ((j)object0).e);
                }
                this.f.clear();
                c.this.m.remove(this.f);
            }
        }


        class b implements Runnable {
            final ArrayList f;
            final c g;

            b(ArrayList arrayList0) {
                this.f = arrayList0;
                super();
            }

            @Override
            public void run() {
                for(Object object0: this.f) {
                    c.this.R(((i)object0));
                }
                this.f.clear();
                c.this.n.remove(this.f);
            }
        }


        class androidx.recyclerview.widget.c.c implements Runnable {
            final ArrayList f;
            final c g;

            androidx.recyclerview.widget.c.c(ArrayList arrayList0) {
                this.f = arrayList0;
                super();
            }

            @Override
            public void run() {
                for(Object object0: this.f) {
                    c.this.Q(((B)object0));
                }
                this.f.clear();
                c.this.l.remove(this.f);
            }
        }

        boolean z = this.h.isEmpty();
        boolean z1 = this.j.isEmpty();
        boolean z2 = this.k.isEmpty();
        boolean z3 = this.i.isEmpty();
        if(z && z1 && z3 && z2) {
            return;
        }
        for(Object object0: this.h) {
            this.T(((B)object0));
        }
        this.h.clear();
        if(!z1) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(this.j);
            this.m.add(arrayList0);
            this.j.clear();
            a c$a0 = new a(this, arrayList0);
            if(z) {
                c$a0.run();
            }
            else {
                Y.h0(((j)arrayList0.get(0)).a.a, c$a0, this.o());
            }
        }
        if(!z2) {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.addAll(this.k);
            this.n.add(arrayList1);
            this.k.clear();
            b c$b0 = new b(this, arrayList1);
            if(z) {
                c$b0.run();
            }
            else {
                Y.h0(((i)arrayList1.get(0)).a.a, c$b0, this.o());
            }
        }
        if(!z3) {
            long v = 0L;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.i);
            this.l.add(arrayList2);
            this.i.clear();
            androidx.recyclerview.widget.c.c c$c0 = new androidx.recyclerview.widget.c.c(this, arrayList2);
            if(z && z1 && z2) {
                c$c0.run();
                return;
            }
            long v1 = z ? 0L : this.o();
            long v2 = z1 ? 0L : this.n();
            if(!z2) {
                v = this.m();
            }
            Y.h0(((B)arrayList2.get(0)).a, c$c0, v1 + Math.max(v2, v));
        }
    }

    @Override  // androidx.recyclerview.widget.n
    public boolean w(B recyclerView$B0) {
        this.Z(recyclerView$B0);
        recyclerView$B0.a.setAlpha(0.0f);
        this.i.add(recyclerView$B0);
        return true;
    }

    @Override  // androidx.recyclerview.widget.n
    public boolean x(B recyclerView$B0, B recyclerView$B1, int v, int v1, int v2, int v3) {
        if(recyclerView$B0 == recyclerView$B1) {
            return this.y(recyclerView$B0, v, v1, v2, v3);
        }
        float f = recyclerView$B0.a.getTranslationX();
        float f1 = recyclerView$B0.a.getTranslationY();
        float f2 = recyclerView$B0.a.getAlpha();
        this.Z(recyclerView$B0);
        recyclerView$B0.a.setTranslationX(f);
        recyclerView$B0.a.setTranslationY(f1);
        recyclerView$B0.a.setAlpha(f2);
        if(recyclerView$B1 != null) {
            this.Z(recyclerView$B1);
            recyclerView$B1.a.setTranslationX(((float)(-((int)(((float)(v2 - v)) - f)))));
            recyclerView$B1.a.setTranslationY(((float)(-((int)(((float)(v3 - v1)) - f1)))));
            recyclerView$B1.a.setAlpha(0.0f);
        }
        this.k.add(new i(recyclerView$B0, recyclerView$B1, v, v1, v2, v3));
        return true;
    }

    @Override  // androidx.recyclerview.widget.n
    public boolean y(B recyclerView$B0, int v, int v1, int v2, int v3) {
        View view0 = recyclerView$B0.a;
        int v4 = v + ((int)view0.getTranslationX());
        int v5 = v1 + ((int)recyclerView$B0.a.getTranslationY());
        this.Z(recyclerView$B0);
        int v6 = v2 - v4;
        int v7 = v3 - v5;
        if(v6 == 0 && v7 == 0) {
            this.E(recyclerView$B0);
            return false;
        }
        if(v6 != 0) {
            view0.setTranslationX(((float)(-v6)));
        }
        if(v7 != 0) {
            view0.setTranslationY(((float)(-v7)));
        }
        this.j.add(new j(recyclerView$B0, v4, v5, v2, v3));
        return true;
    }

    @Override  // androidx.recyclerview.widget.n
    public boolean z(B recyclerView$B0) {
        this.Z(recyclerView$B0);
        this.h.add(recyclerView$B0);
        return true;
    }
}

