package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.util.TypedValue;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.G;
import androidx.core.view.V0;
import androidx.core.view.Y;
import androidx.core.view.y0;

public abstract class t {
    public interface c {
        y0 a(View arg1, y0 arg2, d arg3);
    }

    public static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        public d(int v, int v1, int v2, int v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }

        public d(d t$d0) {
            this.a = t$d0.a;
            this.b = t$d0.b;
            this.c = t$d0.c;
            this.d = t$d0.d;
        }

        public void a(View view0) {
            Y.C0(view0, this.a, this.b, this.c, this.d);
        }
    }

    // 检测为 Lambda 实现
    public static void a(View view0, boolean z) [...]

    public static void b(View view0, c t$c0) {
        class a implements G {
            final c a;
            final d b;

            a(c t$c0, d t$d0) {
                this.b = t$d0;
                super();
            }

            @Override  // androidx.core.view.G
            public y0 a(View view0, y0 y00) {
                d t$d0 = new d(this.b);
                return this.a.a(view0, y00, t$d0);
            }
        }

        Y.B0(view0, new a(t$c0, new d(Y.E(view0), view0.getPaddingTop(), Y.D(view0), view0.getPaddingBottom())));
        t.j(view0);
    }

    public static float c(Context context0, int v) {
        return TypedValue.applyDimension(1, ((float)v), context0.getResources().getDisplayMetrics());
    }

    public static Integer d(View view0) {
        ColorStateList colorStateList0 = com.google.android.material.drawable.d.f(view0.getBackground());
        return colorStateList0 == null ? null : colorStateList0.getDefaultColor();
    }

    private static InputMethodManager e(View view0) {
        return (InputMethodManager)androidx.core.content.a.getSystemService(view0.getContext(), InputMethodManager.class);
    }

    public static float f(View view0) {
        ViewParent viewParent0 = view0.getParent();
        float f = 0.0f;
        while(viewParent0 instanceof View) {
            f += Y.u(((View)viewParent0));
            viewParent0 = viewParent0.getParent();
        }
        return f;
    }

    public static boolean g(View view0) {
        return Y.z(view0) == 1;
    }

    private static void h(View view0, boolean z) {
        t.l(view0, z);
    }

    public static PorterDuff.Mode i(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }

    public static void j(View view0) {
        class b implements View.OnAttachStateChangeListener {
            b() {
                super();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                view0.removeOnAttachStateChangeListener(this);
                Y.l0(view0);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
            }
        }

        if(Y.R(view0)) {
            Y.l0(view0);
            return;
        }
        view0.addOnAttachStateChangeListener(new b());
    }

    public static void k(View view0, boolean z) {
        view0.requestFocus();
        view0.post(() -> t.h(view0, z));
    }

    public static void l(View view0, boolean z) {
        if(z) {
            V0 v00 = Y.K(view0);
            if(v00 != null) {
                v00.e(8);
                return;
            }
        }
        t.e(view0).showSoftInput(view0, 1);
    }
}

