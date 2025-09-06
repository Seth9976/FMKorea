package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import e.c;
import e.d;
import e.e;

public final class j {
    private T a;
    private static final PorterDuff.Mode b;
    private static j c;

    static {
        j.b = PorterDuff.Mode.SRC_IN;
    }

    public static j b() {
        synchronized(j.class) {
            if(j.c == null) {
                j.h();
            }
            return j.c;
        }
    }

    public Drawable c(Context context0, int v) {
        synchronized(this) {
            return this.a.j(context0, v);
        }
    }

    Drawable d(Context context0, int v, boolean z) {
        synchronized(this) {
            return this.a.k(context0, v, z);
        }
    }

    public static PorterDuffColorFilter e(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(j.class) {
            return T.l(v, porterDuff$Mode0);
        }
    }

    ColorStateList f(Context context0, int v) {
        synchronized(this) {
            return this.a.m(context0, v);
        }
    }

    public void g(Context context0) {
        synchronized(this) {
            this.a.s(context0);
        }
    }

    public static void h() {
        class a implements f {
            private final int[] a;
            private final int[] b;
            private final int[] c;
            private final int[] d;
            private final int[] e;
            private final int[] f;

            a() {
                super();
                this.a = new int[]{e.R, e.P, e.a};
                this.b = new int[]{e.o, e.B, e.t, e.p, e.q, e.s, e.r};
                this.c = new int[]{e.O, e.Q, e.k, e.K, e.L, e.M, e.N};
                this.d = new int[]{e.w, e.i, e.v};
                this.e = new int[]{e.J, e.S};
                this.f = new int[]{e.c, e.g, e.d, e.h};
            }

            @Override  // androidx.appcompat.widget.T$f
            public boolean a(Context context0, int v, Drawable drawable0) {
                int v2;
                boolean z;
                PorterDuff.Mode porterDuff$Mode1;
                int v1;
                PorterDuff.Mode porterDuff$Mode0 = j.b;
                if(this.f(this.a, v)) {
                    v1 = e.a.u;
                    porterDuff$Mode1 = porterDuff$Mode0;
                    z = true;
                    v2 = -1;
                }
                else if(this.f(this.c, v)) {
                    v1 = e.a.s;
                    porterDuff$Mode1 = porterDuff$Mode0;
                    z = true;
                    v2 = -1;
                }
                else if(this.f(this.d, v)) {
                    porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
                    porterDuff$Mode1 = porterDuff$Mode0;
                    v2 = -1;
                    v1 = 0x1010031;
                    z = true;
                }
                else if(v == e.u) {
                    z = true;
                    v2 = 41;
                    v1 = 0x1010030;
                    porterDuff$Mode1 = porterDuff$Mode0;
                }
                else if(v == e.l) {
                    porterDuff$Mode1 = porterDuff$Mode0;
                    v2 = -1;
                    v1 = 0x1010031;
                    z = true;
                }
                else {
                    porterDuff$Mode1 = porterDuff$Mode0;
                    v1 = 0;
                    z = false;
                    v2 = -1;
                }
                if(z) {
                    Drawable drawable1 = drawable0.mutate();
                    drawable1.setColorFilter(j.e(Y.c(context0, v1), porterDuff$Mode1));
                    if(v2 != -1) {
                        drawable1.setAlpha(v2);
                    }
                    return true;
                }
                return false;
            }

            @Override  // androidx.appcompat.widget.T$f
            public PorterDuff.Mode b(int v) {
                return v == e.H ? PorterDuff.Mode.MULTIPLY : null;
            }

            @Override  // androidx.appcompat.widget.T$f
            public Drawable c(T t0, Context context0, int v) {
                if(v == e.j) {
                    return new LayerDrawable(new Drawable[]{t0.j(context0, e.i), t0.j(context0, e.k)});
                }
                if(v == e.y) {
                    return this.l(t0, context0, d.g);
                }
                if(v == e.x) {
                    return this.l(t0, context0, d.h);
                }
                return v == e.z ? this.l(t0, context0, d.i) : null;
            }

            @Override  // androidx.appcompat.widget.T$f
            public ColorStateList d(Context context0, int v) {
                if(v == e.m) {
                    return f.a.a(context0, c.e);
                }
                if(v == e.I) {
                    return f.a.a(context0, c.h);
                }
                if(v == e.H) {
                    return this.k(context0);
                }
                if(v == e.f) {
                    return this.j(context0);
                }
                if(v == e.b) {
                    return this.g(context0);
                }
                if(v == e.e) {
                    return this.i(context0);
                }
                if(v != e.D && v != e.E) {
                    if(this.f(this.b, v)) {
                        return Y.e(context0, e.a.u);
                    }
                    if(this.f(this.e, v)) {
                        return f.a.a(context0, c.d);
                    }
                    if(this.f(this.f, v)) {
                        return f.a.a(context0, c.c);
                    }
                    return v == e.A ? f.a.a(context0, c.f) : null;
                }
                return f.a.a(context0, c.g);
            }

            @Override  // androidx.appcompat.widget.T$f
            public boolean e(Context context0, int v, Drawable drawable0) {
                if(v == e.C) {
                    this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), Y.c(context0, e.a.u), j.b);
                    this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), Y.c(context0, e.a.u), j.b);
                    this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), Y.c(context0, e.a.s), j.b);
                    return true;
                }
                if(v != e.y && v != e.x && v != e.z) {
                    return false;
                }
                this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), Y.b(context0, e.a.u), j.b);
                this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), Y.c(context0, e.a.s), j.b);
                this.m(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), Y.c(context0, e.a.s), j.b);
                return true;
            }

            private boolean f(int[] arr_v, int v) {
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    if(arr_v[v1] == v) {
                        return true;
                    }
                }
                return false;
            }

            private ColorStateList g(Context context0) {
                return this.h(context0, 0);
            }

            private ColorStateList h(Context context0, int v) {
                int[][] arr2_v = new int[4][];
                int[] arr_v = new int[4];
                int v1 = Y.c(context0, e.a.t);
                int v2 = Y.b(context0, e.a.r);
                arr2_v[0] = Y.b;
                arr_v[0] = v2;
                arr2_v[1] = Y.e;
                arr_v[1] = androidx.core.graphics.d.g(v1, v);
                arr2_v[2] = Y.c;
                arr_v[2] = androidx.core.graphics.d.g(v1, v);
                arr2_v[3] = Y.i;
                arr_v[3] = v;
                return new ColorStateList(arr2_v, arr_v);
            }

            private ColorStateList i(Context context0) {
                return this.h(context0, Y.c(context0, e.a.q));
            }

            private ColorStateList j(Context context0) {
                return this.h(context0, Y.c(context0, e.a.r));
            }

            private ColorStateList k(Context context0) {
                int[][] arr2_v = new int[3][];
                int[] arr_v = new int[3];
                ColorStateList colorStateList0 = Y.e(context0, e.a.w);
                if(colorStateList0 != null && colorStateList0.isStateful()) {
                    arr2_v[0] = Y.b;
                    arr_v[0] = colorStateList0.getColorForState(Y.b, 0);
                    arr2_v[1] = Y.f;
                    arr_v[1] = Y.c(context0, e.a.s);
                    arr2_v[2] = Y.i;
                    arr_v[2] = colorStateList0.getDefaultColor();
                    return new ColorStateList(arr2_v, arr_v);
                }
                arr2_v[0] = Y.b;
                arr_v[0] = Y.b(context0, 0x7F040123);  // attr:colorSwitchThumbNormal
                arr2_v[1] = Y.f;
                arr_v[1] = Y.c(context0, e.a.s);
                arr2_v[2] = Y.i;
                arr_v[2] = Y.c(context0, 0x7F040123);  // attr:colorSwitchThumbNormal
                return new ColorStateList(arr2_v, arr_v);
            }

            private LayerDrawable l(T t0, Context context0, int v) {
                BitmapDrawable bitmapDrawable2;
                BitmapDrawable bitmapDrawable1;
                BitmapDrawable bitmapDrawable0;
                int v1 = context0.getResources().getDimensionPixelSize(v);
                Drawable drawable0 = t0.j(context0, e.F);
                Drawable drawable1 = t0.j(context0, e.G);
                if(!(drawable0 instanceof BitmapDrawable) || drawable0.getIntrinsicWidth() != v1 || drawable0.getIntrinsicHeight() != v1) {
                    Bitmap bitmap0 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
                    Canvas canvas0 = new Canvas(bitmap0);
                    drawable0.setBounds(0, 0, v1, v1);
                    drawable0.draw(canvas0);
                    bitmapDrawable0 = new BitmapDrawable(bitmap0);
                    bitmapDrawable1 = new BitmapDrawable(bitmap0);
                }
                else {
                    bitmapDrawable0 = (BitmapDrawable)drawable0;
                    bitmapDrawable1 = new BitmapDrawable(bitmapDrawable0.getBitmap());
                }
                bitmapDrawable1.setTileModeX(Shader.TileMode.REPEAT);
                if(!(drawable1 instanceof BitmapDrawable) || drawable1.getIntrinsicWidth() != v1 || drawable1.getIntrinsicHeight() != v1) {
                    Bitmap bitmap1 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
                    Canvas canvas1 = new Canvas(bitmap1);
                    drawable1.setBounds(0, 0, v1, v1);
                    drawable1.draw(canvas1);
                    bitmapDrawable2 = new BitmapDrawable(bitmap1);
                }
                else {
                    bitmapDrawable2 = (BitmapDrawable)drawable1;
                }
                LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{bitmapDrawable0, bitmapDrawable2, bitmapDrawable1});
                layerDrawable0.setId(0, 0x1020000);
                layerDrawable0.setId(1, 0x102000F);
                layerDrawable0.setId(2, 0x102000D);
                return layerDrawable0;
            }

            private void m(Drawable drawable0, int v, PorterDuff.Mode porterDuff$Mode0) {
                Drawable drawable1 = drawable0.mutate();
                if(porterDuff$Mode0 == null) {
                    porterDuff$Mode0 = j.b;
                }
                drawable1.setColorFilter(j.e(v, porterDuff$Mode0));
            }
        }

        synchronized(j.class) {
            if(j.c == null) {
                j j0 = new j();
                j.c = j0;
                j0.a = T.h();
                j.c.a.u(new a());
            }
        }
    }

    static void i(Drawable drawable0, a0 a00, int[] arr_v) {
        T.w(drawable0, a00, arr_v);
    }
}

