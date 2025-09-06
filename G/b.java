package g;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.graphics.drawable.a;

public abstract class b extends Drawable implements Drawable.Callback {
    static abstract class g.b.b {
        public static boolean a(Drawable.ConstantState drawable$ConstantState0) {
            return drawable$ConstantState0.canApplyTheme();
        }

        public static void b(Drawable drawable0, Outline outline0) {
            drawable0.getOutline(outline0);
        }

        public static Resources c(Resources.Theme resources$Theme0) {
            return resources$Theme0.getResources();
        }
    }

    static class c implements Drawable.Callback {
        private Drawable.Callback f;

        public Drawable.Callback a() {
            Drawable.Callback drawable$Callback0 = this.f;
            this.f = null;
            return drawable$Callback0;
        }

        public c b(Drawable.Callback drawable$Callback0) {
            this.f = drawable$Callback0;
            return this;
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void invalidateDrawable(Drawable drawable0) {
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
            Drawable.Callback drawable$Callback0 = this.f;
            if(drawable$Callback0 != null) {
                drawable$Callback0.scheduleDrawable(drawable0, runnable0, v);
            }
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
            Drawable.Callback drawable$Callback0 = this.f;
            if(drawable$Callback0 != null) {
                drawable$Callback0.unscheduleDrawable(drawable0, runnable0);
            }
        }
    }

    static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;
        Resources b;
        int c;
        int d;
        int e;
        SparseArray f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        d(d b$d0, b b0, Resources resources0) {
            Resources resources1;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = b0;
            Rect rect0 = null;
            if(resources0 == null) {
                resources1 = b$d0 == null ? null : b$d0.b;
            }
            else {
                resources1 = resources0;
            }
            this.b = resources1;
            int v1 = b.f(resources0, (b$d0 == null ? 0 : b$d0.c));
            this.c = v1;
            if(b$d0 != null) {
                this.d = b$d0.d;
                this.e = b$d0.e;
                this.v = true;
                this.w = true;
                this.i = b$d0.i;
                this.l = b$d0.l;
                this.x = b$d0.x;
                this.y = b$d0.y;
                this.z = b$d0.z;
                this.A = b$d0.A;
                this.B = b$d0.B;
                this.C = b$d0.C;
                this.D = b$d0.D;
                this.E = b$d0.E;
                this.F = b$d0.F;
                this.G = b$d0.G;
                this.H = b$d0.H;
                this.I = b$d0.I;
                if(b$d0.c == v1) {
                    if(b$d0.j) {
                        if(b$d0.k != null) {
                            rect0 = new Rect(b$d0.k);
                        }
                        this.k = rect0;
                        this.j = true;
                    }
                    if(b$d0.m) {
                        this.n = b$d0.n;
                        this.o = b$d0.o;
                        this.p = b$d0.p;
                        this.q = b$d0.q;
                        this.m = true;
                    }
                }
                if(b$d0.r) {
                    this.s = b$d0.s;
                    this.r = true;
                }
                if(b$d0.t) {
                    this.u = b$d0.u;
                    this.t = true;
                }
                Drawable[] arr_drawable = b$d0.g;
                this.g = new Drawable[arr_drawable.length];
                this.h = b$d0.h;
                SparseArray sparseArray0 = b$d0.f;
                this.f = sparseArray0 == null ? new SparseArray(this.h) : sparseArray0.clone();
                int v2 = this.h;
                for(int v = 0; v < v2; ++v) {
                    Drawable drawable0 = arr_drawable[v];
                    if(drawable0 != null) {
                        Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                        if(drawable$ConstantState0 == null) {
                            this.g[v] = arr_drawable[v];
                        }
                        else {
                            this.f.put(v, drawable$ConstantState0);
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        public final int a(Drawable drawable0) {
            int v = this.h;
            if(v >= this.g.length) {
                this.o(v, v + 10);
            }
            drawable0.mutate();
            drawable0.setVisible(false, true);
            drawable0.setCallback(this.a);
            this.g[v] = drawable0;
            ++this.h;
            int v1 = this.e;
            this.e = drawable0.getChangingConfigurations() | v1;
            this.p();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return v;
        }

        final void b(Resources.Theme resources$Theme0) {
            if(resources$Theme0 != null) {
                this.e();
                int v = this.h;
                Drawable[] arr_drawable = this.g;
                for(int v1 = 0; v1 < v; ++v1) {
                    Drawable drawable0 = arr_drawable[v1];
                    if(drawable0 != null && a.b(drawable0)) {
                        a.a(arr_drawable[v1], resources$Theme0);
                        this.e |= arr_drawable[v1].getChangingConfigurations();
                    }
                }
                this.y(g.b.b.c(resources$Theme0));
            }
        }

        public boolean c() {
            if(this.v) {
                return this.w;
            }
            this.e();
            this.v = true;
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_drawable[v1].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public boolean canApplyTheme() {
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                if(drawable0 == null) {
                    Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.get(v1);
                    if(drawable$ConstantState0 != null && g.b.b.a(drawable$ConstantState0)) {
                        return true;
                    }
                }
                else if(a.b(drawable0)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.m = true;
            this.e();
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                int v2 = drawable0.getIntrinsicWidth();
                if(v2 > this.n) {
                    this.n = v2;
                }
                int v3 = drawable0.getIntrinsicHeight();
                if(v3 > this.o) {
                    this.o = v3;
                }
                int v4 = drawable0.getMinimumWidth();
                if(v4 > this.p) {
                    this.p = v4;
                }
                int v5 = drawable0.getMinimumHeight();
                if(v5 > this.q) {
                    this.q = v5;
                }
            }
        }

        private void e() {
            SparseArray sparseArray0 = this.f;
            if(sparseArray0 != null) {
                int v = sparseArray0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = this.f.keyAt(v1);
                    Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.valueAt(v1);
                    Drawable[] arr_drawable = this.g;
                    arr_drawable[v2] = this.s(drawable$ConstantState0.newDrawable(this.b));
                }
                this.f = null;
            }
        }

        final int f() {
            return this.g.length;
        }

        public final Drawable g(int v) {
            Drawable drawable0 = this.g[v];
            if(drawable0 != null) {
                return drawable0;
            }
            SparseArray sparseArray0 = this.f;
            if(sparseArray0 != null) {
                int v1 = sparseArray0.indexOfKey(v);
                if(v1 >= 0) {
                    Drawable drawable1 = this.s(((Drawable.ConstantState)this.f.valueAt(v1)).newDrawable(this.b));
                    this.g[v] = drawable1;
                    this.f.removeAt(v1);
                    if(this.f.size() == 0) {
                        this.f = null;
                    }
                    return drawable1;
                }
            }
            return null;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final int h() {
            return this.h;
        }

        public final int i() {
            if(!this.m) {
                this.d();
            }
            return this.o;
        }

        public final int j() {
            if(!this.m) {
                this.d();
            }
            return this.q;
        }

        public final int k() {
            if(!this.m) {
                this.d();
            }
            return this.p;
        }

        public final Rect l() {
            Rect rect0 = null;
            if(this.i) {
                return null;
            }
            Rect rect1 = this.k;
            if(rect1 == null && !this.j) {
                this.e();
                Rect rect2 = new Rect();
                int v = this.h;
                Drawable[] arr_drawable = this.g;
                for(int v1 = 0; v1 < v; ++v1) {
                    if(arr_drawable[v1].getPadding(rect2)) {
                        if(rect0 == null) {
                            rect0 = new Rect(0, 0, 0, 0);
                        }
                        int v2 = rect2.left;
                        if(v2 > rect0.left) {
                            rect0.left = v2;
                        }
                        int v3 = rect2.top;
                        if(v3 > rect0.top) {
                            rect0.top = v3;
                        }
                        int v4 = rect2.right;
                        if(v4 > rect0.right) {
                            rect0.right = v4;
                        }
                        int v5 = rect2.bottom;
                        if(v5 > rect0.bottom) {
                            rect0.bottom = v5;
                        }
                    }
                }
                this.j = true;
                this.k = rect0;
                return rect0;
            }
            return rect1;
        }

        public final int m() {
            if(!this.m) {
                this.d();
            }
            return this.n;
        }

        public final int n() {
            if(this.r) {
                return this.s;
            }
            this.e();
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            int v1 = v <= 0 ? -2 : arr_drawable[0].getOpacity();
            for(int v2 = 1; v2 < v; ++v2) {
                v1 = Drawable.resolveOpacity(v1, arr_drawable[v2].getOpacity());
            }
            this.s = v1;
            this.r = true;
            return v1;
        }

        public void o(int v, int v1) {
            Drawable[] arr_drawable = new Drawable[v1];
            Drawable[] arr_drawable1 = this.g;
            if(arr_drawable1 != null) {
                System.arraycopy(arr_drawable1, 0, arr_drawable, 0, v);
            }
            this.g = arr_drawable;
        }

        void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.l;
        }

        abstract void r();

        private Drawable s(Drawable drawable0) {
            a.m(drawable0, this.z);
            Drawable drawable1 = drawable0.mutate();
            drawable1.setCallback(this.a);
            return drawable1;
        }

        public final void t(boolean z) {
            this.l = z;
        }

        public final void u(int v) {
            this.A = v;
        }

        public final void v(int v) {
            this.B = v;
        }

        final boolean w(int v, int v1) {
            int v2 = this.h;
            Drawable[] arr_drawable = this.g;
            boolean z = false;
            for(int v3 = 0; v3 < v2; ++v3) {
                Drawable drawable0 = arr_drawable[v3];
                if(drawable0 != null) {
                    boolean z1 = a.m(drawable0, v);
                    if(v3 == v1) {
                        z = z1;
                    }
                }
            }
            this.z = v;
            return z;
        }

        public final void x(boolean z) {
            this.i = z;
        }

        final void y(Resources resources0) {
            if(resources0 != null) {
                this.b = resources0;
                int v = b.f(resources0, this.c);
                int v1 = this.c;
                this.c = v;
                if(v1 != v) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
    }

    private d f;
    private Rect g;
    private Drawable h;
    private Drawable i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private Runnable n;
    private long o;
    private long p;
    private c q;

    public b() {
        this.j = 0xFF;
        this.l = -1;
    }

    void a(boolean z) {
        int v3;
        int v = 1;
        this.k = true;
        long v1 = SystemClock.uptimeMillis();
        Drawable drawable0 = this.h;
        if(drawable0 == null) {
            this.o = 0L;
            v3 = 0;
        }
        else {
            long v2 = this.o;
            if(v2 == 0L) {
                v3 = 0;
            }
            else if(v2 <= v1) {
                drawable0.setAlpha(this.j);
                this.o = 0L;
                v3 = 0;
            }
            else {
                drawable0.setAlpha((0xFF - ((int)((v2 - v1) * 0xFFL)) / this.f.A) * this.j / 0xFF);
                v3 = 1;
            }
        }
        Drawable drawable1 = this.i;
        if(drawable1 == null) {
            this.p = 0L;
            v = v3;
        }
        else {
            long v4 = this.p;
            if(v4 == 0L) {
                v = v3;
            }
            else if(v4 <= v1) {
                drawable1.setVisible(false, false);
                this.i = null;
                this.p = 0L;
                v = v3;
            }
            else {
                drawable1.setAlpha(((int)((v4 - v1) * 0xFFL)) / this.f.B * this.j / 0xFF);
            }
        }
        if(z && v != 0) {
            this.scheduleSelf(this.n, v1 + 16L);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme resources$Theme0) {
        this.f.b(resources$Theme0);
    }

    abstract d b();

    int c() {
        return this.l;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f.canApplyTheme();
    }

    private void d(Drawable drawable0) {
        if(this.q == null) {
            this.q = new c();
        }
        drawable0.setCallback(this.q.b(drawable0.getCallback()));
        try {
            if(this.f.A <= 0 && this.k) {
                drawable0.setAlpha(this.j);
            }
            d b$d0 = this.f;
            if(b$d0.E) {
                drawable0.setColorFilter(b$d0.D);
            }
            else {
                if(b$d0.H) {
                    a.o(drawable0, b$d0.F);
                }
                d b$d1 = this.f;
                if(b$d1.I) {
                    a.p(drawable0, b$d1.G);
                }
            }
            drawable0.setVisible(this.isVisible(), true);
            drawable0.setDither(this.f.x);
            drawable0.setState(this.getState());
            drawable0.setLevel(this.getLevel());
            drawable0.setBounds(this.getBounds());
            a.m(drawable0, a.f(this));
            a.j(drawable0, this.f.C);
            Rect rect0 = this.g;
            if(rect0 != null) {
                a.l(drawable0, rect0.left, rect0.top, rect0.right, rect0.bottom);
            }
        }
        finally {
            drawable0.setCallback(this.q.a());
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Drawable drawable0 = this.h;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
        }
        Drawable drawable1 = this.i;
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
    }

    private boolean e() {
        return this.isAutoMirrored() && a.f(this) == 1;
    }

    static int f(Resources resources0, int v) {
        if(resources0 != null) {
            v = resources0.getDisplayMetrics().densityDpi;
        }
        return v == 0 ? 0xA0 : v;
    }

    boolean g(int v) {
        class g.b.a implements Runnable {
            final b f;

            @Override
            public void run() {
                b.this.a(true);
                b.this.invalidateSelf();
            }
        }

        if(v == this.l) {
            return false;
        }
        long v1 = SystemClock.uptimeMillis();
        if(this.f.B > 0) {
            Drawable drawable0 = this.i;
            if(drawable0 != null) {
                drawable0.setVisible(false, false);
            }
            Drawable drawable1 = this.h;
            if(drawable1 == null) {
                this.i = null;
                this.p = 0L;
            }
            else {
                this.i = drawable1;
                this.p = ((long)this.f.B) + v1;
            }
        }
        else {
            Drawable drawable2 = this.h;
            if(drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
        if(v >= 0) {
            d b$d0 = this.f;
            if(v < b$d0.h) {
                Drawable drawable3 = b$d0.g(v);
                this.h = drawable3;
                this.l = v;
                if(drawable3 != null) {
                    int v2 = this.f.A;
                    if(v2 > 0) {
                        this.o = v1 + ((long)v2);
                    }
                    this.d(drawable3);
                }
            }
            else {
                this.h = null;
                this.l = -1;
            }
        }
        else {
            this.h = null;
            this.l = -1;
        }
        if(Long.compare(this.o, 0L) != 0 || this.p != 0L) {
            Runnable runnable0 = this.n;
            if(runnable0 == null) {
                this.n = new g.b.a(this);
            }
            else {
                this.unscheduleSelf(runnable0);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if(this.f.c()) {
            d b$d0 = this.f;
            b$d0.d = this.getChangingConfigurations();
            return this.f;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.h;
    }

    @Override  // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect0) {
        Rect rect1 = this.g;
        if(rect1 != null) {
            rect0.set(rect1);
            return;
        }
        super.getHotspotBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if(this.f.q()) {
            return this.f.i();
        }
        return this.h == null ? -1 : this.h.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if(this.f.q()) {
            return this.f.m();
        }
        return this.h == null ? -1 : this.h.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if(this.f.q()) {
            return this.f.j();
        }
        return this.h == null ? 0 : this.h.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if(this.f.q()) {
            return this.f.k();
        }
        return this.h == null ? 0 : this.h.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.h == null || !this.h.isVisible() ? -2 : this.f.n();
    }

    @Override  // android.graphics.drawable.Drawable
    public void getOutline(Outline outline0) {
        Drawable drawable0 = this.h;
        if(drawable0 != null) {
            g.b.b.b(drawable0, outline0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect0) {
        boolean z;
        Rect rect1 = this.f.l();
        if(rect1 == null) {
            Drawable drawable0 = this.h;
            z = drawable0 == null ? super.getPadding(rect0) : drawable0.getPadding(rect0);
        }
        else {
            rect0.set(rect1);
            z = (rect1.right | (rect1.left | rect1.top | rect1.bottom)) == 0 ? false : true;
        }
        if(this.e()) {
            int v = rect0.left;
            rect0.left = rect0.right;
            rect0.right = v;
        }
        return z;
    }

    void h(d b$d0) {
        this.f = b$d0;
        int v = this.l;
        if(v >= 0) {
            Drawable drawable0 = b$d0.g(v);
            this.h = drawable0;
            if(drawable0 != null) {
                this.d(drawable0);
            }
        }
        this.i = null;
    }

    final void i(Resources resources0) {
        this.f.y(resources0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(Drawable drawable0) {
        d b$d0 = this.f;
        if(b$d0 != null) {
            b$d0.p();
        }
        if(drawable0 == this.h && this.getCallback() != null) {
            this.getCallback().invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f.C;
    }

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        int v1;
        Drawable drawable0 = this.i;
        int v = 1;
        if(drawable0 == null) {
            v1 = 0;
        }
        else {
            drawable0.jumpToCurrentState();
            this.i = null;
            v1 = 1;
        }
        Drawable drawable1 = this.h;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
            if(this.k) {
                this.h.setAlpha(this.j);
            }
        }
        if(this.p != 0L) {
            this.p = 0L;
            v1 = 1;
        }
        if(this.o == 0L) {
            v = v1;
        }
        else {
            this.o = 0L;
        }
        if(v != 0) {
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if(!this.m && super.mutate() == this) {
            d b$d0 = this.b();
            b$d0.r();
            this.h(b$d0);
            this.m = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
        Drawable drawable1 = this.h;
        if(drawable1 != null) {
            drawable1.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int v) {
        return this.f.w(v, this.c());
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            return drawable0.setLevel(v);
        }
        return this.h == null ? false : this.h.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            return drawable0.setState(arr_v);
        }
        return this.h == null ? false : this.h.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        if(drawable0 == this.h && this.getCallback() != null) {
            this.getCallback().scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(!this.k || this.j != v) {
            this.k = true;
            this.j = v;
            Drawable drawable0 = this.h;
            if(drawable0 != null) {
                if(this.o == 0L) {
                    drawable0.setAlpha(v);
                    return;
                }
                this.a(false);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        d b$d0 = this.f;
        if(b$d0.C != z) {
            b$d0.C = z;
            Drawable drawable0 = this.h;
            if(drawable0 != null) {
                a.j(drawable0, z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        d b$d0 = this.f;
        b$d0.E = true;
        if(b$d0.D != colorFilter0) {
            b$d0.D = colorFilter0;
            Drawable drawable0 = this.h;
            if(drawable0 != null) {
                drawable0.setColorFilter(colorFilter0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        d b$d0 = this.f;
        if(b$d0.x != z) {
            b$d0.x = z;
            Drawable drawable0 = this.h;
            if(drawable0 != null) {
                drawable0.setDither(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f1) {
        Drawable drawable0 = this.h;
        if(drawable0 != null) {
            a.k(drawable0, f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        Rect rect0 = this.g;
        if(rect0 == null) {
            this.g = new Rect(v, v1, v2, v3);
        }
        else {
            rect0.set(v, v1, v2, v3);
        }
        Drawable drawable0 = this.h;
        if(drawable0 != null) {
            a.l(drawable0, v, v1, v2, v3);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTint(int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        d b$d0 = this.f;
        b$d0.H = true;
        if(b$d0.F != colorStateList0) {
            b$d0.F = colorStateList0;
            a.o(this.h, colorStateList0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        d b$d0 = this.f;
        b$d0.I = true;
        if(b$d0.G != porterDuff$Mode0) {
            b$d0.G = porterDuff$Mode0;
            a.p(this.h, porterDuff$Mode0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setVisible(z, z1);
        }
        Drawable drawable1 = this.h;
        if(drawable1 != null) {
            drawable1.setVisible(z, z1);
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        if(drawable0 == this.h && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable(this, runnable0);
        }
    }
}

