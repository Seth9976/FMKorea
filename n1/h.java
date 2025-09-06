package N1;

import O.c;
import O.d;
import O.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.b;

public final class h extends i {
    class a extends c {
        a(String s) {
        }

        @Override  // O.c
        public float a(Object object0) {
            return this.c(((h)object0));
        }

        @Override  // O.c
        public void b(Object object0, float f) {
            this.d(((h)object0), f);
        }

        public float c(h h0) {
            return h.t(h0) * 10000.0f;
        }

        public void d(h h0, float f) {
            h0.z(f / 10000.0f);
        }
    }

    private j u;
    private final e v;
    private final d w;
    private final N1.j.a x;
    private boolean y;
    private static final c z;

    static {
        h.z = new a("indicatorLevel");
    }

    h(Context context0, N1.c c0, j j0) {
        super(context0, c0);
        this.y = false;
        this.y(j0);
        this.x = new N1.j.a();
        e e0 = new e();
        this.v = e0;
        e0.d(1.0f);
        e0.f(50.0f);
        d d0 = new d(this, h.z);
        this.w = d0;
        d0.p(e0);
        this.n(1.0f);
    }

    void A(float f) {
        this.setLevel(((int)(f * 10000.0f)));
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = new Rect();
        if(!this.getBounds().isEmpty() && this.isVisible() && canvas0.getClipBounds(rect0)) {
            canvas0.save();
            this.u.g(canvas0, this.getBounds(), this.h(), this.k(), this.j());
            this.r.setStyle(Paint.Style.FILL);
            this.r.setAntiAlias(true);
            N1.c c0 = this.g;
            this.x.c = c0.c[0];
            int v = c0.g;
            if(v > 0) {
                j j0 = this.u;
                int v1 = this.g.d;
                int v2 = this.getAlpha();
                j0.d(canvas0, this.r, this.x(), 1.0f, v1, v2, ((int)(((float)v) * x.a.a(this.x(), 0.0f, 0.01f) / 0.01f)));
            }
            else {
                j j1 = this.u;
                int v3 = c0.d;
                int v4 = this.getAlpha();
                j1.d(canvas0, this.r, 0.0f, 1.0f, v3, v4, 0);
            }
            j j2 = this.u;
            int v5 = this.getAlpha();
            j2.c(canvas0, this.r, this.x, v5);
            j j3 = this.u;
            int v6 = this.g.c[0];
            int v7 = this.getAlpha();
            j3.b(canvas0, this.r, v6, v7);
            canvas0.restore();
        }
    }

    @Override  // N1.i
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.u.e();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.u.f();
    }

    @Override  // N1.i
    public int getOpacity() {
        return super.getOpacity();
    }

    @Override  // N1.i
    public boolean i() {
        return super.i();
    }

    @Override  // N1.i
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override  // N1.i
    public boolean j() {
        return super.j();
    }

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.w.q();
        this.z(((float)this.getLevel()) / 10000.0f);
    }

    @Override  // N1.i
    public boolean k() {
        return super.k();
    }

    @Override  // N1.i
    public void m(b b0) {
        super.m(b0);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        if(this.y) {
            this.w.q();
            this.z(((float)v) / 10000.0f);
            return true;
        }
        this.w.h(this.x() * 10000.0f);
        this.w.l(((float)v));
        return true;
    }

    @Override  // N1.i
    public boolean q(boolean z, boolean z1, boolean z2) {
        return super.q(z, z1, z2);
    }

    @Override  // N1.i
    boolean r(boolean z, boolean z1, boolean z2) {
        boolean z3 = super.r(z, z1, z2);
        float f = this.h.a(this.f.getContentResolver());
        if(f == 0.0f) {
            this.y = true;
            return z3;
        }
        this.y = false;
        this.v.f(50.0f / f);
        return z3;
    }

    @Override  // N1.i
    public boolean s(b b0) {
        return super.s(b0);
    }

    @Override  // N1.i
    public void setAlpha(int v) {
        super.setAlpha(v);
    }

    @Override  // N1.i
    public void setColorFilter(ColorFilter colorFilter0) {
        super.setColorFilter(colorFilter0);
    }

    @Override  // N1.i
    public boolean setVisible(boolean z, boolean z1) {
        return super.setVisible(z, z1);
    }

    @Override  // N1.i
    public void start() {
        super.start();
    }

    @Override  // N1.i
    public void stop() {
        super.stop();
    }

    static float t(h h0) {
        return h0.x();
    }

    static h v(Context context0, g g0, N1.d d0) {
        return new h(context0, g0, d0);
    }

    j w() {
        return this.u;
    }

    private float x() {
        return this.x.b;
    }

    void y(j j0) {
        this.u = j0;
    }

    private void z(float f) {
        this.x.b = f;
        this.invalidateSelf();
    }
}

