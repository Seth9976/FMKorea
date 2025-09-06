package com.google.android.material.textfield;

import C.c.a;
import C.z;
import M1.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.core.view.Y;
import z1.d;
import z1.i;

class q extends t {
    private final int e;
    private final int f;
    private final TimeInterpolator g;
    private AutoCompleteTextView h;
    private final View.OnClickListener i;
    private final View.OnFocusChangeListener j;
    private final a k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;
    private AccessibilityManager p;
    private ValueAnimator q;
    private ValueAnimator r;
    private static final boolean s;

    static {
        q.s = true;
    }

    q(s s0) {
        super(s0);
        this.i = (View view0) -> this.J(view0);
        this.j = (View view0, boolean z) -> this.K(view0, z);
        this.k = (boolean z) -> this.L(z);
        this.o = 0x7FFFFFFFFFFFFFFFL;
        this.f = h.f(s0.getContext(), z1.a.G, 67);
        this.e = h.f(s0.getContext(), z1.a.G, 50);
        this.g = h.g(s0.getContext(), z1.a.K, A1.a.a);
    }

    // 检测为 Lambda 实现
    public static void A(q q0) [...]

    // 检测为 Lambda 实现
    public static void B(q q0, View view0) [...]

    private static AutoCompleteTextView D(EditText editText0) {
        if(!(editText0 instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (AutoCompleteTextView)editText0;
    }

    private ValueAnimator E(int v, float[] arr_f) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(arr_f);
        valueAnimator0.setInterpolator(this.g);
        valueAnimator0.setDuration(((long)v));
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> this.I(valueAnimator0));
        return valueAnimator0;
    }

    private void F() {
        class com.google.android.material.textfield.q.a extends AnimatorListenerAdapter {
            final q a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                q.this.r();
                q.this.r.start();
            }
        }

        this.r = this.E(this.f, new float[]{0.0f, 1.0f});
        ValueAnimator valueAnimator0 = this.E(this.e, new float[]{1.0f, 0.0f});
        this.q = valueAnimator0;
        valueAnimator0.addListener(new com.google.android.material.textfield.q.a(this));
    }

    private boolean G() {
        long v = System.currentTimeMillis() - this.o;
        return v < 0L || v > 300L;
    }

    private void H() {
        boolean z = this.h.isPopupShowing();
        this.O(z);
        this.m = z;
    }

    private void I(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.d.setAlpha(f);
    }

    private void J(View view0) {
        this.Q();
    }

    private void K(View view0, boolean z) {
        this.l = z;
        this.r();
        if(!z) {
            this.O(false);
            this.m = false;
        }
    }

    private void L(boolean z) {
        if(this.h != null && !r.a(this.h)) {
            Y.x0(this.d, (z ? 2 : 1));
        }
    }

    private boolean M(View view0, MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1) {
            if(this.G()) {
                this.m = false;
            }
            this.Q();
            this.R();
        }
        return false;
    }

    private void N() {
        this.R();
        this.O(false);
    }

    private void O(boolean z) {
        if(this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    private void P() {
        this.h.setOnTouchListener((View view0, MotionEvent motionEvent0) -> this.M(view0, motionEvent0));
        if(q.s) {
            this.h.setOnDismissListener(() -> this.N());
        }
        this.h.setThreshold(0);
    }

    private void Q() {
        if(this.h == null) {
            return;
        }
        if(this.G()) {
            this.m = false;
        }
        if(!this.m) {
            if(q.s) {
                this.O(!this.n);
            }
            else {
                this.n = !this.n;
                this.r();
            }
            if(this.n) {
                this.h.requestFocus();
                this.h.showDropDown();
                return;
            }
            this.h.dismissDropDown();
            return;
        }
        this.m = false;
    }

    private void R() {
        this.m = true;
        this.o = System.currentTimeMillis();
    }

    @Override  // com.google.android.material.textfield.t
    public void a(Editable editable0) {
        if(this.p.isTouchExplorationEnabled() && r.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(() -> this.H());
    }

    @Override  // com.google.android.material.textfield.t
    int c() {
        return i.g;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.textfield.t
    int d() {
        return q.s ? d.h : d.i;
    }

    @Override  // com.google.android.material.textfield.t
    View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override  // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.i;
    }

    @Override  // com.google.android.material.textfield.t
    public a h() {
        return this.k;
    }

    @Override  // com.google.android.material.textfield.t
    boolean i(int v) {
        return v != 0;
    }

    @Override  // com.google.android.material.textfield.t
    boolean j() {
        return true;
    }

    @Override  // com.google.android.material.textfield.t
    boolean k() {
        return this.l;
    }

    @Override  // com.google.android.material.textfield.t
    boolean l() {
        return true;
    }

    @Override  // com.google.android.material.textfield.t
    boolean m() {
        return this.n;
    }

    @Override  // com.google.android.material.textfield.t
    public void n(EditText editText0) {
        this.h = q.D(editText0);
        this.P();
        this.a.setErrorIconDrawable(null);
        if(!r.a(editText0) && this.p.isTouchExplorationEnabled()) {
            Y.x0(this.d, 2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override  // com.google.android.material.textfield.t
    public void o(View view0, z z0) {
        if(!r.a(this.h)) {
            z0.m0("android.widget.Spinner");
        }
        if(z0.W()) {
            z0.w0(null);
        }
    }

    @Override  // com.google.android.material.textfield.t
    public void p(View view0, AccessibilityEvent accessibilityEvent0) {
        boolean z;
        if(this.p.isEnabled() && !r.a(this.h)) {
            switch(accessibilityEvent0.getEventType()) {
                case 8: 
                case 0x8000: {
                    z = this.n && !this.h.isPopupShowing();
                    break;
                }
                default: {
                    z = false;
                }
            }
            if(accessibilityEvent0.getEventType() == 1 || z) {
                this.Q();
                this.R();
            }
        }
    }

    @Override  // com.google.android.material.textfield.t
    void s() {
        this.F();
        this.p = (AccessibilityManager)this.c.getSystemService("accessibility");
    }

    @Override  // com.google.android.material.textfield.t
    boolean t() {
        return true;
    }

    @Override  // com.google.android.material.textfield.t
    void u() {
        AutoCompleteTextView autoCompleteTextView0 = this.h;
        if(autoCompleteTextView0 != null) {
            autoCompleteTextView0.setOnTouchListener(null);
            if(q.s) {
                this.h.setOnDismissListener(null);
            }
        }
    }

    // 检测为 Lambda 实现
    public static void v(q q0) [...]

    // 检测为 Lambda 实现
    public static void w(q q0, boolean z) [...]

    // 检测为 Lambda 实现
    public static void x(q q0, ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    public static void y(q q0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    public static boolean z(q q0, View view0, MotionEvent motionEvent0) [...]
}

