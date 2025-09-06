package com.google.android.material.internal;

import B.h;
import P1.d;
import P1.j;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View;
import androidx.core.text.p;
import androidx.core.view.Y;
import androidx.core.view.s;

public final class a {
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private P1.a D;
    private P1.a E;
    private TextUtils.TruncateAt F;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean J;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;
    private final View a;
    private float a0;
    private float b;
    private float b0;
    private boolean c;
    private ColorStateList c0;
    private float d;
    private float d0;
    private float e;
    private float e0;
    private int f;
    private float f0;
    private final Rect g;
    private ColorStateList g0;
    private final Rect h;
    private float h0;
    private final RectF i;
    private float i0;
    private int j;
    private float j0;
    private int k;
    private StaticLayout k0;
    private float l;
    private float l0;
    private float m;
    private float m0;
    private ColorStateList n;
    private float n0;
    private ColorStateList o;
    private CharSequence o0;
    private int p;
    private int p0;
    private float q;
    private float q0;
    private float r;
    private float r0;
    private float s;
    private int s0;
    private float t;
    private static final boolean t0;
    private float u;
    private static final Paint u0;
    private float v;
    private Typeface w;
    private Typeface x;
    private Typeface y;
    private Typeface z;

    static {
        a.t0 = false;
        a.u0 = null;
    }

    public a(View view0) {
        this.j = 16;
        this.k = 16;
        this.l = 15.0f;
        this.m = 15.0f;
        this.F = TextUtils.TruncateAt.END;
        this.J = true;
        this.p0 = 1;
        this.q0 = 0.0f;
        this.r0 = 1.0f;
        this.s0 = l.n;
        this.a = view0;
        TextPaint textPaint0 = new TextPaint(0x81);
        this.V = textPaint0;
        this.W = new TextPaint(textPaint0);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        this.e = this.e();
        this.H(view0.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint0) {
        textPaint0.setTextSize(this.l);
        textPaint0.setTypeface(this.z);
        textPaint0.setLetterSpacing(this.i0);
    }

    private void B(float f) {
        if(this.c) {
            this.i.set((f < this.e ? this.g : this.h));
            return;
        }
        this.i.left = a.G(this.g.left, this.h.left, f, this.X);
        this.i.top = a.G(this.q, this.r, f, this.X);
        this.i.right = a.G(this.g.right, this.h.right, f, this.X);
        this.i.bottom = a.G(this.g.bottom, this.h.bottom, f, this.X);
    }

    private static boolean C(float f, float f1) {
        return Math.abs(f - f1) < 0.00001f;
    }

    private boolean D() {
        return Y.z(this.a) == 1;
    }

    // 去混淆评级： 低(30)
    public final boolean E() {
        return this.o != null && this.o.isStateful() || this.n != null && this.n.isStateful();
    }

    // 去混淆评级： 低(20)
    private boolean F(CharSequence charSequence0, boolean z) {
        return z ? p.d.a(charSequence0, 0, charSequence0.length()) : p.c.a(charSequence0, 0, charSequence0.length());
    }

    private static float G(float f, float f1, float f2, TimeInterpolator timeInterpolator0) {
        if(timeInterpolator0 != null) {
            f2 = timeInterpolator0.getInterpolation(f2);
        }
        return f + f2 * (f1 - f);
    }

    public void H(Configuration configuration0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            Typeface typeface0 = this.y;
            if(typeface0 != null) {
                this.x = j.b(configuration0, typeface0);
            }
            Typeface typeface1 = this.B;
            if(typeface1 != null) {
                this.A = j.b(configuration0, typeface1);
            }
            this.w = this.x == null ? this.y : this.x;
            this.z = this.A == null ? this.B : this.A;
            this.K(true);
        }
    }

    private float I(TextPaint textPaint0, CharSequence charSequence0) {
        return textPaint0.measureText(charSequence0, 0, charSequence0.length());
    }

    public void J() {
        this.K(false);
    }

    public void K(boolean z) {
        if(this.a.getHeight() > 0 && this.a.getWidth() > 0 || z) {
            this.b(z);
            this.c();
        }
    }

    private static boolean L(Rect rect0, int v, int v1, int v2, int v3) {
        return rect0.left == v && rect0.top == v1 && rect0.right == v2 && rect0.bottom == v3;
    }

    public void M(ColorStateList colorStateList0) {
        if(this.o != colorStateList0 || this.n != colorStateList0) {
            this.o = colorStateList0;
            this.n = colorStateList0;
            this.J();
        }
    }

    public void N(int v, int v1, int v2, int v3) {
        if(!a.L(this.h, v, v1, v2, v3)) {
            this.h.set(v, v1, v2, v3);
            this.U = true;
        }
    }

    public void O(Rect rect0) {
        this.N(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    public void P(int v) {
        class com.google.android.material.internal.a.a implements P1.a.a {
            final a a;

            @Override  // P1.a$a
            public void a(Typeface typeface0) {
                a.this.T(typeface0);
            }
        }

        d d0 = new d(this.a.getContext(), v);
        if(d0.i() != null) {
            this.o = d0.i();
        }
        if(d0.j() != 0.0f) {
            this.m = d0.j();
        }
        ColorStateList colorStateList0 = d0.c;
        if(colorStateList0 != null) {
            this.c0 = colorStateList0;
        }
        this.a0 = d0.h;
        this.b0 = d0.i;
        this.Z = d0.j;
        this.h0 = d0.l;
        P1.a a0 = this.E;
        if(a0 != null) {
            a0.c();
        }
        this.E = new P1.a((Typeface typeface0) -> if(a.this.U(typeface0)) {
            a.this.J();
        }, d0.e());
        d0.g(this.a.getContext(), this.E);
        this.J();
    }

    private void Q(float f) {
        this.m0 = f;
        Y.f0(this.a);
    }

    public void R(ColorStateList colorStateList0) {
        if(this.o != colorStateList0) {
            this.o = colorStateList0;
            this.J();
        }
    }

    public void S(int v) {
        if(this.k != v) {
            this.k = v;
            this.J();
        }
    }

    // 检测为 Lambda 实现
    public void T(Typeface typeface0) [...]

    private boolean U(Typeface typeface0) {
        P1.a a0 = this.E;
        if(a0 != null) {
            a0.c();
        }
        if(this.y != typeface0) {
            this.y = typeface0;
            Typeface typeface1 = j.b(this.a.getContext().getResources().getConfiguration(), typeface0);
            this.x = typeface1;
            if(typeface1 == null) {
                typeface1 = this.y;
            }
            this.w = typeface1;
            return true;
        }
        return false;
    }

    public void V(int v, int v1, int v2, int v3) {
        if(!a.L(this.g, v, v1, v2, v3)) {
            this.g.set(v, v1, v2, v3);
            this.U = true;
        }
    }

    public void W(Rect rect0) {
        this.V(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    public void X(float f) {
        if(this.i0 != f) {
            this.i0 = f;
            this.J();
        }
    }

    private void Y(float f) {
        this.n0 = f;
        Y.f0(this.a);
    }

    public void Z(int v) {
        if(this.j != v) {
            this.j = v;
            this.J();
        }
    }

    private static int a(int v, int v1, float f) {
        return Color.argb(Math.round(((float)Color.alpha(v)) * (1.0f - f) + ((float)Color.alpha(v1)) * f), Math.round(((float)Color.red(v)) * (1.0f - f) + ((float)Color.red(v1)) * f), Math.round(((float)Color.green(v)) * (1.0f - f) + ((float)Color.green(v1)) * f), Math.round(((float)Color.blue(v)) * (1.0f - f) + ((float)Color.blue(v1)) * f));
    }

    public void a0(float f) {
        if(this.l != f) {
            this.l = f;
            this.J();
        }
    }

    private void b(boolean z) {
        this.i(1.0f, z);
        CharSequence charSequence0 = this.H;
        if(charSequence0 != null) {
            StaticLayout staticLayout0 = this.k0;
            if(staticLayout0 != null) {
                float f = (float)staticLayout0.getWidth();
                this.o0 = TextUtils.ellipsize(charSequence0, this.V, f, this.F);
            }
        }
        CharSequence charSequence1 = this.o0;
        float f1 = 0.0f;
        this.l0 = charSequence1 == null ? 0.0f : this.I(this.V, charSequence1);
        int v = s.b(this.k, ((int)this.I));
        switch(v & 0x70) {
            case 0x30: {
                this.r = (float)this.h.top;
                break;
            }
            case 80: {
                this.r = ((float)this.h.bottom) + this.V.ascent();
                break;
            }
            default: {
                float f2 = this.V.descent();
                float f3 = this.V.ascent();
                this.r = ((float)this.h.centerY()) - (f2 - f3) / 2.0f;
            }
        }
        switch(v & 0x800007) {
            case 1: {
                this.t = ((float)this.h.centerX()) - this.l0 / 2.0f;
                break;
            }
            case 5: {
                this.t = ((float)this.h.right) - this.l0;
                break;
            }
            default: {
                this.t = (float)this.h.left;
            }
        }
        this.i(0.0f, z);
        float f4 = this.k0 == null ? 0.0f : ((float)this.k0.getHeight());
        StaticLayout staticLayout1 = this.k0;
        if(staticLayout1 == null || this.p0 <= 1) {
            CharSequence charSequence2 = this.H;
            if(charSequence2 != null) {
                f1 = this.I(this.V, charSequence2);
            }
        }
        else {
            f1 = (float)staticLayout1.getWidth();
        }
        this.p = this.k0 == null ? 0 : this.k0.getLineCount();
        int v1 = s.b(this.j, ((int)this.I));
        switch(v1 & 0x70) {
            case 0x30: {
                this.q = (float)this.g.top;
                break;
            }
            case 80: {
                this.q = ((float)this.g.bottom) - f4 + this.V.descent();
                break;
            }
            default: {
                this.q = ((float)this.g.centerY()) - f4 / 2.0f;
            }
        }
        switch(v1 & 0x800007) {
            case 1: {
                this.s = ((float)this.g.centerX()) - f1 / 2.0f;
                break;
            }
            case 5: {
                this.s = ((float)this.g.right) - f1;
                break;
            }
            default: {
                this.s = (float)this.g.left;
            }
        }
        this.j();
        this.d0(this.b);
    }

    private boolean b0(Typeface typeface0) {
        P1.a a0 = this.D;
        if(a0 != null) {
            a0.c();
        }
        if(this.B != typeface0) {
            this.B = typeface0;
            Typeface typeface1 = j.b(this.a.getContext().getResources().getConfiguration(), typeface0);
            this.A = typeface1;
            if(typeface1 == null) {
                typeface1 = this.B;
            }
            this.z = typeface1;
            return true;
        }
        return false;
    }

    private void c() {
        this.g(this.b);
    }

    public void c0(float f) {
        float f1 = x.a.a(f, 0.0f, 1.0f);
        if(f1 != this.b) {
            this.b = f1;
            this.c();
        }
    }

    private float d(float f) {
        return Float.compare(f, this.e) > 0 ? A1.a.b(0.0f, 1.0f, this.e, 1.0f, f) : A1.a.b(1.0f, 0.0f, this.d, this.e, f);
    }

    private void d0(float f) {
        this.h(f);
        boolean z = a.t0 && this.N != 1.0f;
        this.K = z;
        if(z) {
            this.n();
        }
        Y.f0(this.a);
    }

    private float e() {
        return this.d + (1.0f - this.d) * 0.5f;
    }

    public void e0(TimeInterpolator timeInterpolator0) {
        this.X = timeInterpolator0;
        this.J();
    }

    private boolean f(CharSequence charSequence0) {
        boolean z = this.D();
        return this.J ? this.F(charSequence0, z) : z;
    }

    public final boolean f0(int[] arr_v) {
        this.T = arr_v;
        if(this.E()) {
            this.J();
            return true;
        }
        return false;
    }

    private void g(float f) {
        float f1;
        this.B(f);
        if(!this.c) {
            this.u = a.G(this.s, this.t, f, this.X);
            this.v = a.G(this.q, this.r, f, this.X);
            this.d0(f);
            f1 = f;
        }
        else if(f < this.e) {
            this.u = this.s;
            this.v = this.q;
            this.d0(0.0f);
            f1 = 0.0f;
        }
        else {
            this.u = this.t;
            this.v = this.r - ((float)Math.max(0, this.f));
            this.d0(1.0f);
            f1 = 1.0f;
        }
        TimeInterpolator timeInterpolator0 = A1.a.b;
        this.Q(1.0f - a.G(0.0f, 1.0f, 1.0f - f, timeInterpolator0));
        this.Y(a.G(1.0f, 0.0f, f, timeInterpolator0));
        if(this.o == this.n) {
            int v1 = this.t();
            this.V.setColor(v1);
        }
        else {
            int v = a.a(this.v(), this.t(), f1);
            this.V.setColor(v);
        }
        int v2 = Build.VERSION.SDK_INT;
        float f2 = this.h0;
        float f3 = this.i0;
        if(f2 == f3) {
            this.V.setLetterSpacing(f2);
        }
        else {
            float f4 = a.G(f3, f2, f, timeInterpolator0);
            this.V.setLetterSpacing(f4);
        }
        this.P = a.G(this.d0, this.Z, f, null);
        this.Q = a.G(this.e0, this.a0, f, null);
        this.R = a.G(this.f0, this.b0, f, null);
        int v3 = a.a(this.u(this.g0), this.u(this.c0), f);
        this.S = v3;
        this.V.setShadowLayer(this.P, this.Q, this.R, v3);
        if(this.c) {
            int v4 = this.V.getAlpha();
            float f5 = this.d(f);
            this.V.setAlpha(((int)(f5 * ((float)v4))));
            if(v2 >= 0x1F) {
                float f6 = this.P;
                float f7 = this.Q;
                float f8 = this.R;
                int v5 = H1.a.a(this.S, this.V.getAlpha());
                this.V.setShadowLayer(f6, f7, f8, v5);
            }
        }
        Y.f0(this.a);
    }

    public void g0(CharSequence charSequence0) {
        if(charSequence0 == null || !TextUtils.equals(this.G, charSequence0)) {
            this.G = charSequence0;
            this.H = null;
            this.j();
            this.J();
        }
    }

    private void h(float f) {
        this.i(f, false);
    }

    public void h0(TimeInterpolator timeInterpolator0) {
        this.Y = timeInterpolator0;
        this.J();
    }

    private void i(float f, boolean z) {
        Typeface typeface0;
        float f4;
        float f3;
        if(this.G == null) {
            return;
        }
        float f1 = (float)this.h.width();
        float f2 = (float)this.g.width();
        if(a.C(f, 1.0f)) {
            f3 = this.m;
            f4 = this.h0;
            this.N = 1.0f;
            typeface0 = this.w;
        }
        else {
            float f5 = this.l;
            float f6 = this.i0;
            Typeface typeface1 = this.z;
            this.N = a.C(f, 0.0f) ? 1.0f : a.G(this.l, this.m, f, this.Y) / this.l;
            float f7 = this.m / this.l;
            f1 = z || this.c || f2 * f7 <= f1 ? f2 : Math.min(f1 / f7, f2);
            f3 = f5;
            f4 = f6;
            typeface0 = typeface1;
        }
        int v = 1;
        boolean z1 = false;
        if(Float.compare(f1, 0.0f) > 0) {
            boolean z2 = this.C != typeface0;
            boolean z3 = this.O != f3 || this.j0 != f4 || this.k0 != null && f1 != ((float)this.k0.getWidth()) || z2 || this.U;
            this.O = f3;
            this.j0 = f4;
            this.C = typeface0;
            this.U = false;
            TextPaint textPaint0 = this.V;
            if(this.N != 1.0f) {
                z1 = true;
            }
            textPaint0.setLinearText(z1);
            z1 = z3;
        }
        if(this.H == null || z1) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.j0);
            this.I = this.f(this.G);
            if(this.j0()) {
                v = this.p0;
            }
            StaticLayout staticLayout0 = this.k(v, f1, this.I);
            this.k0 = staticLayout0;
            this.H = staticLayout0.getText();
        }
    }

    public void i0(Typeface typeface0) {
        if(this.U(typeface0) || this.b0(typeface0)) {
            this.J();
        }
    }

    private void j() {
        Bitmap bitmap0 = this.L;
        if(bitmap0 != null) {
            bitmap0.recycle();
            this.L = null;
        }
    }

    // 去混淆评级： 低(30)
    private boolean j0() {
        return this.p0 > 1 && (!this.I || this.c) && !this.K;
    }

    private StaticLayout k(int v, float f, boolean z) {
        Layout.Alignment layout$Alignment0;
        if(v == 1) {
            layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
            return (StaticLayout)h.g(l.b(this.G, this.V, ((int)f)).d(this.F).g(z).c(layout$Alignment0).f(false).i(1).h(this.q0, this.r0).e(this.s0).j(null).a());
        }
        layout$Alignment0 = this.y();
        return (StaticLayout)h.g(l.b(this.G, this.V, ((int)f)).d(this.F).g(z).c(layout$Alignment0).f(false).i(v).h(this.q0, this.r0).e(this.s0).j(null).a());
    }

    public void l(Canvas canvas0) {
        int v = canvas0.save();
        if(this.H != null && this.i.width() > 0.0f && this.i.height() > 0.0f) {
            this.V.setTextSize(this.O);
            float f = this.u;
            float f1 = this.v;
            boolean z = this.K && this.L != null;
            float f2 = this.N;
            if(f2 != 1.0f && !this.c) {
                canvas0.scale(f2, f2, f, f1);
            }
            if(z) {
                canvas0.drawBitmap(this.L, f, f1, this.M);
                canvas0.restoreToCount(v);
                return;
            }
            if(!this.j0() || this.c && this.b <= this.e) {
                canvas0.translate(f, f1);
                this.k0.draw(canvas0);
            }
            else {
                this.m(canvas0, this.u - ((float)this.k0.getLineStart(0)), f1);
            }
            canvas0.restoreToCount(v);
        }
    }

    private void m(Canvas canvas0, float f, float f1) {
        int v = this.V.getAlpha();
        canvas0.translate(f, f1);
        if(!this.c) {
            this.V.setAlpha(((int)(this.n0 * ((float)v))));
            if(Build.VERSION.SDK_INT >= 0x1F) {
                float f2 = this.P;
                float f3 = this.Q;
                float f4 = this.R;
                int v1 = H1.a.a(this.S, this.V.getAlpha());
                this.V.setShadowLayer(f2, f3, f4, v1);
            }
            this.k0.draw(canvas0);
        }
        if(!this.c) {
            this.V.setAlpha(((int)(this.m0 * ((float)v))));
        }
        int v2 = Build.VERSION.SDK_INT;
        if(v2 >= 0x1F) {
            float f5 = this.P;
            float f6 = this.Q;
            float f7 = this.R;
            int v3 = H1.a.a(this.S, this.V.getAlpha());
            this.V.setShadowLayer(f5, f6, f7, v3);
        }
        int v4 = this.k0.getLineBaseline(0);
        canvas0.drawText(this.o0, 0, this.o0.length(), 0.0f, ((float)v4), this.V);
        if(v2 >= 0x1F) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if(!this.c) {
            String s = this.o0.toString().trim();
            if(s.endsWith("…")) {
                s = s.substring(0, s.length() - 1);
            }
            this.V.setAlpha(v);
            canvas0.drawText(s, 0, Math.min(this.k0.getLineEnd(0), s.length()), 0.0f, ((float)v4), this.V);
        }
    }

    private void n() {
        if(this.L == null && !this.g.isEmpty() && !TextUtils.isEmpty(this.H)) {
            this.g(0.0f);
            int v = this.k0.getWidth();
            int v1 = this.k0.getHeight();
            if(v > 0 && v1 > 0) {
                this.L = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(this.L);
                this.k0.draw(canvas0);
                if(this.M == null) {
                    this.M = new Paint(3);
                }
            }
        }
    }

    public void o(RectF rectF0, int v, int v1) {
        this.I = this.f(this.G);
        rectF0.left = Math.max(this.r(v, v1), this.h.left);
        rectF0.top = (float)this.h.top;
        rectF0.right = Math.min(this.s(rectF0, v, v1), this.h.right);
        rectF0.bottom = ((float)this.h.top) + this.q();
    }

    public ColorStateList p() {
        return this.o;
    }

    public float q() {
        this.z(this.W);
        return -this.W.ascent();
    }

    private float r(int v, int v1) {
        if(v1 != 17 && (v1 & 7) != 1) {
            if((v1 & 0x800005) != 0x800005 && (v1 & 5) != 5) {
                return this.I ? ((float)this.h.right) - this.l0 : ((float)this.h.left);
            }
            return this.I ? ((float)this.h.left) : ((float)this.h.right) - this.l0;
        }
        return ((float)v) / 2.0f - this.l0 / 2.0f;
    }

    private float s(RectF rectF0, int v, int v1) {
        if(v1 != 17 && (v1 & 7) != 1) {
            if((v1 & 0x800005) != 0x800005 && (v1 & 5) != 5) {
                return this.I ? ((float)this.h.right) : rectF0.left + this.l0;
            }
            return this.I ? rectF0.left + this.l0 : ((float)this.h.right);
        }
        return ((float)v) / 2.0f + this.l0 / 2.0f;
    }

    public int t() {
        return this.u(this.o);
    }

    private int u(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            return 0;
        }
        int[] arr_v = this.T;
        return arr_v == null ? colorStateList0.getDefaultColor() : colorStateList0.getColorForState(arr_v, 0);
    }

    private int v() {
        return this.u(this.n);
    }

    public float w() {
        this.A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.b;
    }

    private Layout.Alignment y() {
        switch(s.b(this.j, ((int)this.I)) & 7) {
            case 1: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 5: {
                return this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    private void z(TextPaint textPaint0) {
        textPaint0.setTextSize(this.m);
        textPaint0.setTypeface(this.w);
        textPaint0.setLetterSpacing(this.h0);
    }
}

