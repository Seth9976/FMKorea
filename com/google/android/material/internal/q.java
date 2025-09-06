package com.google.android.material.internal;

import P1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.c0;
import z1.a;
import z1.k;

public abstract class q {
    private static final int[] a;
    private static final int[] b;

    static {
        q.a = new int[]{a.n};
        q.b = new int[]{a.o};
    }

    public static void a(Context context0) {
        q.e(context0, q.a, "Theme.AppCompat");
    }

    private static void b(Context context0, AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.R8, v, v1);
        boolean z = typedArray0.getBoolean(k.T8, false);
        typedArray0.recycle();
        if(z) {
            TypedValue typedValue0 = new TypedValue();
            if(!context0.getTheme().resolveAttribute(a.v, typedValue0, true) || typedValue0.type == 18 && typedValue0.data == 0) {
                q.c(context0);
            }
        }
        q.a(context0);
    }

    public static void c(Context context0) {
        q.e(context0, q.b, "Theme.MaterialComponents");
    }

    private static void d(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, int[] arr_v1) {
        boolean z1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.R8, v, v1);
        boolean z = false;
        if(!typedArray0.getBoolean(k.U8, false)) {
            typedArray0.recycle();
            return;
        }
        if(arr_v1 == null || arr_v1.length == 0) {
            if(typedArray0.getResourceId(k.S8, -1) != -1) {
                z = true;
            }
            z1 = z;
        }
        else {
            z1 = q.f(context0, attributeSet0, arr_v, v, v1, arr_v1);
        }
        typedArray0.recycle();
        if(!z1) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context0, int[] arr_v, String s) {
        if(!q.h(context0, arr_v)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + s + " (or a descendant).");
        }
    }

    private static boolean f(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, int[] arr_v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
        for(int v2 = 0; v2 < arr_v1.length; ++v2) {
            if(typedArray0.getResourceId(arr_v1[v2], -1) == -1) {
                typedArray0.recycle();
                return false;
            }
        }
        typedArray0.recycle();
        return true;
    }

    public static boolean g(Context context0) {
        return b.b(context0, a.u, false);
    }

    private static boolean h(Context context0, int[] arr_v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v);
        for(int v = 0; v < arr_v.length; ++v) {
            if(!typedArray0.hasValue(v)) {
                typedArray0.recycle();
                return false;
            }
        }
        typedArray0.recycle();
        return true;
    }

    public static TypedArray i(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, int[] arr_v1) {
        q.b(context0, attributeSet0, v, v1);
        q.d(context0, attributeSet0, arr_v, v, v1, arr_v1);
        return context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
    }

    public static c0 j(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, int[] arr_v1) {
        q.b(context0, attributeSet0, v, v1);
        q.d(context0, attributeSet0, arr_v, v, v1, arr_v1);
        return c0.v(context0, attributeSet0, arr_v, v, v1);
    }
}

