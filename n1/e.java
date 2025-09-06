package N1;

import T.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;

final class e extends k {
    class c extends Property {
        c(Class class0, String s) {
            super(class0, s);
        }

        public Float a(e e0) {
            return e.l(e0);
        }

        public void b(e e0, Float float0) {
            e0.t(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((e)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((e)object0), ((Float)object1));
        }
    }

    class d extends Property {
        d(Class class0, String s) {
            super(class0, s);
        }

        public Float a(e e0) {
            return e0.p();
        }

        public void b(e e0, Float float0) {
            e0.u(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((e)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((e)object0), ((Float)object1));
        }
    }

    private ObjectAnimator c;
    private ObjectAnimator d;
    private final b e;
    private final N1.c f;
    private int g;
    private float h;
    private float i;
    androidx.vectordrawable.graphics.drawable.b j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final Property n;
    private static final Property o;

    static {
        e.k = new int[]{0, 1350, 2700, 4050};
        e.l = new int[]{667, 2017, 0xD27, 4717};
        e.m = new int[]{1000, 2350, 3700, 5050};
        e.n = new c(Float.class, "animationFraction");
        e.o = new d(Float.class, "completeEndFraction");
    }

    public e(g g0) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = g0;
        this.e = new b();
    }

    @Override  // N1.k
    void a() {
        ObjectAnimator objectAnimator0 = this.c;
        if(objectAnimator0 != null) {
            objectAnimator0.cancel();
        }
    }

    @Override  // N1.k
    public void c() {
        this.s();
    }

    @Override  // N1.k
    public void d(androidx.vectordrawable.graphics.drawable.b b0) {
        this.j = b0;
    }

    @Override  // N1.k
    void f() {
        if(this.d != null && !this.d.isRunning()) {
            if(this.a.isVisible()) {
                this.d.start();
                return;
            }
            this.a();
        }
    }

    @Override  // N1.k
    void g() {
        this.q();
        this.s();
        this.c.start();
    }

    @Override  // N1.k
    public void h() {
        this.j = null;
    }

    static float l(e e0) {
        return e0.o();
    }

    private float o() {
        return this.h;
    }

    private float p() {
        return this.i;
    }

    private void q() {
        class a extends AnimatorListenerAdapter {
            final e a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationRepeat(Animator animator0) {
                super.onAnimationRepeat(animator0);
                e.this.g = (e.this.g + 4) % e.this.f.c.length;
            }
        }


        class N1.e.b extends AnimatorListenerAdapter {
            final e a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                e.this.a();
                e e0 = e.this;
                androidx.vectordrawable.graphics.drawable.b b0 = e0.j;
                if(b0 != null) {
                    b0.b(e0.a);
                }
            }
        }

        if(this.c == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, e.n, new float[]{0.0f, 1.0f});
            this.c = objectAnimator0;
            objectAnimator0.setDuration(5400L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new a(this));
        }
        if(this.d == null) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, e.o, new float[]{0.0f, 1.0f});
            this.d = objectAnimator1;
            objectAnimator1.setDuration(333L);
            this.d.setInterpolator(this.e);
            this.d.addListener(new N1.e.b(this));
        }
    }

    private void r(int v) {
        for(int v1 = 0; v1 < 4; ++v1) {
            float f = this.b(v, e.m[v1], 333);
            if(f >= 0.0f && f <= 1.0f) {
                int[] arr_v = this.f.c;
                int v2 = (v1 + this.g) % arr_v.length;
                int v3 = arr_v[v2];
                int v4 = arr_v[(v2 + 1) % arr_v.length];
                ((N1.j.a)this.b.get(0)).c = (int)A1.c.b().a(this.e.getInterpolation(f), v3, v4);
                return;
            }
        }
    }

    void s() {
        this.g = 0;
        N1.j.a j$a0 = (N1.j.a)this.b.get(0);
        j$a0.c = this.f.c[0];
        this.i = 0.0f;
    }

    void t(float f) {
        this.h = f;
        this.v(((int)(f * 5400.0f)));
        this.r(((int)(f * 5400.0f)));
        this.a.invalidateSelf();
    }

    private void u(float f) {
        this.i = f;
    }

    private void v(int v) {
        N1.j.a j$a0 = (N1.j.a)this.b.get(0);
        j$a0.a = this.h * 1520.0f - 20.0f;
        j$a0.b = this.h * 1520.0f;
        for(int v1 = 0; v1 < 4; ++v1) {
            j$a0.b += this.e.getInterpolation(this.b(v, e.k[v1], 667)) * 250.0f;
            j$a0.a += this.e.getInterpolation(this.b(v, e.l[v1], 667)) * 250.0f;
        }
        j$a0.a = (j$a0.a + (j$a0.b - j$a0.a) * this.i) / 360.0f;
        j$a0.b /= 360.0f;
    }
}

