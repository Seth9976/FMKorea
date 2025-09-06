package I1;

import S1.g;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.c.a;
import androidx.appcompat.view.d;
import androidx.core.view.Y;
import z1.j;
import z1.k;

public class b extends a {
    private Drawable c;
    private final Rect d;
    private static final int e;
    private static final int f;
    private static final int g;

    static {
        b.e = z1.a.a;
        b.f = j.a;
        b.g = z1.a.w;
    }

    public b(Context context0) {
        this(context0, 0);
    }

    public b(Context context0, int v) {
        super(b.t(context0), b.v(context0, v));
        Context context1 = this.b();
        Resources.Theme resources$Theme0 = context1.getTheme();
        this.d = c.a(context1, b.e, b.f);
        String s = this.getClass().getCanonicalName();
        int v1 = H1.a.c(context1, z1.a.p, s);
        TypedArray typedArray0 = context1.obtainStyledAttributes(null, k.S2, b.e, b.f);
        int v2 = typedArray0.getColor(k.X2, v1);
        typedArray0.recycle();
        g g0 = new g(context1, null, b.e, b.f);
        g0.K(context1);
        g0.V(ColorStateList.valueOf(v2));
        if(Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue0 = new TypedValue();
            resources$Theme0.resolveAttribute(0x1010571, typedValue0, true);
            float f = typedValue0.getDimension(this.b().getResources().getDisplayMetrics());
            if(typedValue0.type == 5 && f >= 0.0f) {
                g0.S(f);
            }
        }
        this.c = g0;
    }

    public b A(CharSequence[] arr_charSequence, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return (b)super.g(arr_charSequence, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    public b B(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.h(v, dialogInterface$OnClickListener0);
    }

    public b C(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.i(charSequence0, dialogInterface$OnClickListener0);
    }

    public b D(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return (b)super.j(dialogInterface$OnDismissListener0);
    }

    public b E(DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
        return (b)super.k(dialogInterface$OnKeyListener0);
    }

    public b F(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.l(v, dialogInterface$OnClickListener0);
    }

    public b G(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.m(charSequence0, dialogInterface$OnClickListener0);
    }

    public b H(ListAdapter listAdapter0, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.n(listAdapter0, v, dialogInterface$OnClickListener0);
    }

    public b I(CharSequence[] arr_charSequence, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.o(arr_charSequence, v, dialogInterface$OnClickListener0);
    }

    public b J(int v) {
        return (b)super.p(v);
    }

    public b K(CharSequence charSequence0) {
        return (b)super.q(charSequence0);
    }

    public b L(View view0) {
        return (b)super.r(view0);
    }

    @Override  // androidx.appcompat.app.c$a
    public androidx.appcompat.app.c a() {
        androidx.appcompat.app.c c0 = super.a();
        Window window0 = c0.getWindow();
        View view0 = window0.getDecorView();
        Drawable drawable0 = this.c;
        if(drawable0 instanceof g) {
            ((g)drawable0).U(Y.u(view0));
        }
        window0.setBackgroundDrawable(c.b(this.c, this.d));
        view0.setOnTouchListener(new I1.a(c0, this.d));
        return c0;
    }

    @Override  // androidx.appcompat.app.c$a
    public a c(ListAdapter listAdapter0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.w(listAdapter0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a d(View view0) {
        return this.x(view0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a e(Drawable drawable0) {
        return this.y(drawable0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a f(CharSequence charSequence0) {
        return this.z(charSequence0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a g(CharSequence[] arr_charSequence, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return this.A(arr_charSequence, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a h(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.B(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a i(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.C(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a j(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.D(dialogInterface$OnDismissListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a k(DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
        return this.E(dialogInterface$OnKeyListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a l(int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.F(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a m(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.G(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a n(ListAdapter listAdapter0, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.H(listAdapter0, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a o(CharSequence[] arr_charSequence, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.I(arr_charSequence, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a p(int v) {
        return this.J(v);
    }

    @Override  // androidx.appcompat.app.c$a
    public a q(CharSequence charSequence0) {
        return this.K(charSequence0);
    }

    @Override  // androidx.appcompat.app.c$a
    public a r(View view0) {
        return this.L(view0);
    }

    private static Context t(Context context0) {
        int v = b.u(context0);
        Context context1 = V1.a.c(context0, null, b.e, b.f);
        return v == 0 ? context1 : new d(context1, v);
    }

    private static int u(Context context0) {
        TypedValue typedValue0 = P1.b.a(context0, b.g);
        return typedValue0 == null ? 0 : typedValue0.data;
    }

    private static int v(Context context0, int v) {
        return v == 0 ? b.u(context0) : v;
    }

    public b w(ListAdapter listAdapter0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.c(listAdapter0, dialogInterface$OnClickListener0);
    }

    public b x(View view0) {
        return (b)super.d(view0);
    }

    public b y(Drawable drawable0) {
        return (b)super.e(drawable0);
    }

    public b z(CharSequence charSequence0) {
        return (b)super.f(charSequence0);
    }
}

