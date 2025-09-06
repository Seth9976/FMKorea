package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class b extends k {
    class a extends Property {
        a(Class class0, String s) {
            super(class0, s);
        }

        public PointF a(i b$i0) {
            return null;
        }

        public void b(i b$i0, PointF pointF0) {
            b$i0.c(pointF0);
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((i)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((i)object0), ((PointF)object1));
        }
    }

    class androidx.transition.b.b extends Property {
        androidx.transition.b.b(Class class0, String s) {
            super(class0, s);
        }

        public PointF a(i b$i0) {
            return null;
        }

        public void b(i b$i0, PointF pointF0) {
            b$i0.a(pointF0);
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((i)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((i)object0), ((PointF)object1));
        }
    }

    class c extends Property {
        c(Class class0, String s) {
            super(class0, s);
        }

        public PointF a(View view0) {
            return null;
        }

        public void b(View view0, PointF pointF0) {
            A.d(view0, view0.getLeft(), view0.getTop(), Math.round(pointF0.x), Math.round(pointF0.y));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((View)object0), ((PointF)object1));
        }
    }

    class d extends Property {
        d(Class class0, String s) {
            super(class0, s);
        }

        public PointF a(View view0) {
            return null;
        }

        public void b(View view0, PointF pointF0) {
            A.d(view0, Math.round(pointF0.x), Math.round(pointF0.y), view0.getRight(), view0.getBottom());
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((View)object0), ((PointF)object1));
        }
    }

    class e extends Property {
        e(Class class0, String s) {
            super(class0, s);
        }

        public PointF a(View view0) {
            return null;
        }

        public void b(View view0, PointF pointF0) {
            int v = Math.round(pointF0.x);
            int v1 = Math.round(pointF0.y);
            A.d(view0, v, v1, view0.getWidth() + v, view0.getHeight() + v1);
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((View)object0), ((PointF)object1));
        }
    }

    static class g extends AnimatorListenerAdapter implements f {
        private final View a;
        private final Rect b;
        private final boolean c;
        private final Rect d;
        private final boolean e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private boolean n;

        g(View view0, Rect rect0, boolean z, Rect rect1, boolean z1, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
            this.a = view0;
            this.b = rect0;
            this.c = z;
            this.d = rect1;
            this.e = z1;
            this.f = v;
            this.g = v1;
            this.h = v2;
            this.i = v3;
            this.j = v4;
            this.k = v5;
            this.l = v6;
            this.m = v7;
        }

        @Override  // androidx.transition.k$f
        public void a(k k0) {
        }

        @Override  // androidx.transition.k$f
        public void b(k k0) {
            Rect rect0 = this.a.getClipBounds();
            this.a.setTag(h.b, rect0);
            this.a.setClipBounds((this.e ? null : this.d));
        }

        @Override  // androidx.transition.k$f
        public void c(k k0, boolean z) {
            l.a(this, k0, z);
        }

        @Override  // androidx.transition.k$f
        public void d(k k0) {
        }

        @Override  // androidx.transition.k$f
        public void e(k k0) {
            this.n = true;
        }

        @Override  // androidx.transition.k$f
        public void f(k k0, boolean z) {
            l.b(this, k0, z);
        }

        @Override  // androidx.transition.k$f
        public void g(k k0) {
            Rect rect0 = (Rect)this.a.getTag(h.b);
            this.a.setTag(h.b, null);
            this.a.setClipBounds(rect0);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.onAnimationEnd(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(Animator animator0, boolean z) {
            Rect rect0 = null;
            if(this.n) {
                return;
            }
            if(!z) {
                if(!this.e) {
                    rect0 = this.d;
                }
            }
            else if(!this.c) {
                rect0 = this.b;
            }
            this.a.setClipBounds(rect0);
            if(z) {
                A.d(this.a, this.f, this.g, this.h, this.i);
                return;
            }
            A.d(this.a, this.j, this.k, this.l, this.m);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            this.onAnimationStart(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationStart(Animator animator0, boolean z) {
            int v = z ? this.j : this.f;
            int v1 = z ? this.k : this.g;
            A.d(this.a, v, v1, Math.max(this.h - this.f, this.l - this.j) + v, Math.max(this.i - this.g, this.m - this.k) + v1);
            this.a.setClipBounds((z ? this.d : this.b));
        }
    }

    static class androidx.transition.b.h extends s {
        boolean a;
        final ViewGroup b;

        androidx.transition.b.h(ViewGroup viewGroup0) {
            this.a = false;
            this.b = viewGroup0;
        }

        @Override  // androidx.transition.s
        public void b(k k0) {
            z.b(this.b, false);
        }

        @Override  // androidx.transition.k$f
        public void d(k k0) {
            if(!this.a) {
                z.b(this.b, false);
            }
            k0.U(this);
        }

        @Override  // androidx.transition.s
        public void e(k k0) {
            z.b(this.b, false);
            this.a = true;
        }

        @Override  // androidx.transition.s
        public void g(k k0) {
            z.b(this.b, true);
        }
    }

    static class i {
        private int a;
        private int b;
        private int c;
        private int d;
        private final View e;
        private int f;
        private int g;

        i(View view0) {
            this.e = view0;
        }

        void a(PointF pointF0) {
            this.c = Math.round(pointF0.x);
            this.d = Math.round(pointF0.y);
            int v = this.g + 1;
            this.g = v;
            if(this.f == v) {
                this.b();
            }
        }

        private void b() {
            A.d(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void c(PointF pointF0) {
            this.a = Math.round(pointF0.x);
            this.b = Math.round(pointF0.y);
            int v = this.f + 1;
            this.f = v;
            if(v == this.g) {
                this.b();
            }
        }
    }

    private boolean R;
    private static final String[] S;
    private static final Property T;
    private static final Property U;
    private static final Property V;
    private static final Property W;
    private static final Property X;
    private static final androidx.transition.i Y;

    static {
        b.S = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        b.T = new a(PointF.class, "topLeft");
        b.U = new androidx.transition.b.b(PointF.class, "bottomRight");
        b.V = new c(PointF.class, "bottomRight");
        b.W = new d(PointF.class, "topLeft");
        b.X = new e(PointF.class, "position");
        b.Y = new androidx.transition.i();
    }

    public b() {
        this.R = false;
    }

    @Override  // androidx.transition.k
    public String[] G() {
        return b.S;
    }

    private void h0(x x0) {
        View view0 = x0.b;
        if(view0.isLaidOut() || view0.getWidth() != 0 || view0.getHeight() != 0) {
            Rect rect0 = new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            x0.a.put("android:changeBounds:bounds", rect0);
            ViewParent viewParent0 = x0.b.getParent();
            x0.a.put("android:changeBounds:parent", viewParent0);
            if(this.R) {
                Rect rect1 = view0.getClipBounds();
                x0.a.put("android:changeBounds:clip", rect1);
            }
        }
    }

    @Override  // androidx.transition.k
    public void i(x x0) {
        this.h0(x0);
    }

    @Override  // androidx.transition.k
    public void l(x x0) {
        this.h0(x0);
        if(this.R) {
            Rect rect0 = (Rect)x0.b.getTag(h.b);
            if(rect0 != null) {
                x0.a.put("android:changeBounds:clip", rect0);
            }
        }
    }

    @Override  // androidx.transition.k
    public Animator p(ViewGroup viewGroup0, x x0, x x1) {
        class androidx.transition.b.f extends AnimatorListenerAdapter {
            final i a;
            final b b;
            private final i mViewBounds;

            androidx.transition.b.f(i b$i0) {
                this.a = b$i0;
                super();
                this.mViewBounds = b$i0;
            }
        }

        Animator animator0;
        View view1;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator2;
        int v15;
        int v14;
        int v13;
        int v12;
        if(x0 != null && x1 != null && (((ViewGroup)x0.a.get("android:changeBounds:parent")) != null && ((ViewGroup)x1.a.get("android:changeBounds:parent")) != null)) {
            View view0 = x1.b;
            Rect rect0 = (Rect)x0.a.get("android:changeBounds:bounds");
            Rect rect1 = (Rect)x1.a.get("android:changeBounds:bounds");
            int v = rect0.left;
            int v1 = rect1.left;
            int v2 = rect0.top;
            int v3 = rect1.top;
            int v4 = rect0.right;
            int v5 = rect1.right;
            int v6 = rect0.bottom;
            int v7 = rect1.bottom;
            int v8 = v4 - v;
            int v9 = v6 - v2;
            int v10 = v5 - v1;
            int v11 = v7 - v3;
            Rect rect2 = (Rect)x0.a.get("android:changeBounds:clip");
            Rect rect3 = (Rect)x1.a.get("android:changeBounds:clip");
            if((v8 == 0 || v9 == 0) && (v10 == 0 || v11 == 0)) {
                v12 = 0;
            }
            else {
                v12 = v != v1 || v2 != v3 ? 1 : 0;
                if(v4 != v5 || v6 != v7) {
                    ++v12;
                }
            }
            if(rect2 != null && !rect2.equals(rect3) || rect2 == null && rect3 != null) {
                ++v12;
            }
            if(v12 > 0) {
                if(this.R) {
                    view1 = view0;
                    A.d(view1, v, v2, Math.max(v8, v10) + v, v2 + Math.max(v9, v11));
                    if(v != v1 || v2 != v3) {
                        v13 = v5;
                        v14 = v4;
                        v15 = v2;
                        Path path5 = this.x().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                        objectAnimator2 = androidx.transition.f.a(view1, b.X, path5);
                    }
                    else {
                        v13 = v5;
                        v14 = v4;
                        v15 = v2;
                        objectAnimator2 = null;
                    }
                    boolean z = rect2 == null;
                    if(z) {
                        rect2 = new Rect(0, 0, v8, v9);
                    }
                    Rect rect4 = rect3 == null ? rect3 : new Rect(0, 0, v10, v11);
                    if(rect2.equals(rect4)) {
                        objectAnimator3 = null;
                    }
                    else {
                        view1.setClipBounds(rect2);
                        objectAnimator3 = ObjectAnimator.ofObject(view1, "clipBounds", b.Y, new Object[]{rect2, rect4});
                        g b$g0 = new g(view1, rect2, z, rect4, rect3 == null, v, v15, v14, v6, v1, v3, v13, v7);
                        objectAnimator3.addListener(b$g0);
                        this.b(b$g0);
                    }
                    animator0 = w.c(objectAnimator2, objectAnimator3);
                }
                else {
                    view1 = view0;
                    A.d(view1, v, v2, v4, v6);
                    if(v12 != 2) {
                        if(v != v1 || v2 != v3) {
                            Path path4 = this.x().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                            animator0 = androidx.transition.f.a(view1, b.W, path4);
                        }
                        else {
                            Path path3 = this.x().a(((float)v4), ((float)v6), ((float)v5), ((float)v7));
                            animator0 = androidx.transition.f.a(view1, b.V, path3);
                        }
                    }
                    else if(v8 == v10 && v9 == v11) {
                        Path path0 = this.x().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                        animator0 = androidx.transition.f.a(view1, b.X, path0);
                    }
                    else {
                        i b$i0 = new i(view1);
                        Path path1 = this.x().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                        ObjectAnimator objectAnimator0 = androidx.transition.f.a(b$i0, b.T, path1);
                        Path path2 = this.x().a(((float)v4), ((float)v6), ((float)v5), ((float)v7));
                        ObjectAnimator objectAnimator1 = androidx.transition.f.a(b$i0, b.U, path2);
                        AnimatorSet animatorSet0 = new AnimatorSet();
                        animatorSet0.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
                        animatorSet0.addListener(new androidx.transition.b.f(this, b$i0));
                        animator0 = animatorSet0;
                    }
                }
                if(view1.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup1 = (ViewGroup)view1.getParent();
                    z.b(viewGroup1, true);
                    this.z().b(new androidx.transition.b.h(viewGroup1));
                }
                return animator0;
            }
        }
        return null;
    }
}

