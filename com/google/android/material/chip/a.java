package com.google.android.material.chip;

import A1.d;
import P1.c;
import S1.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.n.b;
import com.google.android.material.internal.n;
import com.google.android.material.internal.q;
import com.google.android.material.internal.t;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import z1.k;

public class a extends g implements Drawable.Callback, b {
    public interface com.google.android.material.chip.a.a {
        void a();
    }

    private int A0;
    private int B0;
    private ColorFilter C0;
    private PorterDuffColorFilter D0;
    private ColorStateList E;
    private ColorStateList E0;
    private ColorStateList F;
    private PorterDuff.Mode F0;
    private float G;
    private int[] G0;
    private float H;
    private boolean H0;
    private ColorStateList I;
    private ColorStateList I0;
    private float J;
    private WeakReference J0;
    private ColorStateList K;
    private TextUtils.TruncateAt K0;
    private CharSequence L;
    private boolean L0;
    private boolean M;
    private int M0;
    private Drawable N;
    private boolean N0;
    private ColorStateList O;
    private static final int[] O0;
    private float P;
    private static final ShapeDrawable P0;
    private boolean Q;
    private boolean R;
    private Drawable S;
    private Drawable T;
    private ColorStateList U;
    private float V;
    private CharSequence W;
    private boolean X;
    private boolean Y;
    private Drawable Z;
    private ColorStateList a0;
    private d b0;
    private d c0;
    private float d0;
    private float e0;
    private float f0;
    private float g0;
    private float h0;
    private float i0;
    private float j0;
    private float k0;
    private final Context l0;
    private final Paint m0;
    private final Paint n0;
    private final Paint.FontMetrics o0;
    private final RectF p0;
    private final PointF q0;
    private final Path r0;
    private final n s0;
    private int t0;
    private int u0;
    private int v0;
    private int w0;
    private int x0;
    private int y0;
    private boolean z0;

    static {
        a.O0 = new int[]{0x101009E};
        a.P0 = new ShapeDrawable(new OvalShape());
    }

    private a(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.H = -1.0f;
        this.m0 = new Paint(1);
        this.o0 = new Paint.FontMetrics();
        this.p0 = new RectF();
        this.q0 = new PointF();
        this.r0 = new Path();
        this.B0 = 0xFF;
        this.F0 = PorterDuff.Mode.SRC_IN;
        this.J0 = new WeakReference(null);
        this.K(context0);
        this.l0 = context0;
        n n0 = new n(this);
        this.s0 = n0;
        this.L = "";
        n0.g().density = context0.getResources().getDisplayMetrics().density;
        this.n0 = null;
        this.setState(a.O0);
        this.h2(a.O0);
        this.L0 = true;
        if(Q1.b.a) {
            a.P0.setTint(-1);
        }
    }

    private void A0(Canvas canvas0, Rect rect0) {
        if(this.L != null) {
            Paint.Align paint$Align0 = this.p0(rect0, this.q0);
            this.n0(rect0, this.p0);
            if(this.s0.e() != null) {
                this.s0.g().drawableState = this.getState();
                this.s0.n(this.l0);
            }
            this.s0.g().setTextAlign(paint$Align0);
            int v = 0;
            boolean z = Math.round(this.s0.h(this.d1().toString())) > Math.round(this.p0.width());
            if(z) {
                v = canvas0.save();
                canvas0.clipRect(this.p0);
            }
            CharSequence charSequence0 = this.L;
            if(z && this.K0 != null) {
                float f = this.p0.width();
                charSequence0 = TextUtils.ellipsize(charSequence0, this.s0.g(), f, this.K0);
            }
            canvas0.drawText(charSequence0, 0, charSequence0.length(), this.q0.x, this.q0.y, this.s0.g());
            if(z) {
                canvas0.restoreToCount(v);
            }
        }
    }

    public void A1(boolean z) {
        if(this.Y != z) {
            boolean z1 = this.J2();
            this.Y = z;
            boolean z2 = this.J2();
            if(z1 != z2) {
                if(z2) {
                    this.g0(this.Z);
                }
                else {
                    this.M2(this.Z);
                }
                this.invalidateSelf();
                this.r1();
            }
        }
    }

    public void A2(P1.d d0) {
        this.s0.k(d0, this.l0);
    }

    public Drawable B0() {
        return this.Z;
    }

    public void B1(ColorStateList colorStateList0) {
        if(this.F != colorStateList0) {
            this.F = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public void B2(int v) {
        this.A2(new P1.d(this.l0, v));
    }

    public ColorStateList C0() {
        return this.a0;
    }

    public void C1(int v) {
        this.B1(f.a.a(this.l0, v));
    }

    public void C2(float f) {
        if(this.h0 != f) {
            this.h0 = f;
            this.invalidateSelf();
            this.r1();
        }
    }

    public ColorStateList D0() {
        return this.F;
    }

    public void D1(float f) {
        if(this.H != f) {
            this.H = f;
            this.setShapeAppearanceModel(this.B().w(f));
        }
    }

    public void D2(int v) {
        this.C2(this.l0.getResources().getDimension(v));
    }

    // 去混淆评级： 低(20)
    public float E0() {
        return this.N0 ? this.D() : this.H;
    }

    public void E1(int v) {
        this.D1(this.l0.getResources().getDimension(v));
    }

    public void E2(float f) {
        P1.d d0 = this.e1();
        if(d0 != null) {
            d0.l(f);
            this.s0.g().setTextSize(f);
            this.a();
        }
    }

    public float F0() {
        return this.k0;
    }

    public void F1(float f) {
        if(this.k0 != f) {
            this.k0 = f;
            this.invalidateSelf();
            this.r1();
        }
    }

    public void F2(float f) {
        if(this.g0 != f) {
            this.g0 = f;
            this.invalidateSelf();
            this.r1();
        }
    }

    public Drawable G0() {
        return this.N == null ? null : androidx.core.graphics.drawable.a.q(this.N);
    }

    public void G1(int v) {
        this.F1(this.l0.getResources().getDimension(v));
    }

    public void G2(int v) {
        this.F2(this.l0.getResources().getDimension(v));
    }

    public float H0() {
        return this.P;
    }

    public void H1(Drawable drawable0) {
        Drawable drawable1 = this.G0();
        if(drawable1 != drawable0) {
            float f = this.i0();
            this.N = drawable0 == null ? null : drawable0.mutate();
            float f1 = this.i0();
            this.M2(drawable1);
            if(this.K2()) {
                this.g0(this.N);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.r1();
            }
        }
    }

    public void H2(boolean z) {
        if(this.H0 != z) {
            this.H0 = z;
            this.N2();
            this.onStateChange(this.getState());
        }
    }

    public ColorStateList I0() {
        return this.O;
    }

    public void I1(int v) {
        this.H1(f.a.b(this.l0, v));
    }

    boolean I2() {
        return this.L0;
    }

    public float J0() {
        return this.G;
    }

    public void J1(float f) {
        if(this.P != f) {
            float f1 = this.i0();
            this.P = f;
            float f2 = this.i0();
            this.invalidateSelf();
            if(f1 != f2) {
                this.r1();
            }
        }
    }

    // 去混淆评级： 低(20)
    private boolean J2() {
        return this.Y && this.Z != null && this.z0;
    }

    public float K0() {
        return this.d0;
    }

    public void K1(int v) {
        this.J1(this.l0.getResources().getDimension(v));
    }

    private boolean K2() {
        return this.M && this.N != null;
    }

    public ColorStateList L0() {
        return this.I;
    }

    public void L1(ColorStateList colorStateList0) {
        this.Q = true;
        if(this.O != colorStateList0) {
            this.O = colorStateList0;
            if(this.K2()) {
                androidx.core.graphics.drawable.a.o(this.N, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    private boolean L2() {
        return this.R && this.S != null;
    }

    public float M0() {
        return this.J;
    }

    public void M1(int v) {
        this.L1(f.a.a(this.l0, v));
    }

    private void M2(Drawable drawable0) {
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
    }

    public Drawable N0() {
        return this.S == null ? null : androidx.core.graphics.drawable.a.q(this.S);
    }

    public void N1(int v) {
        this.O1(this.l0.getResources().getBoolean(v));
    }

    private void N2() {
        this.I0 = this.H0 ? Q1.b.d(this.K) : null;
    }

    public CharSequence O0() {
        return this.W;
    }

    public void O1(boolean z) {
        if(this.M != z) {
            boolean z1 = this.K2();
            this.M = z;
            boolean z2 = this.K2();
            if(z1 != z2) {
                if(z2) {
                    this.g0(this.N);
                }
                else {
                    this.M2(this.N);
                }
                this.invalidateSelf();
                this.r1();
            }
        }
    }

    private void O2() {
        this.T = new RippleDrawable(Q1.b.d(this.b1()), this.S, a.P0);
    }

    public float P0() {
        return this.j0;
    }

    public void P1(float f) {
        if(this.G != f) {
            this.G = f;
            this.invalidateSelf();
            this.r1();
        }
    }

    public float Q0() {
        return this.V;
    }

    public void Q1(int v) {
        this.P1(this.l0.getResources().getDimension(v));
    }

    public float R0() {
        return this.i0;
    }

    public void R1(float f) {
        if(this.d0 != f) {
            this.d0 = f;
            this.invalidateSelf();
            this.r1();
        }
    }

    public int[] S0() {
        return this.G0;
    }

    public void S1(int v) {
        this.R1(this.l0.getResources().getDimension(v));
    }

    public ColorStateList T0() {
        return this.U;
    }

    public void T1(ColorStateList colorStateList0) {
        if(this.I != colorStateList0) {
            this.I = colorStateList0;
            if(this.N0) {
                this.b0(colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public void U0(RectF rectF0) {
        this.l0(this.getBounds(), rectF0);
    }

    public void U1(int v) {
        this.T1(f.a.a(this.l0, v));
    }

    private float V0() {
        Drawable drawable0 = this.z0 ? this.Z : this.N;
        float f = this.P;
        if(f <= 0.0f && drawable0 != null) {
            f = (float)Math.ceil(t.c(this.l0, 24));
            return ((float)drawable0.getIntrinsicHeight()) <= f ? ((float)drawable0.getIntrinsicHeight()) : f;
        }
        return f;
    }

    public void V1(float f) {
        if(this.J != f) {
            this.J = f;
            this.m0.setStrokeWidth(f);
            if(this.N0) {
                super.c0(f);
            }
            this.invalidateSelf();
        }
    }

    private float W0() {
        Drawable drawable0 = this.z0 ? this.Z : this.N;
        return this.P > 0.0f || drawable0 == null ? this.P : ((float)drawable0.getIntrinsicWidth());
    }

    public void W1(int v) {
        this.V1(this.l0.getResources().getDimension(v));
    }

    public TextUtils.TruncateAt X0() {
        return this.K0;
    }

    private void X1(ColorStateList colorStateList0) {
        if(this.E != colorStateList0) {
            this.E = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public d Y0() {
        return this.c0;
    }

    public void Y1(Drawable drawable0) {
        Drawable drawable1 = this.N0();
        if(drawable1 != drawable0) {
            float f = this.m0();
            this.S = drawable0 == null ? null : drawable0.mutate();
            if(Q1.b.a) {
                this.O2();
            }
            float f1 = this.m0();
            this.M2(drawable1);
            if(this.L2()) {
                this.g0(this.S);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.r1();
            }
        }
    }

    public float Z0() {
        return this.f0;
    }

    public void Z1(CharSequence charSequence0) {
        if(this.W != charSequence0) {
            this.W = androidx.core.text.a.c().h(charSequence0);
            this.invalidateSelf();
        }
    }

    @Override  // com.google.android.material.internal.n$b
    public void a() {
        this.r1();
        this.invalidateSelf();
    }

    public float a1() {
        return this.e0;
    }

    public void a2(float f) {
        if(this.j0 != f) {
            this.j0 = f;
            this.invalidateSelf();
            if(this.L2()) {
                this.r1();
            }
        }
    }

    public ColorStateList b1() {
        return this.K;
    }

    public void b2(int v) {
        this.a2(this.l0.getResources().getDimension(v));
    }

    public d c1() {
        return this.b0;
    }

    public void c2(int v) {
        this.Y1(f.a.b(this.l0, v));
    }

    public CharSequence d1() {
        return this.L;
    }

    public void d2(float f) {
        if(this.V != f) {
            this.V = f;
            this.invalidateSelf();
            if(this.L2()) {
                this.r1();
            }
        }
    }

    @Override  // S1.g
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        if(!rect0.isEmpty() && this.getAlpha() != 0) {
            int v = this.B0 >= 0xFF ? 0 : D1.a.a(canvas0, ((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), this.B0);
            this.w0(canvas0, rect0);
            this.t0(canvas0, rect0);
            if(this.N0) {
                super.draw(canvas0);
            }
            this.v0(canvas0, rect0);
            this.y0(canvas0, rect0);
            this.u0(canvas0, rect0);
            this.s0(canvas0, rect0);
            if(this.L0) {
                this.A0(canvas0, rect0);
            }
            this.x0(canvas0, rect0);
            this.z0(canvas0, rect0);
            if(this.B0 < 0xFF) {
                canvas0.restoreToCount(v);
            }
        }
    }

    public P1.d e1() {
        return this.s0.e();
    }

    public void e2(int v) {
        this.d2(this.l0.getResources().getDimension(v));
    }

    public float f1() {
        return this.h0;
    }

    public void f2(float f) {
        if(this.i0 != f) {
            this.i0 = f;
            this.invalidateSelf();
            if(this.L2()) {
                this.r1();
            }
        }
    }

    private void g0(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        drawable0.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable0, androidx.core.graphics.drawable.a.f(this));
        drawable0.setLevel(this.getLevel());
        drawable0.setVisible(this.isVisible(), false);
        if(drawable0 == this.S) {
            if(drawable0.isStateful()) {
                drawable0.setState(this.S0());
            }
            androidx.core.graphics.drawable.a.o(drawable0, this.U);
            return;
        }
        Drawable drawable1 = this.N;
        if(drawable0 == drawable1 && this.Q) {
            androidx.core.graphics.drawable.a.o(drawable1, this.O);
        }
        if(drawable0.isStateful()) {
            drawable0.setState(this.getState());
        }
    }

    public float g1() {
        return this.g0;
    }

    public void g2(int v) {
        this.f2(this.l0.getResources().getDimension(v));
    }

    @Override  // S1.g
    public int getAlpha() {
        return this.B0;
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.C0;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int)this.G;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.d0 + this.i0() + this.g0 + this.s0.h(this.d1().toString()) + this.h0 + this.m0() + this.k0), this.M0);
    }

    @Override  // S1.g
    public int getOpacity() {
        return -3;
    }

    @Override  // S1.g
    public void getOutline(Outline outline0) {
        if(this.N0) {
            super.getOutline(outline0);
            return;
        }
        Rect rect0 = this.getBounds();
        if(rect0.isEmpty()) {
            outline0.setRoundRect(0, 0, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.H);
        }
        else {
            outline0.setRoundRect(rect0, this.H);
        }
        outline0.setAlpha(((float)this.getAlpha()) / 255.0f);
    }

    private void h0(Rect rect0, RectF rectF0) {
        rectF0.setEmpty();
        if(this.K2() || this.J2()) {
            float f = this.d0 + this.e0;
            float f1 = this.W0();
            if(androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = ((float)rect0.left) + f;
                rectF0.left = f2;
                rectF0.right = f2 + f1;
            }
            else {
                float f3 = ((float)rect0.right) - f;
                rectF0.right = f3;
                rectF0.left = f3 - f1;
            }
            float f4 = this.V0();
            float f5 = rect0.exactCenterY() - f4 / 2.0f;
            rectF0.top = f5;
            rectF0.bottom = f5 + f4;
        }
    }

    private ColorFilter h1() {
        ColorFilter colorFilter0 = this.C0;
        return colorFilter0 == null ? this.D0 : colorFilter0;
    }

    public boolean h2(int[] arr_v) {
        if(!Arrays.equals(this.G0, arr_v)) {
            this.G0 = arr_v;
            return this.L2() ? this.s1(this.getState(), arr_v) : false;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    float i0() {
        return this.K2() || this.J2() ? this.e0 + this.W0() + this.f0 : 0.0f;
    }

    public boolean i1() {
        return this.H0;
    }

    public void i2(ColorStateList colorStateList0) {
        if(this.U != colorStateList0) {
            this.U = colorStateList0;
            if(this.L2()) {
                androidx.core.graphics.drawable.a.o(this.S, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    // 去混淆评级： 中等(100)
    @Override  // S1.g
    public boolean isStateful() {
        return a.o1(this.E) || a.o1(this.F) || a.o1(this.I) || this.H0 && a.o1(this.I0) || a.n1(this.s0.e()) || this.q0() || a.p1(this.N) || a.p1(this.Z) || a.o1(this.E0);
    }

    private void j0(Rect rect0, RectF rectF0) {
        rectF0.set(rect0);
        if(this.L2()) {
            float f = this.k0 + this.j0 + this.V + this.i0 + this.h0;
            if(androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF0.right = ((float)rect0.right) - f;
                return;
            }
            rectF0.left = ((float)rect0.left) + f;
        }
    }

    private static boolean j1(int[] arr_v, int v) {
        if(arr_v == null) {
            return false;
        }
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public void j2(int v) {
        this.i2(f.a.a(this.l0, v));
    }

    private void k0(Rect rect0, RectF rectF0) {
        rectF0.setEmpty();
        if(this.L2()) {
            float f = this.k0 + this.j0;
            if(androidx.core.graphics.drawable.a.f(this) == 0) {
                float f1 = ((float)rect0.right) - f;
                rectF0.right = f1;
                rectF0.left = f1 - this.V;
            }
            else {
                float f2 = ((float)rect0.left) + f;
                rectF0.left = f2;
                rectF0.right = f2 + this.V;
            }
            float f3 = rect0.exactCenterY() - this.V / 2.0f;
            rectF0.top = f3;
            rectF0.bottom = f3 + this.V;
        }
    }

    public boolean k1() {
        return this.X;
    }

    public void k2(boolean z) {
        if(this.R != z) {
            boolean z1 = this.L2();
            this.R = z;
            boolean z2 = this.L2();
            if(z1 != z2) {
                if(z2) {
                    this.g0(this.S);
                }
                else {
                    this.M2(this.S);
                }
                this.invalidateSelf();
                this.r1();
            }
        }
    }

    private void l0(Rect rect0, RectF rectF0) {
        rectF0.setEmpty();
        if(this.L2()) {
            float f = this.k0 + this.j0 + this.V + this.i0 + this.h0;
            if(androidx.core.graphics.drawable.a.f(this) == 0) {
                float f1 = (float)rect0.right;
                rectF0.right = f1;
                rectF0.left = f1 - f;
            }
            else {
                int v = rect0.left;
                rectF0.left = (float)v;
                rectF0.right = ((float)v) + f;
            }
            rectF0.top = (float)rect0.top;
            rectF0.bottom = (float)rect0.bottom;
        }
    }

    public boolean l1() {
        return a.p1(this.S);
    }

    public void l2(com.google.android.material.chip.a.a a$a0) {
        this.J0 = new WeakReference(a$a0);
    }

    // 去混淆评级： 低(20)
    float m0() {
        return this.L2() ? this.i0 + this.V + this.j0 : 0.0f;
    }

    public boolean m1() {
        return this.R;
    }

    public void m2(TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.K0 = textUtils$TruncateAt0;
    }

    private void n0(Rect rect0, RectF rectF0) {
        rectF0.setEmpty();
        if(this.L != null) {
            float f = this.d0 + this.i0() + this.g0;
            float f1 = this.k0 + this.m0() + this.h0;
            if(androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF0.left = ((float)rect0.left) + f;
                rectF0.right = ((float)rect0.right) - f1;
            }
            else {
                rectF0.left = ((float)rect0.left) + f1;
                rectF0.right = ((float)rect0.right) - f;
            }
            rectF0.top = (float)rect0.top;
            rectF0.bottom = (float)rect0.bottom;
        }
    }

    private static boolean n1(P1.d d0) {
        return d0 != null && d0.i() != null && d0.i().isStateful();
    }

    public void n2(d d0) {
        this.c0 = d0;
    }

    private float o0() {
        this.s0.g().getFontMetrics(this.o0);
        return (this.o0.descent + this.o0.ascent) / 2.0f;
    }

    private static boolean o1(ColorStateList colorStateList0) {
        return colorStateList0 != null && colorStateList0.isStateful();
    }

    public void o2(int v) {
        this.n2(d.c(this.l0, v));
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int v) {
        boolean z = super.onLayoutDirectionChanged(v);
        if(this.K2()) {
            z |= androidx.core.graphics.drawable.a.m(this.N, v);
        }
        if(this.J2()) {
            z |= androidx.core.graphics.drawable.a.m(this.Z, v);
        }
        if(this.L2()) {
            z |= androidx.core.graphics.drawable.a.m(this.S, v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        boolean z = super.onLevelChange(v);
        if(this.K2()) {
            z |= this.N.setLevel(v);
        }
        if(this.J2()) {
            z |= this.Z.setLevel(v);
        }
        if(this.L2()) {
            z |= this.S.setLevel(v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    @Override  // S1.g, com.google.android.material.internal.n$b
    public boolean onStateChange(int[] arr_v) {
        if(this.N0) {
            super.onStateChange(arr_v);
        }
        return this.s1(arr_v, this.S0());
    }

    Paint.Align p0(Rect rect0, PointF pointF0) {
        pointF0.set(0.0f, 0.0f);
        Paint.Align paint$Align0 = Paint.Align.LEFT;
        if(this.L != null) {
            float f = this.d0 + this.i0() + this.g0;
            if(androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF0.x = ((float)rect0.left) + f;
            }
            else {
                pointF0.x = ((float)rect0.right) - f;
                paint$Align0 = Paint.Align.RIGHT;
            }
            pointF0.y = ((float)rect0.centerY()) - this.o0();
        }
        return paint$Align0;
    }

    private static boolean p1(Drawable drawable0) {
        return drawable0 != null && drawable0.isStateful();
    }

    public void p2(float f) {
        if(this.f0 != f) {
            float f1 = this.i0();
            this.f0 = f;
            float f2 = this.i0();
            this.invalidateSelf();
            if(f1 != f2) {
                this.r1();
            }
        }
    }

    // 去混淆评级： 低(20)
    private boolean q0() {
        return this.Y && this.Z != null && this.X;
    }

    private void q1(AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = q.i(this.l0, attributeSet0, k.a1, v, v1, new int[0]);
        this.N0 = typedArray0.hasValue(k.L1);
        this.X1(c.a(this.l0, typedArray0, k.y1));
        this.B1(c.a(this.l0, typedArray0, k.l1));
        this.P1(typedArray0.getDimension(k.t1, 0.0f));
        if(typedArray0.hasValue(k.m1)) {
            this.D1(typedArray0.getDimension(12, 0.0f));
        }
        this.T1(c.a(this.l0, typedArray0, k.w1));
        this.V1(typedArray0.getDimension(k.x1, 0.0f));
        this.u2(c.a(this.l0, typedArray0, k.K1));
        this.z2(typedArray0.getText(k.f1));
        P1.d d0 = c.h(this.l0, typedArray0, k.b1);
        d0.l(typedArray0.getDimension(k.c1, d0.j()));
        this.A2(d0);
        switch(typedArray0.getInt(k.d1, 0)) {
            case 1: {
                this.m2(TextUtils.TruncateAt.START);
                break;
            }
            case 2: {
                this.m2(TextUtils.TruncateAt.MIDDLE);
                break;
            }
            case 3: {
                this.m2(TextUtils.TruncateAt.END);
            }
        }
        this.O1(typedArray0.getBoolean(k.s1, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            this.O1(typedArray0.getBoolean(k.p1, false));
        }
        this.H1(c.e(this.l0, typedArray0, k.o1));
        if(typedArray0.hasValue(k.r1)) {
            this.L1(c.a(this.l0, typedArray0, 17));
        }
        this.J1(typedArray0.getDimension(k.q1, -1.0f));
        this.k2(typedArray0.getBoolean(k.F1, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            this.k2(typedArray0.getBoolean(k.A1, false));
        }
        this.Y1(c.e(this.l0, typedArray0, k.z1));
        this.i2(c.a(this.l0, typedArray0, k.E1));
        this.d2(typedArray0.getDimension(k.C1, 0.0f));
        this.t1(typedArray0.getBoolean(k.g1, false));
        this.A1(typedArray0.getBoolean(k.k1, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            this.A1(typedArray0.getBoolean(k.i1, false));
        }
        this.v1(c.e(this.l0, typedArray0, k.h1));
        if(typedArray0.hasValue(k.j1)) {
            this.x1(c.a(this.l0, typedArray0, 9));
        }
        this.x2(d.b(this.l0, typedArray0, k.M1));
        this.n2(d.b(this.l0, typedArray0, k.H1));
        this.R1(typedArray0.getDimension(k.v1, 0.0f));
        this.r2(typedArray0.getDimension(k.J1, 0.0f));
        this.p2(typedArray0.getDimension(k.I1, 0.0f));
        this.F2(typedArray0.getDimension(k.O1, 0.0f));
        this.C2(typedArray0.getDimension(k.N1, 0.0f));
        this.f2(typedArray0.getDimension(k.D1, 0.0f));
        this.a2(typedArray0.getDimension(k.B1, 0.0f));
        this.F1(typedArray0.getDimension(k.n1, 0.0f));
        this.t2(typedArray0.getDimensionPixelSize(k.e1, 0x7FFFFFFF));
        typedArray0.recycle();
    }

    public void q2(int v) {
        this.p2(this.l0.getResources().getDimension(v));
    }

    public static a r0(Context context0, AttributeSet attributeSet0, int v, int v1) {
        a a0 = new a(context0, attributeSet0, v, v1);
        a0.q1(attributeSet0, v, v1);
        return a0;
    }

    protected void r1() {
        com.google.android.material.chip.a.a a$a0 = (com.google.android.material.chip.a.a)this.J0.get();
        if(a$a0 != null) {
            a$a0.a();
        }
    }

    public void r2(float f) {
        if(this.e0 != f) {
            float f1 = this.i0();
            this.e0 = f;
            float f2 = this.i0();
            this.invalidateSelf();
            if(f1 != f2) {
                this.r1();
            }
        }
    }

    private void s0(Canvas canvas0, Rect rect0) {
        if(this.J2()) {
            this.h0(rect0, this.p0);
            float f = this.p0.left;
            float f1 = this.p0.top;
            canvas0.translate(f, f1);
            this.Z.setBounds(0, 0, ((int)this.p0.width()), ((int)this.p0.height()));
            this.Z.draw(canvas0);
            canvas0.translate(-f, -f1);
        }
    }

    private boolean s1(int[] arr_v, int[] arr_v1) {
        boolean z3;
        boolean z = super.onStateChange(arr_v);
        int v = this.l((this.E == null ? 0 : this.E.getColorForState(arr_v, this.t0)));
        boolean z1 = true;
        if(this.t0 != v) {
            this.t0 = v;
            z = true;
        }
        int v1 = this.l((this.F == null ? 0 : this.F.getColorForState(arr_v, this.u0)));
        if(this.u0 != v1) {
            this.u0 = v1;
            z = true;
        }
        int v2 = H1.a.i(v, v1);
        if(((this.v0 == v2 ? 0 : 1) | (this.v() == null ? 1 : 0)) != 0) {
            this.v0 = v2;
            this.V(ColorStateList.valueOf(v2));
            z = true;
        }
        int v3 = this.I == null ? 0 : this.I.getColorForState(arr_v, this.w0);
        if(this.w0 != v3) {
            this.w0 = v3;
            z = true;
        }
        int v4 = this.I0 == null || !Q1.b.e(arr_v) ? 0 : this.I0.getColorForState(arr_v, this.x0);
        if(this.x0 != v4) {
            this.x0 = v4;
            if(this.H0) {
                z = true;
            }
        }
        int v5 = this.s0.e() == null || this.s0.e().i() == null ? 0 : this.s0.e().i().getColorForState(arr_v, this.y0);
        if(this.y0 != v5) {
            this.y0 = v5;
            z = true;
        }
        boolean z2 = a.j1(this.getState(), 0x10100A0) && this.X;
        if(this.z0 == z2 || this.Z == null) {
            z3 = false;
        }
        else {
            float f = this.i0();
            this.z0 = z2;
            if(f == this.i0()) {
                z3 = false;
                z = true;
            }
            else {
                z = true;
                z3 = true;
            }
        }
        int v6 = this.E0 == null ? 0 : this.E0.getColorForState(arr_v, this.A0);
        if(this.A0 == v6) {
            z1 = z;
        }
        else {
            this.A0 = v6;
            this.D0 = com.google.android.material.drawable.d.k(this, this.E0, this.F0);
        }
        if(a.p1(this.N)) {
            z1 |= this.N.setState(arr_v);
        }
        if(a.p1(this.Z)) {
            z1 |= this.Z.setState(arr_v);
        }
        if(a.p1(this.S)) {
            int[] arr_v2 = new int[arr_v.length + arr_v1.length];
            System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
            System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
            z1 |= this.S.setState(arr_v2);
        }
        if(Q1.b.a && a.p1(this.T)) {
            z1 |= this.T.setState(arr_v1);
        }
        if(z1) {
            this.invalidateSelf();
        }
        if(z3) {
            this.r1();
        }
        return z1;
    }

    public void s2(int v) {
        this.r2(this.l0.getResources().getDimension(v));
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // S1.g
    public void setAlpha(int v) {
        if(this.B0 != v) {
            this.B0 = v;
            this.invalidateSelf();
        }
    }

    @Override  // S1.g
    public void setColorFilter(ColorFilter colorFilter0) {
        if(this.C0 != colorFilter0) {
            this.C0 = colorFilter0;
            this.invalidateSelf();
        }
    }

    @Override  // S1.g
    public void setTintList(ColorStateList colorStateList0) {
        if(this.E0 != colorStateList0) {
            this.E0 = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    @Override  // S1.g
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.F0 != porterDuff$Mode0) {
            this.F0 = porterDuff$Mode0;
            this.D0 = com.google.android.material.drawable.d.k(this, this.E0, porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        if(this.K2()) {
            z2 |= this.N.setVisible(z, z1);
        }
        if(this.J2()) {
            z2 |= this.Z.setVisible(z, z1);
        }
        if(this.L2()) {
            z2 |= this.S.setVisible(z, z1);
        }
        if(z2) {
            this.invalidateSelf();
        }
        return z2;
    }

    private void t0(Canvas canvas0, Rect rect0) {
        if(!this.N0) {
            this.m0.setColor(this.u0);
            this.m0.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter0 = this.h1();
            this.m0.setColorFilter(colorFilter0);
            this.p0.set(rect0);
            float f = this.E0();
            float f1 = this.E0();
            canvas0.drawRoundRect(this.p0, f, f1, this.m0);
        }
    }

    public void t1(boolean z) {
        if(this.X != z) {
            this.X = z;
            float f = this.i0();
            if(!z && this.z0) {
                this.z0 = false;
            }
            float f1 = this.i0();
            this.invalidateSelf();
            if(f != f1) {
                this.r1();
            }
        }
    }

    public void t2(int v) {
        this.M0 = v;
    }

    private void u0(Canvas canvas0, Rect rect0) {
        if(this.K2()) {
            this.h0(rect0, this.p0);
            float f = this.p0.left;
            float f1 = this.p0.top;
            canvas0.translate(f, f1);
            this.N.setBounds(0, 0, ((int)this.p0.width()), ((int)this.p0.height()));
            this.N.draw(canvas0);
            canvas0.translate(-f, -f1);
        }
    }

    public void u1(int v) {
        this.t1(this.l0.getResources().getBoolean(v));
    }

    public void u2(ColorStateList colorStateList0) {
        if(this.K != colorStateList0) {
            this.K = colorStateList0;
            this.N2();
            this.onStateChange(this.getState());
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.unscheduleDrawable(this, runnable0);
        }
    }

    private void v0(Canvas canvas0, Rect rect0) {
        if(this.J > 0.0f && !this.N0) {
            this.m0.setColor(this.w0);
            this.m0.setStyle(Paint.Style.STROKE);
            if(!this.N0) {
                ColorFilter colorFilter0 = this.h1();
                this.m0.setColorFilter(colorFilter0);
            }
            this.p0.set(((float)rect0.left) + this.J / 2.0f, ((float)rect0.top) + this.J / 2.0f, ((float)rect0.right) - this.J / 2.0f, ((float)rect0.bottom) - this.J / 2.0f);
            float f = this.H - this.J / 2.0f;
            canvas0.drawRoundRect(this.p0, f, f, this.m0);
        }
    }

    public void v1(Drawable drawable0) {
        if(this.Z != drawable0) {
            float f = this.i0();
            this.Z = drawable0;
            float f1 = this.i0();
            this.M2(this.Z);
            this.g0(this.Z);
            this.invalidateSelf();
            if(f != f1) {
                this.r1();
            }
        }
    }

    public void v2(int v) {
        this.u2(f.a.a(this.l0, v));
    }

    private void w0(Canvas canvas0, Rect rect0) {
        if(!this.N0) {
            this.m0.setColor(this.t0);
            this.m0.setStyle(Paint.Style.FILL);
            this.p0.set(rect0);
            float f = this.E0();
            float f1 = this.E0();
            canvas0.drawRoundRect(this.p0, f, f1, this.m0);
        }
    }

    public void w1(int v) {
        this.v1(f.a.b(this.l0, v));
    }

    void w2(boolean z) {
        this.L0 = z;
    }

    private void x0(Canvas canvas0, Rect rect0) {
        if(this.L2()) {
            this.k0(rect0, this.p0);
            float f = this.p0.left;
            float f1 = this.p0.top;
            canvas0.translate(f, f1);
            this.S.setBounds(0, 0, ((int)this.p0.width()), ((int)this.p0.height()));
            if(Q1.b.a) {
                this.T.setBounds(this.S.getBounds());
                this.T.jumpToCurrentState();
                this.T.draw(canvas0);
            }
            else {
                this.S.draw(canvas0);
            }
            canvas0.translate(-f, -f1);
        }
    }

    public void x1(ColorStateList colorStateList0) {
        if(this.a0 != colorStateList0) {
            this.a0 = colorStateList0;
            if(this.q0()) {
                androidx.core.graphics.drawable.a.o(this.Z, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public void x2(d d0) {
        this.b0 = d0;
    }

    private void y0(Canvas canvas0, Rect rect0) {
        this.m0.setColor(this.x0);
        this.m0.setStyle(Paint.Style.FILL);
        this.p0.set(rect0);
        if(!this.N0) {
            float f = this.E0();
            float f1 = this.E0();
            canvas0.drawRoundRect(this.p0, f, f1, this.m0);
            return;
        }
        this.h(new RectF(rect0), this.r0);
        RectF rectF0 = this.s();
        super.q(canvas0, this.m0, this.r0, rectF0);
    }

    public void y1(int v) {
        this.x1(f.a.a(this.l0, v));
    }

    public void y2(int v) {
        this.x2(d.c(this.l0, v));
    }

    private void z0(Canvas canvas0, Rect rect0) {
        Paint paint0 = this.n0;
        if(paint0 != null) {
            paint0.setColor(androidx.core.graphics.d.k(0xFF000000, 0x7F));
            canvas0.drawRect(rect0, this.n0);
            if(this.K2() || this.J2()) {
                this.h0(rect0, this.p0);
                canvas0.drawRect(this.p0, this.n0);
            }
            if(this.L != null) {
                canvas0.drawLine(((float)rect0.left), rect0.exactCenterY(), ((float)rect0.right), rect0.exactCenterY(), this.n0);
            }
            if(this.L2()) {
                this.k0(rect0, this.p0);
                canvas0.drawRect(this.p0, this.n0);
            }
            int v = androidx.core.graphics.d.k(0xFFFF0000, 0x7F);
            this.n0.setColor(v);
            this.j0(rect0, this.p0);
            canvas0.drawRect(this.p0, this.n0);
            int v1 = androidx.core.graphics.d.k(0xFF00FF00, 0x7F);
            this.n0.setColor(v1);
            this.l0(rect0, this.p0);
            canvas0.drawRect(this.p0, this.n0);
        }
    }

    public void z1(int v) {
        this.A1(this.l0.getResources().getBoolean(v));
    }

    public void z2(CharSequence charSequence0) {
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        if(!TextUtils.equals(this.L, charSequence0)) {
            this.L = charSequence0;
            this.s0.m(true);
            this.invalidateSelf();
            this.r1();
        }
    }
}

