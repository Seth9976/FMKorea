package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.E;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.c0;
import androidx.core.view.Y;
import androidx.core.view.v;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z1.e;
import z1.i;
import z1.k;

class s extends LinearLayout {
    class a extends p {
        final s f;

        @Override  // android.text.TextWatcher
        public void afterTextChanged(Editable editable0) {
            s.this.m().a(editable0);
        }

        @Override  // com.google.android.material.internal.p
        public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            s.this.m().b(charSequence0, v, v1, v2);
        }
    }

    class b implements f {
        final s a;

        @Override  // com.google.android.material.textfield.TextInputLayout$f
        public void a(TextInputLayout textInputLayout0) {
            if(s.this.x == textInputLayout0.getEditText()) {
                return;
            }
            if(s.this.x != null) {
                s.this.x.removeTextChangedListener(s.this.A);
                if(s.this.x.getOnFocusChangeListener() == s.this.m().e()) {
                    s.this.x.setOnFocusChangeListener(null);
                }
            }
            s.this.x = textInputLayout0.getEditText();
            if(s.this.x != null) {
                s.this.x.addTextChangedListener(s.this.A);
            }
            s.this.m().n(s.this.x);
            t t0 = s.this.m();
            s.this.h0(t0);
        }
    }

    static class d {
        private final SparseArray a;
        private final s b;
        private final int c;
        private final int d;

        d(s s0, c0 c00) {
            this.a = new SparseArray();
            this.b = s0;
            this.c = c00.n(k.Z7, 0);
            this.d = c00.n(k.x8, 0);
        }

        static int a(d s$d0) {
            return s$d0.c;
        }

        private t b(int v) {
            switch(v) {
                case -1: {
                    return new g(this.b);
                }
                case 0: {
                    return new x(this.b);
                }
                case 1: {
                    return new z(this.b, this.d);
                }
                case 2: {
                    return new com.google.android.material.textfield.f(this.b);
                }
                case 3: {
                    return new q(this.b);
                }
                default: {
                    throw new IllegalArgumentException("Invalid end icon mode: " + v);
                }
            }
        }

        t c(int v) {
            t t0 = (t)this.a.get(v);
            if(t0 == null) {
                t0 = this.b(v);
                this.a.append(v, t0);
            }
            return t0;
        }
    }

    private final TextWatcher A;
    private final f B;
    final TextInputLayout f;
    private final FrameLayout g;
    private final CheckableImageButton h;
    private ColorStateList i;
    private PorterDuff.Mode j;
    private View.OnLongClickListener k;
    private final CheckableImageButton l;
    private final d m;
    private int n;
    private final LinkedHashSet o;
    private ColorStateList p;
    private PorterDuff.Mode q;
    private int r;
    private ImageView.ScaleType s;
    private View.OnLongClickListener t;
    private CharSequence u;
    private final TextView v;
    private boolean w;
    private EditText x;
    private final AccessibilityManager y;
    private C.c.a z;

    s(TextInputLayout textInputLayout0, c0 c00) {
        class c implements View.OnAttachStateChangeListener {
            final s f;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                s.e(s.this);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                s.f(s.this);
            }
        }

        super(textInputLayout0.getContext());
        this.n = 0;
        this.o = new LinkedHashSet();
        this.A = new a(this);
        b s$b0 = new b(this);
        this.B = s$b0;
        this.y = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.f = textInputLayout0;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 0x800005));
        FrameLayout frameLayout0 = new FrameLayout(this.getContext());
        this.g = frameLayout0;
        frameLayout0.setVisibility(8);
        frameLayout0.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        CheckableImageButton checkableImageButton0 = this.i(this, layoutInflater0, e.P);
        this.h = checkableImageButton0;
        CheckableImageButton checkableImageButton1 = this.i(frameLayout0, layoutInflater0, e.O);
        this.l = checkableImageButton1;
        this.m = new d(this, c00);
        A a0 = new A(this.getContext());
        this.v = a0;
        this.C(c00);
        this.B(c00);
        this.D(c00);
        frameLayout0.addView(checkableImageButton1);
        this.addView(a0);
        this.addView(frameLayout0);
        this.addView(checkableImageButton0);
        textInputLayout0.i(s$b0);
        this.addOnAttachStateChangeListener(new c(this));
    }

    boolean A() {
        return this.n != 0;
    }

    private void B(c0 c00) {
        if(!c00.s(k.y8)) {
            if(c00.s(k.d8)) {
                this.p = P1.c.b(this.getContext(), c00, 0x20);
            }
            if(c00.s(k.e8)) {
                this.q = com.google.android.material.internal.t.i(c00.k(33, -1), null);
            }
        }
        if(c00.s(k.b8)) {
            this.U(c00.k(30, 0));
            if(c00.s(k.Y7)) {
                this.Q(c00.p(27));
            }
            this.O(c00.a(k.X7, true));
        }
        else if(c00.s(53)) {
            if(c00.s(k.z8)) {
                this.p = P1.c.b(this.getContext(), c00, 54);
            }
            if(c00.s(k.A8)) {
                this.q = com.google.android.material.internal.t.i(c00.k(55, -1), null);
            }
            this.U(((int)c00.a(53, false)));
            this.Q(c00.p(k.w8));
        }
        int v = this.getResources().getDimensionPixelSize(z1.c.m0);
        this.T(c00.f(k.a8, v));
        if(c00.s(k.c8)) {
            this.X(u.b(c00.k(0x1F, -1)));
        }
    }

    private void C(c0 c00) {
        if(c00.s(k.j8)) {
            this.i = P1.c.b(this.getContext(), c00, 38);
        }
        if(c00.s(k.k8)) {
            this.j = com.google.android.material.internal.t.i(c00.k(39, -1), null);
        }
        if(c00.s(k.i8)) {
            this.c0(c00.g(37));
        }
        CharSequence charSequence0 = this.getResources().getText(i.f);
        this.h.setContentDescription(charSequence0);
        Y.x0(this.h, 2);
        this.h.setClickable(false);
        this.h.setPressable(false);
        this.h.setFocusable(false);
    }

    private void D(c0 c00) {
        this.v.setVisibility(8);
        this.v.setId(e.V);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2, 80.0f);
        this.v.setLayoutParams(linearLayout$LayoutParams0);
        Y.q0(this.v, 1);
        this.q0(c00.n(k.P8, 0));
        if(c00.s(k.Q8)) {
            this.r0(c00.c(73));
        }
        this.p0(c00.p(k.O8));
    }

    // 去混淆评级： 低(20)
    boolean E() {
        return this.A() && this.l.isChecked();
    }

    boolean F() {
        return this.g.getVisibility() == 0 && this.l.getVisibility() == 0;
    }

    boolean G() {
        return this.h.getVisibility() == 0;
    }

    void H(boolean z) {
        this.w = z;
        this.y0();
    }

    void I() {
        this.w0();
        this.K();
        this.J();
        if(this.m().t()) {
            this.u0(this.f.d0());
        }
    }

    void J() {
        u.d(this.f, this.l, this.p);
    }

    void K() {
        u.d(this.f, this.h, this.i);
    }

    void L(boolean z) {
        int v1;
        t t0 = this.m();
        int v = 1;
        if(t0.l()) {
            boolean z1 = this.l.isChecked();
            if(z1 == t0.m()) {
                v1 = 0;
            }
            else {
                this.l.setChecked(!z1);
                v1 = 1;
            }
        }
        else {
            v1 = 0;
        }
        if(t0.j()) {
            boolean z2 = this.l.isActivated();
            if(z2 == t0.k()) {
                v = v1;
            }
            else {
                this.N(!z2);
            }
        }
        else {
            v = v1;
        }
        if(z || v != 0) {
            this.J();
        }
    }

    private void M() {
        C.c.a c$a0 = this.z;
        if(c$a0 != null) {
            AccessibilityManager accessibilityManager0 = this.y;
            if(accessibilityManager0 != null) {
                C.c.b(accessibilityManager0, c$a0);
            }
        }
    }

    void N(boolean z) {
        this.l.setActivated(z);
    }

    void O(boolean z) {
        this.l.setCheckable(z);
    }

    void P(int v) {
        this.Q((v == 0 ? null : this.getResources().getText(v)));
    }

    void Q(CharSequence charSequence0) {
        if(this.l() != charSequence0) {
            this.l.setContentDescription(charSequence0);
        }
    }

    void R(int v) {
        this.S((v == 0 ? null : f.a.b(this.getContext(), v)));
    }

    void S(Drawable drawable0) {
        this.l.setImageDrawable(drawable0);
        if(drawable0 != null) {
            u.a(this.f, this.l, this.p, this.q);
            this.J();
        }
    }

    void T(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if(v != this.r) {
            this.r = v;
            u.g(this.l, v);
            u.g(this.h, v);
        }
    }

    void U(int v) {
        if(this.n == v) {
            return;
        }
        this.t0(this.m());
        int v1 = this.n;
        this.n = v;
        this.j(v1);
        this.a0(v != 0);
        t t0 = this.m();
        this.R(this.t(t0));
        this.P(t0.c());
        this.O(t0.l());
        if(!t0.i(this.f.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f.getBoxBackgroundMode() + " is not supported by the end icon mode " + v);
        }
        this.s0(t0);
        this.V(t0.f());
        EditText editText0 = this.x;
        if(editText0 != null) {
            t0.n(editText0);
            this.h0(t0);
        }
        u.a(this.f, this.l, this.p, this.q);
        this.L(true);
    }

    void V(View.OnClickListener view$OnClickListener0) {
        u.h(this.l, view$OnClickListener0, this.t);
    }

    void W(View.OnLongClickListener view$OnLongClickListener0) {
        this.t = view$OnLongClickListener0;
        u.i(this.l, view$OnLongClickListener0);
    }

    void X(ImageView.ScaleType imageView$ScaleType0) {
        this.s = imageView$ScaleType0;
        u.j(this.l, imageView$ScaleType0);
        u.j(this.h, imageView$ScaleType0);
    }

    void Y(ColorStateList colorStateList0) {
        if(this.p != colorStateList0) {
            this.p = colorStateList0;
            u.a(this.f, this.l, colorStateList0, this.q);
        }
    }

    void Z(PorterDuff.Mode porterDuff$Mode0) {
        if(this.q != porterDuff$Mode0) {
            this.q = porterDuff$Mode0;
            u.a(this.f, this.l, this.p, porterDuff$Mode0);
        }
    }

    void a0(boolean z) {
        if(this.F() != z) {
            this.l.setVisibility((z ? 0 : 8));
            this.v0();
            this.x0();
            this.f.o0();
        }
    }

    void b0(int v) {
        this.c0((v == 0 ? null : f.a.b(this.getContext(), v)));
        this.K();
    }

    void c0(Drawable drawable0) {
        this.h.setImageDrawable(drawable0);
        this.w0();
        u.a(this.f, this.h, this.i, this.j);
    }

    void d0(View.OnClickListener view$OnClickListener0) {
        u.h(this.h, view$OnClickListener0, this.k);
    }

    static void e(s s0) {
        s0.g();
    }

    void e0(View.OnLongClickListener view$OnLongClickListener0) {
        this.k = view$OnLongClickListener0;
        u.i(this.h, view$OnLongClickListener0);
    }

    static void f(s s0) {
        s0.M();
    }

    void f0(ColorStateList colorStateList0) {
        if(this.i != colorStateList0) {
            this.i = colorStateList0;
            u.a(this.f, this.h, colorStateList0, this.j);
        }
    }

    private void g() {
        if(this.z != null && this.y != null && Y.R(this)) {
            C.c.a(this.y, this.z);
        }
    }

    void g0(PorterDuff.Mode porterDuff$Mode0) {
        if(this.j != porterDuff$Mode0) {
            this.j = porterDuff$Mode0;
            u.a(this.f, this.h, this.i, porterDuff$Mode0);
        }
    }

    void h() {
        this.l.performClick();
        this.l.jumpDrawablesToCurrentState();
    }

    private void h0(t t0) {
        if(this.x == null) {
            return;
        }
        if(t0.e() != null) {
            this.x.setOnFocusChangeListener(t0.e());
        }
        if(t0.g() != null) {
            this.l.setOnFocusChangeListener(t0.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup0, LayoutInflater layoutInflater0, int v) {
        CheckableImageButton checkableImageButton0 = (CheckableImageButton)layoutInflater0.inflate(z1.g.h, viewGroup0, false);
        checkableImageButton0.setId(v);
        if(P1.c.j(this.getContext())) {
            v.d(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()), 0);
        }
        return checkableImageButton0;
    }

    void i0(int v) {
        this.j0((v == 0 ? null : this.getResources().getText(v)));
    }

    private void j(int v) {
        Iterator iterator0 = this.o.iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        Object object0 = iterator0.next();
        E.a(object0);
        throw null;
    }

    void j0(CharSequence charSequence0) {
        this.l.setContentDescription(charSequence0);
    }

    CheckableImageButton k() {
        if(this.G()) {
            return this.h;
        }
        return !this.A() || !this.F() ? null : this.l;
    }

    void k0(int v) {
        this.l0((v == 0 ? null : f.a.b(this.getContext(), v)));
    }

    CharSequence l() {
        return this.l.getContentDescription();
    }

    void l0(Drawable drawable0) {
        this.l.setImageDrawable(drawable0);
    }

    t m() {
        return this.m.c(this.n);
    }

    void m0(boolean z) {
        if(z && this.n != 1) {
            this.U(1);
            return;
        }
        if(!z) {
            this.U(0);
        }
    }

    Drawable n() {
        return this.l.getDrawable();
    }

    void n0(ColorStateList colorStateList0) {
        this.p = colorStateList0;
        u.a(this.f, this.l, colorStateList0, this.q);
    }

    int o() {
        return this.r;
    }

    void o0(PorterDuff.Mode porterDuff$Mode0) {
        this.q = porterDuff$Mode0;
        u.a(this.f, this.l, this.p, porterDuff$Mode0);
    }

    int p() {
        return this.n;
    }

    void p0(CharSequence charSequence0) {
        this.u = TextUtils.isEmpty(charSequence0) ? null : charSequence0;
        this.v.setText(charSequence0);
        this.y0();
    }

    ImageView.ScaleType q() {
        return this.s;
    }

    void q0(int v) {
        androidx.core.widget.i.o(this.v, v);
    }

    CheckableImageButton r() {
        return this.l;
    }

    void r0(ColorStateList colorStateList0) {
        this.v.setTextColor(colorStateList0);
    }

    Drawable s() {
        return this.h.getDrawable();
    }

    private void s0(t t0) {
        t0.s();
        this.z = t0.h();
        this.g();
    }

    private int t(t t0) {
        int v = d.a(this.m);
        return v == 0 ? t0.d() : v;
    }

    private void t0(t t0) {
        this.M();
        this.z = null;
        t0.u();
    }

    CharSequence u() {
        return this.l.getContentDescription();
    }

    private void u0(boolean z) {
        if(z && this.n() != null) {
            Drawable drawable0 = androidx.core.graphics.drawable.a.r(this.n()).mutate();
            androidx.core.graphics.drawable.a.n(drawable0, this.f.getErrorCurrentTextColors());
            this.l.setImageDrawable(drawable0);
            return;
        }
        u.a(this.f, this.l, this.p, this.q);
    }

    Drawable v() {
        return this.l.getDrawable();
    }

    private void v0() {
        int v = 8;
        int v1 = this.l.getVisibility() != 0 || this.G() ? 8 : 0;
        this.g.setVisibility(v1);
        int v2 = this.u == null || this.w ? 8 : 0;
        if(this.F() || this.G() || v2 == 0) {
            v = 0;
        }
        this.setVisibility(v);
    }

    CharSequence w() {
        return this.u;
    }

    private void w0() {
        int v = 0;
        boolean z = this.s() != null && this.f.N() && this.f.d0();
        CheckableImageButton checkableImageButton0 = this.h;
        if(!z) {
            v = 8;
        }
        checkableImageButton0.setVisibility(v);
        this.v0();
        this.x0();
        if(!this.A()) {
            this.f.o0();
        }
    }

    ColorStateList x() {
        return this.v.getTextColors();
    }

    void x0() {
        if(this.f.i == null) {
            return;
        }
        int v = this.F() || this.G() ? 0 : Y.D(this.f.i);
        int v1 = this.getContext().getResources().getDimensionPixelSize(z1.c.P);
        int v2 = this.f.i.getPaddingTop();
        int v3 = this.f.i.getPaddingBottom();
        Y.C0(this.v, v1, v2, v, v3);
    }

    int y() {
        if(!this.F() && !this.G()) {
            return Y.D(this) + Y.D(this.v);
        }
        int v = this.l.getMeasuredWidth() + v.b(((ViewGroup.MarginLayoutParams)this.l.getLayoutParams()));
        return Y.D(this) + Y.D(this.v) + v;
    }

    private void y0() {
        int v = this.v.getVisibility();
        boolean z = false;
        int v1 = this.u == null || this.w ? 8 : 0;
        if(v != v1) {
            t t0 = this.m();
            if(v1 == 0) {
                z = true;
            }
            t0.q(z);
        }
        this.v0();
        this.v.setVisibility(v1);
        this.f.o0();
    }

    TextView z() {
        return this.v;
    }
}

