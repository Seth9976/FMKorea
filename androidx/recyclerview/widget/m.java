package androidx.recyclerview.widget;

import android.view.View;

abstract class m {
    static int a(y recyclerView$y0, i i0, View view0, View view1, o recyclerView$o0, boolean z) {
        if(recyclerView$o0.O() != 0 && recyclerView$y0.b() != 0 && view0 != null && view1 != null) {
            if(!z) {
                return Math.abs(recyclerView$o0.l0(view0) - recyclerView$o0.l0(view1)) + 1;
            }
            int v = i0.d(view1);
            int v1 = i0.g(view0);
            return Math.min(i0.n(), v - v1);
        }
        return 0;
    }

    static int b(y recyclerView$y0, i i0, View view0, View view1, o recyclerView$o0, boolean z, boolean z1) {
        if(recyclerView$o0.O() != 0 && recyclerView$y0.b() != 0 && view0 != null && view1 != null) {
            int v = z1 ? Math.max(0, recyclerView$y0.b() - Math.max(recyclerView$o0.l0(view0), recyclerView$o0.l0(view1)) - 1) : Math.max(0, Math.min(recyclerView$o0.l0(view0), recyclerView$o0.l0(view1)));
            return z ? Math.round(((float)v) * (((float)Math.abs(i0.d(view1) - i0.g(view0))) / ((float)(Math.abs(recyclerView$o0.l0(view0) - recyclerView$o0.l0(view1)) + 1))) + ((float)(i0.m() - i0.g(view0)))) : v;
        }
        return 0;
    }

    static int c(y recyclerView$y0, i i0, View view0, View view1, o recyclerView$o0, boolean z) {
        if(recyclerView$o0.O() != 0 && recyclerView$y0.b() != 0 && view0 != null && view1 != null) {
            return z ? ((int)(((float)(i0.d(view1) - i0.g(view0))) / ((float)(Math.abs(recyclerView$o0.l0(view0) - recyclerView$o0.l0(view1)) + 1)) * ((float)recyclerView$y0.b()))) : recyclerView$y0.b();
        }
        return 0;
    }
}

