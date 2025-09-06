package com.google.android.material.textfield;

import M1.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;
import z1.a;
import z1.d;
import z1.i;

class f extends t {
    private final int e;
    private final int f;
    private final TimeInterpolator g;
    private final TimeInterpolator h;
    private EditText i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    f(s s0) {
        super(s0);
        this.j = (View view0) -> this.G(view0);
        this.k = (View view0, boolean z) -> this.H(view0, z);
        this.e = h.f(s0.getContext(), a.G, 100);
        this.f = h.f(s0.getContext(), a.G, 150);
        this.g = h.g(s0.getContext(), a.K, A1.a.a);
        this.h = h.g(s0.getContext(), a.J, A1.a.d);
    }

    private void A(boolean z) {
        boolean z1 = this.b.F() == z;
        if(z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if(z1) {
                this.l.end();
            }
        }
        else if(!z) {
            this.l.cancel();
            this.m.start();
            if(z1) {
                this.m.end();
            }
        }
    }

    private ValueAnimator B(float[] arr_f) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(arr_f);
        valueAnimator0.setInterpolator(this.g);
        valueAnimator0.setDuration(((long)this.e));
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> this.E(valueAnimator0));
        return valueAnimator0;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        valueAnimator0.setInterpolator(this.h);
        valueAnimator0.setDuration(((long)this.f));
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> this.F(valueAnimator0));
        return valueAnimator0;
    }

    private void D() {
        class com.google.android.material.textfield.f.a extends AnimatorListenerAdapter {
            final f a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                f.this.b.a0(true);
            }
        }


        class b extends AnimatorListenerAdapter {
            final f a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                f.this.b.a0(false);
            }
        }

        ValueAnimator valueAnimator0 = this.C();
        ValueAnimator valueAnimator1 = this.B(new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.l = animatorSet0;
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
        this.l.addListener(new com.google.android.material.textfield.f.a(this));
        ValueAnimator valueAnimator2 = this.B(new float[]{1.0f, 0.0f});
        this.m = valueAnimator2;
        valueAnimator2.addListener(new b(this));
    }

    private void E(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.d.setAlpha(f);
    }

    private void F(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.d.setScaleX(f);
        this.d.setScaleY(f);
    }

    private void G(View view0) {
        EditText editText0 = this.i;
        if(editText0 == null) {
            return;
        }
        Editable editable0 = editText0.getText();
        if(editable0 != null) {
            editable0.clear();
        }
        this.r();
    }

    private void H(View view0, boolean z) {
        this.A(this.J());
    }

    private void I() {
        this.A(true);
    }

    // 去混淆评级： 低(20)
    private boolean J() {
        return this.i != null && (this.i.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }

    @Override  // com.google.android.material.textfield.t
    void a(Editable editable0) {
        if(this.b.w() != null) {
            return;
        }
        this.A(this.J());
    }

    @Override  // com.google.android.material.textfield.t
    int c() {
        return i.e;
    }

    @Override  // com.google.android.material.textfield.t
    int d() {
        return d.j;
    }

    @Override  // com.google.android.material.textfield.t
    View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override  // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.j;
    }

    @Override  // com.google.android.material.textfield.t
    View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override  // com.google.android.material.textfield.t
    public void n(EditText editText0) {
        this.i = editText0;
        boolean z = this.J();
        this.a.setEndIconVisible(z);
    }

    @Override  // com.google.android.material.textfield.t
    void q(boolean z) {
        if(this.b.w() == null) {
            return;
        }
        this.A(z);
    }

    @Override  // com.google.android.material.textfield.t
    void s() {
        this.D();
    }

    @Override  // com.google.android.material.textfield.t
    void u() {
        EditText editText0 = this.i;
        if(editText0 != null) {
            editText0.post(() -> this.I());
        }
    }

    // 检测为 Lambda 实现
    public static void v(f f0, View view0) [...]

    // 检测为 Lambda 实现
    public static void w(f f0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    public static void x(f f0, ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    public static void y(f f0, ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    public static void z(f f0) [...]
}

