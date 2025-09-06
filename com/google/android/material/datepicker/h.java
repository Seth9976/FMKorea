package com.google.android.material.datepicker;

import P1.b;
import S1.g;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.app.E;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.core.view.y0;
import androidx.fragment.app.c;
import androidx.fragment.app.z;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.t;
import java.util.LinkedHashSet;
import z1.a;
import z1.d;
import z1.e;
import z1.j;
import z1.k;

public final class h extends c {
    private TextView A;
    private CheckableImageButton B;
    private g C;
    private Button D;
    private boolean E;
    private CharSequence F;
    private CharSequence G;
    static final Object H;
    static final Object I;
    static final Object J;
    private final LinkedHashSet f;
    private final LinkedHashSet g;
    private final LinkedHashSet h;
    private final LinkedHashSet i;
    private int j;
    private m k;
    private CalendarConstraints l;
    private f m;
    private int n;
    private CharSequence o;
    private boolean p;
    private int q;
    private int r;
    private CharSequence s;
    private int t;
    private CharSequence u;
    private int v;
    private CharSequence w;
    private int x;
    private CharSequence y;
    private TextView z;

    static {
        h.H = "CONFIRM_BUTTON_TAG";
        h.I = "CANCEL_BUTTON_TAG";
        h.J = "TOGGLE_BUTTON_TAG";
    }

    public h() {
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
    }

    static boolean A(Context context0) {
        return h.C(context0, a.P);
    }

    private void B(View view0) {
        this.r();
        throw null;
    }

    static boolean C(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(b.d(context0, a.z, f.class.getCanonicalName()), new int[]{v});
        boolean z = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        return z;
    }

    private void D() {
        class com.google.android.material.datepicker.h.b extends l {
            final h a;

        }

        int v = this.w(this.requireContext());
        this.r();
        f f0 = f.C(null, v, this.l, null);
        this.m = f0;
        if(this.q == 1) {
            this.r();
            f0 = i.o(null, v, this.l);
        }
        this.k = f0;
        this.F();
        this.E(this.u());
        z z0 = this.getChildFragmentManager().p();
        z0.n(e.y, this.k);
        z0.i();
        this.k.m(new com.google.android.material.datepicker.h.b(this));
    }

    void E(String s) {
        this.A.setContentDescription(this.t());
        this.A.setText(s);
    }

    private void F() {
        this.z.setText((this.q != 1 || !this.z() ? this.F : this.G));
    }

    private void G(CheckableImageButton checkableImageButton0) {
        String s = this.q == 1 ? checkableImageButton0.getContext().getString(z1.i.w) : checkableImageButton0.getContext().getString(z1.i.y);
        this.B.setContentDescription(s);
    }

    // 检测为 Lambda 实现
    public static void o(h h0, View view0) [...]

    @Override  // androidx.fragment.app.c
    public final void onCancel(DialogInterface dialogInterface0) {
        for(Object object0: this.h) {
            ((DialogInterface.OnCancelListener)object0).onCancel(dialogInterface0);
        }
        super.onCancel(dialogInterface0);
    }

    @Override  // androidx.fragment.app.c
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.j = bundle0.getInt("OVERRIDE_THEME_RES_ID");
        E.a(bundle0.getParcelable("DATE_SELECTOR_KEY"));
        this.l = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        E.a(bundle0.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.n = bundle0.getInt("TITLE_TEXT_RES_ID_KEY");
        this.o = bundle0.getCharSequence("TITLE_TEXT_KEY");
        this.q = bundle0.getInt("INPUT_MODE_KEY");
        this.r = bundle0.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.s = bundle0.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.t = bundle0.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.u = bundle0.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.v = bundle0.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.w = bundle0.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.x = bundle0.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.y = bundle0.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence0 = this.o == null ? this.requireContext().getResources().getText(this.n) : this.o;
        this.F = charSequence0;
        this.G = h.s(charSequence0);
    }

    @Override  // androidx.fragment.app.c
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = new Dialog(this.requireContext(), this.w(this.requireContext()));
        Context context0 = dialog0.getContext();
        this.p = h.y(context0);
        this.C = new g(context0, null, a.z, j.w);
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, k.H3, a.z, j.w);
        int v = typedArray0.getColor(k.I3, 0);
        typedArray0.recycle();
        this.C.K(context0);
        this.C.V(ColorStateList.valueOf(v));
        this.C.U(Y.u(dialog0.getWindow().getDecorView()));
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate((this.p ? z1.g.x : z1.g.w), viewGroup0);
        Context context0 = view0.getContext();
        if(this.p) {
            view0.findViewById(e.y).setLayoutParams(new LinearLayout.LayoutParams(h.v(context0), -2));
        }
        else {
            view0.findViewById(e.z).setLayoutParams(new LinearLayout.LayoutParams(h.v(context0), -1));
        }
        TextView textView0 = (TextView)view0.findViewById(e.C);
        this.A = textView0;
        Y.q0(textView0, 1);
        this.B = (CheckableImageButton)view0.findViewById(e.D);
        this.z = (TextView)view0.findViewById(e.E);
        this.x(context0);
        this.D = (Button)view0.findViewById(e.d);
        this.r();
        throw null;
    }

    @Override  // androidx.fragment.app.c
    public final void onDismiss(DialogInterface dialogInterface0) {
        for(Object object0: this.i) {
            ((DialogInterface.OnDismissListener)object0).onDismiss(dialogInterface0);
        }
        ViewGroup viewGroup0 = (ViewGroup)this.getView();
        if(viewGroup0 != null) {
            viewGroup0.removeAllViews();
        }
        super.onDismiss(dialogInterface0);
    }

    @Override  // androidx.fragment.app.c
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("OVERRIDE_THEME_RES_ID", this.j);
        bundle0.putParcelable("DATE_SELECTOR_KEY", null);
        com.google.android.material.datepicker.CalendarConstraints.b calendarConstraints$b0 = new com.google.android.material.datepicker.CalendarConstraints.b(this.l);
        Month month0 = this.m == null ? null : this.m.x();
        if(month0 != null) {
            calendarConstraints$b0.b(month0.k);
        }
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints$b0.a());
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle0.putInt("TITLE_TEXT_RES_ID_KEY", this.n);
        bundle0.putCharSequence("TITLE_TEXT_KEY", this.o);
        bundle0.putInt("INPUT_MODE_KEY", this.q);
        bundle0.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.r);
        bundle0.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.s);
        bundle0.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.t);
        bundle0.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.u);
        bundle0.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.v);
        bundle0.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.w);
        bundle0.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.x);
        bundle0.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.y);
    }

    @Override  // androidx.fragment.app.c
    public void onStart() {
        super.onStart();
        Window window0 = this.requireDialog().getWindow();
        if(this.p) {
            window0.setLayout(-1, -1);
            window0.setBackgroundDrawable(this.C);
            this.q(window0);
        }
        else {
            window0.setLayout(-2, -2);
            int v = this.getResources().getDimensionPixelOffset(z1.c.e0);
            Rect rect0 = new Rect(v, v, v, v);
            window0.setBackgroundDrawable(new InsetDrawable(this.C, v, v, v, v));
            window0.getDecorView().setOnTouchListener(new I1.a(this.requireDialog(), rect0));
        }
        this.D();
    }

    @Override  // androidx.fragment.app.c
    public void onStop() {
        this.k.n();
        super.onStop();
    }

    private static Drawable p(Context context0) {
        Drawable drawable0 = new StateListDrawable();
        Drawable drawable1 = f.a.b(context0, d.c);
        ((StateListDrawable)drawable0).addState(new int[]{0x10100A0}, drawable1);
        Drawable drawable2 = f.a.b(context0, d.d);
        ((StateListDrawable)drawable0).addState(new int[0], drawable2);
        return drawable0;
    }

    private void q(Window window0) {
        class com.google.android.material.datepicker.h.a implements G {
            final int a;
            final View b;
            final int c;
            final h d;

            com.google.android.material.datepicker.h.a(int v, View view0, int v1) {
                this.a = v;
                this.b = view0;
                this.c = v1;
                super();
            }

            @Override  // androidx.core.view.G
            public y0 a(View view0, y0 y00) {
                int v = y00.f(7).b;
                if(this.a >= 0) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
                    viewGroup$LayoutParams0.height = this.a + v;
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.b.getLayoutParams();
                    this.b.setLayoutParams(viewGroup$LayoutParams1);
                }
                int v1 = this.b.getPaddingLeft();
                int v2 = this.b.getPaddingRight();
                int v3 = this.b.getPaddingBottom();
                this.b.setPadding(v1, this.c + v, v2, v3);
                return y00;
            }
        }

        if(this.E) {
            return;
        }
        View view0 = this.requireView().findViewById(e.g);
        com.google.android.material.internal.d.a(window0, true, t.d(view0), null);
        int v = view0.getPaddingTop();
        Y.B0(view0, new com.google.android.material.datepicker.h.a(this, view0.getLayoutParams().height, view0, v));
        this.E = true;
    }

    private DateSelector r() {
        E.a(this.getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence s(CharSequence charSequence0) {
        if(charSequence0 != null) {
            String[] arr_s = TextUtils.split(String.valueOf(charSequence0), "\n");
            return arr_s.length > 1 ? arr_s[0] : charSequence0;
        }
        return null;
    }

    private String t() {
        this.r();
        this.requireContext();
        throw null;
    }

    public String u() {
        this.r();
        throw null;
    }

    private static int v(Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getDimensionPixelOffset(z1.c.a0);
        Month month0 = Month.h();
        int v1 = resources0.getDimensionPixelSize(z1.c.c0);
        int v2 = resources0.getDimensionPixelOffset(z1.c.f0);
        return v * 2 + v1 * month0.i + (month0.i - 1) * v2;
    }

    private int w(Context context0) {
        int v = this.j;
        if(v != 0) {
            return v;
        }
        this.r();
        throw null;
    }

    private void x(Context context0) {
        this.B.setTag(h.J);
        this.B.setImageDrawable(h.p(context0));
        this.B.setChecked(this.q != 0);
        Y.o0(this.B, null);
        this.G(this.B);
        this.B.setOnClickListener((View view0) -> this.B(view0));
    }

    static boolean y(Context context0) {
        return h.C(context0, 0x101020D);
    }

    private boolean z() {
        return this.getResources().getConfiguration().orientation == 2;
    }
}

