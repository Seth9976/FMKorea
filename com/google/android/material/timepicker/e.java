package com.google.android.material.timepicker;

import S1.g;
import S1.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import z1.k;

abstract class e extends ConstraintLayout {
    private final Runnable C;
    private int D;
    private g E;

    public e(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        LayoutInflater.from(context0).inflate(z1.g.l, this);
        Y.s0(this, this.u());
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.g6, v, 0);
        this.D = typedArray0.getDimensionPixelSize(k.h6, 0);
        this.C = new d(this);
        typedArray0.recycle();
    }

    private void A() {
        Handler handler0 = this.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.C);
            handler0.post(this.C);
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(view0.getId() == -1) {
            view0.setId(Y.k());
        }
        this.A();
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.z();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        this.A();
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        this.E.V(ColorStateList.valueOf(v));
    }

    private void t(List list0, androidx.constraintlayout.widget.e e0, int v) {
        float f = 0.0f;
        for(Object object0: list0) {
            e0.g(((View)object0).getId(), z1.e.c, v, f);
            f += 360.0f / ((float)list0.size());
        }
    }

    private Drawable u() {
        g g0 = new g();
        this.E = g0;
        g0.T(new i(0.5f));
        this.E.V(ColorStateList.valueOf(-1));
        return this.E;
    }

    int v(int v) {
        return v == 2 ? Math.round(((float)this.D) * 0.66f) : this.D;
    }

    public int w() {
        return this.D;
    }

    public void x(int v) {
        this.D = v;
        this.z();
    }

    private static boolean y(View view0) {
        return "skip".equals(view0.getTag());
    }

    protected void z() {
        androidx.constraintlayout.widget.e e0 = new androidx.constraintlayout.widget.e();
        e0.f(this);
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0.getId() != z1.e.c && !e.y(view0)) {
                Integer integer0 = (Integer)view0.getTag(z1.e.k);
                if(integer0 == null) {
                    integer0 = 1;
                }
                if(!hashMap0.containsKey(integer0)) {
                    hashMap0.put(integer0, new ArrayList());
                }
                ((List)hashMap0.get(integer0)).add(view0);
            }
        }
        for(Object object0: hashMap0.entrySet()) {
            this.t(((List)((Map.Entry)object0).getValue()), e0, this.v(((int)(((Integer)((Map.Entry)object0).getKey())))));
        }
        e0.c(this);
    }
}

