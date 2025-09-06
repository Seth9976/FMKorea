package N1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.b;
import java.util.ArrayList;
import java.util.List;

abstract class i extends Drawable implements Animatable {
    class c extends Property {
        c(Class class0, String s) {
            super(class0, s);
        }

        public Float a(i i0) {
            return i0.h();
        }

        public void b(i i0, Float float0) {
            i0.n(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((i)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((i)object0), ((Float)object1));
        }
    }

    final Context f;
    final N1.c g;
    a h;
    private ValueAnimator i;
    private ValueAnimator j;
    private boolean k;
    private boolean l;
    private float m;
    private List n;
    private b o;
    private boolean p;
    private float q;
    final Paint r;
    private int s;
    private static final Property t;

    static {
        i.t = new c(Float.class, "growFraction");
    }

    i(Context context0, N1.c c0) {
        this.r = new Paint();
        this.f = context0;
        this.g = c0;
        this.h = new a();
        this.setAlpha(0xFF);
    }

    private void d(ValueAnimator[] arr_valueAnimator) {
        boolean z = this.p;
        this.p = true;
        for(int v = 0; v < arr_valueAnimator.length; ++v) {
            arr_valueAnimator[v].cancel();
        }
        this.p = z;
    }

    private void e() {
        b b0 = this.o;
        if(b0 != null) {
            b0.b(this);
        }
        List list0 = this.n;
        if(list0 != null && !this.p) {
            for(Object object0: list0) {
                ((b)object0).b(this);
            }
        }
    }

    private void f() {
        b b0 = this.o;
        if(b0 != null) {
            b0.c(this);
        }
        List list0 = this.n;
        if(list0 != null && !this.p) {
            for(Object object0: list0) {
                ((b)object0).c(this);
            }
        }
    }

    private void g(ValueAnimator[] arr_valueAnimator) {
        boolean z = this.p;
        this.p = true;
        for(int v = 0; v < arr_valueAnimator.length; ++v) {
            arr_valueAnimator[v].end();
        }
        this.p = z;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float h() {
        if(!this.g.b() && !this.g.a()) {
            return 1.0f;
        }
        return this.l || this.k ? this.m : this.q;
    }

    public boolean i() {
        return this.q(false, false, false);
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.k() || this.j();
    }

    // 去混淆评级： 低(30)
    public boolean j() {
        return this.j != null && this.j.isRunning() || this.l;
    }

    // 去混淆评级： 低(30)
    public boolean k() {
        return this.i != null && this.i.isRunning() || this.k;
    }

    private void l() {
        if(this.i == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, i.t, new float[]{0.0f, 1.0f});
            this.i = objectAnimator0;
            objectAnimator0.setDuration(500L);
            this.i.setInterpolator(A1.a.b);
            this.p(this.i);
        }
        if(this.j == null) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, i.t, new float[]{1.0f, 0.0f});
            this.j = objectAnimator1;
            objectAnimator1.setDuration(500L);
            this.j.setInterpolator(A1.a.b);
            this.o(this.j);
        }
    }

    public void m(b b0) {
        if(this.n == null) {
            this.n = new ArrayList();
        }
        if(!this.n.contains(b0)) {
            this.n.add(b0);
        }
    }

    void n(float f) {
        if(this.q != f) {
            this.q = f;
            this.invalidateSelf();
        }
    }

    private void o(ValueAnimator valueAnimator0) {
        class N1.i.b extends AnimatorListenerAdapter {
            final i a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                i.this.super.setVisible(false, false);
                i.this.e();
            }
        }

        if(this.j != null && this.j.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.j = valueAnimator0;
        valueAnimator0.addListener(new N1.i.b(this));
    }

    private void p(ValueAnimator valueAnimator0) {
        class N1.i.a extends AnimatorListenerAdapter {
            final i a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                super.onAnimationStart(animator0);
                i.this.f();
            }
        }

        if(this.i != null && this.i.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.i = valueAnimator0;
        valueAnimator0.addListener(new N1.i.a(this));
    }

    public boolean q(boolean z, boolean z1, boolean z2) {
        return !z2 || this.h.a(this.f.getContentResolver()) <= 0.0f ? this.r(z, z1, false) : this.r(z, z1, true);
    }

    boolean r(boolean z, boolean z1, boolean z2) {
        this.l();
        if(!this.isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator0 = z ? this.i : this.j;
        ValueAnimator valueAnimator1 = z ? this.j : this.i;
        if(!z2) {
            if(valueAnimator1.isRunning()) {
                this.d(new ValueAnimator[]{valueAnimator1});
            }
            if(valueAnimator0.isRunning()) {
                valueAnimator0.end();
                return super.setVisible(z, false);
            }
            this.g(new ValueAnimator[]{valueAnimator0});
            return super.setVisible(z, false);
        }
        if(valueAnimator0.isRunning()) {
            return false;
        }
        boolean z3 = !z || super.setVisible(true, false);
        if(!(z ? this.g.b() : this.g.a())) {
            this.g(new ValueAnimator[]{valueAnimator0});
            return z3;
        }
        if(!z1 && valueAnimator0.isPaused()) {
            valueAnimator0.resume();
            return z3;
        }
        valueAnimator0.start();
        return z3;
    }

    public boolean s(b b0) {
        if(this.n != null && this.n.contains(b0)) {
            this.n.remove(b0);
            if(this.n.isEmpty()) {
                this.n = null;
            }
            return true;
        }
        return false;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.s = v;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.r.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        return this.q(z, z1, true);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.r(true, true, false);
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.r(false, true, false);
    }
}

