package com.google.android.material.badge;

import P1.c;
import P1.d;
import S1.g;
import S1.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.core.view.Y;
import com.google.android.material.internal.n.b;
import com.google.android.material.internal.n;
import com.google.android.material.internal.q;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import z1.e;
import z1.i;
import z1.j;

public class a extends Drawable implements b {
    private final WeakReference f;
    private final g g;
    private final n h;
    private final Rect i;
    private final BadgeState j;
    private float k;
    private float l;
    private int m;
    private float n;
    private float o;
    private float p;
    private WeakReference q;
    private WeakReference r;
    private static final int s;
    private static final int t;

    static {
        a.s = j.n;
        a.t = z1.a.d;
    }

    private a(Context context0, int v, int v1, int v2, State badgeState$State0) {
        this.f = new WeakReference(context0);
        q.c(context0);
        this.i = new Rect();
        n n0 = new n(this);
        this.h = n0;
        n0.g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState0 = new BadgeState(context0, v, v1, v2, badgeState$State0);
        this.j = badgeState0;
        this.g = new g(k.b(context0, (this.z() ? badgeState0.m() : badgeState0.i()), (this.z() ? badgeState0.l() : badgeState0.h())).m());
        this.M();
    }

    // 去混淆评级： 低(20)
    public boolean A() {
        return !this.j.E() && this.j.D();
    }

    public boolean B() {
        return this.j.E();
    }

    private boolean C() {
        FrameLayout frameLayout0 = this.i();
        return frameLayout0 != null && frameLayout0.getId() == e.v;
    }

    private void D() {
        int v = this.getAlpha();
        this.h.g().setAlpha(v);
        this.invalidateSelf();
    }

    private void E() {
        ColorStateList colorStateList0 = ColorStateList.valueOf(this.j.e());
        if(this.g.v() != colorStateList0) {
            this.g.V(colorStateList0);
            this.invalidateSelf();
        }
    }

    private void F() {
        this.h.l(true);
        this.H();
        this.Q();
        this.invalidateSelf();
    }

    private void G() {
        if(this.q != null && this.q.get() != null) {
            this.P(((View)this.q.get()), (this.r == null ? null : ((FrameLayout)this.r.get())));
        }
    }

    private void H() {
        Context context0 = (Context)this.f.get();
        if(context0 == null) {
            return;
        }
        int v = this.z() ? this.j.m() : this.j.i();
        this.g.setShapeAppearanceModel(k.b(context0, v, (this.z() ? this.j.l() : this.j.h())).m());
        this.invalidateSelf();
    }

    private void I() {
        Context context0 = (Context)this.f.get();
        if(context0 == null) {
            return;
        }
        d d0 = new d(context0, this.j.A());
        if(this.h.e() == d0) {
            return;
        }
        this.h.k(d0, context0);
        this.J();
        this.Q();
        this.invalidateSelf();
    }

    private void J() {
        int v = this.j.j();
        this.h.g().setColor(v);
        this.invalidateSelf();
    }

    private void K() {
        this.R();
        this.h.l(true);
        this.Q();
        this.invalidateSelf();
    }

    private void L() {
        boolean z = this.j.G();
        this.setVisible(z, false);
        if(com.google.android.material.badge.b.a && this.i() != null && !z) {
            ((ViewGroup)this.i().getParent()).invalidate();
        }
    }

    private void M() {
        this.H();
        this.I();
        this.K();
        this.F();
        this.D();
        this.E();
        this.J();
        this.G();
        this.Q();
        this.L();
    }

    private void N(View view0) {
        class com.google.android.material.badge.a.a implements Runnable {
            final View f;
            final FrameLayout g;
            final a h;

            com.google.android.material.badge.a.a(View view0, FrameLayout frameLayout0) {
                this.f = view0;
                this.g = frameLayout0;
                super();
            }

            @Override
            public void run() {
                a.this.P(this.f, this.g);
            }
        }

        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        if(viewGroup0 != null && viewGroup0.getId() == e.v || this.r != null && this.r.get() == viewGroup0) {
            return;
        }
        a.O(view0);
        FrameLayout frameLayout0 = new FrameLayout(view0.getContext());
        frameLayout0.setId(e.v);
        frameLayout0.setClipChildren(false);
        frameLayout0.setClipToPadding(false);
        frameLayout0.setLayoutParams(view0.getLayoutParams());
        frameLayout0.setMinimumWidth(view0.getWidth());
        frameLayout0.setMinimumHeight(view0.getHeight());
        int v = viewGroup0.indexOfChild(view0);
        viewGroup0.removeViewAt(v);
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout0.addView(view0);
        viewGroup0.addView(frameLayout0, v);
        this.r = new WeakReference(frameLayout0);
        frameLayout0.post(new com.google.android.material.badge.a.a(this, view0, frameLayout0));
    }

    private static void O(View view0) {
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        viewGroup0.setClipChildren(false);
        viewGroup0.setClipToPadding(false);
    }

    public void P(View view0, FrameLayout frameLayout0) {
        this.q = new WeakReference(view0);
        boolean z = com.google.android.material.badge.b.a;
        if(!z || frameLayout0 != null) {
            this.r = new WeakReference(frameLayout0);
        }
        else {
            this.N(view0);
        }
        if(!z) {
            a.O(view0);
        }
        this.Q();
        this.invalidateSelf();
    }

    private void Q() {
        Context context0 = (Context)this.f.get();
        ViewGroup viewGroup0 = null;
        View view0 = this.q == null ? null : ((View)this.q.get());
        if(context0 != null && view0 != null) {
            Rect rect0 = new Rect();
            rect0.set(this.i);
            Rect rect1 = new Rect();
            view0.getDrawingRect(rect1);
            WeakReference weakReference0 = this.r;
            if(weakReference0 != null) {
                viewGroup0 = (ViewGroup)weakReference0.get();
            }
            if(viewGroup0 != null || com.google.android.material.badge.b.a) {
                if(viewGroup0 == null) {
                    viewGroup0 = (ViewGroup)view0.getParent();
                }
                viewGroup0.offsetDescendantRectToMyCoords(view0, rect1);
            }
            this.c(rect1, view0);
            com.google.android.material.badge.b.f(this.i, this.k, this.l, this.o, this.p);
            float f = this.n;
            if(f != -1.0f) {
                this.g.S(f);
            }
            if(!rect0.equals(this.i)) {
                this.g.setBounds(this.i);
            }
        }
    }

    private void R() {
        if(this.m() != -2) {
            this.m = ((int)Math.pow(10.0, ((double)this.m()) - 1.0)) - 1;
            return;
        }
        this.m = this.n();
    }

    @Override  // com.google.android.material.internal.n$b
    public void a() {
        this.invalidateSelf();
    }

    private void b(View view0) {
        float f2;
        float f1;
        View view1 = this.i();
        if(view1 == null) {
            if(!(view0.getParent() instanceof View)) {
                return;
            }
            float f = view0.getY();
            f1 = view0.getX();
            view1 = (View)view0.getParent();
            f2 = f;
        }
        else if(this.C()) {
            if(!(view1.getParent() instanceof View)) {
                return;
            }
            f2 = view1.getY();
            f1 = view1.getX();
            view1 = (View)view1.getParent();
        }
        else {
            f2 = 0.0f;
            f1 = 0.0f;
        }
        float f3 = this.w(view1, f2);
        float f4 = this.l(view1, f1);
        float f5 = this.g(view1, f2);
        float f6 = this.r(view1, f1);
        if(f3 < 0.0f) {
            this.l += Math.abs(f3);
        }
        if(f4 < 0.0f) {
            this.k += Math.abs(f4);
        }
        if(f5 > 0.0f) {
            this.l -= Math.abs(f5);
        }
        if(f6 > 0.0f) {
            this.k -= Math.abs(f6);
        }
    }

    private void c(Rect rect0, View view0) {
        float f = this.z() ? this.j.d : this.j.c;
        this.n = f;
        if(Float.compare(f, -1.0f) == 0) {
            this.o = (float)Math.round((this.z() ? this.j.g : this.j.e) / 2.0f);
            this.p = (float)Math.round((this.z() ? this.j.h : this.j.f) / 2.0f);
        }
        else {
            this.o = f;
            this.p = f;
        }
        if(this.z()) {
            String s = this.f();
            this.o = Math.max(this.o, this.h.h(s) / 2.0f + ((float)this.j.g()));
            float f1 = Math.max(this.p, this.h.f(s) / 2.0f + ((float)this.j.k()));
            this.p = f1;
            this.o = Math.max(this.o, f1);
        }
        int v = this.y();
        switch(this.j.f()) {
            case 0x800053: 
            case 0x800055: {
                this.l = (float)(rect0.bottom - v);
                break;
            }
            default: {
                this.l = (float)(rect0.top + v);
            }
        }
        int v1 = this.x();
        switch(this.j.f()) {
            case 0x800033: 
            case 0x800053: {
                this.k = Y.z(view0) == 0 ? ((float)rect0.left) - this.o + ((float)v1) : ((float)rect0.right) + this.o - ((float)v1);
                break;
            }
            default: {
                this.k = Y.z(view0) == 0 ? ((float)rect0.right) + this.o - ((float)v1) : ((float)rect0.left) - this.o + ((float)v1);
            }
        }
        if(this.j.F()) {
            this.b(view0);
        }
    }

    static a d(Context context0, State badgeState$State0) {
        return new a(context0, 0, a.t, a.s, badgeState$State0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        if(!this.getBounds().isEmpty() && this.getAlpha() != 0 && this.isVisible()) {
            this.g.draw(canvas0);
            if(this.z()) {
                this.e(canvas0);
            }
        }
    }

    private void e(Canvas canvas0) {
        String s = this.f();
        if(s != null) {
            Rect rect0 = new Rect();
            this.h.g().getTextBounds(s, 0, s.length(), rect0);
            float f = this.l - rect0.exactCenterY();
            canvas0.drawText(s, this.k, ((float)(rect0.bottom > 0 ? Math.round(f) : ((int)f))), this.h.g());
        }
    }

    private String f() {
        if(this.B()) {
            return this.u();
        }
        return this.A() ? this.p() : null;
    }

    private float g(View view0, float f) {
        if(view0.getParent() instanceof View) {
            View view1 = (View)view0.getParent();
            return this.l + this.p - (((float)view1.getHeight()) - view0.getY()) + f;
        }
        return 0.0f;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.j.d();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.i.height();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.i.width();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence h() {
        if(!this.isVisible()) {
            return null;
        }
        if(this.B()) {
            return this.v();
        }
        return this.A() ? this.q() : this.j();
    }

    public FrameLayout i() {
        return this.r == null ? null : ((FrameLayout)this.r.get());
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    private CharSequence j() {
        return this.j.p();
    }

    public int k() {
        return this.j.s();
    }

    private float l(View view0, float f) {
        return this.k - this.o + view0.getX() + f;
    }

    public int m() {
        return this.j.u();
    }

    public int n() {
        return this.j.v();
    }

    // 去混淆评级： 低(20)
    public int o() {
        return this.j.D() ? this.j.w() : 0;
    }

    @Override  // android.graphics.drawable.Drawable, com.google.android.material.internal.n$b
    public boolean onStateChange(int[] arr_v) {
        return super.onStateChange(arr_v);
    }

    private String p() {
        if(this.m != -2 && this.o() > this.m) {
            Context context0 = (Context)this.f.get();
            return context0 == null ? "" : String.format(this.j.x(), context0.getString(i.p), this.m, "+");
        }
        return NumberFormat.getInstance(this.j.x()).format(((long)this.o()));
    }

    private String q() {
        if(this.j.q() != 0) {
            Context context0 = (Context)this.f.get();
            if(context0 == null) {
                return null;
            }
            return this.m == -2 || this.o() <= this.m ? context0.getResources().getQuantityString(this.j.q(), this.o(), new Object[]{this.o()}) : context0.getString(this.j.n(), new Object[]{this.m});
        }
        return null;
    }

    private float r(View view0, float f) {
        if(view0.getParent() instanceof View) {
            View view1 = (View)view0.getParent();
            return this.k + this.o - (((float)view1.getWidth()) - view0.getX()) + f;
        }
        return 0.0f;
    }

    State s() {
        return this.j.y();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.j.I(v);
        this.D();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
    }

    public String t() {
        return this.j.z();
    }

    private String u() {
        String s = this.t();
        int v = this.m();
        if(v == -2) {
            return s;
        }
        if(s != null && s.length() > v) {
            Context context0 = (Context)this.f.get();
            return context0 == null ? "" : String.format(context0.getString(i.i), s.substring(0, v - 1), "…");
        }
        return s;
    }

    private CharSequence v() {
        CharSequence charSequence0 = this.j.o();
        return charSequence0 != null ? charSequence0 : this.t();
    }

    private float w(View view0, float f) {
        return this.l - this.p + view0.getY() + f;
    }

    private int x() {
        int v = this.z() ? this.j.r() : this.j.s();
        if(this.j.k == 1) {
            v += (this.z() ? this.j.j : this.j.i);
        }
        return v + this.j.b();
    }

    private int y() {
        int v = this.j.C();
        if(this.z()) {
            v = this.j.B();
            Context context0 = (Context)this.f.get();
            if(context0 != null) {
                float f = A1.a.b(0.0f, 1.0f, 0.3f, 1.0f, c.f(context0) - 1.0f);
                v = A1.a.c(v, v - this.j.t(), f);
            }
        }
        if(this.j.k == 0) {
            v -= Math.round(this.p);
        }
        return v + this.j.c();
    }

    // 去混淆评级： 低(20)
    private boolean z() {
        return this.B() || this.A();
    }
}

