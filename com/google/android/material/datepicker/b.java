package com.google.android.material.datepicker;

import P1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import z1.k;

final class b {
    final a a;
    final a b;
    final a c;
    final a d;
    final a e;
    final a f;
    final a g;
    final Paint h;

    b(Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(P1.b.d(context0, z1.a.z, f.class.getCanonicalName()), k.H3);
        this.a = a.a(context0, typedArray0.getResourceId(k.L3, 0));
        this.g = a.a(context0, typedArray0.getResourceId(k.J3, 0));
        this.b = a.a(context0, typedArray0.getResourceId(k.K3, 0));
        this.c = a.a(context0, typedArray0.getResourceId(k.M3, 0));
        ColorStateList colorStateList0 = c.a(context0, typedArray0, k.N3);
        this.d = a.a(context0, typedArray0.getResourceId(k.P3, 0));
        this.e = a.a(context0, typedArray0.getResourceId(k.O3, 0));
        this.f = a.a(context0, typedArray0.getResourceId(k.Q3, 0));
        Paint paint0 = new Paint();
        this.h = paint0;
        paint0.setColor(colorStateList0.getDefaultColor());
        typedArray0.recycle();
    }
}

