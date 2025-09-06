package com.google.android.material.textfield;

import H1.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.c;
import androidx.core.view.Y;
import com.google.android.material.internal.f;
import com.google.android.material.internal.q;
import java.util.List;
import z1.g;
import z1.j;
import z1.k;

public class w extends c {
    class b extends ArrayAdapter {
        private ColorStateList f;
        private ColorStateList g;
        final w h;

        b(Context context0, int v, String[] arr_s) {
            super(context0, v, arr_s);
            this.f();
        }

        private ColorStateList a() {
            if(this.c() && this.d()) {
                int[] arr_v = {0x1010367, 0xFEFEFF59};
                int[] arr_v1 = {0x10100A1, 0xFEFEFF59};
                int v = w.this.q.getColorForState(arr_v1, 0);
                int v1 = w.this.q.getColorForState(arr_v, 0);
                int v2 = a.i(w.this.p, v);
                int v3 = a.i(w.this.p, v1);
                return new ColorStateList(new int[][]{arr_v1, arr_v, new int[0]}, new int[]{v2, v3, w.this.p});
            }
            return null;
        }

        private Drawable b() {
            if(this.c()) {
                Drawable drawable0 = new ColorDrawable(w.this.p);
                if(this.g != null) {
                    androidx.core.graphics.drawable.a.o(drawable0, this.f);
                    return new RippleDrawable(this.g, drawable0, null);
                }
                return drawable0;
            }
            return null;
        }

        private boolean c() {
            return w.this.p != 0;
        }

        private boolean d() {
            return w.this.q != null;
        }

        private ColorStateList e() {
            if(!this.d()) {
                return null;
            }
            int[] arr_v = {0x10100A7};
            int[] arr_v1 = {w.this.q.getColorForState(arr_v, 0), 0};
            return new ColorStateList(new int[][]{arr_v, new int[0]}, arr_v1);
        }

        void f() {
            this.g = this.e();
            this.f = this.a();
        }

        @Override  // android.widget.ArrayAdapter
        public View getView(int v, View view0, ViewGroup viewGroup0) {
            View view1 = super.getView(v, view0, viewGroup0);
            if(view1 instanceof TextView) {
                Y.s0(((TextView)view1), (w.this.getText().toString().contentEquals(((TextView)view1).getText()) ? this.b() : null));
            }
            return view1;
        }
    }

    private final P j;
    private final AccessibilityManager k;
    private final Rect l;
    private final int m;
    private final float n;
    private ColorStateList o;
    private int p;
    private ColorStateList q;

    public w(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.c);
    }

    public w(Context context0, AttributeSet attributeSet0, int v) {
        class com.google.android.material.textfield.w.a implements AdapterView.OnItemClickListener {
            final w f;

            @Override  // android.widget.AdapterView$OnItemClickListener
            public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                Object object0 = v >= 0 ? w.this.getAdapter().getItem(v) : w.b(w.this).u();
                w.c(w.this, object0);
                AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = w.this.getOnItemClickListener();
                if(adapterView$OnItemClickListener0 != null) {
                    if(view0 == null || v < 0) {
                        view0 = w.b(w.this).x();
                        v = w.b(w.this).w();
                        v1 = w.b(w.this).v();
                    }
                    adapterView$OnItemClickListener0.onItemClick(w.b(w.this).j(), view0, v, v1);
                }
                w.b(w.this).dismiss();
            }
        }

        super(V1.a.c(context0, attributeSet0, v, 0), attributeSet0, v);
        this.l = new Rect();
        Context context1 = this.getContext();
        TypedArray typedArray0 = q.i(context1, attributeSet0, k.Z2, v, j.e, new int[0]);
        if(typedArray0.hasValue(k.a3) && typedArray0.getInt(0, 0) == 0) {
            this.setKeyListener(null);
        }
        this.m = typedArray0.getResourceId(k.d3, g.p);
        this.n = (float)typedArray0.getDimensionPixelOffset(k.b3, z1.c.k0);
        if(typedArray0.hasValue(k.c3)) {
            this.o = ColorStateList.valueOf(typedArray0.getColor(2, 0));
        }
        this.p = typedArray0.getColor(k.e3, 0);
        this.q = P1.c.a(context1, typedArray0, k.f3);
        this.k = (AccessibilityManager)context1.getSystemService("accessibility");
        P p0 = new P(context1);
        this.j = p0;
        p0.I(true);
        p0.C(this);
        p0.H(2);
        p0.o(this.getAdapter());
        p0.K(new com.google.android.material.textfield.w.a(this));
        if(typedArray0.hasValue(k.g3)) {
            this.setSimpleItems(typedArray0.getResourceId(6, 0));
        }
        typedArray0.recycle();
    }

    static P b(w w0) {
        return w0.j;
    }

    static void c(w w0, Object object0) {
        w0.l(object0);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if(this.g()) {
            this.j.dismiss();
            return;
        }
        super.dismissDropDown();
    }

    private TextInputLayout f() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    private boolean g() {
        return this.i() || this.h();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.o;
    }

    @Override  // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.f();
        return textInputLayout0 == null || !textInputLayout0.R() ? super.getHint() : textInputLayout0.getHint();
    }

    public float getPopupElevation() {
        return this.n;
    }

    public int getSimpleItemSelectedColor() {
        return this.p;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.q;
    }

    private boolean h() {
        if(this.k != null && this.k.isEnabled()) {
            List list0 = this.k.getEnabledAccessibilityServiceList(16);
            if(list0 != null) {
                for(Object object0: list0) {
                    if(((AccessibilityServiceInfo)object0).getSettingsActivityName() != null && ((AccessibilityServiceInfo)object0).getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean i() {
        return this.k != null && this.k.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter listAdapter0 = this.getAdapter();
        TextInputLayout textInputLayout0 = this.f();
        int v = 0;
        if(listAdapter0 != null && textInputLayout0 != null) {
            int v1 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
            int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
            int v3 = Math.max(0, this.j.w());
            int v4 = Math.min(listAdapter0.getCount(), v3 + 15);
            int v5 = Math.max(0, v4 - 15);
            View view0 = null;
            int v6 = 0;
            while(v5 < v4) {
                int v7 = listAdapter0.getItemViewType(v5);
                if(v7 != v) {
                    view0 = null;
                    v = v7;
                }
                view0 = listAdapter0.getView(v5, view0, textInputLayout0);
                if(view0.getLayoutParams() == null) {
                    view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view0.measure(v1, v2);
                v6 = Math.max(v6, view0.getMeasuredWidth());
                ++v5;
            }
            Drawable drawable0 = this.j.g();
            if(drawable0 != null) {
                drawable0.getPadding(this.l);
                v6 += this.l.left + this.l.right;
            }
            return v6 + textInputLayout0.getEndIconView().getMeasuredWidth();
        }
        return 0;
    }

    private void k() {
        TextInputLayout textInputLayout0 = this.f();
        if(textInputLayout0 != null) {
            textInputLayout0.r0();
        }
    }

    private void l(Object object0) {
        this.setText(this.convertSelectionToString(object0), false);
    }

    @Override  // android.widget.AutoCompleteTextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.f();
        if(textInputLayout0 != null && textInputLayout0.R() && super.getHint() == null && f.b()) {
            this.setHint("");
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j.dismiss();
    }

    @Override  // android.widget.TextView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(View.MeasureSpec.getMode(v) == 0x80000000) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.j()), View.MeasureSpec.getSize(v)), this.getMeasuredHeight());
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void onWindowFocusChanged(boolean z) {
        if(this.g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setAdapter(ListAdapter listAdapter0) {
        super.setAdapter(listAdapter0);
        ListAdapter listAdapter1 = this.getAdapter();
        this.j.o(listAdapter1);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable0) {
        super.setDropDownBackgroundDrawable(drawable0);
        P p0 = this.j;
        if(p0 != null) {
            p0.i(drawable0);
        }
    }

    public void setDropDownBackgroundTint(int v) {
        this.setDropDownBackgroundTintList(ColorStateList.valueOf(v));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList0) {
        this.o = colorStateList0;
        Drawable drawable0 = this.getDropDownBackground();
        if(drawable0 instanceof S1.g) {
            ((S1.g)drawable0).V(this.o);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        super.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
        AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener1 = this.getOnItemSelectedListener();
        this.j.L(adapterView$OnItemSelectedListener1);
    }

    @Override  // android.widget.TextView
    public void setRawInputType(int v) {
        super.setRawInputType(v);
        this.k();
    }

    public void setSimpleItemSelectedColor(int v) {
        this.p = v;
        if(this.getAdapter() instanceof b) {
            ((b)this.getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList0) {
        this.q = colorStateList0;
        if(this.getAdapter() instanceof b) {
            ((b)this.getAdapter()).f();
        }
    }

    public void setSimpleItems(int v) {
        this.setSimpleItems(this.getResources().getStringArray(v));
    }

    public void setSimpleItems(String[] arr_s) {
        this.setAdapter(new b(this, this.getContext(), this.m, arr_s));
    }

    @Override  // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if(this.g()) {
            this.j.show();
            return;
        }
        super.showDropDown();
    }
}

