package S1;

import J1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.drawable.d;
import java.util.BitSet;

public class g extends Drawable implements n {
    public static class c extends Drawable.ConstantState {
        k a;
        a b;
        ColorFilter c;
        ColorStateList d;
        ColorStateList e;
        ColorStateList f;
        ColorStateList g;
        PorterDuff.Mode h;
        Rect i;
        float j;
        float k;
        float l;
        int m;
        float n;
        float o;
        float p;
        int q;
        int r;
        int s;
        int t;
        boolean u;
        Paint.Style v;

        public c(c g$c0) {
            this.i = null;
            this.a = g$c0.a;
            this.b = g$c0.b;
            this.l = g$c0.l;
            this.c = g$c0.c;
            this.d = g$c0.d;
            this.e = g$c0.e;
            this.h = g$c0.h;
            this.g = g$c0.g;
            this.m = g$c0.m;
            this.j = g$c0.j;
            this.s = g$c0.s;
            this.q = g$c0.q;
            this.u = g$c0.u;
            this.k = g$c0.k;
            this.n = g$c0.n;
            this.o = g$c0.o;
            this.p = g$c0.p;
            this.r = g$c0.r;
            this.t = g$c0.t;
            this.f = g$c0.f;
            this.v = g$c0.v;
            if(g$c0.i != null) {
                this.i = new Rect(g$c0.i);
            }
        }

        public c(k k0, a a0) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 0xFF;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = k0;
            this.b = a0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            Drawable drawable0 = new g(this);
            ((g)drawable0).j = true;
            return drawable0;
        }
    }

    private final RectF A;
    private boolean B;
    private static final String C = "g";
    private static final Paint D;
    private c f;
    private final S1.m.g[] g;
    private final S1.m.g[] h;
    private final BitSet i;
    private boolean j;
    private final Matrix k;
    private final Path l;
    private final Path m;
    private final RectF n;
    private final RectF o;
    private final Region p;
    private final Region q;
    private k r;
    private final Paint s;
    private final Paint t;
    private final R1.a u;
    private final b v;
    private final l w;
    private PorterDuffColorFilter x;
    private PorterDuffColorFilter y;
    private int z;

    static {
        Paint paint0 = new Paint(1);
        g.D = paint0;
        paint0.setColor(-1);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    protected g(c g$c0) {
        class S1.g.a implements b {
            final g a;

            @Override  // S1.l$b
            public void a(m m0, Matrix matrix0, int v) {
                g.b(g.this).set(v + 4, m0.e());
                g.d(g.this)[v] = m0.f(matrix0);
            }

            @Override  // S1.l$b
            public void b(m m0, Matrix matrix0, int v) {
                g.this.i.set(v, m0.e());
                g.this.g[v] = m0.f(matrix0);
            }
        }

        this.g = new S1.m.g[4];
        this.h = new S1.m.g[4];
        this.i = new BitSet(8);
        this.k = new Matrix();
        this.l = new Path();
        this.m = new Path();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new Region();
        this.q = new Region();
        Paint paint0 = new Paint(1);
        this.s = paint0;
        Paint paint1 = new Paint(1);
        this.t = paint1;
        this.u = new R1.a();
        this.w = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.A = new RectF();
        this.B = true;
        this.f = g$c0;
        paint1.setStyle(Paint.Style.STROKE);
        paint0.setStyle(Paint.Style.FILL);
        this.e0();
        this.d0(this.getState());
        this.v = new S1.g.a(this);
    }

    public g(k k0) {
        this(new c(k0, null));
    }

    public g(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this(k.e(context0, attributeSet0, v, v1).m());
    }

    public int A() {
        return (int)(((double)this.f.s) * Math.cos(Math.toRadians(this.f.t)));
    }

    public k B() {
        return this.f.a;
    }

    // 去混淆评级： 低(20)
    private float C() {
        return this.J() ? this.t.getStrokeWidth() / 2.0f : 0.0f;
    }

    public float D() {
        return this.f.a.r().a(this.s());
    }

    public float E() {
        return this.f.a.t().a(this.s());
    }

    public float F() {
        return this.f.p;
    }

    public float G() {
        return this.u() + this.F();
    }

    private boolean H() {
        int v = this.f.q;
        return v != 1 && this.f.r > 0 && (v == 2 || this.R());
    }

    private boolean I() {
        Paint.Style paint$Style0 = this.f.v;
        return paint$Style0 == Paint.Style.FILL_AND_STROKE || paint$Style0 == Paint.Style.FILL;
    }

    private boolean J() {
        Paint.Style paint$Style0 = this.f.v;
        return (paint$Style0 == Paint.Style.FILL_AND_STROKE || paint$Style0 == Paint.Style.STROKE) && this.t.getStrokeWidth() > 0.0f;
    }

    public void K(Context context0) {
        c g$c0 = this.f;
        g$c0.b = new a(context0);
        this.f0();
    }

    private void L() {
        super.invalidateSelf();
    }

    public boolean M() {
        a a0 = this.f.b;
        return a0 != null && a0.d();
    }

    public boolean N() {
        return this.f.a.u(this.s());
    }

    private void O(Canvas canvas0) {
        if(!this.H()) {
            return;
        }
        canvas0.save();
        this.Q(canvas0);
        if(!this.B) {
            this.n(canvas0);
            canvas0.restore();
            return;
        }
        int v = (int)(this.A.width() - ((float)this.getBounds().width()));
        int v1 = (int)(this.A.height() - ((float)this.getBounds().height()));
        if(v < 0 || v1 < 0) {
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
        Bitmap bitmap0 = Bitmap.createBitmap(((int)this.A.width()) + this.f.r * 2 + v, ((int)this.A.height()) + this.f.r * 2 + v1, Bitmap.Config.ARGB_8888);
        Canvas canvas1 = new Canvas(bitmap0);
        float f = (float)(this.getBounds().left - this.f.r - v);
        float f1 = (float)(this.getBounds().top - this.f.r - v1);
        canvas1.translate(-f, -f1);
        this.n(canvas1);
        canvas0.drawBitmap(bitmap0, f, f1, null);
        bitmap0.recycle();
        canvas0.restore();
    }

    private static int P(int v, int v1) [...] // Inlined contents

    private void Q(Canvas canvas0) {
        canvas0.translate(((float)this.z()), ((float)this.A()));
    }

    public boolean R() {
        int v = Build.VERSION.SDK_INT;
        return !this.N() && !this.l.isConvex() && v < 29;
    }

    public void S(float f) {
        this.setShapeAppearanceModel(this.f.a.w(f));
    }

    public void T(S1.c c0) {
        this.setShapeAppearanceModel(this.f.a.x(c0));
    }

    public void U(float f) {
        c g$c0 = this.f;
        if(g$c0.o != f) {
            g$c0.o = f;
            this.f0();
        }
    }

    public void V(ColorStateList colorStateList0) {
        c g$c0 = this.f;
        if(g$c0.d != colorStateList0) {
            g$c0.d = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public void W(float f) {
        c g$c0 = this.f;
        if(g$c0.k != f) {
            g$c0.k = f;
            this.j = true;
            this.invalidateSelf();
        }
    }

    public void X(int v, int v1, int v2, int v3) {
        c g$c0 = this.f;
        if(g$c0.i == null) {
            g$c0.i = new Rect();
        }
        this.f.i.set(v, v1, v2, v3);
        this.invalidateSelf();
    }

    public void Y(float f) {
        c g$c0 = this.f;
        if(g$c0.n != f) {
            g$c0.n = f;
            this.f0();
        }
    }

    public void Z(float f, int v) {
        this.c0(f);
        this.b0(ColorStateList.valueOf(v));
    }

    public void a0(float f, ColorStateList colorStateList0) {
        this.c0(f);
        this.b0(colorStateList0);
    }

    public void b0(ColorStateList colorStateList0) {
        c g$c0 = this.f;
        if(g$c0.e != colorStateList0) {
            g$c0.e = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public void c0(float f) {
        this.f.l = f;
        this.invalidateSelf();
    }

    static S1.m.g[] d(g g0) {
        return g0.h;
    }

    private boolean d0(int[] arr_v) {
        boolean z;
        if(this.f.d == null) {
            z = false;
        }
        else {
            int v = this.s.getColor();
            int v1 = this.f.d.getColorForState(arr_v, v);
            if(v == v1) {
                z = false;
            }
            else {
                this.s.setColor(v1);
                z = true;
            }
        }
        if(this.f.e != null) {
            int v2 = this.t.getColor();
            int v3 = this.f.e.getColorForState(arr_v, v2);
            if(v2 != v3) {
                this.t.setColor(v3);
                return true;
            }
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        this.s.setColorFilter(this.x);
        int v = this.s.getAlpha();
        this.s.setAlpha(v * (this.f.m + (this.f.m >>> 7)) >>> 8);
        this.t.setColorFilter(this.y);
        this.t.setStrokeWidth(this.f.l);
        int v1 = this.t.getAlpha();
        this.t.setAlpha(v1 * (this.f.m + (this.f.m >>> 7)) >>> 8);
        if(this.j) {
            this.i();
            this.g(this.s(), this.l);
            this.j = false;
        }
        this.O(canvas0);
        if(this.I()) {
            this.o(canvas0);
        }
        if(this.J()) {
            this.r(canvas0);
        }
        this.s.setAlpha(v);
        this.t.setAlpha(v1);
    }

    private boolean e0() {
        PorterDuffColorFilter porterDuffColorFilter0 = this.x;
        PorterDuffColorFilter porterDuffColorFilter1 = this.y;
        this.x = this.k(this.f.g, this.f.h, this.s, true);
        this.y = this.k(this.f.f, this.f.h, this.t, false);
        c g$c0 = this.f;
        if(g$c0.u) {
            int v = g$c0.g.getColorForState(this.getState(), 0);
            this.u.d(v);
        }
        return !B.c.a(porterDuffColorFilter0, this.x) || !B.c.a(porterDuffColorFilter1, this.y);
    }

    private PorterDuffColorFilter f(Paint paint0, boolean z) {
        if(z) {
            int v = paint0.getColor();
            int v1 = this.l(v);
            this.z = v1;
            return v1 == v ? null : new PorterDuffColorFilter(v1, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void f0() {
        float f = this.G();
        this.f.r = (int)Math.ceil(0.75f * f);
        this.f.s = (int)Math.ceil(f * 0.25f);
        this.e0();
        this.L();
    }

    private void g(RectF rectF0, Path path0) {
        this.h(rectF0, path0);
        if(this.f.j != 1.0f) {
            this.k.reset();
            float f = this.f.j;
            float f1 = rectF0.width();
            float f2 = rectF0.height();
            this.k.setScale(f, f, f1 / 2.0f, f2 / 2.0f);
            path0.transform(this.k);
        }
        path0.computeBounds(this.A, true);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f.m;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public void getOutline(Outline outline0) {
        if(this.f.q == 2) {
            return;
        }
        if(this.N()) {
            float f = this.D() * this.f.k;
            outline0.setRoundRect(this.getBounds(), f);
            return;
        }
        this.g(this.s(), this.l);
        d.j(outline0, this.l);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect0) {
        Rect rect1 = this.f.i;
        if(rect1 != null) {
            rect0.set(rect1);
            return true;
        }
        return super.getPadding(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Rect rect0 = this.getBounds();
        this.p.set(rect0);
        this.g(this.s(), this.l);
        this.q.setPath(this.l, this.p);
        this.p.op(this.q, Region.Op.DIFFERENCE);
        return this.p;
    }

    protected final void h(RectF rectF0, Path path0) {
        this.w.d(this.f.a, this.f.k, rectF0, this.v, path0);
    }

    private void i() {
        class S1.g.b implements S1.k.c {
            final float a;
            final g b;

            S1.g.b(float f) {
                this.a = f;
                super();
            }

            @Override  // S1.k$c
            public S1.c a(S1.c c0) {
                return !(c0 instanceof i) ? new S1.b(this.a, c0) : c0;
            }
        }

        k k0 = this.B().y(new S1.g.b(this, -this.C()));
        this.r = k0;
        float f = this.f.k;
        RectF rectF0 = this.t();
        this.w.e(k0, f, rectF0, this.m);
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.j = true;
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if(!super.isStateful()) {
            ColorStateList colorStateList0 = this.f.g;
            if(colorStateList0 == null || !colorStateList0.isStateful()) {
                ColorStateList colorStateList1 = this.f.f;
                if(colorStateList1 == null || !colorStateList1.isStateful()) {
                    ColorStateList colorStateList2 = this.f.e;
                    if(colorStateList2 == null || !colorStateList2.isStateful()) {
                        ColorStateList colorStateList3 = this.f.d;
                        return colorStateList3 != null && colorStateList3.isStateful();
                    }
                }
            }
        }
        return true;
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0, boolean z) {
        int v = colorStateList0.getColorForState(this.getState(), 0);
        if(z) {
            v = this.l(v);
        }
        this.z = v;
        return new PorterDuffColorFilter(v, porterDuff$Mode0);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0, Paint paint0, boolean z) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? this.f(paint0, z) : this.j(colorStateList0, porterDuff$Mode0, z);
    }

    protected int l(int v) {
        a a0 = this.f.b;
        return a0 == null ? v : a0.c(v, this.G() + this.x());
    }

    public static g m(Context context0, float f, ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(H1.a.c(context0, z1.a.p, "g"));
        }
        g g0 = new g();
        g0.K(context0);
        g0.V(colorStateList0);
        g0.U(f);
        return g0;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f = new c(this.f);
        return this;
    }

    private void n(Canvas canvas0) {
        if(this.i.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can\'t be drawn for all operations in this shape.");
        }
        if(this.f.s != 0) {
            canvas0.drawPath(this.l, this.u.c());
        }
        for(int v = 0; v < 4; ++v) {
            this.g[v].a(this.u, this.f.r, canvas0);
            this.h[v].a(this.u, this.f.r, canvas0);
        }
        if(this.B) {
            int v1 = this.z();
            int v2 = this.A();
            canvas0.translate(((float)(-v1)), ((float)(-v2)));
            canvas0.drawPath(this.l, g.D);
            canvas0.translate(((float)v1), ((float)v2));
        }
    }

    private void o(Canvas canvas0) {
        k k0 = this.f.a;
        RectF rectF0 = this.s();
        this.p(canvas0, this.s, this.l, k0, rectF0);
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        this.j = true;
        super.onBoundsChange(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        boolean z = this.d0(arr_v) || this.e0();
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    private void p(Canvas canvas0, Paint paint0, Path path0, k k0, RectF rectF0) {
        if(k0.u(rectF0)) {
            float f = k0.t().a(rectF0) * this.f.k;
            canvas0.drawRoundRect(rectF0, f, f, paint0);
            return;
        }
        canvas0.drawPath(path0, paint0);
    }

    protected void q(Canvas canvas0, Paint paint0, Path path0, RectF rectF0) {
        this.p(canvas0, paint0, path0, this.f.a, rectF0);
    }

    protected void r(Canvas canvas0) {
        k k0 = this.r;
        RectF rectF0 = this.t();
        this.p(canvas0, this.t, this.m, k0, rectF0);
    }

    protected RectF s() {
        Rect rect0 = this.getBounds();
        this.n.set(rect0);
        return this.n;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        c g$c0 = this.f;
        if(g$c0.m != v) {
            g$c0.m = v;
            this.L();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.f.c = colorFilter0;
        this.L();
    }

    @Override  // S1.n
    public void setShapeAppearanceModel(k k0) {
        this.f.a = k0;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTint(int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        this.f.g = colorStateList0;
        this.e0();
        this.L();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        c g$c0 = this.f;
        if(g$c0.h != porterDuff$Mode0) {
            g$c0.h = porterDuff$Mode0;
            this.e0();
            this.L();
        }
    }

    private RectF t() {
        RectF rectF0 = this.s();
        this.o.set(rectF0);
        float f = this.C();
        this.o.inset(f, f);
        return this.o;
    }

    public float u() {
        return this.f.o;
    }

    public ColorStateList v() {
        return this.f.d;
    }

    public float w() {
        return this.f.k;
    }

    public float x() {
        return this.f.n;
    }

    public int y() {
        return this.z;
    }

    public int z() {
        return (int)(((double)this.f.s) * Math.sin(Math.toRadians(this.f.t)));
    }
}

