package com.google.android.material.button;

import P1.c;
import S1.h;
import S1.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.app.E;
import androidx.appcompat.widget.e;
import androidx.core.view.Y;
import androidx.core.widget.i;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.q;
import com.google.android.material.internal.t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z1.j;
import z1.k;

public class MaterialButton extends e implements n, Checkable {
    static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        boolean h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                this.getClass().getClassLoader();
            }
            this.b(parcel0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private void b(Parcel parcel0) {
            this.h = parcel0.readInt() == 1;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.h));
        }
    }

    interface com.google.android.material.button.MaterialButton.a {
        void a(MaterialButton arg1, boolean arg2);
    }

    private final com.google.android.material.button.a i;
    private final LinkedHashSet j;
    private com.google.android.material.button.MaterialButton.a k;
    private PorterDuff.Mode l;
    private ColorStateList m;
    private Drawable n;
    private String o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private static final int[] w;
    private static final int[] x;
    private static final int y;

    static {
        MaterialButton.w = new int[]{0x101009F};
        MaterialButton.x = new int[]{0x10100A0};
        MaterialButton.y = j.p;
    }

    public MaterialButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.x);
    }

    public MaterialButton(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, MaterialButton.y), attributeSet0, v);
        this.j = new LinkedHashSet();
        boolean z = false;
        this.t = false;
        this.u = false;
        Context context1 = this.getContext();
        TypedArray typedArray0 = q.i(context1, attributeSet0, k.h3, v, MaterialButton.y, new int[0]);
        this.s = typedArray0.getDimensionPixelSize(k.u3, 0);
        this.l = t.i(typedArray0.getInt(k.x3, -1), PorterDuff.Mode.SRC_IN);
        this.m = c.a(this.getContext(), typedArray0, k.w3);
        this.n = c.e(this.getContext(), typedArray0, k.s3);
        this.v = typedArray0.getInteger(k.t3, 1);
        this.p = typedArray0.getDimensionPixelSize(k.v3, 0);
        com.google.android.material.button.a a0 = new com.google.android.material.button.a(this, S1.k.e(context1, attributeSet0, v, MaterialButton.y).m());
        this.i = a0;
        a0.r(typedArray0);
        typedArray0.recycle();
        this.setCompoundDrawablePadding(this.s);
        if(this.n != null) {
            z = true;
        }
        this.h(z);
    }

    public boolean a() {
        return this.i != null && this.i.p();
    }

    private boolean b() {
        return this.v == 3 || this.v == 4;
    }

    private boolean c() {
        return this.v == 1 || this.v == 2;
    }

    private boolean d() {
        return this.v == 16 || this.v == 0x20;
    }

    private boolean e() {
        return Y.z(this) == 1;
    }

    private boolean f() {
        return this.i != null && !this.i.o();
    }

    private void g() {
        if(this.c()) {
            i.i(this, this.n, null, null, null);
            return;
        }
        if(this.b()) {
            i.i(this, null, null, this.n, null);
            return;
        }
        if(this.d()) {
            i.i(this, null, this.n, null, null);
        }
    }

    // 去混淆评级： 低(23)
    String getA11yClassName() {
        if(!TextUtils.isEmpty(this.o)) {
            return this.o;
        }
        return this.a() ? "android.widget.CompoundButton" : "android.widget.Button";
    }

    private Layout.Alignment getActualTextAlignment() {
        switch(this.getTextAlignment()) {
            case 1: {
                return this.getGravityTextAlignment();
            }
            case 4: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 3: 
            case 6: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    @Override  // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }

    @Override  // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }

    // 去混淆评级： 低(20)
    public int getCornerRadius() {
        return this.f() ? this.i.b() : 0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        switch(this.getGravity() & 0x800007) {
            case 1: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 5: 
            case 0x800005: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    public Drawable getIcon() {
        return this.n;
    }

    public int getIconGravity() {
        return this.v;
    }

    public int getIconPadding() {
        return this.s;
    }

    public int getIconSize() {
        return this.p;
    }

    public ColorStateList getIconTint() {
        return this.m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.l;
    }

    public int getInsetBottom() {
        return this.i.c();
    }

    public int getInsetTop() {
        return this.i.d();
    }

    // 去混淆评级： 低(20)
    public ColorStateList getRippleColor() {
        return this.f() ? this.i.h() : null;
    }

    public S1.k getShapeAppearanceModel() {
        if(!this.f()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        return this.i.i();
    }

    // 去混淆评级： 低(20)
    public ColorStateList getStrokeColor() {
        return this.f() ? this.i.j() : null;
    }

    // 去混淆评级： 低(20)
    public int getStrokeWidth() {
        return this.f() ? this.i.k() : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.widget.e
    public ColorStateList getSupportBackgroundTintList() {
        return this.f() ? this.i.l() : super.getSupportBackgroundTintList();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.widget.e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.f() ? this.i.m() : super.getSupportBackgroundTintMode();
    }

    private int getTextHeight() {
        if(this.getLineCount() > 1) {
            return this.getLayout().getHeight();
        }
        TextPaint textPaint0 = this.getPaint();
        String s = this.getText().toString();
        if(this.getTransformationMethod() != null) {
            s = this.getTransformationMethod().getTransformation(s, this).toString();
        }
        Rect rect0 = new Rect();
        textPaint0.getTextBounds(s, 0, s.length(), rect0);
        return Math.min(rect0.height(), this.getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int v = this.getLineCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, this.getLayout().getLineWidth(v1));
        }
        return (int)Math.ceil(f);
    }

    private void h(boolean z) {
        Drawable drawable0 = this.n;
        if(drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            this.n = drawable1;
            androidx.core.graphics.drawable.a.o(drawable1, this.m);
            PorterDuff.Mode porterDuff$Mode0 = this.l;
            if(porterDuff$Mode0 != null) {
                androidx.core.graphics.drawable.a.p(this.n, porterDuff$Mode0);
            }
            int v = this.p == 0 ? this.n.getIntrinsicWidth() : this.p;
            int v1 = this.p == 0 ? this.n.getIntrinsicHeight() : this.p;
            this.n.setBounds(this.q, this.r, v + this.q, v1 + this.r);
            this.n.setVisible(true, z);
        }
        if(z) {
            this.g();
            return;
        }
        Drawable[] arr_drawable = i.a(this);
        if(this.c() && arr_drawable[0] != this.n || this.b() && arr_drawable[2] != this.n || this.d() && arr_drawable[1] != this.n) {
            this.g();
        }
    }

    private void i(int v, int v1) {
        if(this.n != null && this.getLayout() != null) {
            if(!this.c() && !this.b()) {
                if(!this.d()) {
                    return;
                }
                this.q = 0;
                if(this.v == 16) {
                    this.r = 0;
                    this.h(false);
                    return;
                }
                int v2 = this.p == 0 ? this.n.getIntrinsicHeight() : this.p;
                int v3 = Math.max(0, (v1 - this.getTextHeight() - this.getPaddingTop() - v2 - this.s - this.getPaddingBottom()) / 2);
                if(this.r == v3) {
                    return;
                }
                this.r = v3;
                this.h(false);
                return;
            }
            this.r = 0;
            Layout.Alignment layout$Alignment0 = this.getActualTextAlignment();
            int v4 = this.v;
            boolean z = true;
            switch(v4) {
                case 2: {
                    if(layout$Alignment0 != Layout.Alignment.ALIGN_NORMAL) {
                    label_21:
                        if(v4 != 4 || layout$Alignment0 != Layout.Alignment.ALIGN_OPPOSITE) {
                            int v5 = this.p == 0 ? this.n.getIntrinsicWidth() : this.p;
                            int v6 = v - this.getTextLayoutWidth() - Y.D(this) - v5 - this.s - Y.E(this);
                            if(layout$Alignment0 == Layout.Alignment.ALIGN_CENTER) {
                                v6 /= 2;
                            }
                            boolean z1 = this.e();
                            if(this.v != 4) {
                                z = false;
                            }
                            if(z1 != z) {
                                v6 = -v6;
                            }
                            if(this.q != v6) {
                                this.q = v6;
                                this.h(false);
                            }
                            return;
                        }
                    }
                    break;
                }
                case 1: 
                case 3: {
                    break;
                }
                default: {
                    goto label_21;
                }
            }
            this.q = 0;
            this.h(false);
        }
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.t;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.f()) {
            h.f(this, this.i.f());
        }
    }

    @Override  // android.widget.TextView
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.a()) {
            View.mergeDrawableStates(arr_v, MaterialButton.w);
        }
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, MaterialButton.x);
        }
        return arr_v;
    }

    @Override  // androidx.appcompat.widget.e
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName(this.getA11yClassName());
        accessibilityEvent0.setChecked(this.isChecked());
    }

    @Override  // androidx.appcompat.widget.e
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(this.getA11yClassName());
        accessibilityNodeInfo0.setCheckable(this.a());
        accessibilityNodeInfo0.setChecked(this.isChecked());
        accessibilityNodeInfo0.setClickable(this.isClickable());
    }

    @Override  // androidx.appcompat.widget.e
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.widget.TextView
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setChecked(((SavedState)parcelable0).h);
    }

    @Override  // android.widget.TextView
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.h = this.t;
        return parcelable0;
    }

    @Override  // androidx.appcompat.widget.e
    protected void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.view.View
    public boolean performClick() {
        if(this.i.q()) {
            this.toggle();
        }
        return super.performClick();
    }

    @Override  // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if(this.n != null) {
            int[] arr_v = this.getDrawableState();
            if(this.n.setState(arr_v)) {
                this.invalidate();
            }
        }
    }

    void setA11yClassName(String s) {
        this.o = s;
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        if(this.f()) {
            this.i.s(v);
            return;
        }
        super.setBackgroundColor(v);
    }

    @Override  // androidx.appcompat.widget.e
    public void setBackgroundDrawable(Drawable drawable0) {
        if(this.f()) {
            if(drawable0 != this.getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.i.t();
                super.setBackgroundDrawable(drawable0);
                return;
            }
            this.getBackground().setState(drawable0.getState());
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.widget.e
    public void setBackgroundResource(int v) {
        this.setBackgroundDrawable((v == 0 ? null : f.a.b(this.getContext(), v)));
    }

    @Override  // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList0) {
        this.setSupportBackgroundTintList(colorStateList0);
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.setSupportBackgroundTintMode(porterDuff$Mode0);
    }

    public void setCheckable(boolean z) {
        if(this.f()) {
            this.i.u(z);
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.a() && this.isEnabled() && this.t != z) {
            this.t = z;
            this.refreshDrawableState();
            if(this.getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup)this.getParent()).m(this, this.t);
            }
            if(this.u) {
                return;
            }
            this.u = true;
            Iterator iterator0 = this.j.iterator();
            if(!iterator0.hasNext()) {
                this.u = false;
                return;
            }
            Object object0 = iterator0.next();
            E.a(object0);
            throw null;
        }
    }

    public void setCornerRadius(int v) {
        if(this.f()) {
            this.i.v(v);
        }
    }

    public void setCornerRadiusResource(int v) {
        if(this.f()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if(this.f()) {
            this.i.f().U(f);
        }
    }

    public void setIcon(Drawable drawable0) {
        if(this.n != drawable0) {
            this.n = drawable0;
            this.h(true);
            this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconGravity(int v) {
        if(this.v != v) {
            this.v = v;
            this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconPadding(int v) {
        if(this.s != v) {
            this.s = v;
            this.setCompoundDrawablePadding(v);
        }
    }

    public void setIconResource(int v) {
        this.setIcon((v == 0 ? null : f.a.b(this.getContext(), v)));
    }

    public void setIconSize(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if(this.p != v) {
            this.p = v;
            this.h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList0) {
        if(this.m != colorStateList0) {
            this.m = colorStateList0;
            this.h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.l != porterDuff$Mode0) {
            this.l = porterDuff$Mode0;
            this.h(false);
        }
    }

    public void setIconTintResource(int v) {
        this.setIconTint(f.a.a(this.getContext(), v));
    }

    public void setInsetBottom(int v) {
        this.i.w(v);
    }

    public void setInsetTop(int v) {
        this.i.x(v);
    }

    void setInternalBackground(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
    }

    void setOnPressedChangeListenerInternal(com.google.android.material.button.MaterialButton.a materialButton$a0) {
        this.k = materialButton$a0;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        com.google.android.material.button.MaterialButton.a materialButton$a0 = this.k;
        if(materialButton$a0 != null) {
            materialButton$a0.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList0) {
        if(this.f()) {
            this.i.y(colorStateList0);
        }
    }

    public void setRippleColorResource(int v) {
        if(this.f()) {
            this.setRippleColor(f.a.a(this.getContext(), v));
        }
    }

    @Override  // S1.n
    public void setShapeAppearanceModel(S1.k k0) {
        if(!this.f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.i.z(k0);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if(this.f()) {
            this.i.A(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList0) {
        if(this.f()) {
            this.i.B(colorStateList0);
        }
    }

    public void setStrokeColorResource(int v) {
        if(this.f()) {
            this.setStrokeColor(f.a.a(this.getContext(), v));
        }
    }

    public void setStrokeWidth(int v) {
        if(this.f()) {
            this.i.C(v);
        }
    }

    public void setStrokeWidthResource(int v) {
        if(this.f()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // androidx.appcompat.widget.e
    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        if(this.f()) {
            this.i.D(colorStateList0);
            return;
        }
        super.setSupportBackgroundTintList(colorStateList0);
    }

    @Override  // androidx.appcompat.widget.e
    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.f()) {
            this.i.E(porterDuff$Mode0);
            return;
        }
        super.setSupportBackgroundTintMode(porterDuff$Mode0);
    }

    @Override  // android.view.View
    public void setTextAlignment(int v) {
        super.setTextAlignment(v);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.i.F(z);
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.setChecked(!this.t);
    }
}

