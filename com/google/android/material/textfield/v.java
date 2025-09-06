package com.google.android.material.textfield;

import M1.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.A;
import androidx.core.view.Y;
import androidx.core.widget.i;
import java.util.ArrayList;
import java.util.List;
import z1.a;
import z1.c;
import z1.e;

final class v {
    private ColorStateList A;
    private Typeface B;
    private final int a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator e;
    private final TimeInterpolator f;
    private final Context g;
    private final TextInputLayout h;
    private LinearLayout i;
    private int j;
    private FrameLayout k;
    private Animator l;
    private final float m;
    private int n;
    private int o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private CharSequence s;
    private int t;
    private int u;
    private ColorStateList v;
    private CharSequence w;
    private boolean x;
    private TextView y;
    private int z;

    public v(TextInputLayout textInputLayout0) {
        Context context0 = textInputLayout0.getContext();
        this.g = context0;
        this.h = textInputLayout0;
        this.m = (float)context0.getResources().getDimensionPixelSize(c.m);
        this.a = h.f(context0, a.H, 0xD9);
        this.b = h.f(context0, a.E, 0xA7);
        this.c = h.f(context0, a.H, 0xA7);
        this.d = h.g(context0, a.I, A1.a.d);
        this.e = h.g(context0, a.I, A1.a.a);
        this.f = h.g(context0, a.K, A1.a.a);
    }

    boolean A() {
        return this.q;
    }

    boolean B() {
        return this.x;
    }

    void C(TextView textView0, int v) {
        if(this.i == null) {
            return;
        }
        if(this.z(v)) {
            FrameLayout frameLayout0 = this.k;
            if(frameLayout0 == null) {
                this.i.removeView(textView0);
            }
            else {
                frameLayout0.removeView(textView0);
            }
        }
        else {
            this.i.removeView(textView0);
        }
        int v1 = this.j - 1;
        this.j = v1;
        this.O(this.i, v1);
    }

    private void D(int v, int v1) {
        if(v == v1) {
            return;
        }
        if(v1 != 0) {
            TextView textView0 = this.m(v1);
            if(textView0 != null) {
                textView0.setVisibility(0);
                textView0.setAlpha(1.0f);
            }
        }
        if(v != 0) {
            TextView textView1 = this.m(v);
            if(textView1 != null) {
                textView1.setVisibility(4);
                if(v == 1) {
                    textView1.setText(null);
                }
            }
        }
        this.n = v1;
    }

    void E(int v) {
        this.t = v;
        TextView textView0 = this.r;
        if(textView0 != null) {
            Y.q0(textView0, v);
        }
    }

    void F(CharSequence charSequence0) {
        this.s = charSequence0;
        TextView textView0 = this.r;
        if(textView0 != null) {
            textView0.setContentDescription(charSequence0);
        }
    }

    void G(boolean z) {
        if(this.q == z) {
            return;
        }
        this.h();
        if(z) {
            A a0 = new A(this.g);
            this.r = a0;
            a0.setId(e.R);
            this.r.setTextAlignment(5);
            Typeface typeface0 = this.B;
            if(typeface0 != null) {
                this.r.setTypeface(typeface0);
            }
            this.H(this.u);
            this.I(this.v);
            this.F(this.s);
            this.E(this.t);
            this.r.setVisibility(4);
            this.e(this.r, 0);
        }
        else {
            this.w();
            this.C(this.r, 0);
            this.r = null;
            this.h.p0();
            this.h.A0();
        }
        this.q = z;
    }

    void H(int v) {
        this.u = v;
        TextView textView0 = this.r;
        if(textView0 != null) {
            this.h.c0(textView0, v);
        }
    }

    void I(ColorStateList colorStateList0) {
        this.v = colorStateList0;
        TextView textView0 = this.r;
        if(textView0 != null && colorStateList0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    void J(int v) {
        this.z = v;
        TextView textView0 = this.y;
        if(textView0 != null) {
            i.o(textView0, v);
        }
    }

    void K(boolean z) {
        class b extends View.AccessibilityDelegate {
            final v a;

            @Override  // android.view.View$AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
                EditText editText0 = v.this.h.getEditText();
                if(editText0 != null) {
                    accessibilityNodeInfo0.setLabeledBy(editText0);
                }
            }
        }

        if(this.x == z) {
            return;
        }
        this.h();
        if(z) {
            A a0 = new A(this.g);
            this.y = a0;
            a0.setId(e.S);
            this.y.setTextAlignment(5);
            Typeface typeface0 = this.B;
            if(typeface0 != null) {
                this.y.setTypeface(typeface0);
            }
            this.y.setVisibility(4);
            Y.q0(this.y, 1);
            this.J(this.z);
            this.L(this.A);
            this.e(this.y, 1);
            this.y.setAccessibilityDelegate(new b(this));
        }
        else {
            this.x();
            this.C(this.y, 1);
            this.y = null;
            this.h.p0();
            this.h.A0();
        }
        this.x = z;
    }

    void L(ColorStateList colorStateList0) {
        this.A = colorStateList0;
        TextView textView0 = this.y;
        if(textView0 != null && colorStateList0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    private void M(TextView textView0, Typeface typeface0) {
        if(textView0 != null) {
            textView0.setTypeface(typeface0);
        }
    }

    void N(Typeface typeface0) {
        if(typeface0 != this.B) {
            this.B = typeface0;
            this.M(this.r, typeface0);
            this.M(this.y, typeface0);
        }
    }

    private void O(ViewGroup viewGroup0, int v) {
        if(v == 0) {
            viewGroup0.setVisibility(8);
        }
    }

    // 去混淆评级： 低(40)
    private boolean P(TextView textView0, CharSequence charSequence0) {
        return Y.S(this.h) && this.h.isEnabled() && (this.o != this.n || textView0 == null || !TextUtils.equals(textView0.getText(), charSequence0));
    }

    void Q(CharSequence charSequence0) {
        this.h();
        this.p = charSequence0;
        this.r.setText(charSequence0);
        int v = this.n;
        if(v != 1) {
            this.o = 1;
        }
        this.S(v, this.o, this.P(this.r, charSequence0));
    }

    void R(CharSequence charSequence0) {
        this.h();
        this.w = charSequence0;
        this.y.setText(charSequence0);
        int v = this.n;
        if(v != 2) {
            this.o = 2;
        }
        this.S(v, this.o, this.P(this.y, charSequence0));
    }

    private void S(int v, int v1, boolean z) {
        class com.google.android.material.textfield.v.a extends AnimatorListenerAdapter {
            final int a;
            final TextView b;
            final int c;
            final TextView d;
            final v e;

            com.google.android.material.textfield.v.a(int v1, TextView textView0, int v2, TextView textView1) {
                this.a = v1;
                this.b = textView0;
                this.c = v2;
                this.d = textView1;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                v.this.n = this.a;
                v.b(v.this, null);
                TextView textView0 = this.b;
                if(textView0 != null) {
                    textView0.setVisibility(4);
                    if(this.c == 1 && v.c(v.this) != null) {
                        v.c(v.this).setText(null);
                    }
                }
                TextView textView1 = this.d;
                if(textView1 != null) {
                    textView1.setTranslationY(0.0f);
                    this.d.setAlpha(1.0f);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                TextView textView0 = this.d;
                if(textView0 != null) {
                    textView0.setVisibility(0);
                    this.d.setAlpha(0.0f);
                }
            }
        }

        if(v == v1) {
            return;
        }
        if(z) {
            AnimatorSet animatorSet0 = new AnimatorSet();
            this.l = animatorSet0;
            ArrayList arrayList0 = new ArrayList();
            this.i(arrayList0, this.x, this.y, 2, v, v1);
            this.i(arrayList0, this.q, this.r, 1, v, v1);
            A1.b.a(animatorSet0, arrayList0);
            animatorSet0.addListener(new com.google.android.material.textfield.v.a(this, v1, this.m(v), v, this.m(v1)));
            animatorSet0.start();
        }
        else {
            this.D(v, v1);
        }
        this.h.p0();
        this.h.u0(z);
        this.h.A0();
    }

    static Animator b(v v0, Animator animator0) {
        v0.l = animator0;
        return animator0;
    }

    static TextView c(v v0) {
        return v0.r;
    }

    void e(TextView textView0, int v) {
        if(this.i == null && this.k == null) {
            LinearLayout linearLayout0 = new LinearLayout(this.g);
            this.i = linearLayout0;
            linearLayout0.setOrientation(0);
            this.h.addView(this.i, -1, -2);
            this.k = new FrameLayout(this.g);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.i.addView(this.k, linearLayout$LayoutParams0);
            if(this.h.getEditText() != null) {
                this.f();
            }
        }
        if(this.z(v)) {
            this.k.setVisibility(0);
            this.k.addView(textView0);
        }
        else {
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
            this.i.addView(textView0, linearLayout$LayoutParams1);
        }
        this.i.setVisibility(0);
        ++this.j;
    }

    void f() {
        if(this.g()) {
            EditText editText0 = this.h.getEditText();
            boolean z = P1.c.j(this.g);
            LinearLayout linearLayout0 = this.i;
            int v = Y.E(editText0);
            int v1 = this.v(z, c.N, v);
            int v2 = this.g.getResources().getDimensionPixelSize(c.M);
            int v3 = this.v(z, c.O, v2);
            int v4 = Y.D(editText0);
            Y.C0(linearLayout0, v1, v3, this.v(z, c.N, v4), 0);
        }
    }

    private boolean g() {
        return this.i != null && this.h.getEditText() != null;
    }

    void h() {
        Animator animator0 = this.l;
        if(animator0 != null) {
            animator0.cancel();
        }
    }

    private void i(List list0, boolean z, TextView textView0, int v, int v1, int v2) {
        if(textView0 != null && z && (v == v2 || v == v1)) {
            ObjectAnimator objectAnimator0 = this.j(textView0, v2 == v);
            if(v == v2 && v1 != 0) {
                objectAnimator0.setStartDelay(((long)this.c));
            }
            list0.add(objectAnimator0);
            if(v2 == v && v1 != 0) {
                ObjectAnimator objectAnimator1 = this.k(textView0);
                objectAnimator1.setStartDelay(((long)this.c));
                list0.add(objectAnimator1);
            }
        }
    }

    private ObjectAnimator j(TextView textView0, boolean z) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(textView0, View.ALPHA, new float[]{(z ? 1.0f : 0.0f)});
        objectAnimator0.setDuration(((long)(z ? this.b : this.c)));
        objectAnimator0.setInterpolator((z ? this.e : this.f));
        return objectAnimator0;
    }

    private ObjectAnimator k(TextView textView0) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(textView0, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
        objectAnimator0.setDuration(((long)this.a));
        objectAnimator0.setInterpolator(this.d);
        return objectAnimator0;
    }

    boolean l() {
        return this.y(this.o);
    }

    private TextView m(int v) {
        switch(v) {
            case 1: {
                return this.r;
            }
            case 2: {
                return this.y;
            }
            default: {
                return null;
            }
        }
    }

    int n() {
        return this.t;
    }

    CharSequence o() {
        return this.s;
    }

    CharSequence p() {
        return this.p;
    }

    int q() {
        return this.r == null ? -1 : this.r.getCurrentTextColor();
    }

    ColorStateList r() {
        return this.r == null ? null : this.r.getTextColors();
    }

    CharSequence s() {
        return this.w;
    }

    View t() {
        return this.y;
    }

    int u() {
        return this.y == null ? -1 : this.y.getCurrentTextColor();
    }

    // 去混淆评级： 低(20)
    private int v(boolean z, int v, int v1) {
        return z ? this.g.getResources().getDimensionPixelSize(v) : v1;
    }

    void w() {
        this.p = null;
        this.h();
        if(this.n == 1) {
            this.o = !this.x || TextUtils.isEmpty(this.w) ? 0 : 2;
        }
        this.S(this.n, this.o, this.P(this.r, ""));
    }

    void x() {
        this.h();
        int v = this.n;
        if(v == 2) {
            this.o = 0;
        }
        this.S(v, this.o, this.P(this.y, ""));
    }

    // 去混淆评级： 低(20)
    private boolean y(int v) {
        return v == 1 && this.r != null && !TextUtils.isEmpty(this.p);
    }

    boolean z(int v) {
        return v == 0 || v == 1;
    }
}

