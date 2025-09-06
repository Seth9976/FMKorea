package com.google.android.material.textfield;

import C.z;
import M1.h;
import S1.g;
import S1.k.b;
import S1.k;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.core.view.Y;
import androidx.core.widget.i;
import androidx.customview.view.AbsSavedState;
import androidx.transition.c;
import androidx.transition.t;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.q;
import java.util.LinkedHashSet;
import z1.j;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        CharSequence h;
        boolean i;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.h = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
            this.i = parcel0.readInt() == 1;
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.h + "}";
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            TextUtils.writeToParcel(this.h, parcel0, v);
            parcel0.writeInt(((int)this.i));
        }
    }

    public static class d extends androidx.core.view.a {
        private final TextInputLayout d;

        public d(TextInputLayout textInputLayout0) {
            this.d = textInputLayout0;
        }

        @Override  // androidx.core.view.a
        public void g(View view0, z z0) {
            super.g(view0, z0);
            EditText editText0 = this.d.getEditText();
            Editable editable0 = editText0 == null ? null : editText0.getText();
            CharSequence charSequence0 = this.d.getHint();
            CharSequence charSequence1 = this.d.getError();
            CharSequence charSequence2 = this.d.getPlaceholderText();
            int v = this.d.getCounterMaxLength();
            CharSequence charSequence3 = this.d.getCounterOverflowDescription();
            boolean z1 = TextUtils.isEmpty(editable0);
            boolean z2 = TextUtils.isEmpty(charSequence0);
            boolean z3 = this.d.P();
            boolean z4 = TextUtils.isEmpty(charSequence1);
            boolean z5 = !z4 || !TextUtils.isEmpty(charSequence3);
            String s = z2 ? "" : charSequence0.toString();
            this.d.g.A(z0);
            if(!z1) {
                z0.L0(editable0);
            }
            else if(!TextUtils.isEmpty(s)) {
                z0.L0(s);
                if(!z3 && charSequence2 != null) {
                    z0.L0(s + ", " + charSequence2);
                }
            }
            else if(charSequence2 != null) {
                z0.L0(charSequence2);
            }
            if(!TextUtils.isEmpty(s)) {
                if(Build.VERSION.SDK_INT >= 26) {
                    z0.w0(s);
                }
                else {
                    if(!z1) {
                        s = editable0 + ", " + s;
                    }
                    z0.L0(s);
                }
                z0.H0(z1);
            }
            if(editable0 == null || editable0.length() != v) {
                v = -1;
            }
            z0.y0(v);
            if(z5) {
                if(z4) {
                    charSequence1 = charSequence3;
                }
                z0.s0(charSequence1);
            }
            View view1 = this.d.o.t();
            if(view1 != null) {
                z0.x0(view1);
            }
            this.d.h.m().o(view0, z0);
        }

        @Override  // androidx.core.view.a
        public void h(View view0, AccessibilityEvent accessibilityEvent0) {
            super.h(view0, accessibilityEvent0);
            this.d.h.m().p(view0, accessibilityEvent0);
        }
    }

    public interface e {
        int a(Editable arg1);
    }

    public interface f {
        void a(TextInputLayout arg1);
    }

    private int A;
    final com.google.android.material.internal.a A0;
    private c B;
    private boolean B0;
    private c C;
    private boolean C0;
    private ColorStateList D;
    private ValueAnimator D0;
    private ColorStateList E;
    private boolean E0;
    private ColorStateList F;
    private boolean F0;
    private ColorStateList G;
    private boolean G0;
    private boolean H;
    private static final int H0;
    private CharSequence I;
    private static final int[][] I0;
    private boolean J;
    private g K;
    private g L;
    private StateListDrawable M;
    private boolean N;
    private g O;
    private g P;
    private k Q;
    private boolean R;
    private final int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int a0;
    private int b0;
    private int c0;
    private final Rect d0;
    private final Rect e0;
    private final FrameLayout f;
    private final RectF f0;
    private final A g;
    private Typeface g0;
    private final s h;
    private Drawable h0;
    EditText i;
    private int i0;
    private CharSequence j;
    private final LinkedHashSet j0;
    private int k;
    private Drawable k0;
    private int l;
    private int l0;
    private int m;
    private Drawable m0;
    private int n;
    private ColorStateList n0;
    private final v o;
    private ColorStateList o0;
    boolean p;
    private int p0;
    private int q;
    private int q0;
    private boolean r;
    private int r0;
    private e s;
    private ColorStateList s0;
    private TextView t;
    private int t0;
    private int u;
    private int u0;
    private int v;
    private int v0;
    private CharSequence w;
    private int w0;
    private boolean x;
    private int x0;
    private TextView y;
    int y0;
    private ColorStateList z;
    private boolean z0;

    static {
        TextInputLayout.H0 = j.l;
        TextInputLayout.I0 = new int[][]{new int[]{0x10100A7}, new int[0]};
    }

    public TextInputLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.Z);
    }

    public TextInputLayout(Context context0, AttributeSet attributeSet0, int v) {
        int v1 = TextInputLayout.H0;
        super(V1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = new v(this);
        this.s = (Editable editable0) -> TextInputLayout.T(editable0);
        this.d0 = new Rect();
        this.e0 = new Rect();
        this.f0 = new RectF();
        this.j0 = new LinkedHashSet();
        com.google.android.material.internal.a a0 = new com.google.android.material.internal.a(this);
        this.A0 = a0;
        this.G0 = false;
        Context context1 = this.getContext();
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        FrameLayout frameLayout0 = new FrameLayout(context1);
        this.f = frameLayout0;
        frameLayout0.setAddStatesFromChildren(true);
        a0.h0(A1.a.a);
        a0.e0(A1.a.a);
        a0.S(0x800033);
        c0 c00 = q.j(context1, attributeSet0, z1.k.w7, v, v1, new int[]{z1.k.T7, z1.k.R7, z1.k.l8, z1.k.q8, z1.k.u8});
        A a1 = new A(this, c00);
        this.g = a1;
        this.H = c00.a(z1.k.t8, true);
        this.setHint(c00.p(z1.k.B7));
        this.C0 = c00.a(z1.k.s8, true);
        this.B0 = c00.a(z1.k.n8, true);
        if(c00.s(z1.k.D7)) {
            this.setMinEms(c00.k(6, -1));
        }
        else if(c00.s(z1.k.A7)) {
            this.setMinWidth(c00.f(3, -1));
        }
        if(c00.s(z1.k.C7)) {
            this.setMaxEms(c00.k(5, -1));
        }
        else if(c00.s(z1.k.z7)) {
            this.setMaxWidth(c00.f(2, -1));
        }
        this.Q = k.e(context1, attributeSet0, v, v1).m();
        this.S = context1.getResources().getDimensionPixelOffset(z1.c.u0);
        this.U = c00.e(z1.k.G7, 0);
        int v2 = context1.getResources().getDimensionPixelSize(z1.c.v0);
        this.W = c00.f(z1.k.N7, v2);
        int v3 = context1.getResources().getDimensionPixelSize(z1.c.w0);
        this.a0 = c00.f(z1.k.O7, v3);
        this.V = this.W;
        float f = c00.d(z1.k.K7, -1.0f);
        float f1 = c00.d(z1.k.J7, -1.0f);
        float f2 = c00.d(z1.k.H7, -1.0f);
        float f3 = c00.d(z1.k.I7, -1.0f);
        b k$b0 = this.Q.v();
        if(f >= 0.0f) {
            k$b0.A(f);
        }
        if(f1 >= 0.0f) {
            k$b0.E(f1);
        }
        if(f2 >= 0.0f) {
            k$b0.w(f2);
        }
        if(f3 >= 0.0f) {
            k$b0.s(f3);
        }
        this.Q = k$b0.m();
        ColorStateList colorStateList0 = P1.c.b(context1, c00, z1.k.E7);
        if(colorStateList0 == null) {
            this.c0 = 0;
            this.t0 = 0;
            this.u0 = 0;
            this.v0 = 0;
            this.w0 = 0;
        }
        else {
            int v4 = colorStateList0.getDefaultColor();
            this.t0 = v4;
            this.c0 = v4;
            if(colorStateList0.isStateful()) {
                this.u0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.v0 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
                this.w0 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            }
            else {
                this.v0 = this.t0;
                ColorStateList colorStateList1 = f.a.a(context1, z1.b.d);
                this.u0 = colorStateList1.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.w0 = colorStateList1.getColorForState(new int[]{0x1010367}, -1);
            }
        }
        if(c00.s(z1.k.y7)) {
            ColorStateList colorStateList2 = c00.c(1);
            this.o0 = colorStateList2;
            this.n0 = colorStateList2;
        }
        ColorStateList colorStateList3 = P1.c.b(context1, c00, z1.k.L7);
        this.r0 = c00.b(z1.k.L7, 0);
        this.p0 = androidx.core.content.a.getColor(context1, z1.b.e);
        this.x0 = androidx.core.content.a.getColor(context1, z1.b.f);
        this.q0 = androidx.core.content.a.getColor(context1, z1.b.g);
        if(colorStateList3 != null) {
            this.setBoxStrokeColorStateList(colorStateList3);
        }
        if(c00.s(z1.k.M7)) {
            this.setBoxStrokeErrorColor(P1.c.b(context1, c00, 15));
        }
        if(c00.n(49, -1) != -1) {
            this.setHintTextAppearance(c00.n(49, 0));
        }
        this.F = c00.c(z1.k.V7);
        this.G = c00.c(z1.k.W7);
        int v5 = c00.n(40, 0);
        CharSequence charSequence0 = c00.p(z1.k.g8);
        int v6 = c00.k(z1.k.f8, 1);
        boolean z = c00.a(z1.k.h8, false);
        int v7 = c00.n(45, 0);
        boolean z1 = c00.a(z1.k.p8, false);
        CharSequence charSequence1 = c00.p(z1.k.o8);
        int v8 = c00.n(z1.k.C8, 0);
        CharSequence charSequence2 = c00.p(z1.k.B8);
        boolean z2 = c00.a(z1.k.P7, false);
        this.setCounterMaxLength(c00.k(z1.k.Q7, -1));
        this.v = c00.n(22, 0);
        this.u = c00.n(20, 0);
        this.setBoxBackgroundMode(c00.k(z1.k.F7, 0));
        this.setErrorContentDescription(charSequence0);
        this.setErrorAccessibilityLiveRegion(v6);
        this.setCounterOverflowTextAppearance(this.u);
        this.setHelperTextTextAppearance(v7);
        this.setErrorTextAppearance(v5);
        this.setCounterTextAppearance(this.v);
        this.setPlaceholderText(charSequence2);
        this.setPlaceholderTextAppearance(v8);
        if(c00.s(z1.k.m8)) {
            this.setErrorTextColor(c00.c(41));
        }
        if(c00.s(z1.k.r8)) {
            this.setHelperTextColor(c00.c(46));
        }
        if(c00.s(z1.k.v8)) {
            this.setHintTextColor(c00.c(50));
        }
        if(c00.s(z1.k.U7)) {
            this.setCounterTextColor(c00.c(23));
        }
        if(c00.s(z1.k.S7)) {
            this.setCounterOverflowTextColor(c00.c(21));
        }
        if(c00.s(z1.k.D8)) {
            this.setPlaceholderTextColor(c00.c(58));
        }
        s s0 = new s(this, c00);
        this.h = s0;
        boolean z3 = c00.a(z1.k.x7, true);
        c00.x();
        Y.x0(this, 2);
        if(Build.VERSION.SDK_INT >= 26) {
            Y.z0(this, 1);
        }
        frameLayout0.addView(a1);
        frameLayout0.addView(s0);
        this.addView(frameLayout0);
        this.setEnabled(z3);
        this.setHelperTextEnabled(z1);
        this.setErrorEnabled(z);
        this.setCounterEnabled(z2);
        this.setHelperText(charSequence1);
    }

    private c A() {
        c c0 = new c();
        c0.Z(((long)h.f(this.getContext(), z1.a.F, 87)));
        c0.b0(h.g(this.getContext(), z1.a.K, A1.a.a));
        return c0;
    }

    void A0() {
        boolean z = false;
        if(this.K != null && this.T != 0) {
            boolean z1 = this.isFocused() || this.i != null && this.i.hasFocus();
            if(this.isHovered() || this.i != null && this.i.isHovered()) {
                z = true;
            }
            if(!this.isEnabled()) {
                this.b0 = this.x0;
            }
            else if(!this.d0()) {
                if(this.r) {
                    TextView textView0 = this.t;
                    if(textView0 == null) {
                        goto label_22;
                    }
                    else if(this.s0 != null) {
                        this.z0(z1, z);
                    }
                    else {
                        this.b0 = textView0.getCurrentTextColor();
                    }
                }
                else {
                label_22:
                    if(z1) {
                        this.b0 = this.r0;
                    }
                    else if(z) {
                        this.b0 = this.q0;
                    }
                    else {
                        this.b0 = this.p0;
                    }
                }
            }
            else if(this.s0 != null) {
                this.z0(z1, z);
            }
            else {
                this.b0 = this.getErrorCurrentTextColors();
            }
            if(Build.VERSION.SDK_INT >= 29) {
                this.n0();
            }
            this.h.I();
            this.Z();
            if(this.T == 2) {
                int v = this.V;
                this.V = !z1 || !this.isEnabled() ? this.W : this.a0;
                if(this.V != v) {
                    this.X();
                }
            }
            if(this.T == 1) {
                if(!this.isEnabled()) {
                    this.c0 = this.u0;
                }
                else if(z && !z1) {
                    this.c0 = this.w0;
                }
                else if(z1) {
                    this.c0 = this.v0;
                }
                else {
                    this.c0 = this.t0;
                }
            }
            this.m();
        }
    }

    // 去混淆评级： 低(30)
    private boolean B() {
        return this.H && !TextUtils.isEmpty(this.I) && this.K instanceof com.google.android.material.textfield.h;
    }

    private void C() {
        for(Object object0: this.j0) {
            ((f)object0).a(this);
        }
    }

    private void D(Canvas canvas0) {
        if(this.P != null) {
            g g0 = this.O;
            if(g0 != null) {
                g0.draw(canvas0);
                if(this.i.isFocused()) {
                    Rect rect0 = this.P.getBounds();
                    Rect rect1 = this.O.getBounds();
                    float f = this.A0.x();
                    int v = rect1.centerX();
                    rect0.left = A1.a.c(v, rect1.left, f);
                    rect0.right = A1.a.c(v, rect1.right, f);
                    this.P.draw(canvas0);
                }
            }
        }
    }

    private void E(Canvas canvas0) {
        if(this.H) {
            this.A0.l(canvas0);
        }
    }

    private void F(boolean z) {
        if(this.D0 != null && this.D0.isRunning()) {
            this.D0.cancel();
        }
        if(!z || !this.C0) {
            this.A0.c0(0.0f);
        }
        else {
            this.l(0.0f);
        }
        if(this.B() && ((com.google.android.material.textfield.h)this.K).j0()) {
            this.y();
        }
        this.z0 = true;
        this.L();
        this.g.l(true);
        this.h.H(true);
    }

    private g G(boolean z) {
        float f = (float)this.getResources().getDimensionPixelOffset(z1.c.s0);
        float f1 = this.i instanceof w ? ((w)this.i).getPopupElevation() : ((float)this.getResources().getDimensionPixelOffset(z1.c.z));
        int v = this.getResources().getDimensionPixelOffset(z1.c.l0);
        k k0 = k.a().A((z ? f : 0.0f)).E((z ? f : 0.0f)).s(f).w(f).m();
        ColorStateList colorStateList0 = this.i instanceof w ? ((w)this.i).getDropDownBackgroundTintList() : null;
        g g0 = g.m(this.getContext(), f1, colorStateList0);
        g0.setShapeAppearanceModel(k0);
        g0.X(0, v, 0, v);
        return g0;
    }

    private static Drawable H(g g0, int v, int v1, int[][] arr2_v) {
        return new RippleDrawable(new ColorStateList(arr2_v, new int[]{H1.a.j(v1, v, 0.1f), v}), g0, g0);
    }

    private int I(int v, boolean z) {
        if(!z && this.getPrefixText() != null) {
            return v + this.g.c();
        }
        return !z || this.getSuffixText() == null ? v + this.i.getCompoundPaddingLeft() : v + this.h.y();
    }

    private int J(int v, boolean z) {
        if(!z && this.getSuffixText() != null) {
            return v - this.h.y();
        }
        return !z || this.getPrefixText() == null ? v - this.i.getCompoundPaddingRight() : v - this.g.c();
    }

    private static Drawable K(Context context0, g g0, int v, int[][] arr2_v) {
        int v1 = H1.a.c(context0, z1.a.p, "TextInputLayout");
        g g1 = new g(g0.B());
        int v2 = H1.a.j(v, v1, 0.1f);
        g1.V(new ColorStateList(arr2_v, new int[]{v2, 0}));
        g1.setTint(v1);
        ColorStateList colorStateList0 = new ColorStateList(arr2_v, new int[]{v2, v1});
        g g2 = new g(g0.B());
        g2.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList0, g1, g2), g0});
    }

    private void L() {
        TextView textView0 = this.y;
        if(textView0 != null && this.x) {
            textView0.setText(null);
            t.a(this.f, this.C);
            this.y.setVisibility(4);
        }
    }

    public boolean M() {
        return this.h.F();
    }

    public boolean N() {
        return this.o.A();
    }

    public boolean O() {
        return this.o.B();
    }

    final boolean P() {
        return this.z0;
    }

    // 去混淆评级： 低(30)
    private boolean Q() {
        return this.d0() || this.t != null && this.r;
    }

    public boolean R() {
        return this.J;
    }

    private boolean S() {
        return this.T == 1 && this.i.getMinLines() <= 1;
    }

    private static int T(Editable editable0) {
        return editable0 == null ? 0 : editable0.length();
    }

    private void U() {
        this.i.requestLayout();
    }

    private void V() {
        this.p();
        this.r0();
        this.A0();
        this.h0();
        this.k();
        if(this.T != 0) {
            this.t0();
        }
        this.b0();
    }

    private void W() {
        if(!this.B()) {
            return;
        }
        RectF rectF0 = this.f0;
        int v = this.i.getWidth();
        int v1 = this.i.getGravity();
        this.A0.o(rectF0, v, v1);
        if(rectF0.width() > 0.0f && rectF0.height() > 0.0f) {
            this.o(rectF0);
            rectF0.offset(((float)(-this.getPaddingLeft())), ((float)(-this.getPaddingTop())) - rectF0.height() / 2.0f + ((float)this.V));
            ((com.google.android.material.textfield.h)this.K).m0(rectF0);
        }
    }

    private void X() {
        if(this.B() && !this.z0) {
            this.y();
            this.W();
        }
    }

    private static void Y(ViewGroup viewGroup0, boolean z) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            view0.setEnabled(z);
            if(view0 instanceof ViewGroup) {
                TextInputLayout.Y(((ViewGroup)view0), z);
            }
        }
    }

    public void Z() {
        this.g.m();
    }

    // 检测为 Lambda 实现
    public static void a(TextInputLayout textInputLayout0) [...]

    private void a0() {
        TextView textView0 = this.y;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(view0 instanceof EditText) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(viewGroup$LayoutParams0);
            frameLayout$LayoutParams0.gravity = frameLayout$LayoutParams0.gravity & 0xFFFFFF8F | 16;
            this.f.addView(view0, frameLayout$LayoutParams0);
            this.f.setLayoutParams(viewGroup$LayoutParams0);
            this.t0();
            this.setEditText(((EditText)view0));
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    // 检测为 Lambda 实现
    public static int b(Editable editable0) [...]

    private void b0() {
        EditText editText0 = this.i;
        if(!(editText0 instanceof AutoCompleteTextView)) {
            return;
        }
        if(((AutoCompleteTextView)editText0).getDropDownBackground() == null) {
            int v = this.T;
            if(v == 2) {
                ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(this.getOrCreateOutlinedDropDownMenuBackground());
                return;
            }
            if(v == 1) {
                ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(this.getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    void c0(TextView textView0, int v) {
        try {
            i.o(textView0, v);
            if(textView0.getTextColors().getDefaultColor() == 0xFFFF00FF) {
                goto label_2;
            }
            return;
        }
        catch(Exception unused_ex) {
        }
    label_2:
        i.o(textView0, j.c);
        textView0.setTextColor(androidx.core.content.a.getColor(this.getContext(), z1.b.b));
    }

    boolean d0() {
        return this.o.l();
    }

    @Override  // android.view.ViewGroup
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure0, int v) {
        EditText editText0 = this.i;
        if(editText0 == null) {
            super.dispatchProvideAutofillStructure(viewStructure0, v);
            return;
        }
        if(this.j != null) {
            boolean z = this.J;
            this.J = false;
            CharSequence charSequence0 = editText0.getHint();
            this.i.setHint(this.j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure0, v);
            }
            finally {
                this.i.setHint(charSequence0);
                this.J = z;
            }
            return;
        }
        viewStructure0.setAutofillId(this.getAutofillId());
        this.onProvideAutofillStructure(viewStructure0, v);
        this.onProvideAutofillVirtualStructure(viewStructure0, v);
        viewStructure0.setChildCount(this.f.getChildCount());
        for(int v1 = 0; v1 < this.f.getChildCount(); ++v1) {
            View view0 = this.f.getChildAt(v1);
            ViewStructure viewStructure1 = viewStructure0.newChild(v1);
            view0.dispatchProvideAutofillStructure(viewStructure1, v);
            if(view0 == this.i) {
                viewStructure1.setHint(this.getHint());
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        this.F0 = true;
        super.dispatchRestoreInstanceState(sparseArray0);
        this.F0 = false;
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        this.E(canvas0);
        this.D(canvas0);
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        if(this.E0) {
            return;
        }
        boolean z = true;
        this.E0 = true;
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        boolean z1 = this.A0 == null ? false : this.A0.f0(arr_v);
        if(this.i != null) {
            if(!Y.S(this) || !this.isEnabled()) {
                z = false;
            }
            this.u0(z);
        }
        this.p0();
        this.A0();
        if(z1) {
            this.invalidate();
        }
        this.E0 = false;
    }

    // 去混淆评级： 低(30)
    private boolean e0() {
        return (this.h.G() || this.h.A() && this.M() || this.h.w() != null) && this.h.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (this.getStartIconDrawable() != null || this.getPrefixText() != null && this.getPrefixTextView().getVisibility() == 0) && this.g.getMeasuredWidth() > 0;
    }

    private void g0() {
        if(this.y != null && this.x && !TextUtils.isEmpty(this.w)) {
            this.y.setText(this.w);
            t.a(this.f, this.B);
            this.y.setVisibility(0);
            this.y.bringToFront();
            this.announceForAccessibility(this.w);
        }
    }

    @Override  // android.widget.LinearLayout
    public int getBaseline() {
        EditText editText0 = this.i;
        return editText0 == null ? super.getBaseline() : editText0.getBaseline() + this.getPaddingTop() + this.v();
    }

    g getBoxBackground() {
        if(this.T != 1 && this.T != 2) {
            throw new IllegalStateException();
        }
        return this.K;
    }

    public int getBoxBackgroundColor() {
        return this.c0;
    }

    public int getBoxBackgroundMode() {
        return this.T;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.U;
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.t.g(this) ? this.Q.j().a(this.f0) : this.Q.l().a(this.f0);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.t.g(this) ? this.Q.l().a(this.f0) : this.Q.j().a(this.f0);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.t.g(this) ? this.Q.r().a(this.f0) : this.Q.t().a(this.f0);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.t.g(this) ? this.Q.t().a(this.f0) : this.Q.r().a(this.f0);
    }

    public int getBoxStrokeColor() {
        return this.r0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.s0;
    }

    public int getBoxStrokeWidth() {
        return this.W;
    }

    public int getBoxStrokeWidthFocused() {
        return this.a0;
    }

    public int getCounterMaxLength() {
        return this.q;
    }

    CharSequence getCounterOverflowDescription() {
        if(this.p && this.r) {
            return this.t == null ? null : this.t.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.E;
    }

    public ColorStateList getCounterTextColor() {
        return this.D;
    }

    public ColorStateList getCursorColor() {
        return this.F;
    }

    public ColorStateList getCursorErrorColor() {
        return this.G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.n0;
    }

    public EditText getEditText() {
        return this.i;
    }

    private Drawable getEditTextBoxBackground() {
        if(this.i instanceof AutoCompleteTextView && !r.a(this.i)) {
            int v = H1.a.d(this.i, z1.a.k);
            int v1 = this.T;
            if(v1 == 2) {
                return TextInputLayout.K(this.getContext(), this.K, v, TextInputLayout.I0);
            }
            return v1 == 1 ? TextInputLayout.H(this.K, this.c0, v, TextInputLayout.I0) : null;
        }
        return this.K;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h.l();
    }

    public Drawable getEndIconDrawable() {
        return this.h.n();
    }

    public int getEndIconMinSize() {
        return this.h.o();
    }

    public int getEndIconMode() {
        return this.h.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h.q();
    }

    CheckableImageButton getEndIconView() {
        return this.h.r();
    }

    // 去混淆评级： 低(20)
    public CharSequence getError() {
        return this.o.A() ? this.o.p() : null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.o.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.o.o();
    }

    public int getErrorCurrentTextColors() {
        return this.o.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.h.s();
    }

    // 去混淆评级： 低(20)
    public CharSequence getHelperText() {
        return this.o.B() ? this.o.s() : null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.o.u();
    }

    // 去混淆评级： 低(20)
    public CharSequence getHint() {
        return this.H ? this.I : null;
    }

    final float getHintCollapsedTextHeight() {
        return this.A0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.A0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.o0;
    }

    public e getLengthCounter() {
        return this.s;
    }

    public int getMaxEms() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.n;
    }

    public int getMinEms() {
        return this.k;
    }

    public int getMinWidth() {
        return this.m;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if(this.M == null) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            this.M = stateListDrawable0;
            Drawable drawable0 = this.getOrCreateOutlinedDropDownMenuBackground();
            stateListDrawable0.addState(new int[]{0x10100AA}, drawable0);
            StateListDrawable stateListDrawable1 = this.M;
            g g0 = this.G(false);
            stateListDrawable1.addState(new int[0], g0);
        }
        return this.M;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if(this.L == null) {
            this.L = this.G(true);
        }
        return this.L;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h.v();
    }

    // 去混淆评级： 低(20)
    public CharSequence getPlaceholderText() {
        return this.x ? this.w : null;
    }

    public int getPlaceholderTextAppearance() {
        return this.A;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.z;
    }

    public CharSequence getPrefixText() {
        return this.g.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.g.b();
    }

    public TextView getPrefixTextView() {
        return this.g.d();
    }

    public k getShapeAppearanceModel() {
        return this.Q;
    }

    public CharSequence getStartIconContentDescription() {
        return this.g.e();
    }

    public Drawable getStartIconDrawable() {
        return this.g.f();
    }

    public int getStartIconMinSize() {
        return this.g.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.g.h();
    }

    public CharSequence getSuffixText() {
        return this.h.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.h.x();
    }

    public TextView getSuffixTextView() {
        return this.h.z();
    }

    public Typeface getTypeface() {
        return this.g0;
    }

    private void h0() {
        if(this.T == 1) {
            if(P1.c.k(this.getContext())) {
                this.U = this.getResources().getDimensionPixelSize(z1.c.L);
                return;
            }
            if(P1.c.j(this.getContext())) {
                this.U = this.getResources().getDimensionPixelSize(z1.c.K);
            }
        }
    }

    public void i(f textInputLayout$f0) {
        this.j0.add(textInputLayout$f0);
        if(this.i != null) {
            textInputLayout$f0.a(this);
        }
    }

    private void i0(Rect rect0) {
        g g0 = this.O;
        if(g0 != null) {
            g0.setBounds(rect0.left, rect0.bottom - this.W, rect0.right, rect0.bottom);
        }
        g g1 = this.P;
        if(g1 != null) {
            g1.setBounds(rect0.left, rect0.bottom - this.a0, rect0.right, rect0.bottom);
        }
    }

    private void j() {
        TextView textView0 = this.y;
        if(textView0 != null) {
            this.f.addView(textView0);
            this.y.setVisibility(0);
        }
    }

    private void j0() {
        if(this.t != null) {
            this.k0((this.i == null ? null : this.i.getText()));
        }
    }

    private void k() {
        if(this.i != null && this.T == 1) {
            if(P1.c.k(this.getContext())) {
                Y.C0(this.i, Y.E(this.i), this.getResources().getDimensionPixelSize(z1.c.J), Y.D(this.i), this.getResources().getDimensionPixelSize(z1.c.I));
                return;
            }
            if(P1.c.j(this.getContext())) {
                Y.C0(this.i, Y.E(this.i), this.getResources().getDimensionPixelSize(z1.c.H), Y.D(this.i), this.getResources().getDimensionPixelSize(z1.c.G));
            }
        }
    }

    void k0(Editable editable0) {
        int v = this.s.a(editable0);
        boolean z = this.r;
        int v1 = this.q;
        if(v1 == -1) {
            this.t.setText(String.valueOf(v));
            this.t.setContentDescription(null);
            this.r = false;
        }
        else {
            this.r = v > v1;
            TextInputLayout.l0(this.getContext(), this.t, v, this.q, this.r);
            if(z != this.r) {
                this.m0();
            }
            androidx.core.text.a a0 = androidx.core.text.a.c();
            this.t.setText(a0.j(this.getContext().getString(z1.i.d, new Object[]{v, this.q})));
        }
        if(this.i != null && z != this.r) {
            this.u0(false);
            this.A0();
            this.p0();
        }
    }

    void l(float f) {
        class com.google.android.material.textfield.TextInputLayout.c implements ValueAnimator.AnimatorUpdateListener {
            final TextInputLayout a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                TextInputLayout.this.A0.c0(f);
            }
        }

        if(this.A0.x() == f) {
            return;
        }
        if(this.D0 == null) {
            ValueAnimator valueAnimator0 = new ValueAnimator();
            this.D0 = valueAnimator0;
            valueAnimator0.setInterpolator(h.g(this.getContext(), z1.a.J, A1.a.b));
            this.D0.setDuration(((long)h.f(this.getContext(), z1.a.E, 0xA7)));
            this.D0.addUpdateListener(new com.google.android.material.textfield.TextInputLayout.c(this));
        }
        this.D0.setFloatValues(new float[]{this.A0.x(), f});
        this.D0.start();
    }

    private static void l0(Context context0, TextView textView0, int v, int v1, boolean z) {
        textView0.setContentDescription(context0.getString((z ? z1.i.c : z1.i.b), new Object[]{v, v1}));
    }

    private void m() {
        g g0 = this.K;
        if(g0 == null) {
            return;
        }
        k k0 = this.Q;
        if(g0.B() != k0) {
            this.K.setShapeAppearanceModel(k0);
        }
        if(this.w()) {
            this.K.Z(((float)this.V), this.b0);
        }
        int v = this.q();
        this.c0 = v;
        this.K.V(ColorStateList.valueOf(v));
        this.n();
        this.r0();
    }

    private void m0() {
        TextView textView0 = this.t;
        if(textView0 != null) {
            this.c0(textView0, (this.r ? this.u : this.v));
            if(!this.r) {
                ColorStateList colorStateList0 = this.D;
                if(colorStateList0 != null) {
                    this.t.setTextColor(colorStateList0);
                }
            }
            if(this.r) {
                ColorStateList colorStateList1 = this.E;
                if(colorStateList1 != null) {
                    this.t.setTextColor(colorStateList1);
                }
            }
        }
    }

    private void n() {
        if(this.O != null && this.P != null) {
            if(this.x()) {
                this.O.V((this.i.isFocused() ? ColorStateList.valueOf(this.p0) : ColorStateList.valueOf(this.b0)));
                this.P.V(ColorStateList.valueOf(this.b0));
            }
            this.invalidate();
        }
    }

    private void n0() {
        ColorStateList colorStateList0 = this.F == null ? H1.a.g(this.getContext(), z1.a.j) : this.F;
        if(this.i != null && this.i.getTextCursorDrawable() != null) {
            Drawable drawable0 = androidx.core.graphics.drawable.a.r(this.i.getTextCursorDrawable()).mutate();
            if(this.Q()) {
                ColorStateList colorStateList1 = this.G;
                if(colorStateList1 != null) {
                    colorStateList0 = colorStateList1;
                }
            }
            androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
        }
    }

    private void o(RectF rectF0) {
        rectF0.left -= (float)this.S;
        rectF0.right += (float)this.S;
    }

    boolean o0() {
        boolean z1;
        boolean z = true;
        if(this.i == null) {
            return false;
        }
        if(this.f0()) {
            int v = this.g.getMeasuredWidth() - this.i.getPaddingLeft();
            if(this.h0 == null || this.i0 != v) {
                ColorDrawable colorDrawable0 = new ColorDrawable();
                this.h0 = colorDrawable0;
                this.i0 = v;
                colorDrawable0.setBounds(0, 0, v, 1);
            }
            Drawable[] arr_drawable = i.a(this.i);
            Drawable drawable0 = this.h0;
            if(arr_drawable[0] == drawable0) {
                z1 = false;
            }
            else {
                i.i(this.i, drawable0, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
                z1 = true;
            }
        }
        else if(this.h0 == null) {
            z1 = false;
        }
        else {
            Drawable[] arr_drawable1 = i.a(this.i);
            i.i(this.i, null, arr_drawable1[1], arr_drawable1[2], arr_drawable1[3]);
            this.h0 = null;
            z1 = true;
        }
        if(this.e0()) {
            int v1 = this.h.z().getMeasuredWidth() - this.i.getPaddingRight();
            CheckableImageButton checkableImageButton0 = this.h.k();
            if(checkableImageButton0 != null) {
                v1 = v1 + checkableImageButton0.getMeasuredWidth() + androidx.core.view.v.b(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()));
            }
            Drawable[] arr_drawable2 = i.a(this.i);
            Drawable drawable1 = this.k0;
            if(drawable1 != null && this.l0 != v1) {
                this.l0 = v1;
                drawable1.setBounds(0, 0, v1, 1);
                i.i(this.i, arr_drawable2[0], arr_drawable2[1], this.k0, arr_drawable2[3]);
                return true;
            }
            if(drawable1 == null) {
                ColorDrawable colorDrawable1 = new ColorDrawable();
                this.k0 = colorDrawable1;
                this.l0 = v1;
                colorDrawable1.setBounds(0, 0, v1, 1);
            }
            Drawable drawable2 = arr_drawable2[2];
            Drawable drawable3 = this.k0;
            if(drawable2 != drawable3) {
                this.m0 = drawable2;
                i.i(this.i, arr_drawable2[0], arr_drawable2[1], drawable3, arr_drawable2[3]);
                return true;
            }
            return z1;
        }
        if(this.k0 != null) {
            Drawable[] arr_drawable3 = i.a(this.i);
            if(arr_drawable3[2] == this.k0) {
                i.i(this.i, arr_drawable3[0], arr_drawable3[1], this.m0, arr_drawable3[3]);
            }
            else {
                z = z1;
            }
            this.k0 = null;
            return z;
        }
        return z1;
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.A0.H(configuration0);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.G0 = false;
        if(this.s0() || this.o0()) {
            this.i.post(() -> this.U());
        }
    }

    @Override  // android.widget.LinearLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        EditText editText0 = this.i;
        if(editText0 != null) {
            Rect rect0 = this.d0;
            com.google.android.material.internal.c.a(this, editText0, rect0);
            this.i0(rect0);
            if(this.H) {
                float f = this.i.getTextSize();
                this.A0.a0(f);
                int v4 = this.i.getGravity();
                this.A0.S(v4 & 0xFFFFFF8F | 0x30);
                this.A0.Z(v4);
                Rect rect1 = this.r(rect0);
                this.A0.O(rect1);
                Rect rect2 = this.u(rect0);
                this.A0.W(rect2);
                this.A0.J();
                if(this.B() && !this.z0) {
                    this.W();
                }
            }
        }
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(!this.G0) {
            this.h.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.G0 = true;
        }
        this.w0();
        this.h.x0();
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        class com.google.android.material.textfield.TextInputLayout.b implements Runnable {
            final TextInputLayout f;

            @Override
            public void run() {
                TextInputLayout.this.h.h();
            }
        }

        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setError(((SavedState)parcelable0).h);
        if(((SavedState)parcelable0).i) {
            this.post(new com.google.android.material.textfield.TextInputLayout.b(this));
        }
        this.requestLayout();
    }

    @Override  // android.widget.LinearLayout
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        if(v == 1 != this.R) {
            float f = this.Q.r().a(this.f0);
            float f1 = this.Q.t().a(this.f0);
            float f2 = this.Q.j().a(this.f0);
            float f3 = this.Q.l().a(this.f0);
            S1.d d0 = this.Q.q();
            S1.d d1 = this.Q.s();
            S1.d d2 = this.Q.i();
            S1.d d3 = this.Q.k();
            k k0 = k.a().z(d1).D(d0).r(d3).v(d2).A(f1).E(f).s(f3).w(f2).m();
            this.R = v == 1;
            this.setShapeAppearanceModel(k0);
        }
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        if(this.d0()) {
            parcelable0.h = this.getError();
        }
        parcelable0.i = this.h.E();
        return parcelable0;
    }

    private void p() {
        switch(this.T) {
            case 0: {
                this.K = null;
                this.O = null;
                this.P = null;
                return;
            }
            case 1: {
                this.K = new g(this.Q);
                this.O = new g();
                this.P = new g();
                return;
            }
            case 2: {
                this.K = !this.H || this.K instanceof com.google.android.material.textfield.h ? new g(this.Q) : com.google.android.material.textfield.h.h0(this.Q);
                this.O = null;
                this.P = null;
                return;
            }
            default: {
                throw new IllegalArgumentException(this.T + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
        }
    }

    void p0() {
        EditText editText0 = this.i;
        if(editText0 != null && this.T == 0) {
            Drawable drawable0 = editText0.getBackground();
            if(drawable0 == null) {
                return;
            }
            drawable0 = drawable0.mutate();
            if(this.d0()) {
                drawable0.setColorFilter(androidx.appcompat.widget.j.e(this.getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
                return;
            }
            if(this.r) {
                TextView textView0 = this.t;
                if(textView0 != null) {
                    drawable0.setColorFilter(androidx.appcompat.widget.j.e(textView0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                    return;
                }
            }
            androidx.core.graphics.drawable.a.c(drawable0);
            this.i.refreshDrawableState();
        }
    }

    private int q() {
        return this.T == 1 ? H1.a.i(H1.a.e(this, z1.a.p, 0), this.c0) : this.c0;
    }

    private void q0() {
        Drawable drawable0 = this.getEditTextBoxBackground();
        Y.s0(this.i, drawable0);
    }

    private Rect r(Rect rect0) {
        if(this.i != null) {
            Rect rect1 = this.e0;
            boolean z = com.google.android.material.internal.t.g(this);
            rect1.bottom = rect0.bottom;
            switch(this.T) {
                case 1: {
                    rect1.left = this.I(rect0.left, z);
                    rect1.top = rect0.top + this.U;
                    rect1.right = this.J(rect0.right, z);
                    return rect1;
                }
                case 2: {
                    rect1.left = rect0.left + this.i.getPaddingLeft();
                    rect1.top = rect0.top - this.v();
                    rect1.right = rect0.right - this.i.getPaddingRight();
                    return rect1;
                }
                default: {
                    rect1.left = this.I(rect0.left, z);
                    rect1.top = this.getPaddingTop();
                    rect1.right = this.J(rect0.right, z);
                    return rect1;
                }
            }
        }
        throw new IllegalStateException();
    }

    void r0() {
        if(this.i != null && this.K != null && (this.N || this.i.getBackground() == null) && this.T != 0) {
            this.q0();
            this.N = true;
        }
    }

    // 去混淆评级： 低(20)
    private int s(Rect rect0, Rect rect1, float f) {
        return this.S() ? ((int)(((float)rect1.top) + f)) : rect0.bottom - this.i.getCompoundPaddingBottom();
    }

    private boolean s0() {
        if(this.i == null) {
            return false;
        }
        int v = Math.max(this.h.getMeasuredHeight(), this.g.getMeasuredHeight());
        if(this.i.getMeasuredHeight() < v) {
            this.i.setMinimumHeight(v);
            return true;
        }
        return false;
    }

    public void setBoxBackgroundColor(int v) {
        if(this.c0 != v) {
            this.c0 = v;
            this.t0 = v;
            this.v0 = v;
            this.w0 = v;
            this.m();
        }
    }

    public void setBoxBackgroundColorResource(int v) {
        this.setBoxBackgroundColor(androidx.core.content.a.getColor(this.getContext(), v));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList0) {
        int v = colorStateList0.getDefaultColor();
        this.t0 = v;
        this.c0 = v;
        this.u0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
        this.v0 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        this.w0 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
        this.m();
    }

    public void setBoxBackgroundMode(int v) {
        if(v == this.T) {
            return;
        }
        this.T = v;
        if(this.i != null) {
            this.V();
        }
    }

    public void setBoxCollapsedPaddingTop(int v) {
        this.U = v;
    }

    public void setBoxCornerFamily(int v) {
        this.Q = this.Q.v().y(v, this.Q.r()).C(v, this.Q.t()).q(v, this.Q.j()).u(v, this.Q.l()).m();
        this.m();
    }

    public void setBoxStrokeColor(int v) {
        if(this.r0 != v) {
            this.r0 = v;
            this.A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList0) {
        if(colorStateList0.isStateful()) {
            this.p0 = colorStateList0.getDefaultColor();
            this.x0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
            this.q0 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            this.r0 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        }
        else if(this.r0 != colorStateList0.getDefaultColor()) {
            this.r0 = colorStateList0.getDefaultColor();
        }
        this.A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList0) {
        if(this.s0 != colorStateList0) {
            this.s0 = colorStateList0;
            this.A0();
        }
    }

    public void setBoxStrokeWidth(int v) {
        this.W = v;
        this.A0();
    }

    public void setBoxStrokeWidthFocused(int v) {
        this.a0 = v;
        this.A0();
    }

    public void setBoxStrokeWidthFocusedResource(int v) {
        this.setBoxStrokeWidthFocused(this.getResources().getDimensionPixelSize(v));
    }

    public void setBoxStrokeWidthResource(int v) {
        this.setBoxStrokeWidth(this.getResources().getDimensionPixelSize(v));
    }

    public void setCounterEnabled(boolean z) {
        if(this.p != z) {
            if(z) {
                androidx.appcompat.widget.A a0 = new androidx.appcompat.widget.A(this.getContext());
                this.t = a0;
                a0.setId(z1.e.Q);
                Typeface typeface0 = this.g0;
                if(typeface0 != null) {
                    this.t.setTypeface(typeface0);
                }
                this.t.setMaxLines(1);
                this.o.e(this.t, 2);
                androidx.core.view.v.d(((ViewGroup.MarginLayoutParams)this.t.getLayoutParams()), this.getResources().getDimensionPixelOffset(z1.c.x0));
                this.m0();
                this.j0();
            }
            else {
                this.o.C(this.t, 2);
                this.t = null;
            }
            this.p = z;
        }
    }

    public void setCounterMaxLength(int v) {
        if(this.q != v) {
            this.q = v > 0 ? v : -1;
            if(this.p) {
                this.j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int v) {
        if(this.u != v) {
            this.u = v;
            this.m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList0) {
        if(this.E != colorStateList0) {
            this.E = colorStateList0;
            this.m0();
        }
    }

    public void setCounterTextAppearance(int v) {
        if(this.v != v) {
            this.v = v;
            this.m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList0) {
        if(this.D != colorStateList0) {
            this.D = colorStateList0;
            this.m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList0) {
        if(this.F != colorStateList0) {
            this.F = colorStateList0;
            this.n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList0) {
        if(this.G != colorStateList0) {
            this.G = colorStateList0;
            if(this.Q()) {
                this.n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList0) {
        this.n0 = colorStateList0;
        this.o0 = colorStateList0;
        if(this.i != null) {
            this.u0(false);
        }
    }

    private void setEditText(EditText editText0) {
        class com.google.android.material.textfield.TextInputLayout.a implements TextWatcher {
            int f;
            final EditText g;
            final TextInputLayout h;

            com.google.android.material.textfield.TextInputLayout.a(EditText editText0) {
                this.g = editText0;
                super();
                this.f = editText0.getLineCount();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                TextInputLayout.this.u0(!TextInputLayout.this.F0);
                TextInputLayout textInputLayout0 = TextInputLayout.this;
                if(textInputLayout0.p) {
                    textInputLayout0.k0(editable0);
                }
                if(TextInputLayout.this.x) {
                    TextInputLayout.this.y0(editable0);
                }
                int v = this.g.getLineCount();
                int v1 = this.f;
                if(v != v1) {
                    if(v < v1) {
                        int v2 = Y.A(this.g);
                        int v3 = TextInputLayout.this.y0;
                        if(v2 != v3) {
                            this.g.setMinimumHeight(v3);
                        }
                    }
                    this.f = v;
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }

        if(this.i != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if(this.getEndIconMode() != 3 && !(editText0 instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.i = editText0;
        int v = this.k;
        if(v == -1) {
            this.setMinWidth(this.m);
        }
        else {
            this.setMinEms(v);
        }
        int v1 = this.l;
        if(v1 == -1) {
            this.setMaxWidth(this.n);
        }
        else {
            this.setMaxEms(v1);
        }
        this.N = false;
        this.V();
        this.setTextInputAccessibilityDelegate(new d(this));
        Typeface typeface0 = this.i.getTypeface();
        this.A0.i0(typeface0);
        float f = this.i.getTextSize();
        this.A0.a0(f);
        int v2 = Build.VERSION.SDK_INT;
        float f1 = this.i.getLetterSpacing();
        this.A0.X(f1);
        int v3 = this.i.getGravity();
        this.A0.S(v3 & 0xFFFFFF8F | 0x30);
        this.A0.Z(v3);
        this.y0 = Y.A(editText0);
        this.i.addTextChangedListener(new com.google.android.material.textfield.TextInputLayout.a(this, editText0));
        if(this.n0 == null) {
            this.n0 = this.i.getHintTextColors();
        }
        if(this.H) {
            if(TextUtils.isEmpty(this.I)) {
                CharSequence charSequence0 = this.i.getHint();
                this.j = charSequence0;
                this.setHint(charSequence0);
                this.i.setHint(null);
            }
            this.J = true;
        }
        if(v2 >= 29) {
            this.n0();
        }
        if(this.t != null) {
            this.k0(this.i.getText());
        }
        this.p0();
        this.o.f();
        this.g.bringToFront();
        this.h.bringToFront();
        this.C();
        this.h.x0();
        if(!this.isEnabled()) {
            editText0.setEnabled(false);
        }
        this.v0(false, true);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        TextInputLayout.Y(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.h.N(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.h.O(z);
    }

    public void setEndIconContentDescription(int v) {
        this.h.P(v);
    }

    public void setEndIconContentDescription(CharSequence charSequence0) {
        this.h.Q(charSequence0);
    }

    public void setEndIconDrawable(int v) {
        this.h.R(v);
    }

    public void setEndIconDrawable(Drawable drawable0) {
        this.h.S(drawable0);
    }

    public void setEndIconMinSize(int v) {
        this.h.T(v);
    }

    public void setEndIconMode(int v) {
        this.h.U(v);
    }

    public void setEndIconOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.h.V(view$OnClickListener0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.h.W(view$OnLongClickListener0);
    }

    public void setEndIconScaleType(ImageView.ScaleType imageView$ScaleType0) {
        this.h.X(imageView$ScaleType0);
    }

    public void setEndIconTintList(ColorStateList colorStateList0) {
        this.h.Y(colorStateList0);
    }

    public void setEndIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.h.Z(porterDuff$Mode0);
    }

    public void setEndIconVisible(boolean z) {
        this.h.a0(z);
    }

    public void setError(CharSequence charSequence0) {
        if(!this.o.A()) {
            if(TextUtils.isEmpty(charSequence0)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            this.o.Q(charSequence0);
            return;
        }
        this.o.w();
    }

    public void setErrorAccessibilityLiveRegion(int v) {
        this.o.E(v);
    }

    public void setErrorContentDescription(CharSequence charSequence0) {
        this.o.F(charSequence0);
    }

    public void setErrorEnabled(boolean z) {
        this.o.G(z);
    }

    public void setErrorIconDrawable(int v) {
        this.h.b0(v);
    }

    public void setErrorIconDrawable(Drawable drawable0) {
        this.h.c0(drawable0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.h.d0(view$OnClickListener0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.h.e0(view$OnLongClickListener0);
    }

    public void setErrorIconTintList(ColorStateList colorStateList0) {
        this.h.f0(colorStateList0);
    }

    public void setErrorIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.h.g0(porterDuff$Mode0);
    }

    public void setErrorTextAppearance(int v) {
        this.o.H(v);
    }

    public void setErrorTextColor(ColorStateList colorStateList0) {
        this.o.I(colorStateList0);
    }

    public void setExpandedHintEnabled(boolean z) {
        if(this.B0 != z) {
            this.B0 = z;
            this.u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(!this.O()) {
                this.setHelperTextEnabled(true);
            }
            this.o.R(charSequence0);
        }
        else if(this.O()) {
            this.setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList0) {
        this.o.L(colorStateList0);
    }

    public void setHelperTextEnabled(boolean z) {
        this.o.K(z);
    }

    public void setHelperTextTextAppearance(int v) {
        this.o.J(v);
    }

    public void setHint(int v) {
        this.setHint((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setHint(CharSequence charSequence0) {
        if(this.H) {
            this.setHintInternal(charSequence0);
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.C0 = z;
    }

    public void setHintEnabled(boolean z) {
        if(z != this.H) {
            this.H = z;
            if(z) {
                CharSequence charSequence0 = this.i.getHint();
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(TextUtils.isEmpty(this.I)) {
                        this.setHint(charSequence0);
                    }
                    this.i.setHint(null);
                }
                this.J = true;
            }
            else {
                this.J = false;
                if(!TextUtils.isEmpty(this.I) && TextUtils.isEmpty(this.i.getHint())) {
                    this.i.setHint(this.I);
                }
                this.setHintInternal(null);
            }
            if(this.i != null) {
                this.t0();
            }
        }
    }

    private void setHintInternal(CharSequence charSequence0) {
        if(!TextUtils.equals(charSequence0, this.I)) {
            this.I = charSequence0;
            this.A0.g0(charSequence0);
            if(!this.z0) {
                this.W();
            }
        }
    }

    public void setHintTextAppearance(int v) {
        this.A0.P(v);
        this.o0 = this.A0.p();
        if(this.i != null) {
            this.u0(false);
            this.t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList0) {
        if(this.o0 != colorStateList0) {
            if(this.n0 == null) {
                this.A0.R(colorStateList0);
            }
            this.o0 = colorStateList0;
            if(this.i != null) {
                this.u0(false);
            }
        }
    }

    public void setLengthCounter(e textInputLayout$e0) {
        this.s = textInputLayout$e0;
    }

    public void setMaxEms(int v) {
        this.l = v;
        EditText editText0 = this.i;
        if(editText0 != null && v != -1) {
            editText0.setMaxEms(v);
        }
    }

    public void setMaxWidth(int v) {
        this.n = v;
        EditText editText0 = this.i;
        if(editText0 != null && v != -1) {
            editText0.setMaxWidth(v);
        }
    }

    public void setMaxWidthResource(int v) {
        this.setMaxWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    public void setMinEms(int v) {
        this.k = v;
        EditText editText0 = this.i;
        if(editText0 != null && v != -1) {
            editText0.setMinEms(v);
        }
    }

    public void setMinWidth(int v) {
        this.m = v;
        EditText editText0 = this.i;
        if(editText0 != null && v != -1) {
            editText0.setMinWidth(v);
        }
    }

    public void setMinWidthResource(int v) {
        this.setMinWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int v) {
        this.h.i0(v);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence0) {
        this.h.j0(charSequence0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int v) {
        this.h.k0(v);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable0) {
        this.h.l0(drawable0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.h.m0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList0) {
        this.h.n0(colorStateList0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.h.o0(porterDuff$Mode0);
    }

    public void setPlaceholderText(CharSequence charSequence0) {
        if(this.y == null) {
            androidx.appcompat.widget.A a0 = new androidx.appcompat.widget.A(this.getContext());
            this.y = a0;
            a0.setId(z1.e.T);
            Y.x0(this.y, 2);
            c c0 = this.A();
            this.B = c0;
            c0.e0(67L);
            this.C = this.A();
            this.setPlaceholderTextAppearance(this.A);
            this.setPlaceholderTextColor(this.z);
        }
        if(TextUtils.isEmpty(charSequence0)) {
            this.setPlaceholderTextEnabled(false);
        }
        else {
            if(!this.x) {
                this.setPlaceholderTextEnabled(true);
            }
            this.w = charSequence0;
        }
        this.x0();
    }

    public void setPlaceholderTextAppearance(int v) {
        this.A = v;
        TextView textView0 = this.y;
        if(textView0 != null) {
            i.o(textView0, v);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList0) {
        if(this.z != colorStateList0) {
            this.z = colorStateList0;
            TextView textView0 = this.y;
            if(textView0 != null && colorStateList0 != null) {
                textView0.setTextColor(colorStateList0);
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if(this.x == z) {
            return;
        }
        if(z) {
            this.j();
        }
        else {
            this.a0();
            this.y = null;
        }
        this.x = z;
    }

    public void setPrefixText(CharSequence charSequence0) {
        this.g.n(charSequence0);
    }

    public void setPrefixTextAppearance(int v) {
        this.g.o(v);
    }

    public void setPrefixTextColor(ColorStateList colorStateList0) {
        this.g.p(colorStateList0);
    }

    public void setShapeAppearanceModel(k k0) {
        if(this.K != null && this.K.B() != k0) {
            this.Q = k0;
            this.m();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.g.q(z);
    }

    public void setStartIconContentDescription(int v) {
        this.setStartIconContentDescription((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setStartIconContentDescription(CharSequence charSequence0) {
        this.g.r(charSequence0);
    }

    public void setStartIconDrawable(int v) {
        this.setStartIconDrawable((v == 0 ? null : f.a.b(this.getContext(), v)));
    }

    public void setStartIconDrawable(Drawable drawable0) {
        this.g.s(drawable0);
    }

    public void setStartIconMinSize(int v) {
        this.g.t(v);
    }

    public void setStartIconOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.g.u(view$OnClickListener0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.g.v(view$OnLongClickListener0);
    }

    public void setStartIconScaleType(ImageView.ScaleType imageView$ScaleType0) {
        this.g.w(imageView$ScaleType0);
    }

    public void setStartIconTintList(ColorStateList colorStateList0) {
        this.g.x(colorStateList0);
    }

    public void setStartIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.g.y(porterDuff$Mode0);
    }

    public void setStartIconVisible(boolean z) {
        this.g.z(z);
    }

    public void setSuffixText(CharSequence charSequence0) {
        this.h.p0(charSequence0);
    }

    public void setSuffixTextAppearance(int v) {
        this.h.q0(v);
    }

    public void setSuffixTextColor(ColorStateList colorStateList0) {
        this.h.r0(colorStateList0);
    }

    public void setTextInputAccessibilityDelegate(d textInputLayout$d0) {
        EditText editText0 = this.i;
        if(editText0 != null) {
            Y.o0(editText0, textInputLayout$d0);
        }
    }

    public void setTypeface(Typeface typeface0) {
        if(typeface0 != this.g0) {
            this.g0 = typeface0;
            this.A0.i0(typeface0);
            this.o.N(typeface0);
            TextView textView0 = this.t;
            if(textView0 != null) {
                textView0.setTypeface(typeface0);
            }
        }
    }

    // 去混淆评级： 低(20)
    private int t(Rect rect0, float f) {
        return this.S() ? ((int)(((float)rect0.centerY()) - f / 2.0f)) : rect0.top + this.i.getCompoundPaddingTop();
    }

    private void t0() {
        if(this.T != 1) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.f.getLayoutParams();
            int v = this.v();
            if(v != linearLayout$LayoutParams0.topMargin) {
                linearLayout$LayoutParams0.topMargin = v;
                this.f.requestLayout();
            }
        }
    }

    private Rect u(Rect rect0) {
        if(this.i == null) {
            throw new IllegalStateException();
        }
        float f = this.A0.w();
        this.e0.left = rect0.left + this.i.getCompoundPaddingLeft();
        this.e0.top = this.t(rect0, f);
        this.e0.right = rect0.right - this.i.getCompoundPaddingRight();
        this.e0.bottom = this.s(rect0, this.e0, f);
        return this.e0;
    }

    void u0(boolean z) {
        this.v0(z, false);
    }

    private int v() {
        if(!this.H) {
            return 0;
        }
        switch(this.T) {
            case 0: {
                return (int)this.A0.q();
            }
            case 2: {
                return (int)(this.A0.q() / 2.0f);
            }
            default: {
                return 0;
            }
        }
    }

    private void v0(boolean z, boolean z1) {
        boolean z2 = this.isEnabled();
        boolean z3 = false;
        boolean z4 = this.i != null && !TextUtils.isEmpty(this.i.getText());
        if(this.i != null && this.i.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList0 = this.n0;
        if(colorStateList0 != null) {
            this.A0.M(colorStateList0);
        }
        if(!z2) {
            ColorStateList colorStateList1 = ColorStateList.valueOf((this.n0 == null ? this.x0 : this.n0.getColorForState(new int[]{0xFEFEFF62}, this.x0)));
            this.A0.M(colorStateList1);
        }
        else if(this.d0()) {
            ColorStateList colorStateList2 = this.o.r();
            this.A0.M(colorStateList2);
        }
        else if(this.r) {
            TextView textView0 = this.t;
            if(textView0 != null) {
                ColorStateList colorStateList3 = textView0.getTextColors();
                this.A0.M(colorStateList3);
                goto label_26;
            }
            goto label_22;
        }
        else {
        label_22:
            if(z3) {
                ColorStateList colorStateList4 = this.o0;
                if(colorStateList4 != null) {
                    this.A0.R(colorStateList4);
                }
            }
        }
    label_26:
        if(!z4 && this.B0 && (!this.isEnabled() || !z3)) {
            if(z1 || !this.z0) {
                this.F(z);
            }
        }
        else if(z1 || this.z0) {
            this.z(z);
        }
    }

    private boolean w() {
        return this.T == 2 && this.x();
    }

    private void w0() {
        if(this.y != null) {
            EditText editText0 = this.i;
            if(editText0 != null) {
                int v = editText0.getGravity();
                this.y.setGravity(v);
                this.y.setPadding(this.i.getCompoundPaddingLeft(), this.i.getCompoundPaddingTop(), this.i.getCompoundPaddingRight(), this.i.getCompoundPaddingBottom());
            }
        }
    }

    private boolean x() {
        return this.V > -1 && this.b0 != 0;
    }

    private void x0() {
        this.y0((this.i == null ? null : this.i.getText()));
    }

    private void y() {
        if(this.B()) {
            ((com.google.android.material.textfield.h)this.K).k0();
        }
    }

    private void y0(Editable editable0) {
        if(this.s.a(editable0) == 0 && !this.z0) {
            this.g0();
            return;
        }
        this.L();
    }

    private void z(boolean z) {
        if(this.D0 != null && this.D0.isRunning()) {
            this.D0.cancel();
        }
        if(!z || !this.C0) {
            this.A0.c0(1.0f);
        }
        else {
            this.l(1.0f);
        }
        this.z0 = false;
        if(this.B()) {
            this.W();
        }
        this.x0();
        this.g.l(false);
        this.h.H(false);
    }

    private void z0(boolean z, boolean z1) {
        int v = this.s0.getDefaultColor();
        int v1 = this.s0.getColorForState(new int[]{0x1010367, 0x101009E}, v);
        int v2 = this.s0.getColorForState(new int[]{0x10102FE, 0x101009E}, v);
        if(z) {
            this.b0 = v2;
            return;
        }
        if(z1) {
            this.b0 = v1;
            return;
        }
        this.b0 = v;
    }
}

