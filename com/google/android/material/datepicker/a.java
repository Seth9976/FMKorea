package com.google.android.material.datepicker;

import B.h;
import P1.c;
import S1.g;
import S1.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.Y;

final class a {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final k f;

    private a(ColorStateList colorStateList0, ColorStateList colorStateList1, ColorStateList colorStateList2, int v, k k0, Rect rect0) {
        h.d(rect0.left);
        h.d(rect0.top);
        h.d(rect0.right);
        h.d(rect0.bottom);
        this.a = rect0;
        this.b = colorStateList1;
        this.c = colorStateList0;
        this.d = colorStateList2;
        this.e = v;
        this.f = k0;
    }

    static a a(Context context0, int v) {
        h.b(v != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, z1.k.R3);
        Rect rect0 = new Rect(typedArray0.getDimensionPixelOffset(z1.k.S3, 0), typedArray0.getDimensionPixelOffset(z1.k.U3, 0), typedArray0.getDimensionPixelOffset(z1.k.T3, 0), typedArray0.getDimensionPixelOffset(z1.k.V3, 0));
        ColorStateList colorStateList0 = c.a(context0, typedArray0, z1.k.W3);
        ColorStateList colorStateList1 = c.a(context0, typedArray0, z1.k.b4);
        ColorStateList colorStateList2 = c.a(context0, typedArray0, z1.k.Z3);
        int v1 = typedArray0.getDimensionPixelSize(z1.k.a4, 0);
        k k0 = k.b(context0, typedArray0.getResourceId(z1.k.X3, 0), typedArray0.getResourceId(z1.k.Y3, 0)).m();
        typedArray0.recycle();
        return new a(colorStateList0, colorStateList1, colorStateList2, v1, k0, rect0);
    }

    void b(TextView textView0) {
        this.c(textView0, null, null);
    }

    void c(TextView textView0, ColorStateList colorStateList0, ColorStateList colorStateList1) {
        g g0 = new g();
        g g1 = new g();
        g0.setShapeAppearanceModel(this.f);
        g1.setShapeAppearanceModel(this.f);
        if(colorStateList0 == null) {
            colorStateList0 = this.c;
        }
        g0.V(colorStateList0);
        g0.a0(((float)this.e), this.d);
        if(colorStateList1 == null) {
            colorStateList1 = this.b;
        }
        textView0.setTextColor(colorStateList1);
        Y.s0(textView0, new InsetDrawable(new RippleDrawable(this.b.withAlpha(30), g0, g1), this.a.left, this.a.top, this.a.right, this.a.bottom));
    }
}

