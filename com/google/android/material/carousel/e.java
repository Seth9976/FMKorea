package com.google.android.material.carousel;

import android.content.Context;
import z1.c;

abstract class e {
    static float a(float f, float f1, int v) {
        return f + ((float)Math.max(0, v - 1)) * f1;
    }

    static float b(float f, float f1, int v) {
        return v <= 0 ? f : f + f1 / 2.0f;
    }

    static f c(Context context0, float f, float f1, a a0) {
        float f2 = Math.min(e.f(context0) + f, a0.f);
        float f3 = e.b(0.0f, a0.b, a0.c);
        float f4 = e.j(0.0f, e.a(f3, a0.b, ((int)Math.floor(((float)a0.c) / 2.0f))), a0.b, a0.c);
        float f5 = e.b(f4, a0.e, a0.d);
        float f6 = e.j(f4, e.a(f5, a0.e, ((int)Math.floor(((float)a0.d) / 2.0f))), a0.e, a0.d);
        float f7 = e.b(f6, a0.f, a0.g);
        float f8 = e.j(f6, e.a(f7, a0.f, a0.g), a0.f, a0.g);
        float f9 = e.b(f8, a0.e, a0.d);
        float f10 = e.b(e.j(f8, e.a(f9, a0.e, ((int)Math.ceil(((float)a0.d) / 2.0f))), a0.e, a0.d), a0.b, a0.c);
        float f11 = 1.0f - (f2 - f) / (a0.f - f);
        float f12 = 1.0f - (a0.b - f) / (a0.f - f);
        float f13 = 1.0f - (a0.e - f) / (a0.f - f);
        b f$b0 = new b(a0.f, f1).a(0.0f - f2 / 2.0f, f11, f2);
        int v = a0.c;
        if(v > 0) {
            f$b0.g(f3, f12, a0.b, ((int)Math.floor(((float)v) / 2.0f)));
        }
        int v1 = a0.d;
        if(v1 > 0) {
            f$b0.g(f5, f13, a0.e, ((int)Math.floor(((float)v1) / 2.0f)));
        }
        f$b0.h(f7, 0.0f, a0.f, a0.g, true);
        int v2 = a0.d;
        if(v2 > 0) {
            f$b0.g(f9, f13, a0.e, ((int)Math.ceil(((float)v2) / 2.0f)));
        }
        int v3 = a0.c;
        if(v3 > 0) {
            f$b0.g(f10, f12, a0.b, ((int)Math.ceil(((float)v3) / 2.0f)));
        }
        f$b0.a(f2 / 2.0f + f1, f11, f2);
        return f$b0.i();
    }

    static f d(Context context0, float f, float f1, a a0, int v) {
        return v == 1 ? e.c(context0, f, f1, a0) : e.e(context0, f, f1, a0);
    }

    static f e(Context context0, float f, float f1, a a0) {
        float f2 = Math.min(e.f(context0) + f, a0.f);
        float f3 = e.b(0.0f, a0.f, a0.g);
        float f4 = e.j(0.0f, e.a(f3, a0.f, a0.g), a0.f, a0.g);
        float f5 = e.b(f4, a0.e, a0.d);
        float f6 = e.b(e.j(f4, f5, a0.e, a0.d), a0.b, a0.c);
        float f7 = 1.0f - (f2 - f) / (a0.f - f);
        float f8 = 1.0f - (a0.b - f) / (a0.f - f);
        float f9 = 1.0f - (a0.e - f) / (a0.f - f);
        b f$b0 = new b(a0.f, f1).a(0.0f - f2 / 2.0f, f7, f2).h(f3, 0.0f, a0.f, a0.g, true);
        if(a0.d > 0) {
            f$b0.b(f5, f9, a0.e);
        }
        int v = a0.c;
        if(v > 0) {
            f$b0.g(f6, f8, a0.b, v);
        }
        f$b0.a(f2 / 2.0f + f1, f7, f2);
        return f$b0.i();
    }

    static float f(Context context0) {
        return context0.getResources().getDimension(c.w);
    }

    static float g(Context context0) {
        return context0.getResources().getDimension(c.x);
    }

    static float h(Context context0) {
        return context0.getResources().getDimension(c.y);
    }

    static int i(int[] arr_v) {
        int v = 0x80000000;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 > v) {
                v = v2;
            }
        }
        return v;
    }

    static float j(float f, float f1, float f2, int v) {
        return v <= 0 ? f : f1 + f2 / 2.0f;
    }
}

