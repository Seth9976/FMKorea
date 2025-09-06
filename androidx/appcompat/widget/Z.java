package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.Y;
import androidx.core.widget.i;
import e.j;
import java.lang.ref.WeakReference;
import java.util.Locale;

class z {
    static abstract class c {
        static Locale a(String s) {
            return Locale.forLanguageTag(s);
        }
    }

    static abstract class d {
        static LocaleList a(String s) {
            return LocaleList.forLanguageTags(s);
        }

        static void b(TextView textView0, LocaleList localeList0) {
            textView0.setTextLocales(localeList0);
        }
    }

    static abstract class e {
        static int a(TextView textView0) {
            return textView0.getAutoSizeStepGranularity();
        }

        static void b(TextView textView0, int v, int v1, int v2, int v3) {
            textView0.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
        }

        static void c(TextView textView0, int[] arr_v, int v) {
            textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
        }

        static boolean d(TextView textView0, String s) {
            return textView0.setFontVariationSettings(s);
        }
    }

    static abstract class f {
        static Typeface a(Typeface typeface0, int v, boolean z) {
            return Typeface.create(typeface0, v, z);
        }
    }

    private final TextView a;
    private a0 b;
    private a0 c;
    private a0 d;
    private a0 e;
    private a0 f;
    private a0 g;
    private a0 h;
    private final B i;
    private int j;
    private int k;
    private Typeface l;
    private boolean m;

    z(TextView textView0) {
        this.j = 0;
        this.k = -1;
        this.a = textView0;
        this.i = new B(textView0);
    }

    void A(int v, float f) {
        if(!n0.c && !this.l()) {
            this.B(v, f);
        }
    }

    private void B(int v, float f) {
        this.i.t(v, f);
    }

    private void C(Context context0, c0 c00) {
        class a extends androidx.core.content.res.h.e {
            final int a;
            final int b;
            final WeakReference c;
            final z d;

            a(int v, int v1, WeakReference weakReference0) {
                this.a = v;
                this.b = v1;
                this.c = weakReference0;
                super();
            }

            @Override  // androidx.core.content.res.h$e
            public void h(int v) {
            }

            @Override  // androidx.core.content.res.h$e
            public void i(Typeface typeface0) {
                if(Build.VERSION.SDK_INT >= 28) {
                    int v = this.a;
                    if(v != -1) {
                        typeface0 = f.a(typeface0, v, (this.b & 2) != 0);
                    }
                }
                z.this.n(this.c, typeface0);
            }
        }

        this.j = c00.k(j.d3, this.j);
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            int v1 = c00.k(j.g3, -1);
            this.k = v1;
            if(v1 != -1) {
                this.j &= 2;
            }
        }
        int v2 = j.f3;
        boolean z = true;
        if(!c00.s(v2) && !c00.s(j.h3)) {
            if(c00.s(j.c3)) {
                this.m = false;
                int v3 = c00.k(1, 1);
                switch(v3) {
                    case 1: {
                        this.l = Typeface.SANS_SERIF;
                        break;
                    }
                    case 2: {
                        this.l = Typeface.SERIF;
                        return;
                    label_17:
                        if(v3 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        break;
                    }
                    default: {
                        goto label_17;
                    }
                }
            }
            return;
        }
        this.l = null;
        if(c00.s(j.h3)) {
            v2 = 12;
        }
        int v4 = this.k;
        int v5 = this.j;
        if(!context0.isRestricted()) {
            a z$a0 = new a(this, v4, v5, new WeakReference(this.a));
            try {
                Typeface typeface0 = c00.j(v2, this.j, z$a0);
                if(typeface0 != null) {
                    this.l = v < 28 || this.k == -1 ? typeface0 : f.a(Typeface.create(typeface0, 0), this.k, (this.j & 2) != 0);
                }
                this.m = this.l == null;
            }
            catch(UnsupportedOperationException | Resources.NotFoundException unused_ex) {
            }
        }
        if(this.l == null) {
            String s = c00.o(v2);
            if(s != null) {
                if(Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                    Typeface typeface1 = Typeface.create(s, 0);
                    int v6 = this.k;
                    if((this.j & 2) == 0) {
                        z = false;
                    }
                    this.l = f.a(typeface1, v6, z);
                    return;
                }
                this.l = Typeface.create(s, this.j);
            }
        }
    }

    private void a(Drawable drawable0, a0 a00) {
        if(drawable0 != null && a00 != null) {
            androidx.appcompat.widget.j.i(drawable0, a00, this.a.getDrawableState());
        }
    }

    void b() {
        if(this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] arr_drawable = this.a.getCompoundDrawables();
            this.a(arr_drawable[0], this.b);
            this.a(arr_drawable[1], this.c);
            this.a(arr_drawable[2], this.d);
            this.a(arr_drawable[3], this.e);
        }
        if(this.f != null || this.g != null) {
            Drawable[] arr_drawable1 = this.a.getCompoundDrawablesRelative();
            this.a(arr_drawable1[0], this.f);
            this.a(arr_drawable1[2], this.g);
        }
    }

    void c() {
        this.i.a();
    }

    private static a0 d(Context context0, androidx.appcompat.widget.j j0, int v) {
        ColorStateList colorStateList0 = j0.f(context0, v);
        if(colorStateList0 != null) {
            a0 a00 = new a0();
            a00.d = true;
            a00.a = colorStateList0;
            return a00;
        }
        return null;
    }

    int e() {
        return this.i.f();
    }

    int f() {
        return this.i.g();
    }

    int g() {
        return this.i.h();
    }

    int[] h() {
        return this.i.i();
    }

    int i() {
        return this.i.j();
    }

    ColorStateList j() {
        return this.h == null ? null : this.h.a;
    }

    PorterDuff.Mode k() {
        return this.h == null ? null : this.h.b;
    }

    boolean l() {
        return this.i.n();
    }

    void m(AttributeSet attributeSet0, int v) {
        float f;
        int v14;
        int v4;
        String s1;
        String s;
        int v2;
        boolean z;
        Context context0 = this.a.getContext();
        androidx.appcompat.widget.j j0 = androidx.appcompat.widget.j.b();
        c0 c00 = c0.v(context0, attributeSet0, j.Y, v, 0);
        Context context1 = this.a.getContext();
        Y.m0(this.a, context1, j.Y, attributeSet0, c00.r(), v, 0);
        int v1 = c00.n(j.Z, -1);
        if(c00.s(j.c0)) {
            this.b = z.d(context0, j0, c00.n(3, 0));
        }
        if(c00.s(j.a0)) {
            this.c = z.d(context0, j0, c00.n(1, 0));
        }
        if(c00.s(j.d0)) {
            this.d = z.d(context0, j0, c00.n(4, 0));
        }
        if(c00.s(j.b0)) {
            this.e = z.d(context0, j0, c00.n(2, 0));
        }
        if(c00.s(j.e0)) {
            this.f = z.d(context0, j0, c00.n(5, 0));
        }
        if(c00.s(j.f0)) {
            this.g = z.d(context0, j0, c00.n(6, 0));
        }
        c00.x();
        TransformationMethod transformationMethod0 = this.a.getTransformationMethod();
        if(v1 == -1) {
            z = false;
            v2 = 0;
            s1 = null;
            s = null;
        }
        else {
            c0 c01 = c0.t(context0, v1, j.a3);
            if(transformationMethod0 instanceof PasswordTransformationMethod || !c01.s(j.j3)) {
                z = false;
                v2 = 0;
            }
            else {
                z = c01.a(14, false);
                v2 = 1;
            }
            this.C(context0, c01);
            int v3 = Build.VERSION.SDK_INT;
            s = c01.s(j.k3) ? c01.o(15) : null;
            s1 = v3 < 26 || !c01.s(j.i3) ? null : c01.o(13);
            c01.x();
        }
        c0 c02 = c0.v(context0, attributeSet0, j.a3, v, 0);
        if(transformationMethod0 instanceof PasswordTransformationMethod || !c02.s(j.j3)) {
            v4 = v2;
        }
        else {
            z = c02.a(14, false);
            v4 = 1;
        }
        int v5 = Build.VERSION.SDK_INT;
        if(c02.s(j.k3)) {
            s = c02.o(15);
        }
        if(v5 >= 26 && c02.s(j.i3)) {
            s1 = c02.o(13);
        }
        if(v5 >= 28 && c02.s(j.b3) && c02.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.C(context0, c02);
        c02.x();
        if(!(transformationMethod0 instanceof PasswordTransformationMethod) && v4 != 0) {
            this.s(z);
        }
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            if(this.k == -1) {
                this.a.setTypeface(typeface0, this.j);
            }
            else {
                this.a.setTypeface(typeface0);
            }
        }
        if(s1 != null) {
            e.d(this.a, s1);
        }
        if(s != null) {
            if(v5 >= 24) {
                LocaleList localeList0 = d.a(s);
                d.b(this.a, localeList0);
            }
            else {
                Locale locale0 = c.a(s.split(",")[0]);
                this.a.setTextLocale(locale0);
            }
        }
        this.i.o(attributeSet0, v);
        if(n0.c && this.i.j() != 0) {
            int[] arr_v = this.i.i();
            if(arr_v.length > 0) {
                if(((float)e.a(this.a)) == -1.0f) {
                    e.c(this.a, arr_v, 0);
                }
                else {
                    e.b(this.a, this.i.g(), this.i.f(), this.i.h(), 0);
                }
            }
        }
        c0 c03 = c0.u(context0, attributeSet0, j.g0);
        int v6 = c03.n(j.o0, -1);
        Drawable drawable0 = v6 == -1 ? null : j0.c(context0, v6);
        int v7 = c03.n(j.t0, -1);
        Drawable drawable1 = v7 == -1 ? null : j0.c(context0, v7);
        int v8 = c03.n(j.p0, -1);
        Drawable drawable2 = v8 == -1 ? null : j0.c(context0, v8);
        int v9 = c03.n(j.m0, -1);
        Drawable drawable3 = v9 == -1 ? null : j0.c(context0, v9);
        int v10 = c03.n(j.q0, -1);
        Drawable drawable4 = v10 == -1 ? null : j0.c(context0, v10);
        int v11 = c03.n(j.n0, -1);
        this.y(drawable0, drawable1, drawable2, drawable3, drawable4, (v11 == -1 ? null : j0.c(context0, v11)));
        if(c03.s(j.r0)) {
            ColorStateList colorStateList0 = c03.c(11);
            i.g(this.a, colorStateList0);
        }
        if(c03.s(j.s0)) {
            PorterDuff.Mode porterDuff$Mode0 = L.e(c03.k(12, -1), null);
            i.h(this.a, porterDuff$Mode0);
        }
        int v12 = c03.f(j.v0, -1);
        int v13 = c03.f(j.w0, -1);
        if(c03.s(j.x0)) {
            TypedValue typedValue0 = c03.w(19);
            if(typedValue0 == null || typedValue0.type != 5) {
                f = (float)c03.f(19, -1);
                v14 = -1;
            }
            else {
                v14 = typedValue0.data & 15;
                f = TypedValue.complexToFloat(typedValue0.data);
            }
        }
        else {
            f = -1.0f;
            v14 = -1;
        }
        c03.x();
        if(v12 != -1) {
            i.j(this.a, v12);
        }
        if(v13 != -1) {
            i.k(this.a, v13);
        }
        if(f != -1.0f) {
            if(v14 == -1) {
                i.l(this.a, ((int)f));
                return;
            }
            i.m(this.a, v14, f);
        }
    }

    void n(WeakReference weakReference0, Typeface typeface0) {
        class b implements Runnable {
            final TextView f;
            final Typeface g;
            final int h;
            final z i;

            b(TextView textView0, Typeface typeface0, int v) {
                this.f = textView0;
                this.g = typeface0;
                this.h = v;
                super();
            }

            @Override
            public void run() {
                this.f.setTypeface(this.g, this.h);
            }
        }

        if(this.m) {
            this.l = typeface0;
            TextView textView0 = (TextView)weakReference0.get();
            if(textView0 != null) {
                if(textView0.isAttachedToWindow()) {
                    textView0.post(new b(this, textView0, typeface0, this.j));
                    return;
                }
                textView0.setTypeface(typeface0, this.j);
            }
        }
    }

    void o(boolean z, int v, int v1, int v2, int v3) {
        if(!n0.c) {
            this.c();
        }
    }

    void p() {
        this.b();
    }

    void q(Context context0, int v) {
        c0 c00 = c0.t(context0, v, j.a3);
        if(c00.s(j.j3)) {
            this.s(c00.a(14, false));
        }
        int v1 = Build.VERSION.SDK_INT;
        if(c00.s(j.b3) && c00.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.C(context0, c00);
        if(v1 >= 26 && c00.s(j.i3)) {
            String s = c00.o(13);
            if(s != null) {
                e.d(this.a, s);
            }
        }
        c00.x();
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            this.a.setTypeface(typeface0, this.j);
        }
    }

    void r(TextView textView0, InputConnection inputConnection0, EditorInfo editorInfo0) {
        if(Build.VERSION.SDK_INT < 30 && inputConnection0 != null) {
            F.c.f(editorInfo0, textView0.getText());
        }
    }

    void s(boolean z) {
        this.a.setAllCaps(z);
    }

    void t(int v, int v1, int v2, int v3) {
        this.i.p(v, v1, v2, v3);
    }

    void u(int[] arr_v, int v) {
        this.i.q(arr_v, v);
    }

    void v(int v) {
        this.i.r(v);
    }

    void w(ColorStateList colorStateList0) {
        if(this.h == null) {
            this.h = new a0();
        }
        this.h.a = colorStateList0;
        this.h.d = colorStateList0 != null;
        this.z();
    }

    void x(PorterDuff.Mode porterDuff$Mode0) {
        if(this.h == null) {
            this.h = new a0();
        }
        this.h.b = porterDuff$Mode0;
        this.h.c = porterDuff$Mode0 != null;
        this.z();
    }

    private void y(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5) {
        if(drawable4 != null || drawable5 != null) {
            Drawable[] arr_drawable2 = this.a.getCompoundDrawablesRelative();
            if(drawable4 == null) {
                drawable4 = arr_drawable2[0];
            }
            if(drawable1 == null) {
                drawable1 = arr_drawable2[1];
            }
            if(drawable5 == null) {
                drawable5 = arr_drawable2[2];
            }
            TextView textView1 = this.a;
            if(drawable3 == null) {
                drawable3 = arr_drawable2[3];
            }
            textView1.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable4, drawable1, drawable5, drawable3);
        }
        else if(drawable0 != null || drawable1 != null || drawable2 != null || drawable3 != null) {
            Drawable[] arr_drawable = this.a.getCompoundDrawablesRelative();
            Drawable drawable6 = arr_drawable[0];
            if(drawable6 == null && arr_drawable[2] == null) {
                Drawable[] arr_drawable1 = this.a.getCompoundDrawables();
                TextView textView0 = this.a;
                if(drawable0 == null) {
                    drawable0 = arr_drawable1[0];
                }
                if(drawable1 == null) {
                    drawable1 = arr_drawable1[1];
                }
                if(drawable2 == null) {
                    drawable2 = arr_drawable1[2];
                }
                if(drawable3 == null) {
                    drawable3 = arr_drawable1[3];
                }
                textView0.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
                return;
            }
            if(drawable1 == null) {
                drawable1 = arr_drawable[1];
            }
            if(drawable3 == null) {
                drawable3 = arr_drawable[3];
            }
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable6, drawable1, arr_drawable[2], drawable3);
        }
    }

    private void z() {
        this.b = this.h;
        this.c = this.h;
        this.d = this.h;
        this.e = this.h;
        this.f = this.h;
        this.g = this.h;
    }
}

