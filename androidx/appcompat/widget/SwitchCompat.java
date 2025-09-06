package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.i;
import androidx.emoji2.text.f.f;
import e.h;
import e.j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class SwitchCompat extends CompoundButton {
    class a extends Property {
        a(Class class0, String s) {
            super(class0, s);
        }

        public Float a(SwitchCompat switchCompat0) {
            return switchCompat0.E;
        }

        public void b(SwitchCompat switchCompat0, Float float0) {
            switchCompat0.setThumbPosition(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((SwitchCompat)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((SwitchCompat)object0), ((Float)object1));
        }
    }

    static class b extends f {
        private final Reference a;

        b(SwitchCompat switchCompat0) {
            this.a = new WeakReference(switchCompat0);
        }

        @Override  // androidx.emoji2.text.f$f
        public void a(Throwable throwable0) {
            SwitchCompat switchCompat0 = (SwitchCompat)this.a.get();
            if(switchCompat0 != null) {
                switchCompat0.j();
            }
        }

        @Override  // androidx.emoji2.text.f$f
        public void b() {
            SwitchCompat switchCompat0 = (SwitchCompat)this.a.get();
            if(switchCompat0 != null) {
                switchCompat0.j();
            }
        }
    }

    private float A;
    private float B;
    private VelocityTracker C;
    private int D;
    float E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private final TextPaint N;
    private ColorStateList O;
    private Layout P;
    private Layout Q;
    private TransformationMethod R;
    ObjectAnimator S;
    private final z T;
    private m U;
    private b V;
    private final Rect W;
    private static final Property a0;
    private static final int[] b0;
    private Drawable f;
    private ColorStateList g;
    private PorterDuff.Mode h;
    private boolean i;
    private boolean j;
    private Drawable k;
    private ColorStateList l;
    private PorterDuff.Mode m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private int y;
    private int z;

    static {
        SwitchCompat.a0 = new a(Float.class, "thumbPos");
        SwitchCompat.b0 = new int[]{0x10100A0};
    }

    public SwitchCompat(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.L);
    }

    public SwitchCompat(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.C = VelocityTracker.obtain();
        this.M = true;
        this.W = new Rect();
        Y.a(this, this.getContext());
        TextPaint textPaint0 = new TextPaint(1);
        this.N = textPaint0;
        textPaint0.density = this.getResources().getDisplayMetrics().density;
        c0 c00 = c0.v(context0, attributeSet0, j.L2, v, 0);
        androidx.core.view.Y.m0(this, context0, j.L2, attributeSet0, c00.r(), v, 0);
        Drawable drawable0 = c00.g(j.O2);
        this.f = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        Drawable drawable1 = c00.g(j.X2);
        this.k = drawable1;
        if(drawable1 != null) {
            drawable1.setCallback(this);
        }
        this.setTextOnInternal(c00.p(j.M2));
        this.setTextOffInternal(c00.p(j.N2));
        this.x = c00.a(j.P2, true);
        this.p = c00.f(j.U2, 0);
        this.q = c00.f(j.R2, 0);
        this.r = c00.f(j.S2, 0);
        this.s = c00.a(j.Q2, false);
        ColorStateList colorStateList0 = c00.c(j.V2);
        if(colorStateList0 != null) {
            this.g = colorStateList0;
            this.i = true;
        }
        PorterDuff.Mode porterDuff$Mode0 = L.e(c00.k(j.W2, -1), null);
        if(this.h != porterDuff$Mode0) {
            this.h = porterDuff$Mode0;
            this.j = true;
        }
        if(this.i || this.j) {
            this.b();
        }
        ColorStateList colorStateList1 = c00.c(j.Y2);
        if(colorStateList1 != null) {
            this.l = colorStateList1;
            this.n = true;
        }
        PorterDuff.Mode porterDuff$Mode1 = L.e(c00.k(j.Z2, -1), null);
        if(this.m != porterDuff$Mode1) {
            this.m = porterDuff$Mode1;
            this.o = true;
        }
        if(this.n || this.o) {
            this.c();
        }
        int v1 = c00.n(j.T2, 0);
        if(v1 != 0) {
            this.m(context0, v1);
        }
        z z0 = new z(this);
        this.T = z0;
        z0.m(attributeSet0, v);
        c00.x();
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.z = viewConfiguration0.getScaledTouchSlop();
        this.D = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.getEmojiTextViewHelper().c(attributeSet0, v);
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }

    private void a(boolean z) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, SwitchCompat.a0, new float[]{(z ? 1.0f : 0.0f)});
        this.S = objectAnimator0;
        objectAnimator0.setDuration(0xFAL);
        this.S.setAutoCancel(true);
        this.S.start();
    }

    private void b() {
        Drawable drawable0 = this.f;
        if(drawable0 != null && (this.i || this.j)) {
            Drawable drawable1 = drawable0.mutate();
            this.f = drawable1;
            if(this.i) {
                androidx.core.graphics.drawable.a.o(drawable1, this.g);
            }
            if(this.j) {
                androidx.core.graphics.drawable.a.p(this.f, this.h);
            }
            if(this.f.isStateful()) {
                this.f.setState(this.getDrawableState());
            }
        }
    }

    private void c() {
        Drawable drawable0 = this.k;
        if(drawable0 != null && (this.n || this.o)) {
            Drawable drawable1 = drawable0.mutate();
            this.k = drawable1;
            if(this.n) {
                androidx.core.graphics.drawable.a.o(drawable1, this.l);
            }
            if(this.o) {
                androidx.core.graphics.drawable.a.p(this.k, this.m);
            }
            if(this.k.isStateful()) {
                this.k.setState(this.getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator0 = this.S;
        if(objectAnimator0 != null) {
            objectAnimator0.cancel();
        }
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v12;
        int v7;
        Rect rect0 = this.W;
        int v = this.I;
        int v1 = this.J;
        int v2 = this.K;
        int v3 = this.L;
        int v4 = this.getThumbOffset() + v;
        Rect rect1 = this.f == null ? L.c : L.d(this.f);
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.getPadding(rect0);
            int v5 = rect0.left;
            v4 += v5;
            if(rect1 == null) {
                v7 = v1;
                v12 = v3;
            }
            else {
                int v6 = rect1.left;
                if(v6 > v5) {
                    v += v6 - v5;
                }
                v7 = rect1.top <= rect0.top ? v1 : rect1.top - rect0.top + v1;
                int v8 = rect1.right;
                int v9 = rect0.right;
                if(v8 > v9) {
                    v2 -= v8 - v9;
                }
                int v10 = rect1.bottom;
                int v11 = rect0.bottom;
                v12 = v10 > v11 ? v3 - (v10 - v11) : v3;
            }
            this.k.setBounds(v, v7, v2, v12);
        }
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.getPadding(rect0);
            int v13 = v4 - rect0.left;
            int v14 = v4 + this.H + rect0.right;
            this.f.setBounds(v13, v1, v14, v3);
            Drawable drawable2 = this.getBackground();
            if(drawable2 != null) {
                androidx.core.graphics.drawable.a.l(drawable2, v13, v1, v14, v3);
            }
        }
        super.draw(canvas0);
    }

    @Override  // android.widget.CompoundButton
    public void drawableHotspotChanged(float f, float f1) {
        super.drawableHotspotChanged(f, f1);
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            androidx.core.graphics.drawable.a.k(drawable0, f, f1);
        }
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            androidx.core.graphics.drawable.a.k(drawable1, f, f1);
        }
    }

    @Override  // android.widget.CompoundButton
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.f;
        boolean z = drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v);
        Drawable drawable1 = this.k;
        if(drawable1 != null && drawable1.isStateful()) {
            z |= drawable1.setState(arr_v);
        }
        if(z) {
            this.invalidate();
        }
    }

    private void e(MotionEvent motionEvent0) {
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setAction(3);
        super.onTouchEvent(motionEvent1);
        motionEvent1.recycle();
    }

    private static float f(float f, float f1, float f2) {
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    private CharSequence g(CharSequence charSequence0) {
        TransformationMethod transformationMethod0 = this.getEmojiTextViewHelper().f(this.R);
        return transformationMethod0 == null ? charSequence0 : transformationMethod0.getTransformation(charSequence0, this);
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        if(!n0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int v = super.getCompoundPaddingLeft() + this.F;
        return TextUtils.isEmpty(this.getText()) ? v : v + this.r;
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingRight() {
        if(n0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int v = super.getCompoundPaddingRight() + this.F;
        return TextUtils.isEmpty(this.getText()) ? v : v + this.r;
    }

    @Override  // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    private m getEmojiTextViewHelper() {
        if(this.U == null) {
            this.U = new m(this);
        }
        return this.U;
    }

    public boolean getShowText() {
        return this.x;
    }

    public boolean getSplitTrack() {
        return this.s;
    }

    public int getSwitchMinWidth() {
        return this.q;
    }

    public int getSwitchPadding() {
        return this.r;
    }

    private boolean getTargetCheckedState() {
        return this.E > 0.5f;
    }

    public CharSequence getTextOff() {
        return this.v;
    }

    public CharSequence getTextOn() {
        return this.t;
    }

    public Drawable getThumbDrawable() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    private int getThumbOffset() {
        return n0.b(this) ? ((int)((1.0f - this.E) * ((float)this.getThumbScrollRange()) + 0.5f)) : ((int)(this.E * ((float)this.getThumbScrollRange()) + 0.5f));
    }

    protected final float getThumbPosition() {
        return this.E;
    }

    private int getThumbScrollRange() {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            Rect rect0 = this.W;
            drawable0.getPadding(rect0);
            Drawable drawable1 = this.f;
            if(drawable1 != null) {
                Rect rect1 = L.d(drawable1);
                return this.F - this.H - rect0.left - rect0.right - rect1.left - rect1.right;
            }
            return this.F - this.H - rect0.left - rect0.right - L.c.left - L.c.right;
        }
        return 0;
    }

    public int getThumbTextPadding() {
        return this.p;
    }

    public ColorStateList getThumbTintList() {
        return this.g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.h;
    }

    public Drawable getTrackDrawable() {
        return this.k;
    }

    public ColorStateList getTrackTintList() {
        return this.l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.m;
    }

    private boolean h(float f, float f1) {
        if(this.f == null) {
            return false;
        }
        int v = this.getThumbOffset();
        this.f.getPadding(this.W);
        int v1 = this.I + v - this.z;
        return f > ((float)v1) && f < ((float)(this.H + v1 + this.W.left + this.W.right + this.z)) && f1 > ((float)(this.J - this.z)) && f1 < ((float)(this.L + this.z));
    }

    private Layout i(CharSequence charSequence0) {
        return charSequence0 == null ? new StaticLayout(null, this.N, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true) : new StaticLayout(charSequence0, this.N, ((int)Math.ceil(Layout.getDesiredWidth(charSequence0, this.N))), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    void j() {
        this.setTextOnInternal(this.t);
        this.setTextOffInternal(this.v);
        this.requestLayout();
    }

    @Override  // android.widget.CompoundButton
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
        }
        if(this.S != null && this.S.isStarted()) {
            this.S.end();
            this.S = null;
        }
    }

    private void k() {
        if(Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence0 = this.v;
            if(charSequence0 == null) {
                charSequence0 = this.getResources().getString(h.b);
            }
            androidx.core.view.Y.G0(this, charSequence0);
        }
    }

    private void l() {
        if(Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence0 = this.t;
            if(charSequence0 == null) {
                charSequence0 = this.getResources().getString(h.c);
            }
            androidx.core.view.Y.G0(this, charSequence0);
        }
    }

    public void m(Context context0, int v) {
        c0 c00 = c0.t(context0, v, j.a3);
        ColorStateList colorStateList0 = c00.c(j.e3);
        this.O = colorStateList0 == null ? this.getTextColors() : colorStateList0;
        int v1 = c00.f(j.b3, 0);
        if(v1 != 0 && ((float)v1) != this.N.getTextSize()) {
            this.N.setTextSize(((float)v1));
            this.requestLayout();
        }
        this.o(c00.k(j.c3, -1), c00.k(j.d3, -1));
        this.R = c00.a(j.j3, false) ? new i.a(this.getContext()) : null;
        this.setTextOnInternal(this.t);
        this.setTextOffInternal(this.v);
        c00.x();
    }

    public void n(Typeface typeface0, int v) {
        float f = 0.0f;
        boolean z = false;
        if(v > 0) {
            Typeface typeface1 = typeface0 == null ? Typeface.defaultFromStyle(v) : Typeface.create(typeface0, v);
            this.setSwitchTypeface(typeface1);
            int v1 = ~(typeface1 == null ? 0 : typeface1.getStyle()) & v;
            TextPaint textPaint0 = this.N;
            if((v1 & 1) != 0) {
                z = true;
            }
            textPaint0.setFakeBoldText(z);
            TextPaint textPaint1 = this.N;
            if((v1 & 2) != 0) {
                f = -0.25f;
            }
            textPaint1.setTextSkewX(f);
            return;
        }
        this.N.setFakeBoldText(false);
        this.N.setTextSkewX(0.0f);
        this.setSwitchTypeface(typeface0);
    }

    private void o(int v, int v1) {
        Typeface typeface0;
        switch(v) {
            case 1: {
                typeface0 = Typeface.SANS_SERIF;
                break;
            }
            case 2: {
                typeface0 = Typeface.SERIF;
                break;
            }
            case 3: {
                typeface0 = Typeface.MONOSPACE;
                break;
            }
            default: {
                typeface0 = null;
            }
        }
        this.n(typeface0, v1);
    }

    @Override  // android.widget.CompoundButton
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, SwitchCompat.b0);
        }
        return arr_v;
    }

    @Override  // android.widget.CompoundButton
    protected void onDraw(Canvas canvas0) {
        int v5;
        super.onDraw(canvas0);
        Rect rect0 = this.W;
        Drawable drawable0 = this.k;
        if(drawable0 == null) {
            rect0.setEmpty();
        }
        else {
            drawable0.getPadding(rect0);
        }
        int v = this.J + rect0.top;
        int v1 = this.L - rect0.bottom;
        Drawable drawable1 = this.f;
        if(drawable0 != null) {
            if(!this.s || drawable1 == null) {
                drawable0.draw(canvas0);
            }
            else {
                Rect rect1 = L.d(drawable1);
                drawable1.copyBounds(rect0);
                rect0.left += rect1.left;
                rect0.right -= rect1.right;
                int v2 = canvas0.save();
                canvas0.clipRect(rect0, Region.Op.DIFFERENCE);
                drawable0.draw(canvas0);
                canvas0.restoreToCount(v2);
            }
        }
        int v3 = canvas0.save();
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
        Layout layout0 = this.getTargetCheckedState() ? this.P : this.Q;
        if(layout0 != null) {
            int[] arr_v = this.getDrawableState();
            ColorStateList colorStateList0 = this.O;
            if(colorStateList0 != null) {
                int v4 = colorStateList0.getColorForState(arr_v, 0);
                this.N.setColor(v4);
            }
            this.N.drawableState = arr_v;
            if(drawable1 == null) {
                v5 = this.getWidth();
            }
            else {
                Rect rect2 = drawable1.getBounds();
                v5 = rect2.left + rect2.right;
            }
            canvas0.translate(((float)(v5 / 2 - layout0.getWidth() / 2)), ((float)((v + v1) / 2 - layout0.getHeight() / 2)));
            layout0.draw(canvas0);
        }
        canvas0.restoreToCount(v3);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.Switch");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.Switch");
        if(Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence0 = this.isChecked() ? this.t : this.v;
            if(!TextUtils.isEmpty(charSequence0)) {
                CharSequence charSequence1 = accessibilityNodeInfo0.getText();
                if(TextUtils.isEmpty(charSequence1)) {
                    accessibilityNodeInfo0.setText(charSequence0);
                    return;
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(charSequence1);
                stringBuilder0.append(' ');
                stringBuilder0.append(charSequence0);
                accessibilityNodeInfo0.setText(stringBuilder0);
            }
        }
    }

    @Override  // android.widget.TextView
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        super.onLayout(z, v, v1, v2, v3);
        int v4 = 0;
        if(this.f == null) {
            v5 = 0;
        }
        else {
            Rect rect0 = this.W;
            Drawable drawable0 = this.k;
            if(drawable0 == null) {
                rect0.setEmpty();
            }
            else {
                drawable0.getPadding(rect0);
            }
            Rect rect1 = L.d(this.f);
            v5 = Math.max(0, rect1.left - rect0.left);
            v4 = Math.max(0, rect1.right - rect0.right);
        }
        if(n0.b(this)) {
            v6 = this.getPaddingLeft() + v5;
            v7 = this.F + v6 - v5 - v4;
        }
        else {
            v7 = this.getWidth() - this.getPaddingRight() - v4;
            v6 = v7 - this.F + v5 + v4;
        }
        switch(this.getGravity() & 0x70) {
            case 16: {
                v8 = (this.getPaddingTop() + this.getHeight() - this.getPaddingBottom()) / 2 - this.G / 2;
                v9 = this.G + v8;
                break;
            }
            case 80: {
                v9 = this.getHeight() - this.getPaddingBottom();
                v8 = v9 - this.G;
                break;
            }
            default: {
                v8 = this.getPaddingTop();
                v9 = this.G + v8;
            }
        }
        this.I = v6;
        this.J = v8;
        this.L = v9;
        this.K = v7;
    }

    @Override  // android.widget.TextView
    public void onMeasure(int v, int v1) {
        int v4;
        int v3;
        if(this.x) {
            if(this.P == null) {
                this.P = this.i(this.u);
            }
            if(this.Q == null) {
                this.Q = this.i(this.w);
            }
        }
        Rect rect0 = this.W;
        Drawable drawable0 = this.f;
        int v2 = 0;
        if(drawable0 == null) {
            v3 = 0;
            v4 = 0;
        }
        else {
            drawable0.getPadding(rect0);
            v3 = this.f.getIntrinsicWidth() - rect0.left - rect0.right;
            v4 = this.f.getIntrinsicHeight();
        }
        this.H = Math.max((this.x ? Math.max(this.P.getWidth(), this.Q.getWidth()) + this.p * 2 : 0), v3);
        Drawable drawable1 = this.k;
        if(drawable1 == null) {
            rect0.setEmpty();
        }
        else {
            drawable1.getPadding(rect0);
            v2 = this.k.getIntrinsicHeight();
        }
        int v5 = rect0.left;
        int v6 = rect0.right;
        Drawable drawable2 = this.f;
        if(drawable2 != null) {
            Rect rect1 = L.d(drawable2);
            v5 = Math.max(v5, rect1.left);
            v6 = Math.max(v6, rect1.right);
        }
        int v7 = Math.max(v2, v4);
        this.F = this.M ? Math.max(this.q, this.H * 2 + v5 + v6) : this.q;
        this.G = v7;
        super.onMeasure(v, v1);
        if(this.getMeasuredHeight() < v7) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), v7);
        }
    }

    @Override  // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onPopulateAccessibilityEvent(accessibilityEvent0);
        CharSequence charSequence0 = this.isChecked() ? this.t : this.v;
        if(charSequence0 != null) {
            accessibilityEvent0.getText().add(charSequence0);
        }
    }

    @Override  // android.widget.TextView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        float f2;
        this.C.addMovement(motionEvent0);
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            float f6 = motionEvent0.getX();
            float f7 = motionEvent0.getY();
            if(this.isEnabled() && this.h(f6, f7)) {
                this.y = 1;
                this.A = f6;
                this.B = f7;
            }
        }
        else {
            switch(v) {
                case 1: {
                label_6:
                    if(this.y == 2) {
                        this.q(motionEvent0);
                        super.onTouchEvent(motionEvent0);
                        return true;
                    }
                    this.y = 0;
                    this.C.clear();
                    return super.onTouchEvent(motionEvent0);
                }
                case 2: {
                    break;
                }
                default: {
                    if(v != 3) {
                        return super.onTouchEvent(motionEvent0);
                    }
                    goto label_6;
                }
            }
            switch(this.y) {
                case 1: {
                    goto label_29;
                }
                case 2: {
                    goto label_15;
                }
            }
            return super.onTouchEvent(motionEvent0);
        label_15:
            float f = motionEvent0.getX();
            int v1 = this.getThumbScrollRange();
            float f1 = f - this.A;
            if(v1 == 0) {
                f2 = f1 > 0.0f ? 1.0f : -1.0f;
            }
            else {
                f2 = f1 / ((float)v1);
            }
            if(n0.b(this)) {
                f2 = -f2;
            }
            float f3 = SwitchCompat.f(this.E + f2, 0.0f, 1.0f);
            if(f3 != this.E) {
                this.A = f;
                this.setThumbPosition(f3);
            }
            return true;
        label_29:
            float f4 = motionEvent0.getX();
            float f5 = motionEvent0.getY();
            if(Math.abs(f4 - this.A) > ((float)this.z) || Math.abs(f5 - this.B) > ((float)this.z)) {
                this.y = 2;
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.A = f4;
                this.B = f5;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent0);
    }

    private void p() {
        if(this.V == null && this.U.b() && false) {
            androidx.emoji2.text.f f0 = androidx.emoji2.text.f.c();
            switch(f0.e()) {
                case 0: 
                case 3: {
                    b switchCompat$b0 = new b(this);
                    this.V = switchCompat$b0;
                    f0.t(switchCompat$b0);
                    break;
                }
            }
        }
    }

    private void q(MotionEvent motionEvent0) {
        this.y = 0;
        boolean z = true;
        boolean z1 = motionEvent0.getAction() == 1 && this.isEnabled();
        boolean z2 = this.isChecked();
        if(z1) {
            this.C.computeCurrentVelocity(1000);
            float f = this.C.getXVelocity();
            if(Math.abs(f) <= ((float)this.D)) {
                z = this.getTargetCheckedState();
            }
            else if(!n0.b(this)) {
                if(f <= 0.0f) {
                    z = false;
                }
            }
            else if(f >= 0.0f) {
                z = false;
            }
        }
        else {
            z = z2;
        }
        if(z != z2) {
            this.playSoundEffect(0);
        }
        this.setChecked(z);
        this.e(motionEvent0);
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().d(z);
    }

    @Override  // android.widget.CompoundButton
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean z1 = this.isChecked();
        if(z1) {
            this.l();
        }
        else {
            this.k();
        }
        if(this.getWindowToken() != null && this.isLaidOut()) {
            this.a(z1);
            return;
        }
        this.d();
        this.setThumbPosition((z1 ? 1.0f : 0.0f));
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(i.r(this, actionMode$Callback0));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
        this.setTextOnInternal(this.t);
        this.setTextOffInternal(this.v);
        this.requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z) {
        this.M = z;
        this.invalidate();
    }

    @Override  // android.widget.TextView
    public void setFilters(InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().a(arr_inputFilter));
    }

    public void setShowText(boolean z) {
        if(this.x != z) {
            this.x = z;
            this.requestLayout();
            if(z) {
                this.p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.s = z;
        this.invalidate();
    }

    public void setSwitchMinWidth(int v) {
        this.q = v;
        this.requestLayout();
    }

    public void setSwitchPadding(int v) {
        this.r = v;
        this.requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface0) {
        if(this.N.getTypeface() != null && !this.N.getTypeface().equals(typeface0) || this.N.getTypeface() == null && typeface0 != null) {
            this.N.setTypeface(typeface0);
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence0) {
        this.setTextOffInternal(charSequence0);
        this.requestLayout();
        if(!this.isChecked()) {
            this.k();
        }
    }

    private void setTextOffInternal(CharSequence charSequence0) {
        this.v = charSequence0;
        this.w = this.g(charSequence0);
        this.Q = null;
        if(this.x) {
            this.p();
        }
    }

    public void setTextOn(CharSequence charSequence0) {
        this.setTextOnInternal(charSequence0);
        this.requestLayout();
        if(this.isChecked()) {
            this.l();
        }
    }

    private void setTextOnInternal(CharSequence charSequence0) {
        this.t = charSequence0;
        this.u = this.g(charSequence0);
        this.P = null;
        if(this.x) {
            this.p();
        }
    }

    public void setThumbDrawable(Drawable drawable0) {
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.f = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        this.requestLayout();
    }

    void setThumbPosition(float f) {
        this.E = f;
        this.invalidate();
    }

    public void setThumbResource(int v) {
        this.setThumbDrawable(f.a.b(this.getContext(), v));
    }

    public void setThumbTextPadding(int v) {
        this.p = v;
        this.requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList0) {
        this.g = colorStateList0;
        this.i = true;
        this.b();
    }

    public void setThumbTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.h = porterDuff$Mode0;
        this.j = true;
        this.b();
    }

    public void setTrackDrawable(Drawable drawable0) {
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.k = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        this.requestLayout();
    }

    public void setTrackResource(int v) {
        this.setTrackDrawable(f.a.b(this.getContext(), v));
    }

    public void setTrackTintList(ColorStateList colorStateList0) {
        this.l = colorStateList0;
        this.n = true;
        this.c();
    }

    public void setTrackTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.m = porterDuff$Mode0;
        this.o = true;
        this.c();
    }

    @Override  // android.widget.CompoundButton
    public void toggle() {
        this.setChecked(!this.isChecked());
    }

    @Override  // android.widget.CompoundButton
    protected boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.f || drawable0 == this.k;
    }
}

