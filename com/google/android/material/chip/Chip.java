package com.google.android.material.chip;

import C.z;
import P1.d;
import Q1.b;
import S1.h;
import S1.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.f;
import androidx.core.view.Y;
import com.google.android.material.internal.g;
import com.google.android.material.internal.q;
import com.google.android.material.internal.t;
import java.util.List;
import z1.j;
import z1.k;

public class Chip extends f implements n, Checkable, a {
    class com.google.android.material.chip.Chip.a extends P1.f {
        final Chip a;

        @Override  // P1.f
        public void a(int v) {
        }

        @Override  // P1.f
        public void b(Typeface typeface0, boolean z) {
            CharSequence charSequence0 = Chip.this.j.I2() ? Chip.this.j.d1() : Chip.this.getText();
            Chip.this.setText(charSequence0);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class c extends H.a {
        final Chip q;

        c(Chip chip1) {
            super(chip1);
        }

        // 去混淆评级： 低(20)
        @Override  // H.a
        protected int B(float f, float f1) {
            return !Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f, f1) ? 0 : 1;
        }

        @Override  // H.a
        protected void C(List list0) {
            list0.add(0);
            if(Chip.this.n() && Chip.this.s() && Chip.this.m != null) {
                list0.add(1);
            }
        }

        @Override  // H.a
        protected boolean J(int v, int v1, Bundle bundle0) {
            if(v1 == 16) {
                if(v == 0) {
                    return Chip.this.performClick();
                }
                return v == 1 ? Chip.this.u() : false;
            }
            return false;
        }

        @Override  // H.a
        protected void M(z z0) {
            z0.k0(Chip.this.r());
            z0.n0(Chip.this.isClickable());
            z0.m0(Chip.this.getAccessibilityClassName());
            z0.L0(Chip.this.getText());
        }

        @Override  // H.a
        protected void N(int v, z z0) {
            CharSequence charSequence0 = "";
            if(v == 1) {
                CharSequence charSequence1 = Chip.this.getCloseIconContentDescription();
                if(charSequence1 == null) {
                    CharSequence charSequence2 = Chip.this.getText();
                    Context context0 = Chip.this.getContext();
                    if(!TextUtils.isEmpty(charSequence2)) {
                        charSequence0 = charSequence2;
                    }
                    z0.q0(context0.getString(0x7F1200C5, new Object[]{charSequence0}).trim());  // string:mtrl_chip_close_icon_content_description "Remove %1$s"
                }
                else {
                    z0.q0(charSequence1);
                }
                z0.i0(Chip.this.getCloseIconTouchBoundsInt());
                z0.b(C.z.a.i);
                z0.r0(Chip.this.isEnabled());
                return;
            }
            z0.q0("");
            z0.i0(Chip.C);
        }

        @Override  // H.a
        protected void O(int v, boolean z) {
            if(v == 1) {
                Chip.this.r = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    private final P1.f A;
    private static final int B;
    private static final Rect C;
    private static final int[] D;
    private static final int[] E;
    private com.google.android.material.chip.a j;
    private InsetDrawable k;
    private RippleDrawable l;
    private View.OnClickListener m;
    private CompoundButton.OnCheckedChangeListener n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private CharSequence v;
    private final c w;
    private boolean x;
    private final Rect y;
    private final RectF z;

    static {
        Chip.B = j.q;
        Chip.C = new Rect();
        Chip.D = new int[]{0x10100A1};
        Chip.E = new int[]{0x101009F};
    }

    public Chip(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.h);
    }

    public Chip(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, Chip.B), attributeSet0, v);
        this.y = new Rect();
        this.z = new RectF();
        this.A = new com.google.android.material.chip.Chip.a(this);
        Context context1 = this.getContext();
        this.D(attributeSet0);
        com.google.android.material.chip.a a0 = com.google.android.material.chip.a.r0(context1, attributeSet0, v, Chip.B);
        this.o(context1, attributeSet0, v);
        this.setChipDrawable(a0);
        a0.U(Y.u(this));
        TypedArray typedArray0 = q.i(context1, attributeSet0, k.a1, v, Chip.B, new int[0]);
        boolean z = typedArray0.hasValue(k.L1);
        typedArray0.recycle();
        this.w = new c(this, this);
        this.y();
        if(!z) {
            this.p();
        }
        this.setChecked(this.o);
        this.setText(a0.d1());
        this.setEllipsize(a0.X0());
        this.C();
        if(!this.j.I2()) {
            this.setLines(1);
            this.setHorizontallyScrolling(true);
        }
        this.setGravity(0x800013);
        this.B();
        if(this.w()) {
            this.setMinHeight(this.u);
        }
        this.t = Y.z(this);
        super.setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> this.t(compoundButton0, z));
    }

    private void A() {
        this.l = new RippleDrawable(b.d(this.j.b1()), this.getBackgroundDrawable(), null);
        this.j.H2(false);
        Y.s0(this, this.l);
        this.B();
    }

    private void B() {
        if(!TextUtils.isEmpty(this.getText())) {
            com.google.android.material.chip.a a0 = this.j;
            if(a0 != null) {
                int v = (int)(a0.F0() + this.j.f1() + this.j.m0());
                int v1 = (int)(this.j.K0() + this.j.g1() + this.j.i0());
                if(this.k != null) {
                    Rect rect0 = new Rect();
                    this.k.getPadding(rect0);
                    v1 += rect0.left;
                    v += rect0.right;
                }
                Y.C0(this, v1, this.getPaddingTop(), v, this.getPaddingBottom());
            }
        }
    }

    private void C() {
        TextPaint textPaint0 = this.getPaint();
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            textPaint0.drawableState = a0.getState();
        }
        d d0 = this.getTextAppearance();
        if(d0 != null) {
            d0.n(this.getContext(), textPaint0, this.A);
        }
    }

    private void D(AttributeSet attributeSet0) {
        if(attributeSet0 == null) {
            return;
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null || attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if(!attributeSet0.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if(attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 0x800013) != 0x800013) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override  // com.google.android.material.chip.a$a
    public void a() {
        this.l(this.u);
        this.requestLayout();
        this.invalidateOutline();
    }

    // 检测为 Lambda 实现
    public static void b(Chip chip0, CompoundButton compoundButton0, boolean z) [...]

    // 去混淆评级： 低(30)
    @Override  // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        return this.x ? this.w.v(motionEvent0) || super.dispatchHoverEvent(motionEvent0) : super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(!this.x) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        return !this.w.w(keyEvent0) || this.w.A() == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    @Override  // androidx.appcompat.widget.f
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if((this.j == null || !this.j.l1() ? false : this.j.h2(this.k()))) {
            this.invalidate();
        }
    }

    @Override  // android.widget.CheckBox
    public CharSequence getAccessibilityClassName() {
        if(!TextUtils.isEmpty(this.v)) {
            return this.v;
        }
        if(this.r()) {
            this.getParent();
            return "android.widget.Button";
        }
        return this.isClickable() ? "android.widget.Button" : "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        Drawable drawable0 = this.k;
        return drawable0 == null ? this.j : drawable0;
    }

    public Drawable getCheckedIcon() {
        return this.j == null ? null : this.j.B0();
    }

    public ColorStateList getCheckedIconTint() {
        return this.j == null ? null : this.j.C0();
    }

    public ColorStateList getChipBackgroundColor() {
        return this.j == null ? null : this.j.D0();
    }

    public float getChipCornerRadius() {
        return this.j == null ? 0.0f : Math.max(0.0f, this.j.E0());
    }

    public Drawable getChipDrawable() {
        return this.j;
    }

    public float getChipEndPadding() {
        return this.j == null ? 0.0f : this.j.F0();
    }

    public Drawable getChipIcon() {
        return this.j == null ? null : this.j.G0();
    }

    public float getChipIconSize() {
        return this.j == null ? 0.0f : this.j.H0();
    }

    public ColorStateList getChipIconTint() {
        return this.j == null ? null : this.j.I0();
    }

    public float getChipMinHeight() {
        return this.j == null ? 0.0f : this.j.J0();
    }

    public float getChipStartPadding() {
        return this.j == null ? 0.0f : this.j.K0();
    }

    public ColorStateList getChipStrokeColor() {
        return this.j == null ? null : this.j.L0();
    }

    public float getChipStrokeWidth() {
        return this.j == null ? 0.0f : this.j.M0();
    }

    @Deprecated
    public CharSequence getChipText() {
        return this.getText();
    }

    public Drawable getCloseIcon() {
        return this.j == null ? null : this.j.N0();
    }

    public CharSequence getCloseIconContentDescription() {
        return this.j == null ? null : this.j.O0();
    }

    public float getCloseIconEndPadding() {
        return this.j == null ? 0.0f : this.j.P0();
    }

    public float getCloseIconSize() {
        return this.j == null ? 0.0f : this.j.Q0();
    }

    public float getCloseIconStartPadding() {
        return this.j == null ? 0.0f : this.j.R0();
    }

    public ColorStateList getCloseIconTint() {
        return this.j == null ? null : this.j.T0();
    }

    private RectF getCloseIconTouchBounds() {
        this.z.setEmpty();
        if(this.n() && this.m != null) {
            this.j.U0(this.z);
        }
        return this.z;
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF rectF0 = this.getCloseIconTouchBounds();
        this.y.set(((int)rectF0.left), ((int)rectF0.top), ((int)rectF0.right), ((int)rectF0.bottom));
        return this.y;
    }

    @Override  // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        return this.j == null ? null : this.j.X0();
    }

    @Override  // android.widget.TextView
    public void getFocusedRect(Rect rect0) {
        if(this.x && (this.w.A() == 1 || this.w.x() == 1)) {
            rect0.set(this.getCloseIconTouchBoundsInt());
            return;
        }
        super.getFocusedRect(rect0);
    }

    public A1.d getHideMotionSpec() {
        return this.j == null ? null : this.j.Y0();
    }

    public float getIconEndPadding() {
        return this.j == null ? 0.0f : this.j.Z0();
    }

    public float getIconStartPadding() {
        return this.j == null ? 0.0f : this.j.a1();
    }

    public ColorStateList getRippleColor() {
        return this.j == null ? null : this.j.b1();
    }

    public S1.k getShapeAppearanceModel() {
        return this.j.B();
    }

    public A1.d getShowMotionSpec() {
        return this.j == null ? null : this.j.c1();
    }

    private d getTextAppearance() {
        return this.j == null ? null : this.j.e1();
    }

    public float getTextEndPadding() {
        return this.j == null ? 0.0f : this.j.f1();
    }

    public float getTextStartPadding() {
        return this.j == null ? 0.0f : this.j.g1();
    }

    private void j(com.google.android.material.chip.a a0) {
        a0.l2(this);
    }

    private int[] k() {
        int v = this.isEnabled();
        if(this.r) {
            ++v;
        }
        if(this.q) {
            ++v;
        }
        if(this.p) {
            ++v;
        }
        if(this.isChecked()) {
            ++v;
        }
        int[] arr_v = new int[v];
        int v1 = 0;
        if(this.isEnabled()) {
            arr_v[0] = 0x101009E;
            v1 = 1;
        }
        if(this.r) {
            arr_v[v1] = 0x101009C;
            ++v1;
        }
        if(this.q) {
            arr_v[v1] = 0x1010367;
            ++v1;
        }
        if(this.p) {
            arr_v[v1] = 0x10100A7;
            ++v1;
        }
        if(this.isChecked()) {
            arr_v[v1] = 0x10100A1;
        }
        return arr_v;
    }

    public boolean l(int v) {
        this.u = v;
        int v1 = 0;
        if(!this.w()) {
            if(this.k != null) {
                this.v();
                return false;
            }
            this.z();
            return false;
        }
        int v2 = Math.max(0, v - this.j.getIntrinsicHeight());
        int v3 = Math.max(0, v - this.j.getIntrinsicWidth());
        if(v3 <= 0 && v2 <= 0) {
            if(this.k != null) {
                this.v();
                return false;
            }
            this.z();
            return false;
        }
        int v4 = v3 <= 0 ? 0 : v3 / 2;
        if(v2 > 0) {
            v1 = v2 / 2;
        }
        if(this.k != null) {
            Rect rect0 = new Rect();
            this.k.getPadding(rect0);
            if(rect0.top == v1 && rect0.bottom == v1 && rect0.left == v4 && rect0.right == v4) {
                this.z();
                return true;
            }
        }
        if(this.getMinHeight() != v) {
            this.setMinHeight(v);
        }
        if(this.getMinWidth() != v) {
            this.setMinWidth(v);
        }
        this.q(v4, v1, v4, v1);
        this.z();
        return true;
    }

    private void m() {
        if(this.getBackgroundDrawable() == this.k && this.j.getCallback() == null) {
            this.j.setCallback(this.k);
        }
    }

    private boolean n() {
        return this.j != null && this.j.N0() != null;
    }

    private void o(Context context0, AttributeSet attributeSet0, int v) {
        TypedArray typedArray0 = q.i(context0, attributeSet0, k.a1, v, Chip.B, new int[0]);
        this.s = typedArray0.getBoolean(k.G1, false);
        float f = (float)Math.ceil(t.c(this.getContext(), 0x30));
        this.u = (int)Math.ceil(typedArray0.getDimension(k.u1, f));
        typedArray0.recycle();
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.j);
    }

    @Override  // android.widget.CompoundButton
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, Chip.D);
        }
        if(this.r()) {
            View.mergeDrawableStates(arr_v, Chip.E);
        }
        return arr_v;
    }

    @Override  // android.widget.TextView
    protected void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(this.x) {
            this.w.I(z, v, rect0);
        }
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 7: {
                this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()));
                return super.onHoverEvent(motionEvent0);
            }
            case 10: {
                this.setCloseIconHovered(false);
                return super.onHoverEvent(motionEvent0);
            }
            default: {
                return super.onHoverEvent(motionEvent0);
            }
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(this.getAccessibilityClassName());
        accessibilityNodeInfo0.setCheckable(this.r());
        accessibilityNodeInfo0.setClickable(this.isClickable());
        this.getParent();
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.Button
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent0, int v) {
        return !this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()) || !this.isEnabled() ? super.onResolvePointerIcon(motionEvent0, v) : PointerIcon.getSystemIcon(this.getContext(), 1002);
    }

    @Override  // android.widget.TextView
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        if(this.t != v) {
            this.t = v;
            this.B();
        }
    }

    @Override  // android.widget.TextView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z1;
        int v = motionEvent0.getActionMasked();
        boolean z = this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY());
        switch(v) {
            case 0: {
                if(!z) {
                    return super.onTouchEvent(motionEvent0);
                }
                this.setCloseIconPressed(true);
                return true;
            }
            case 1: {
                if(this.p) {
                    this.u();
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                break;
            }
            case 2: {
                if(this.p) {
                    if(!z) {
                        this.setCloseIconPressed(false);
                    }
                    return true;
                }
                return super.onTouchEvent(motionEvent0);
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
        this.setCloseIconPressed(false);
        return z1 || super.onTouchEvent(motionEvent0);
    }

    private void p() {
        class com.google.android.material.chip.Chip.b extends ViewOutlineProvider {
            final Chip a;

            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                if(Chip.this.j != null) {
                    Chip.this.j.getOutline(outline0);
                    return;
                }
                outline0.setAlpha(0.0f);
            }
        }

        this.setOutlineProvider(new com.google.android.material.chip.Chip.b(this));
    }

    private void q(int v, int v1, int v2, int v3) {
        this.k = new InsetDrawable(this.j, v, v1, v2, v3);
    }

    public boolean r() {
        return this.j != null && this.j.k1();
    }

    public boolean s() {
        return this.j != null && this.j.m1();
    }

    public void setAccessibilityClassName(CharSequence charSequence0) {
        this.v = charSequence0;
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.l) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            return;
        }
        super.setBackground(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override  // androidx.appcompat.widget.f
    public void setBackgroundDrawable(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.l) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.widget.f
    public void setBackgroundResource(int v) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList0) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.t1(z);
        }
    }

    public void setCheckableResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.u1(v);
        }
    }

    @Override  // android.widget.Checkable, android.widget.CompoundButton
    public void setChecked(boolean z) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 == null) {
            this.o = z;
            return;
        }
        if(a0.k1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.v1(drawable0);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        this.setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int v) {
        this.setCheckedIconVisible(v);
    }

    public void setCheckedIconResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.w1(v);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.x1(colorStateList0);
        }
    }

    public void setCheckedIconTintResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.y1(v);
        }
    }

    public void setCheckedIconVisible(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.z1(v);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.A1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.B1(colorStateList0);
        }
    }

    public void setChipBackgroundColorResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.C1(v);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.D1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.E1(v);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a a0) {
        com.google.android.material.chip.a a1 = this.j;
        if(a1 != a0) {
            this.x(a1);
            this.j = a0;
            a0.w2(false);
            this.j(this.j);
            this.l(this.u);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.F1(f);
        }
    }

    public void setChipEndPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.G1(v);
        }
    }

    public void setChipIcon(Drawable drawable0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.H1(drawable0);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        this.setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int v) {
        this.setChipIconVisible(v);
    }

    public void setChipIconResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.I1(v);
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.J1(f);
        }
    }

    public void setChipIconSizeResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.K1(v);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.L1(colorStateList0);
        }
    }

    public void setChipIconTintResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.M1(v);
        }
    }

    public void setChipIconVisible(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.N1(v);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.O1(z);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.P1(f);
        }
    }

    public void setChipMinHeightResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.Q1(v);
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.R1(f);
        }
    }

    public void setChipStartPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.S1(v);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.T1(colorStateList0);
        }
    }

    public void setChipStrokeColorResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.U1(v);
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.V1(f);
        }
    }

    public void setChipStrokeWidthResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.W1(v);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence0) {
        this.setText(charSequence0);
    }

    @Deprecated
    public void setChipTextResource(int v) {
        this.setText(this.getResources().getString(v));
    }

    public void setCloseIcon(Drawable drawable0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.Y1(drawable0);
        }
        this.y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.Z1(charSequence0);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        this.setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int v) {
        this.setCloseIconVisible(v);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.a2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.b2(v);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if(this.q != z) {
            this.q = z;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if(this.p != z) {
            this.p = z;
            this.refreshDrawableState();
        }
    }

    public void setCloseIconResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.c2(v);
        }
        this.y();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.d2(f);
        }
    }

    public void setCloseIconSizeResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.e2(v);
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.f2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.g2(v);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.i2(colorStateList0);
        }
    }

    public void setCloseIconTintResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.j2(v);
        }
    }

    public void setCloseIconVisible(int v) {
        this.setCloseIconVisible(this.getResources().getBoolean(v));
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.k2(z);
        }
        this.y();
    }

    @Override  // androidx.appcompat.widget.f
    public void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable1, null, drawable3);
    }

    @Override  // androidx.appcompat.widget.f
    public void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.U(f);
        }
    }

    @Override  // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt textUtils$TruncateAt0) {
        if(this.j == null) {
            return;
        }
        if(textUtils$TruncateAt0 == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(textUtils$TruncateAt0);
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.m2(textUtils$TruncateAt0);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.s = z;
        this.l(this.u);
    }

    @Override  // android.widget.TextView
    public void setGravity(int v) {
        if(v != 0x800013) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
            return;
        }
        super.setGravity(0x800013);
    }

    public void setHideMotionSpec(A1.d d0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.n2(d0);
        }
    }

    public void setHideMotionSpecResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.o2(v);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.p2(f);
        }
    }

    public void setIconEndPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.q2(v);
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.r2(f);
        }
    }

    public void setIconStartPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.s2(v);
        }
    }

    public void setInternalOnCheckedChangeListener(g g0) {
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
        if(this.j == null) {
            return;
        }
        super.setLayoutDirection(v);
    }

    @Override  // android.widget.TextView
    public void setLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxWidth(int v) {
        super.setMaxWidth(v);
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.t2(v);
        }
    }

    @Override  // android.widget.TextView
    public void setMinLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(v);
    }

    @Override  // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.n = compoundButton$OnCheckedChangeListener0;
    }

    public void setOnCloseIconClickListener(View.OnClickListener view$OnClickListener0) {
        this.m = view$OnClickListener0;
        this.y();
    }

    public void setRippleColor(ColorStateList colorStateList0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.u2(colorStateList0);
        }
        if(!this.j.i1()) {
            this.A();
        }
    }

    public void setRippleColorResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.v2(v);
            if(!this.j.i1()) {
                this.A();
            }
        }
    }

    @Override  // S1.n
    public void setShapeAppearanceModel(S1.k k0) {
        this.j.setShapeAppearanceModel(k0);
    }

    public void setShowMotionSpec(A1.d d0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.x2(d0);
        }
    }

    public void setShowMotionSpecResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.y2(v);
        }
    }

    @Override  // android.widget.TextView
    public void setSingleLine(boolean z) {
        if(!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override  // android.widget.TextView
    public void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 == null) {
            return;
        }
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        super.setText((a0.I2() ? null : charSequence0), textView$BufferType0);
        com.google.android.material.chip.a a1 = this.j;
        if(a1 != null) {
            a1.z2(charSequence0);
        }
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(int v) {
        super.setTextAppearance(v);
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.B2(v);
        }
        this.C();
    }

    public void setTextAppearance(d d0) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.A2(d0);
        }
        this.C();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.B2(v);
        }
        this.C();
    }

    public void setTextAppearanceResource(int v) {
        this.setTextAppearance(this.getContext(), v);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.C2(f);
        }
    }

    public void setTextEndPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.D2(v);
        }
    }

    @Override  // android.widget.TextView
    public void setTextSize(int v, float f) {
        super.setTextSize(v, f);
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.E2(TypedValue.applyDimension(v, f, this.getResources().getDisplayMetrics()));
        }
        this.C();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.F2(f);
        }
    }

    public void setTextStartPaddingResource(int v) {
        com.google.android.material.chip.a a0 = this.j;
        if(a0 != null) {
            a0.G2(v);
        }
    }

    private void t(CompoundButton compoundButton0, boolean z) {
        CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = this.n;
        if(compoundButton$OnCheckedChangeListener0 != null) {
            compoundButton$OnCheckedChangeListener0.onCheckedChanged(compoundButton0, z);
        }
    }

    public boolean u() {
        boolean z = false;
        this.playSoundEffect(0);
        View.OnClickListener view$OnClickListener0 = this.m;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
            z = true;
        }
        if(this.x) {
            this.w.U(1, 1);
        }
        return z;
    }

    private void v() {
        if(this.k != null) {
            this.k = null;
            this.setMinWidth(0);
            this.setMinHeight(((int)this.getChipMinHeight()));
            this.z();
        }
    }

    public boolean w() {
        return this.s;
    }

    private void x(com.google.android.material.chip.a a0) {
        if(a0 != null) {
            a0.l2(null);
        }
    }

    private void y() {
        if(this.n() && this.s() && this.m != null) {
            Y.o0(this, this.w);
            this.x = true;
            return;
        }
        Y.o0(this, null);
        this.x = false;
    }

    private void z() {
        if(b.a) {
            this.A();
            return;
        }
        this.j.H2(true);
        Y.s0(this, this.getBackgroundDrawable());
        this.B();
        this.m();
    }
}

