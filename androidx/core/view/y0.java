package androidx.core.view;

import A.j;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;
import androidx.core.graphics.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class y0 {
    static abstract class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field field0 = View.class.getDeclaredField("mAttachInfo");
                a.a = field0;
                field0.setAccessible(true);
                Class class0 = Class.forName("android.view.View$AttachInfo");
                Field field1 = class0.getDeclaredField("mStableInsets");
                a.b = field1;
                field1.setAccessible(true);
                Field field2 = class0.getDeclaredField("mContentInsets");
                a.c = field2;
                field2.setAccessible(true);
                a.d = true;
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
            }
        }

        public static y0 a(View view0) {
            if(a.d && view0.isAttachedToWindow()) {
                View view1 = view0.getRootView();
                try {
                    Object object0 = a.a.get(view1);
                    if(object0 != null) {
                        Rect rect0 = (Rect)a.b.get(object0);
                        Rect rect1 = (Rect)a.c.get(object0);
                        if(rect0 != null && rect1 != null) {
                            y0 y00 = new b().c(e.c(rect0)).d(e.c(rect1)).a();
                            y00.u(y00);
                            y00.d(view0.getRootView());
                            return y00;
                        }
                    }
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + illegalAccessException0.getMessage(), illegalAccessException0);
                }
            }
            return null;
        }
    }

    public static final class b {
        private final f a;

        public b() {
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                this.a = new androidx.core.view.y0.e();
                return;
            }
            if(v >= 29) {
                this.a = new d();
                return;
            }
            this.a = new c();
        }

        public b(y0 y00) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                this.a = new androidx.core.view.y0.e(y00);
                return;
            }
            if(v >= 29) {
                this.a = new d(y00);
                return;
            }
            this.a = new c(y00);
        }

        public y0 a() {
            return this.a.b();
        }

        public b b(int v, e e0) {
            this.a.c(v, e0);
            return this;
        }

        public b c(e e0) {
            this.a.e(e0);
            return this;
        }

        public b d(e e0) {
            this.a.g(e0);
            return this;
        }
    }

    static class c extends f {
        private WindowInsets c;
        private e d;
        private static Field e = null;
        private static boolean f = false;
        private static Constructor g = null;
        private static boolean h = false;

        static {
        }

        c() {
            this.c = c.i();
        }

        c(y0 y00) {
            super(y00);
            this.c = y00.w();
        }

        @Override  // androidx.core.view.y0$f
        y0 b() {
            this.a();
            y0 y00 = y0.x(this.c);
            y00.s(this.b);
            y00.v(this.d);
            return y00;
        }

        @Override  // androidx.core.view.y0$f
        void e(e e0) {
            this.d = e0;
        }

        @Override  // androidx.core.view.y0$f
        void g(e e0) {
            WindowInsets windowInsets0 = this.c;
            if(windowInsets0 != null) {
                this.c = windowInsets0.replaceSystemWindowInsets(e0.a, e0.b, e0.c, e0.d);
            }
        }

        private static WindowInsets i() {
            Class class0 = WindowInsets.class;
            if(!c.f) {
                try {
                    c.e = class0.getDeclaredField("CONSUMED");
                }
                catch(ReflectiveOperationException reflectiveOperationException0) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException0);
                }
                c.f = true;
            }
            Field field0 = c.e;
            if(field0 != null) {
                try {
                    WindowInsets windowInsets0 = (WindowInsets)field0.get(null);
                    if(windowInsets0 != null) {
                        return new WindowInsets(windowInsets0);
                    }
                }
                catch(ReflectiveOperationException reflectiveOperationException1) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException1);
                }
            }
            if(!c.h) {
                try {
                    c.g = class0.getConstructor(Rect.class);
                }
                catch(ReflectiveOperationException reflectiveOperationException2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException2);
                }
                c.h = true;
            }
            Constructor constructor0 = c.g;
            if(constructor0 != null) {
                try {
                    return (WindowInsets)constructor0.newInstance(new Rect());
                }
                catch(ReflectiveOperationException reflectiveOperationException3) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException3);
                }
            }
            return null;
        }
    }

    static class d extends f {
        final WindowInsets.Builder c;

        d() {
            this.c = j.a();
        }

        d(y0 y00) {
            super(y00);
            WindowInsets windowInsets0 = y00.w();
            this.c = windowInsets0 == null ? j.a() : E0.a(windowInsets0);
        }

        @Override  // androidx.core.view.y0$f
        y0 b() {
            this.a();
            y0 y00 = y0.x(this.c.build());
            y00.s(this.b);
            return y00;
        }

        @Override  // androidx.core.view.y0$f
        void d(e e0) {
            Insets insets0 = e0.e();
            this.c.setMandatorySystemGestureInsets(insets0);
        }

        @Override  // androidx.core.view.y0$f
        void e(e e0) {
            Insets insets0 = e0.e();
            this.c.setStableInsets(insets0);
        }

        @Override  // androidx.core.view.y0$f
        void f(e e0) {
            Insets insets0 = e0.e();
            this.c.setSystemGestureInsets(insets0);
        }

        @Override  // androidx.core.view.y0$f
        void g(e e0) {
            Insets insets0 = e0.e();
            this.c.setSystemWindowInsets(insets0);
        }

        @Override  // androidx.core.view.y0$f
        void h(e e0) {
            Insets insets0 = e0.e();
            this.c.setTappableElementInsets(insets0);
        }
    }

    static class androidx.core.view.y0.e extends d {
        androidx.core.view.y0.e() {
        }

        androidx.core.view.y0.e(y0 y00) {
            super(y00);
        }

        @Override  // androidx.core.view.y0$f
        void c(int v, e e0) {
            int v1 = n.a(v);
            Insets insets0 = e0.e();
            this.c.setInsets(v1, insets0);
        }
    }

    static abstract class f {
        private final y0 a;
        e[] b;

        f() {
            this(new y0(null));
        }

        f(y0 y00) {
            this.a = y00;
        }

        protected final void a() {
            e[] arr_e = this.b;
            if(arr_e != null) {
                e e0 = arr_e[m.b(1)];
                e[] arr_e1 = this.b;
                e e1 = arr_e1[m.b(2)];
                if(e1 == null) {
                    e1 = this.a.f(2);
                }
                if(e0 == null) {
                    e0 = this.a.f(1);
                }
                this.g(e.a(e0, e1));
                e[] arr_e2 = this.b;
                e e2 = arr_e2[m.b(16)];
                if(e2 != null) {
                    this.f(e2);
                }
                e[] arr_e3 = this.b;
                e e3 = arr_e3[m.b(0x20)];
                if(e3 != null) {
                    this.d(e3);
                }
                e[] arr_e4 = this.b;
                e e4 = arr_e4[m.b(0x40)];
                if(e4 != null) {
                    this.h(e4);
                }
            }
        }

        abstract y0 b();

        void c(int v, e e0) {
            if(this.b == null) {
                this.b = new e[9];
            }
            for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
                if((v & v1) != 0) {
                    e[] arr_e = this.b;
                    arr_e[m.b(v1)] = e0;
                }
            }
        }

        void d(e e0) {
        }

        abstract void e(e arg1);

        void f(e e0) {
        }

        abstract void g(e arg1);

        void h(e e0) {
        }
    }

    static class g extends l {
        final WindowInsets c;
        private e[] d;
        private e e;
        private y0 f;
        e g;
        private static boolean h = false;
        private static Method i;
        private static Class j;
        private static Field k;
        private static Field l;

        static {
        }

        g(y0 y00, WindowInsets windowInsets0) {
            super(y00);
            this.e = null;
            this.c = windowInsets0;
        }

        g(y0 y00, g y0$g0) {
            this(y00, new WindowInsets(y0$g0.c));
        }

        @Override  // androidx.core.view.y0$l
        void d(View view0) {
            e e0 = this.w(view0);
            if(e0 == null) {
                e0 = e.e;
            }
            this.q(e0);
        }

        @Override  // androidx.core.view.y0$l
        void e(y0 y00) {
            y00.u(this.f);
            y00.t(this.g);
        }

        @Override  // androidx.core.view.y0$l
        public boolean equals(Object object0) {
            return super.equals(object0) ? Objects.equals(this.g, ((g)object0).g) : false;
        }

        @Override  // androidx.core.view.y0$l
        public e g(int v) {
            return this.t(v, false);
        }

        @Override  // androidx.core.view.y0$l
        final e k() {
            if(this.e == null) {
                this.e = e.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override  // androidx.core.view.y0$l
        y0 m(int v, int v1, int v2, int v3) {
            b y0$b0 = new b(y0.x(this.c));
            y0$b0.d(y0.p(this.k(), v, v1, v2, v3));
            y0$b0.c(y0.p(this.i(), v, v1, v2, v3));
            return y0$b0.a();
        }

        @Override  // androidx.core.view.y0$l
        boolean o() {
            return this.c.isRound();
        }

        @Override  // androidx.core.view.y0$l
        public void p(e[] arr_e) {
            this.d = arr_e;
        }

        @Override  // androidx.core.view.y0$l
        void q(e e0) {
            this.g = e0;
        }

        @Override  // androidx.core.view.y0$l
        void r(y0 y00) {
            this.f = y00;
        }

        @SuppressLint({"WrongConstant"})
        private e t(int v, boolean z) {
            e e0 = e.e;
            for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
                if((v & v1) != 0) {
                    e0 = e.a(e0, this.u(v1, z));
                }
            }
            return e0;
        }

        protected e u(int v, boolean z) {
            e e0 = null;
            switch(v) {
                case 1: {
                    if(z) {
                        e e1 = this.v();
                        e e2 = this.k();
                        return e.b(0, Math.max(e1.b, e2.b), 0, 0);
                    }
                    return e.b(0, this.k().b, 0, 0);
                }
                case 2: {
                    if(z) {
                        e e3 = this.v();
                        e e4 = this.i();
                        return e.b(Math.max(e3.a, e4.a), 0, Math.max(e3.c, e4.c), Math.max(e3.d, e4.d));
                    }
                    e e5 = this.k();
                    y0 y00 = this.f;
                    if(y00 != null) {
                        e0 = y00.g();
                    }
                    return e.b(e5.a, 0, e5.c, (e0 == null ? e5.d : Math.min(e5.d, e0.d)));
                }
                case 8: {
                    e[] arr_e = this.d;
                    if(arr_e != null) {
                        e0 = arr_e[m.b(8)];
                    }
                    if(e0 != null) {
                        return e0;
                    }
                    e e6 = this.k();
                    e e7 = this.v();
                    int v1 = e6.d;
                    if(v1 > e7.d) {
                        return e.b(0, 0, 0, v1);
                    }
                    if(this.g != null && !this.g.equals(e.e)) {
                        int v2 = this.g.d;
                        return v2 <= e7.d ? e.e : e.b(0, 0, 0, v2);
                    }
                    return e.e;
                }
                case 16: {
                    return this.j();
                }
                case 0x20: {
                    return this.h();
                }
                case 0x40: {
                    return this.l();
                }
                case 0x80: {
                    y0 y01 = this.f;
                    r r0 = y01 == null ? this.f() : y01.e();
                    return r0 == null ? e.e : e.b(r0.b(), r0.d(), r0.c(), r0.a());
                }
                default: {
                    return e.e;
                }
            }
        }

        private e v() {
            return this.f == null ? e.e : this.f.g();
        }

        private e w(View view0) {
            if(Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if(!g.h) {
                g.x();
            }
            Method method0 = g.i;
            if(method0 != null && g.j != null && g.k != null) {
                try {
                    Object object0 = method0.invoke(view0, null);
                    if(object0 == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Object object1 = g.l.get(object0);
                    Rect rect0 = (Rect)g.k.get(object1);
                    return rect0 == null ? null : e.c(rect0);
                }
                catch(ReflectiveOperationException reflectiveOperationException0) {
                }
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                g.i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class class0 = Class.forName("android.view.View$AttachInfo");
                g.j = class0;
                g.k = class0.getDeclaredField("mVisibleInsets");
                g.l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                g.k.setAccessible(true);
                g.l.setAccessible(true);
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
            }
            g.h = true;
        }
    }

    static class h extends g {
        private e m;

        h(y0 y00, WindowInsets windowInsets0) {
            super(y00, windowInsets0);
            this.m = null;
        }

        h(y0 y00, h y0$h0) {
            super(y00, y0$h0);
            this.m = y0$h0.m;
        }

        @Override  // androidx.core.view.y0$l
        y0 b() {
            return y0.x(this.c.consumeStableInsets());
        }

        @Override  // androidx.core.view.y0$l
        y0 c() {
            return y0.x(this.c.consumeSystemWindowInsets());
        }

        @Override  // androidx.core.view.y0$l
        final e i() {
            if(this.m == null) {
                this.m = e.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override  // androidx.core.view.y0$l
        boolean n() {
            return this.c.isConsumed();
        }

        @Override  // androidx.core.view.y0$l
        public void s(e e0) {
            this.m = e0;
        }
    }

    static class i extends h {
        i(y0 y00, WindowInsets windowInsets0) {
            super(y00, windowInsets0);
        }

        i(y0 y00, i y0$i0) {
            super(y00, y0$i0);
        }

        @Override  // androidx.core.view.y0$l
        y0 a() {
            return y0.x(this.c.consumeDisplayCutout());
        }

        @Override  // androidx.core.view.y0$g
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof i ? Objects.equals(this.c, ((i)object0).c) && Objects.equals(this.g, ((i)object0).g) : false;
        }

        @Override  // androidx.core.view.y0$l
        r f() {
            return r.e(this.c.getDisplayCutout());
        }

        @Override  // androidx.core.view.y0$l
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    static class androidx.core.view.y0.j extends i {
        private e n;
        private e o;
        private e p;

        androidx.core.view.y0.j(y0 y00, WindowInsets windowInsets0) {
            super(y00, windowInsets0);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        androidx.core.view.y0.j(y0 y00, androidx.core.view.y0.j y0$j0) {
            super(y00, y0$j0);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override  // androidx.core.view.y0$l
        e h() {
            if(this.o == null) {
                this.o = e.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override  // androidx.core.view.y0$l
        e j() {
            if(this.n == null) {
                this.n = e.d(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override  // androidx.core.view.y0$l
        e l() {
            if(this.p == null) {
                this.p = e.d(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override  // androidx.core.view.y0$g
        y0 m(int v, int v1, int v2, int v3) {
            return y0.x(this.c.inset(v, v1, v2, v3));
        }

        @Override  // androidx.core.view.y0$h
        public void s(e e0) {
        }
    }

    static class k extends androidx.core.view.y0.j {
        static final y0 q;

        static {
            k.q = y0.x(WindowInsets.CONSUMED);
        }

        k(y0 y00, WindowInsets windowInsets0) {
            super(y00, windowInsets0);
        }

        k(y0 y00, k y0$k0) {
            super(y00, y0$k0);
        }

        @Override  // androidx.core.view.y0$g
        final void d(View view0) {
        }

        @Override  // androidx.core.view.y0$g
        public e g(int v) {
            int v1 = n.a(v);
            return e.d(this.c.getInsets(v1));
        }
    }

    static class l {
        final y0 a;
        static final y0 b;

        static {
            l.b = new b().a().a().b().c();
        }

        l(y0 y00) {
            this.a = y00;
        }

        y0 a() {
            return this.a;
        }

        y0 b() {
            return this.a;
        }

        y0 c() {
            return this.a;
        }

        void d(View view0) {
        }

        void e(y0 y00) {
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof l ? this.o() == ((l)object0).o() && this.n() == ((l)object0).n() && B.c.a(this.k(), ((l)object0).k()) && B.c.a(this.i(), ((l)object0).i()) && B.c.a(this.f(), ((l)object0).f()) : false;
        }

        r f() {
            return null;
        }

        e g(int v) {
            return e.e;
        }

        e h() {
            return this.k();
        }

        @Override
        public int hashCode() {
            e e0 = this.k();
            e e1 = this.i();
            return B.c.b(new Object[]{Boolean.valueOf(this.o()), Boolean.valueOf(this.n()), e0, e1, this.f()});
        }

        e i() {
            return e.e;
        }

        e j() {
            return this.k();
        }

        e k() {
            return e.e;
        }

        e l() {
            return this.k();
        }

        y0 m(int v, int v1, int v2, int v3) {
            return l.b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(e[] arr_e) {
        }

        void q(e e0) {
        }

        void r(y0 y00) {
        }

        public void s(e e0) {
        }
    }

    public static abstract class m {
        public static int a() [...] // Inlined contents

        static int b(int v) {
            switch(v) {
                case 1: {
                    return 0;
                }
                case 2: {
                    return 1;
                }
                case 4: {
                    return 2;
                }
                case 8: {
                    return 3;
                }
                case 16: {
                    return 4;
                }
                case 0x20: {
                    return 5;
                }
                case 0x40: {
                    return 6;
                }
                case 0x80: {
                    return 7;
                }
                case 0x100: {
                    return 8;
                }
                default: {
                    throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + v);
                }
            }
        }

        public static int c() [...] // Inlined contents

        public static int d() [...] // Inlined contents
    }

    static abstract class n {
        static int a(int v) {
            int v1 = 0;
            for(int v2 = 1; v2 <= 0x100; v2 <<= 1) {
                if((v & v2) != 0) {
                    switch(v2) {
                        case 1: {
                            v1 |= O0.a();
                            break;
                        }
                        case 2: {
                            v1 |= P0.a();
                            break;
                        }
                        case 4: {
                            v1 |= Q0.a();
                            break;
                        }
                        case 8: {
                            v1 |= N.a();
                            break;
                        }
                        case 16: {
                            v1 |= R0.a();
                            break;
                        }
                        case 0x20: {
                            v1 |= S0.a();
                            break;
                        }
                        case 0x40: {
                            v1 |= T0.a();
                            break;
                        }
                        case 0x80: {
                            v1 |= U0.a();
                        }
                    }
                }
            }
            return v1;
        }
    }

    private final l a;
    public static final y0 b;

    static {
        if(Build.VERSION.SDK_INT >= 30) {
            y0.b = k.q;
            return;
        }
        y0.b = l.b;
    }

    private y0(WindowInsets windowInsets0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            this.a = new k(this, windowInsets0);
            return;
        }
        if(v >= 29) {
            this.a = new androidx.core.view.y0.j(this, windowInsets0);
            return;
        }
        if(v >= 28) {
            this.a = new i(this, windowInsets0);
            return;
        }
        this.a = new h(this, windowInsets0);
    }

    public y0(y0 y00) {
        if(y00 != null) {
            l y0$l0 = y00.a;
            int v = Build.VERSION.SDK_INT;
            if(v >= 30 && y0$l0 instanceof k) {
                this.a = new k(this, ((k)y0$l0));
            }
            else if(v >= 29 && y0$l0 instanceof androidx.core.view.y0.j) {
                this.a = new androidx.core.view.y0.j(this, ((androidx.core.view.y0.j)y0$l0));
            }
            else if(v >= 28 && y0$l0 instanceof i) {
                this.a = new i(this, ((i)y0$l0));
            }
            else if(y0$l0 instanceof h) {
                this.a = new h(this, ((h)y0$l0));
            }
            else if(y0$l0 instanceof g) {
                this.a = new g(this, ((g)y0$l0));
            }
            else {
                this.a = new l(this);
            }
            y0$l0.e(this);
            return;
        }
        this.a = new l(this);
    }

    public y0 a() {
        return this.a.a();
    }

    public y0 b() {
        return this.a.b();
    }

    public y0 c() {
        return this.a.c();
    }

    void d(View view0) {
        this.a.d(view0);
    }

    public r e() {
        return this.a.f();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y0 ? B.c.a(this.a, ((y0)object0).a) : false;
    }

    public e f(int v) {
        return this.a.g(v);
    }

    public e g() {
        return this.a.i();
    }

    public e h() {
        return this.a.j();
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public int i() {
        return this.a.k().d;
    }

    public int j() {
        return this.a.k().a;
    }

    public int k() {
        return this.a.k().c;
    }

    public int l() {
        return this.a.k().b;
    }

    public e m() {
        return this.a.k();
    }

    public boolean n() {
        return !this.a.k().equals(e.e);
    }

    public y0 o(int v, int v1, int v2, int v3) {
        return this.a.m(v, v1, v2, v3);
    }

    static e p(e e0, int v, int v1, int v2, int v3) {
        int v4 = Math.max(0, e0.a - v);
        int v5 = Math.max(0, e0.b - v1);
        int v6 = Math.max(0, e0.c - v2);
        int v7 = Math.max(0, e0.d - v3);
        return v4 != v || v5 != v1 || v6 != v2 || v7 != v3 ? e.b(v4, v5, v6, v7) : e0;
    }

    public boolean q() {
        return this.a.n();
    }

    public y0 r(int v, int v1, int v2, int v3) {
        return new b(this).d(e.b(v, v1, v2, v3)).a();
    }

    void s(e[] arr_e) {
        this.a.p(arr_e);
    }

    void t(e e0) {
        this.a.q(e0);
    }

    void u(y0 y00) {
        this.a.r(y00);
    }

    void v(e e0) {
        this.a.s(e0);
    }

    // 去混淆评级： 低(20)
    public WindowInsets w() {
        return this.a instanceof g ? ((g)this.a).c : null;
    }

    public static y0 x(WindowInsets windowInsets0) {
        return y0.y(windowInsets0, null);
    }

    public static y0 y(WindowInsets windowInsets0, View view0) {
        y0 y00 = new y0(((WindowInsets)B.h.g(windowInsets0)));
        if(view0 != null && view0.isAttachedToWindow()) {
            y00.u(Y.G(view0));
            y00.d(view0.getRootView());
        }
        return y00;
    }
}

