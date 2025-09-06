package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

public abstract class d {
    private float a;
    private float b;

    static int[] a(int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v1[v] = arr_v[v] * 2;
        }
        return arr_v1;
    }

    static float b(float f, float f1, float f2) [...] // Inlined contents

    public float c() {
        return this.b;
    }

    public float d() {
        return this.a;
    }

    void e(Context context0) {
        this.a = this.a > 0.0f ? this.a : e.h(context0);
        this.b = this.b > 0.0f ? this.b : e.g(context0);
    }

    boolean f() [...] // Inlined contents

    abstract f g(b arg1, View arg2);

    abstract boolean h(b arg1, int arg2);
}

