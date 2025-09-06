package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.app.E;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.f;
import androidx.vectordrawable.graphics.drawable.b;
import androidx.vectordrawable.graphics.drawable.c;
import com.facebook.internal.C;
import com.google.android.material.internal.q;
import com.google.android.material.internal.t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z1.d;
import z1.e;
import z1.i;
import z1.j;
import z1.k;

public class MaterialCheckBox extends f {
    static class SavedState extends View.BaseSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        int f;

        static {
            SavedState.CREATOR = new a();
        }

        private SavedState(Parcel parcel0) {
            super(parcel0);
            this.f = (int)(((Integer)parcel0.readValue(this.getClass().getClassLoader())));
        }

        SavedState(Parcel parcel0, com.google.android.material.checkbox.MaterialCheckBox.a materialCheckBox$a0) {
            this(parcel0);
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private String a() {
            switch(this.f) {
                case 1: {
                    return "checked";
                }
                case 2: {
                    return "indeterminate";
                }
                default: {
                    return "unchecked";
                }
            }
        }

        @Override
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + this.a() + "}";
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeValue(this.f);
        }
    }

    class com.google.android.material.checkbox.MaterialCheckBox.a extends b {
        final MaterialCheckBox b;

        @Override  // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable0) {
            super.b(drawable0);
            ColorStateList colorStateList0 = MaterialCheckBox.this.t;
            if(colorStateList0 != null) {
                androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
            }
        }

        @Override  // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable0) {
            super.c(drawable0);
            MaterialCheckBox materialCheckBox0 = MaterialCheckBox.this;
            ColorStateList colorStateList0 = materialCheckBox0.t;
            if(colorStateList0 != null) {
                androidx.core.graphics.drawable.a.n(drawable0, colorStateList0.getColorForState(materialCheckBox0.x, MaterialCheckBox.this.t.getDefaultColor()));
            }
        }
    }

    private CompoundButton.OnCheckedChangeListener A;
    private final c B;
    private final b C;
    private static final int D;
    private static final int[] E;
    private static final int[] F;
    private static final int[][] G;
    private static final int H;
    private final LinkedHashSet j;
    private final LinkedHashSet k;
    private ColorStateList l;
    private boolean m;
    private boolean n;
    private boolean o;
    private CharSequence p;
    private Drawable q;
    private Drawable r;
    private boolean s;
    ColorStateList t;
    ColorStateList u;
    private PorterDuff.Mode v;
    private int w;
    private int[] x;
    private boolean y;
    private CharSequence z;

    static {
        MaterialCheckBox.D = j.s;
        MaterialCheckBox.E = new int[]{z1.a.V};
        MaterialCheckBox.F = new int[]{z1.a.U};
        MaterialCheckBox.G = new int[][]{new int[]{0x101009E, z1.a.U}, new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
        MaterialCheckBox.H = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.g);
    }

    public MaterialCheckBox(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, MaterialCheckBox.D), attributeSet0, v);
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.B = c.a(this.getContext(), d.f);
        this.C = new com.google.android.material.checkbox.MaterialCheckBox.a(this);
        Context context1 = this.getContext();
        this.q = androidx.core.widget.c.a(this);
        this.t = this.getSuperButtonTintList();
        this.setSupportButtonTintList(null);
        c0 c00 = q.j(context1, attributeSet0, k.d4, v, MaterialCheckBox.D, new int[0]);
        this.r = c00.g(k.g4);
        if(this.q != null && q.g(context1) && this.c(c00)) {
            super.setButtonDrawable(null);
            this.q = f.a.b(context1, d.e);
            this.s = true;
            if(this.r == null) {
                this.r = f.a.b(context1, d.g);
            }
        }
        this.u = P1.c.b(context1, c00, k.h4);
        this.v = t.i(c00.k(k.i4, -1), PorterDuff.Mode.SRC_IN);
        this.m = c00.a(k.n4, false);
        this.n = c00.a(k.j4, true);
        this.o = c00.a(k.m4, false);
        this.p = c00.p(k.l4);
        if(c00.s(k.k4)) {
            this.setCheckedState(c00.k(7, 0));
        }
        c00.x();
        this.e();
    }

    private boolean c(c0 c00) {
        int v = c00.n(k.e4, 0);
        int v1 = c00.n(k.f4, 0);
        return v == MaterialCheckBox.H && v1 == 0;
    }

    public boolean d() {
        return this.o;
    }

    private void e() {
        this.q = com.google.android.material.drawable.d.c(this.q, this.t, androidx.core.widget.c.c(this));
        this.r = com.google.android.material.drawable.d.c(this.r, this.u, this.v);
        this.g();
        this.h();
        super.setButtonDrawable(com.google.android.material.drawable.d.a(this.q, this.r));
        this.refreshDrawableState();
    }

    private void f() {
        if(Build.VERSION.SDK_INT >= 30 && this.z == null) {
            super.setStateDescription(this.getButtonStateDescription());
        }
    }

    private void g() {
        if(!this.s) {
            return;
        }
        c c0 = this.B;
        if(c0 != null) {
            c0.g(this.C);
            this.B.c(this.C);
        }
        if(Build.VERSION.SDK_INT >= 24) {
            Drawable drawable0 = this.q;
            if(drawable0 instanceof AnimatedStateListDrawable) {
                c c1 = this.B;
                if(c1 != null) {
                    ((AnimatedStateListDrawable)drawable0).addTransition(e.b, e.W, c1, false);
                    ((AnimatedStateListDrawable)this.q).addTransition(e.h, e.W, this.B, false);
                }
            }
        }
    }

    @Override  // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.q;
    }

    public Drawable getButtonIconDrawable() {
        return this.r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.v;
    }

    private String getButtonStateDescription() {
        int v = this.w;
        if(v == 1) {
            return this.getResources().getString(i.k);
        }
        return v == 0 ? this.getResources().getString(i.m) : this.getResources().getString(i.l);
    }

    @Override  // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.t;
    }

    public int getCheckedState() {
        return this.w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.p;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if(this.l == null) {
            int[] arr_v = new int[MaterialCheckBox.G.length];
            int v = H1.a.d(this, z1.a.j);
            int v1 = H1.a.d(this, z1.a.l);
            int v2 = H1.a.d(this, z1.a.p);
            int v3 = H1.a.d(this, z1.a.m);
            arr_v[0] = H1.a.j(v2, v1, 1.0f);
            arr_v[1] = H1.a.j(v2, v, 1.0f);
            arr_v[2] = H1.a.j(v2, v3, 0.54f);
            arr_v[3] = H1.a.j(v2, v3, 0.38f);
            arr_v[4] = H1.a.j(v2, v3, 0.38f);
            this.l = new ColorStateList(MaterialCheckBox.G, arr_v);
        }
        return this.l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList0 = this.t;
        if(colorStateList0 != null) {
            return colorStateList0;
        }
        return super.getButtonTintList() == null ? this.getSupportButtonTintList() : super.getButtonTintList();
    }

    private void h() {
        Drawable drawable0 = this.q;
        if(drawable0 != null) {
            ColorStateList colorStateList0 = this.t;
            if(colorStateList0 != null) {
                androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
            }
        }
        Drawable drawable1 = this.r;
        if(drawable1 != null) {
            ColorStateList colorStateList1 = this.u;
            if(colorStateList1 != null) {
                androidx.core.graphics.drawable.a.o(drawable1, colorStateList1);
            }
        }
    }

    private void i() {
    }

    @Override  // android.widget.CompoundButton
    public boolean isChecked() {
        return this.w == 1;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.m && this.t == null && this.u == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    @Override  // android.widget.CompoundButton
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.getCheckedState() == 2) {
            View.mergeDrawableStates(arr_v, MaterialCheckBox.E);
        }
        if(this.d()) {
            View.mergeDrawableStates(arr_v, MaterialCheckBox.F);
        }
        this.x = com.google.android.material.drawable.d.e(arr_v);
        return arr_v;
    }

    @Override  // android.widget.CompoundButton
    protected void onDraw(Canvas canvas0) {
        if(this.n && TextUtils.isEmpty(this.getText())) {
            Drawable drawable0 = androidx.core.widget.c.a(this);
            if(drawable0 != null) {
                int v = t.g(this) ? -1 : 1;
                int v1 = (this.getWidth() - drawable0.getIntrinsicWidth()) / 2 * v;
                int v2 = canvas0.save();
                canvas0.translate(((float)v1), 0.0f);
                super.onDraw(canvas0);
                canvas0.restoreToCount(v2);
                if(this.getBackground() != null) {
                    Rect rect0 = drawable0.getBounds();
                    androidx.core.graphics.drawable.a.l(this.getBackground(), rect0.left + v1, rect0.top, rect0.right + v1, rect0.bottom);
                }
                return;
            }
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(accessibilityNodeInfo0 == null) {
            return;
        }
        if(this.d()) {
            accessibilityNodeInfo0.setText(accessibilityNodeInfo0.getText() + ", " + this.p);
        }
    }

    @Override  // android.widget.CompoundButton
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.setCheckedState(((SavedState)parcelable0).f);
    }

    @Override  // android.widget.CompoundButton
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.f = this.getCheckedState();
        return parcelable0;
    }

    @Override  // androidx.appcompat.widget.f
    public void setButtonDrawable(int v) {
        this.setButtonDrawable(f.a.b(this.getContext(), v));
    }

    @Override  // androidx.appcompat.widget.f
    public void setButtonDrawable(Drawable drawable0) {
        this.q = drawable0;
        this.s = false;
        this.e();
    }

    public void setButtonIconDrawable(Drawable drawable0) {
        this.r = drawable0;
        this.e();
    }

    public void setButtonIconDrawableResource(int v) {
        this.setButtonIconDrawable(f.a.b(this.getContext(), v));
    }

    public void setButtonIconTintList(ColorStateList colorStateList0) {
        if(this.u == colorStateList0) {
            return;
        }
        this.u = colorStateList0;
        this.e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.v == porterDuff$Mode0) {
            return;
        }
        this.v = porterDuff$Mode0;
        this.e();
    }

    @Override  // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList0) {
        if(this.t == colorStateList0) {
            return;
        }
        this.t = colorStateList0;
        this.e();
    }

    @Override  // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.setSupportButtonTintMode(porterDuff$Mode0);
        this.e();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.n = z;
    }

    @Override  // android.widget.CompoundButton
    public void setChecked(boolean z) {
        this.setCheckedState(((int)z));
    }

    public void setCheckedState(int v) {
        if(this.w != v) {
            this.w = v;
            super.setChecked(v == 1);
            this.refreshDrawableState();
            this.f();
            if(this.y) {
                return;
            }
            this.y = true;
            LinkedHashSet linkedHashSet0 = this.k;
            if(linkedHashSet0 != null) {
                Iterator iterator0 = linkedHashSet0.iterator();
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    E.a(object0);
                    throw null;
                }
            }
            if(this.w != 2) {
                CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = this.A;
                if(compoundButton$OnCheckedChangeListener0 != null) {
                    compoundButton$OnCheckedChangeListener0.onCheckedChanged(this, this.isChecked());
                }
            }
            if(Build.VERSION.SDK_INT >= 26) {
                AutofillManager autofillManager0 = C.a(this.getContext().getSystemService(AutofillManager.class));
                if(autofillManager0 != null) {
                    autofillManager0.notifyValueChanged(this);
                }
            }
            this.y = false;
        }
    }

    @Override  // android.widget.TextView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence0) {
        this.p = charSequence0;
    }

    public void setErrorAccessibilityLabelResource(int v) {
        this.setErrorAccessibilityLabel((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setErrorShown(boolean z) {
        if(this.o == z) {
            return;
        }
        this.o = z;
        this.refreshDrawableState();
        Iterator iterator0 = this.j.iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        Object object0 = iterator0.next();
        E.a(object0);
        throw null;
    }

    @Override  // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.A = compoundButton$OnCheckedChangeListener0;
    }

    @Override  // android.widget.CompoundButton
    public void setStateDescription(CharSequence charSequence0) {
        this.z = charSequence0;
        if(charSequence0 == null) {
            this.f();
            return;
        }
        super.setStateDescription(charSequence0);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.m = z;
        if(z) {
            androidx.core.widget.c.d(this, this.getMaterialThemeColorsTintList());
            return;
        }
        androidx.core.widget.c.d(this, null);
    }

    @Override  // android.widget.CompoundButton
    public void toggle() {
        this.setChecked(!this.isChecked());
    }
}

