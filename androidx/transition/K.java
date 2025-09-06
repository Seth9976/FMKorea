package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.core.view.Y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class k implements Cloneable {
    class a extends g {
        a() {
            super();
        }

        @Override  // androidx.transition.g
        public Path a(float f, float f1, float f2, float f3) {
            Path path0 = new Path();
            path0.moveTo(f, f1);
            path0.lineTo(f2, f3);
            return path0;
        }
    }

    static class d {
        View a;
        String b;
        x c;
        WindowId d;
        k e;
        Animator f;

        d(View view0, String s, k k0, WindowId windowId0, x x0, Animator animator0) {
            this.a = view0;
            this.b = s;
            this.c = x0;
            this.d = windowId0;
            this.e = k0;
            this.f = animator0;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(k arg1);

        void b(k arg1);

        void c(k arg1, boolean arg2);

        void d(k arg1);

        void e(k arg1);

        void f(k arg1, boolean arg2);

        void g(k arg1);
    }

    interface androidx.transition.k.g {
        public static final androidx.transition.k.g a;
        public static final androidx.transition.k.g b;
        public static final androidx.transition.k.g c;
        public static final androidx.transition.k.g d;
        public static final androidx.transition.k.g e;

        static {
            androidx.transition.k.g.a = new m();
            androidx.transition.k.g.b = new n();
            androidx.transition.k.g.c = new o();
            androidx.transition.k.g.d = new p();
            androidx.transition.k.g.e = new q();
        }

        void a(f arg1, k arg2, boolean arg3);
    }

    private f[] A;
    boolean B;
    ArrayList C;
    private Animator[] D;
    int E;
    private boolean F;
    boolean G;
    private k H;
    private ArrayList I;
    ArrayList J;
    private e K;
    private androidx.collection.a L;
    private g M;
    private static final Animator[] N;
    private static final int[] O;
    private static final g P;
    private static ThreadLocal Q;
    private String f;
    private long g;
    long h;
    private TimeInterpolator i;
    ArrayList j;
    ArrayList k;
    private ArrayList l;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;
    private ArrayList r;
    private ArrayList s;
    private ArrayList t;
    private y u;
    private y v;
    v w;
    private int[] x;
    private ArrayList y;
    private ArrayList z;

    static {
        k.N = new Animator[0];
        k.O = new int[]{2, 1, 3, 4};
        k.P = new a();
        k.Q = new ThreadLocal();
    }

    public k() {
        this.f = this.getClass().getName();
        this.g = -1L;
        this.h = -1L;
        this.i = null;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = new y();
        this.v = new y();
        this.w = null;
        this.x = k.O;
        this.B = false;
        this.C = new ArrayList();
        this.D = k.N;
        this.E = 0;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = null;
        this.J = new ArrayList();
        this.M = k.P;
    }

    private static androidx.collection.a A() {
        androidx.collection.a a0 = (androidx.collection.a)k.Q.get();
        if(a0 == null) {
            a0 = new androidx.collection.a();
            k.Q.set(a0);
        }
        return a0;
    }

    public long B() {
        return this.g;
    }

    public List C() {
        return this.j;
    }

    public List D() {
        return this.l;
    }

    public List E() {
        return this.m;
    }

    public List F() {
        return this.k;
    }

    public String[] G() {
        return null;
    }

    public x H(View view0, boolean z) {
        v v0 = this.w;
        if(v0 != null) {
            return v0.H(view0, z);
        }
        return z ? ((x)this.u.a.get(view0)) : ((x)this.v.a.get(view0));
    }

    public boolean I(x x0, x x1) {
        if(x0 != null && x1 != null) {
            String[] arr_s = this.G();
            if(arr_s == null) {
                Iterator iterator0 = x0.a.keySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return false;
                    }
                    Object object0 = iterator0.next();
                    if(k.K(x0, x1, ((String)object0))) {
                        break;
                    }
                }
            }
            else {
                for(int v = 0; v < arr_s.length; ++v) {
                    if(k.K(x0, x1, arr_s[v])) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    boolean J(View view0) {
        int v = view0.getId();
        if(this.n != null && this.n.contains(v)) {
            return false;
        }
        if(this.o != null && this.o.contains(view0)) {
            return false;
        }
        ArrayList arrayList0 = this.p;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((Class)this.p.get(v2)).isInstance(view0)) {
                    return false;
                }
            }
        }
        if(this.q != null && Y.I(view0) != null && this.q.contains(Y.I(view0))) {
            return false;
        }
        if(this.j.size() == 0 && this.k.size() == 0 && (this.m == null || this.m.isEmpty()) && (this.l == null || this.l.isEmpty())) {
            return true;
        }
        if(this.j.contains(v) || this.k.contains(view0) || this.l != null && this.l.contains(Y.I(view0))) {
            return true;
        }
        if(this.m != null) {
            for(int v3 = 0; v3 < this.m.size(); ++v3) {
                if(((Class)this.m.get(v3)).isInstance(view0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean K(x x0, x x1, String s) {
        Object object0 = x0.a.get(s);
        Object object1 = x1.a.get(s);
        if(object0 == null && object1 == null) {
            return false;
        }
        return object0 == null || object1 == null ? true : !object0.equals(object1);
    }

    private void L(androidx.collection.a a0, androidx.collection.a a1, SparseArray sparseArray0, SparseArray sparseArray1) {
        int v = sparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)sparseArray0.valueAt(v1);
            if(view0 != null && this.J(view0)) {
                View view1 = (View)sparseArray1.get(sparseArray0.keyAt(v1));
                if(view1 != null && this.J(view1)) {
                    x x0 = (x)a0.get(view0);
                    x x1 = (x)a1.get(view1);
                    if(x0 != null && x1 != null) {
                        this.y.add(x0);
                        this.z.add(x1);
                        a0.remove(view0);
                        a1.remove(view1);
                    }
                }
            }
        }
    }

    private void M(androidx.collection.a a0, androidx.collection.a a1) {
        for(int v = a0.size() - 1; v >= 0; --v) {
            View view0 = (View)a0.j(v);
            if(view0 != null && this.J(view0)) {
                x x0 = (x)a1.remove(view0);
                if(x0 != null && this.J(x0.b)) {
                    x x1 = (x)a0.l(v);
                    this.y.add(x1);
                    this.z.add(x0);
                }
            }
        }
    }

    private void N(androidx.collection.a a0, androidx.collection.a a1, androidx.collection.d d0, androidx.collection.d d1) {
        int v = d0.n();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)d0.o(v1);
            if(view0 != null && this.J(view0)) {
                View view1 = (View)d1.f(d0.j(v1));
                if(view1 != null && this.J(view1)) {
                    x x0 = (x)a0.get(view0);
                    x x1 = (x)a1.get(view1);
                    if(x0 != null && x1 != null) {
                        this.y.add(x0);
                        this.z.add(x1);
                        a0.remove(view0);
                        a1.remove(view1);
                    }
                }
            }
        }
    }

    private void O(androidx.collection.a a0, androidx.collection.a a1, androidx.collection.a a2, androidx.collection.a a3) {
        int v = a2.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)a2.n(v1);
            if(view0 != null && this.J(view0)) {
                View view1 = (View)a3.get(a2.j(v1));
                if(view1 != null && this.J(view1)) {
                    x x0 = (x)a0.get(view0);
                    x x1 = (x)a1.get(view1);
                    if(x0 != null && x1 != null) {
                        this.y.add(x0);
                        this.z.add(x1);
                        a0.remove(view0);
                        a1.remove(view1);
                    }
                }
            }
        }
    }

    private void P(y y0, y y1) {
        androidx.collection.a a0 = new androidx.collection.a(y0.a);
        androidx.collection.a a1 = new androidx.collection.a(y1.a);
        for(int v = 0; true; ++v) {
            int[] arr_v = this.x;
            if(v >= arr_v.length) {
                break;
            }
            switch(arr_v[v]) {
                case 1: {
                    this.M(a0, a1);
                    break;
                }
                case 2: {
                    this.O(a0, a1, y0.d, y1.d);
                    break;
                }
                case 3: {
                    this.L(a0, a1, y0.b, y1.b);
                    break;
                }
                case 4: {
                    this.N(a0, a1, y0.c, y1.c);
                }
            }
        }
        this.d(a0, a1);
    }

    private void Q(k k0, androidx.transition.k.g k$g0, boolean z) {
        k k1 = this.H;
        if(k1 != null) {
            k1.Q(k0, k$g0, z);
        }
        if(this.I != null && !this.I.isEmpty()) {
            int v = this.I.size();
            f[] arr_k$f = this.A == null ? new f[v] : this.A;
            this.A = null;
            f[] arr_k$f1 = (f[])this.I.toArray(arr_k$f);
            for(int v1 = 0; v1 < v; ++v1) {
                k$g0.a(arr_k$f1[v1], k0, z);
                arr_k$f1[v1] = null;
            }
            this.A = arr_k$f1;
        }
    }

    void R(androidx.transition.k.g k$g0, boolean z) {
        this.Q(this, k$g0, z);
    }

    public void S(View view0) {
        if(!this.G) {
            int v = this.C.size();
            Animator[] arr_animator = (Animator[])this.C.toArray(this.D);
            this.D = k.N;
            for(int v1 = v - 1; v1 >= 0; --v1) {
                Animator animator0 = arr_animator[v1];
                arr_animator[v1] = null;
                animator0.pause();
            }
            this.D = arr_animator;
            this.R(androidx.transition.k.g.d, false);
            this.F = true;
        }
    }

    void T(ViewGroup viewGroup0) {
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.P(this.u, this.v);
        androidx.collection.a a0 = k.A();
        WindowId windowId0 = viewGroup0.getWindowId();
        for(int v = a0.size() - 1; v >= 0; --v) {
            Animator animator0 = (Animator)a0.j(v);
            if(animator0 != null) {
                d k$d0 = (d)a0.get(animator0);
                if(k$d0 != null && k$d0.a != null && windowId0.equals(k$d0.d)) {
                    x x0 = k$d0.c;
                    View view0 = k$d0.a;
                    x x1 = this.H(view0, true);
                    x x2 = this.v(view0, true);
                    if(x1 == null && x2 == null) {
                        x2 = (x)this.v.a.get(view0);
                    }
                    if((x1 != null || x2 != null) && k$d0.e.I(x0, x2)) {
                        k$d0.e.z().getClass();
                        if(animator0.isRunning() || animator0.isStarted()) {
                            animator0.cancel();
                        }
                        else {
                            a0.remove(animator0);
                        }
                    }
                }
            }
        }
        this.q(viewGroup0, this.u, this.v, this.y, this.z);
        this.Y();
    }

    public k U(f k$f0) {
        ArrayList arrayList0 = this.I;
        if(arrayList0 == null) {
            return this;
        }
        if(!arrayList0.remove(k$f0)) {
            k k0 = this.H;
            if(k0 != null) {
                k0.U(k$f0);
            }
        }
        if(this.I.size() == 0) {
            this.I = null;
        }
        return this;
    }

    public k V(View view0) {
        this.k.remove(view0);
        return this;
    }

    public void W(View view0) {
        if(this.F) {
            if(!this.G) {
                int v = this.C.size();
                Animator[] arr_animator = (Animator[])this.C.toArray(this.D);
                this.D = k.N;
                for(int v1 = v - 1; v1 >= 0; --v1) {
                    Animator animator0 = arr_animator[v1];
                    arr_animator[v1] = null;
                    animator0.resume();
                }
                this.D = arr_animator;
                this.R(androidx.transition.k.g.e, false);
            }
            this.F = false;
        }
    }

    private void X(Animator animator0, androidx.collection.a a0) {
        class b extends AnimatorListenerAdapter {
            final androidx.collection.a a;
            final k b;

            b(androidx.collection.a a0) {
                this.a = a0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.remove(animator0);
                k.this.C.remove(animator0);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                k.this.C.add(animator0);
            }
        }

        if(animator0 != null) {
            animator0.addListener(new b(this, a0));
            this.f(animator0);
        }
    }

    protected void Y() {
        this.f0();
        androidx.collection.a a0 = k.A();
        for(Object object0: this.J) {
            Animator animator0 = (Animator)object0;
            if(a0.containsKey(animator0)) {
                this.f0();
                this.X(animator0, a0);
            }
        }
        this.J.clear();
        this.r();
    }

    public k Z(long v) {
        this.h = v;
        return this;
    }

    public void a0(e k$e0) {
        this.K = k$e0;
    }

    public k b(f k$f0) {
        if(this.I == null) {
            this.I = new ArrayList();
        }
        this.I.add(k$f0);
        return this;
    }

    public k b0(TimeInterpolator timeInterpolator0) {
        this.i = timeInterpolator0;
        return this;
    }

    public k c(View view0) {
        this.k.add(view0);
        return this;
    }

    public void c0(g g0) {
        if(g0 == null) {
            this.M = k.P;
            return;
        }
        this.M = g0;
    }

    @Override
    public Object clone() {
        return this.o();
    }

    private void d(androidx.collection.a a0, androidx.collection.a a1) {
        for(int v1 = 0; v1 < a0.size(); ++v1) {
            x x0 = (x)a0.n(v1);
            if(this.J(x0.b)) {
                this.y.add(x0);
                this.z.add(null);
            }
        }
        for(int v = 0; v < a1.size(); ++v) {
            x x1 = (x)a1.n(v);
            if(this.J(x1.b)) {
                this.z.add(x1);
                this.y.add(null);
            }
        }
    }

    public void d0(u u0) {
    }

    private static void e(y y0, View view0, x x0) {
        y0.a.put(view0, x0);
        int v = view0.getId();
        if(v >= 0) {
            if(y0.b.indexOfKey(v) >= 0) {
                y0.b.put(v, null);
            }
            else {
                y0.b.put(v, view0);
            }
        }
        String s = Y.I(view0);
        if(s != null) {
            if(y0.d.containsKey(s)) {
                y0.d.put(s, null);
            }
            else {
                y0.d.put(s, view0);
            }
        }
        if(view0.getParent() instanceof ListView) {
            ListView listView0 = (ListView)view0.getParent();
            if(listView0.getAdapter().hasStableIds()) {
                long v1 = listView0.getItemIdAtPosition(listView0.getPositionForView(view0));
                if(y0.c.i(v1) >= 0) {
                    View view1 = (View)y0.c.f(v1);
                    if(view1 != null) {
                        view1.setHasTransientState(false);
                        y0.c.k(v1, null);
                    }
                }
                else {
                    view0.setHasTransientState(true);
                    y0.c.k(v1, view0);
                }
            }
        }
    }

    public k e0(long v) {
        this.g = v;
        return this;
    }

    protected void f(Animator animator0) {
        class c extends AnimatorListenerAdapter {
            final k a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                k.this.r();
                animator0.removeListener(this);
            }
        }

        if(animator0 == null) {
            this.r();
            return;
        }
        if(this.s() >= 0L) {
            animator0.setDuration(this.s());
        }
        if(this.B() >= 0L) {
            animator0.setStartDelay(this.B() + animator0.getStartDelay());
        }
        if(this.u() != null) {
            animator0.setInterpolator(this.u());
        }
        animator0.addListener(new c(this));
        animator0.start();
    }

    protected void f0() {
        if(this.E == 0) {
            this.R(androidx.transition.k.g.a, false);
            this.G = false;
        }
        ++this.E;
    }

    protected void g() {
        int v = this.C.size();
        Animator[] arr_animator = (Animator[])this.C.toArray(this.D);
        this.D = k.N;
        for(int v1 = v - 1; v1 >= 0; --v1) {
            Animator animator0 = arr_animator[v1];
            arr_animator[v1] = null;
            animator0.cancel();
        }
        this.D = arr_animator;
        this.R(androidx.transition.k.g.c, false);
    }

    String g0(String s) [...] // 潜在的解密器

    public abstract void i(x arg1);

    private void j(View view0, boolean z) {
        if(view0 == null) {
            return;
        }
        int v = view0.getId();
        if(this.n != null && this.n.contains(v)) {
            return;
        }
        if(this.o != null && this.o.contains(view0)) {
            return;
        }
        ArrayList arrayList0 = this.p;
        if(arrayList0 != null) {
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                if(((Class)this.p.get(v3)).isInstance(view0)) {
                    return;
                }
            }
        }
        if(view0.getParent() instanceof ViewGroup) {
            x x0 = new x(view0);
            if(z) {
                this.l(x0);
            }
            else {
                this.i(x0);
            }
            x0.c.add(this);
            this.k(x0);
            if(z) {
                k.e(this.u, view0, x0);
            }
            else {
                k.e(this.v, view0, x0);
            }
        }
        if(!(view0 instanceof ViewGroup) || this.r != null && this.r.contains(v)) {
            return;
        }
        if(this.s != null && this.s.contains(view0)) {
            return;
        }
        ArrayList arrayList1 = this.t;
        if(arrayList1 != null) {
            int v4 = arrayList1.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                if(((Class)this.t.get(v5)).isInstance(view0)) {
                    return;
                }
            }
        }
        for(int v1 = 0; v1 < ((ViewGroup)view0).getChildCount(); ++v1) {
            this.j(((ViewGroup)view0).getChildAt(v1), z);
        }
    }

    void k(x x0) {
    }

    public abstract void l(x arg1);

    void m(ViewGroup viewGroup0, boolean z) {
        this.n(z);
        if((this.j.size() > 0 || this.k.size() > 0) && (this.l == null || this.l.isEmpty()) && (this.m == null || this.m.isEmpty())) {
            for(int v1 = 0; v1 < this.j.size(); ++v1) {
                View view0 = viewGroup0.findViewById(((int)(((Integer)this.j.get(v1)))));
                if(view0 != null) {
                    x x0 = new x(view0);
                    if(z) {
                        this.l(x0);
                    }
                    else {
                        this.i(x0);
                    }
                    x0.c.add(this);
                    this.k(x0);
                    if(z) {
                        k.e(this.u, view0, x0);
                    }
                    else {
                        k.e(this.v, view0, x0);
                    }
                }
            }
            for(int v2 = 0; v2 < this.k.size(); ++v2) {
                View view1 = (View)this.k.get(v2);
                x x1 = new x(view1);
                if(z) {
                    this.l(x1);
                }
                else {
                    this.i(x1);
                }
                x1.c.add(this);
                this.k(x1);
                if(z) {
                    k.e(this.u, view1, x1);
                }
                else {
                    k.e(this.v, view1, x1);
                }
            }
        }
        else {
            this.j(viewGroup0, z);
        }
        if(!z) {
            androidx.collection.a a0 = this.L;
            if(a0 != null) {
                int v3 = a0.size();
                ArrayList arrayList0 = new ArrayList(v3);
                for(int v4 = 0; v4 < v3; ++v4) {
                    arrayList0.add(((View)this.u.d.remove(((String)this.L.j(v4)))));
                }
                for(int v = 0; v < v3; ++v) {
                    View view2 = (View)arrayList0.get(v);
                    if(view2 != null) {
                        this.u.d.put(((String)this.L.n(v)), view2);
                    }
                }
            }
        }
    }

    void n(boolean z) {
        if(z) {
            this.u.a.clear();
            this.u.b.clear();
            this.u.c.c();
            return;
        }
        this.v.a.clear();
        this.v.b.clear();
        this.v.c.c();
    }

    public k o() {
        try {
            k k0 = (k)super.clone();
            k0.J = new ArrayList();
            k0.u = new y();
            k0.v = new y();
            k0.y = null;
            k0.z = null;
            k0.H = this;
            k0.I = null;
            return k0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    public Animator p(ViewGroup viewGroup0, x x0, x x1) {
        return null;
    }

    void q(ViewGroup viewGroup0, y y0, y y1, ArrayList arrayList0, ArrayList arrayList1) {
        x x4;
        Animator animator2;
        View view1;
        Animator animator1;
        x x2;
        androidx.collection.a a0 = k.A();
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        int v = arrayList0.size();
        this.z().getClass();
        int v1 = 0;
        while(v1 < v) {
            x x0 = (x)arrayList0.get(v1);
            x x1 = (x)arrayList1.get(v1);
            if(x0 != null && !x0.c.contains(this)) {
                x0 = null;
            }
            if(x1 != null && !x1.c.contains(this)) {
                x1 = null;
            }
            if((x0 != null || x1 != null) && (x0 == null || x1 == null || this.I(x0, x1))) {
                Animator animator0 = this.p(viewGroup0, x0, x1);
                if(animator0 != null) {
                    if(x1 == null) {
                        view1 = x0.b;
                        animator2 = animator0;
                        x4 = null;
                    }
                    else {
                        View view0 = x1.b;
                        String[] arr_s = this.G();
                        if(arr_s == null || arr_s.length <= 0) {
                            animator1 = animator0;
                            x2 = null;
                        }
                        else {
                            x2 = new x(view0);
                            x x3 = (x)y1.a.get(view0);
                            if(x3 != null) {
                                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                                    String s = arr_s[v2];
                                    Object object0 = x3.a.get(s);
                                    x2.a.put(s, object0);
                                }
                            }
                            int v3 = a0.size();
                            int v4 = 0;
                            while(v4 < v3) {
                                d k$d0 = (d)a0.get(((Animator)a0.j(v4)));
                                if(k$d0.c != null && k$d0.a == view0 && k$d0.b.equals("androidx.transition.k") && k$d0.c.equals(x2)) {
                                    animator1 = null;
                                    goto label_42;
                                }
                                ++v4;
                            }
                            animator1 = animator0;
                        }
                    label_42:
                        view1 = view0;
                        animator2 = animator1;
                        x4 = x2;
                    }
                    if(animator2 != null) {
                        a0.put(animator2, new d(view1, "androidx.transition.k", this, viewGroup0.getWindowId(), x4, animator2));
                        this.J.add(animator2);
                    }
                }
            }
            ++v1;
        }
        if(sparseIntArray0.size() != 0) {
            for(int v5 = 0; v5 < sparseIntArray0.size(); ++v5) {
                int v6 = sparseIntArray0.keyAt(v5);
                d k$d1 = (d)a0.get(((Animator)this.J.get(v6)));
                long v7 = ((long)sparseIntArray0.valueAt(v5)) - 0x7FFFFFFFFFFFFFFFL;
                long v8 = k$d1.f.getStartDelay();
                k$d1.f.setStartDelay(v7 + v8);
            }
        }
    }

    protected void r() {
        int v = this.E - 1;
        this.E = v;
        if(v == 0) {
            this.R(androidx.transition.k.g.b, false);
            for(int v1 = 0; v1 < this.u.c.n(); ++v1) {
                View view0 = (View)this.u.c.o(v1);
                if(view0 != null) {
                    view0.setHasTransientState(false);
                }
            }
            for(int v2 = 0; v2 < this.v.c.n(); ++v2) {
                View view1 = (View)this.v.c.o(v2);
                if(view1 != null) {
                    view1.setHasTransientState(false);
                }
            }
            this.G = true;
        }
    }

    public long s() {
        return this.h;
    }

    public e t() {
        return this.K;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "k@7ae15225: ";
    }

    public TimeInterpolator u() {
        return this.i;
    }

    x v(View view0, boolean z) {
        v v0 = this.w;
        if(v0 != null) {
            return v0.v(view0, z);
        }
        ArrayList arrayList0 = z ? this.y : this.z;
        if(arrayList0 == null) {
            return null;
        }
        int v1 = arrayList0.size();
        int v2;
        for(v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                v2 = -1;
                break;
            }
            x x0 = (x)arrayList0.get(v2);
            if(x0 == null) {
                return null;
            }
            if(x0.b == view0) {
                break;
            }
        }
        if(v2 >= 0) {
            return z ? ((x)this.z.get(v2)) : ((x)this.y.get(v2));
        }
        return null;
    }

    public String w() [...] // 潜在的解密器

    public g x() {
        return this.M;
    }

    public u y() [...] // Inlined contents

    public final k z() {
        return this.w == null ? this : this.w.z();
    }
}

