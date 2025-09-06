package com.google.android.material.timepicker;

import C.z.f;
import C.z;
import P1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.Y;
import androidx.core.view.a;
import java.util.Arrays;
import z1.g;
import z1.j;
import z1.k;

class ClockFaceView extends e implements b {
    private final ClockHandView F;
    private final Rect G;
    private final RectF H;
    private final Rect I;
    private final SparseArray J;
    private final a K;
    private final int[] L;
    private final float[] M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private String[] R;
    private float S;
    private final ColorStateList T;

    public ClockFaceView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.A);
    }

    public ClockFaceView(Context context0, AttributeSet attributeSet0, int v) {
        class com.google.android.material.timepicker.ClockFaceView.a implements ViewTreeObserver.OnPreDrawListener {
            final ClockFaceView f;

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                if(!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int v = ClockFaceView.this.getHeight();
                ClockFaceView.this.x(v / 2 - ClockFaceView.this.F.i() - ClockFaceView.this.N);
                return true;
            }
        }


        class com.google.android.material.timepicker.ClockFaceView.b extends a {
            final ClockFaceView d;

            @Override  // androidx.core.view.a
            public void g(View view0, z z0) {
                super.g(view0, z0);
                int v = (int)(((Integer)view0.getTag(z1.e.p)));
                if(v > 0) {
                    z0.M0(((View)ClockFaceView.D(ClockFaceView.this).get(v - 1)));
                }
                z0.p0(f.a(0, 1, v, 1, false, view0.isSelected()));
                z0.n0(true);
                z0.b(C.z.a.i);
            }

            @Override  // androidx.core.view.a
            public boolean j(View view0, int v, Bundle bundle0) {
                if(v == 16) {
                    long v1 = SystemClock.uptimeMillis();
                    view0.getHitRect(ClockFaceView.E(ClockFaceView.this));
                    float f = (float)ClockFaceView.E(ClockFaceView.this).centerX();
                    float f1 = (float)ClockFaceView.E(ClockFaceView.this).centerY();
                    MotionEvent motionEvent0 = MotionEvent.obtain(v1, v1, 0, f, f1, 0);
                    ClockFaceView.B(ClockFaceView.this).onTouchEvent(motionEvent0);
                    MotionEvent motionEvent1 = MotionEvent.obtain(v1, v1, 1, f, f1, 0);
                    ClockFaceView.B(ClockFaceView.this).onTouchEvent(motionEvent1);
                    return true;
                }
                return super.j(view0, v, bundle0);
            }
        }

        super(context0, attributeSet0, v);
        this.G = new Rect();
        this.H = new RectF();
        this.I = new Rect();
        this.J = new SparseArray();
        this.M = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.U1, v, j.y);
        Resources resources0 = this.getResources();
        ColorStateList colorStateList0 = c.a(context0, typedArray0, k.W1);
        this.T = colorStateList0;
        LayoutInflater.from(context0).inflate(g.k, this, true);
        ClockHandView clockHandView0 = (ClockHandView)this.findViewById(z1.e.j);
        this.F = clockHandView0;
        this.N = resources0.getDimensionPixelSize(z1.c.D);
        int v1 = colorStateList0.getDefaultColor();
        int v2 = colorStateList0.getColorForState(new int[]{0x10100A1}, v1);
        this.L = new int[]{v2, v2, colorStateList0.getDefaultColor()};
        clockHandView0.b(this);
        int v3 = f.a.a(context0, z1.b.c).getDefaultColor();
        ColorStateList colorStateList1 = c.a(context0, typedArray0, k.V1);
        if(colorStateList1 != null) {
            v3 = colorStateList1.getDefaultColor();
        }
        this.setBackgroundColor(v3);
        this.getViewTreeObserver().addOnPreDrawListener(new com.google.android.material.timepicker.ClockFaceView.a(this));
        this.setFocusable(true);
        typedArray0.recycle();
        this.K = new com.google.android.material.timepicker.ClockFaceView.b(this);
        String[] arr_s = new String[12];
        Arrays.fill(arr_s, "");
        this.J(arr_s, 0);
        this.O = resources0.getDimensionPixelSize(z1.c.Q);
        this.P = resources0.getDimensionPixelSize(z1.c.R);
        this.Q = resources0.getDimensionPixelSize(z1.c.F);
    }

    static SparseArray D(ClockFaceView clockFaceView0) {
        return clockFaceView0.J;
    }

    static Rect E(ClockFaceView clockFaceView0) {
        return clockFaceView0.G;
    }

    private void F() {
        RectF rectF0 = this.F.e();
        TextView textView0 = this.H(rectF0);
        for(int v = 0; v < this.J.size(); ++v) {
            TextView textView1 = (TextView)this.J.get(v);
            if(textView1 != null) {
                textView1.setSelected(textView1 == textView0);
                RadialGradient radialGradient0 = this.G(rectF0, textView1);
                textView1.getPaint().setShader(radialGradient0);
                textView1.invalidate();
            }
        }
    }

    private RadialGradient G(RectF rectF0, TextView textView0) {
        textView0.getHitRect(this.G);
        this.H.set(this.G);
        textView0.getLineBounds(0, this.I);
        this.H.inset(((float)this.I.left), ((float)this.I.top));
        return RectF.intersects(rectF0, this.H) ? new RadialGradient(rectF0.centerX() - this.H.left, rectF0.centerY() - this.H.top, rectF0.width() * 0.5f, this.L, this.M, Shader.TileMode.CLAMP) : null;
    }

    private TextView H(RectF rectF0) {
        float f = 3.402823E+38f;
        TextView textView0 = null;
        for(int v = 0; v < this.J.size(); ++v) {
            TextView textView1 = (TextView)this.J.get(v);
            if(textView1 != null) {
                textView1.getHitRect(this.G);
                this.H.set(this.G);
                this.H.union(rectF0);
                float f1 = this.H.width() * this.H.height();
                if(f1 < f) {
                    textView0 = textView1;
                    f = f1;
                }
            }
        }
        return textView0;
    }

    private static float I(float f, float f1, float f2) {
        return Math.max(Math.max(f, f1), f2);
    }

    public void J(String[] arr_s, int v) {
        this.R = arr_s;
        this.K(v);
    }

    private void K(int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        int v1 = this.J.size();
        boolean z = false;
        for(int v2 = 0; v2 < Math.max(this.R.length, v1); ++v2) {
            TextView textView0 = (TextView)this.J.get(v2);
            if(v2 >= this.R.length) {
                this.removeView(textView0);
                this.J.remove(v2);
            }
            else {
                if(textView0 == null) {
                    textView0 = (TextView)layoutInflater0.inflate(g.j, this, false);
                    this.J.put(v2, textView0);
                    this.addView(textView0);
                }
                textView0.setText(this.R[v2]);
                textView0.setTag(z1.e.p, v2);
                int v3 = v2 / 12 + 1;
                textView0.setTag(z1.e.k, v3);
                if(v3 > 1) {
                    z = true;
                }
                Y.o0(textView0, this.K);
                textView0.setTextColor(this.T);
                if(v != 0) {
                    textView0.setContentDescription(this.getResources().getString(v, new Object[]{this.R[v2]}));
                }
            }
        }
        this.F.q(z);
    }

    @Override  // com.google.android.material.timepicker.ClockHandView$b
    public void a(float f, boolean z) {
        if(Math.abs(this.S - f) > 0.001f) {
            this.S = f;
            this.F();
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        z.P0(accessibilityNodeInfo0).o0(C.z.e.b(1, this.R.length, false, 1));
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.F();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void onMeasure(int v, int v1) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v2 = (int)(((float)this.Q) / ClockFaceView.I(((float)this.O) / ((float)displayMetrics0.heightPixels), ((float)this.P) / ((float)displayMetrics0.widthPixels), 1.0f));
        int v3 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        this.setMeasuredDimension(v2, v2);
        super.onMeasure(v3, v3);
    }

    @Override  // com.google.android.material.timepicker.e
    public void x(int v) {
        if(v != this.w()) {
            super.x(v);
            this.F.m(this.w());
        }
    }

    @Override  // com.google.android.material.timepicker.e
    protected void z() {
        super.z();
        for(int v = 0; v < this.J.size(); ++v) {
            ((TextView)this.J.get(v)).setVisibility(0);
        }
    }
}

