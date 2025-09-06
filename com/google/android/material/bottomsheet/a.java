package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.l0.b;
import androidx.core.view.l0;
import androidx.core.view.y0;
import java.util.List;

class a extends b {
    private final View c;
    private int d;
    private int e;
    private final int[] f;

    public a(View view0) {
        super(0);
        this.f = new int[2];
        this.c = view0;
    }

    @Override  // androidx.core.view.l0$b
    public void b(l0 l00) {
        this.c.setTranslationY(0.0f);
    }

    @Override  // androidx.core.view.l0$b
    public void c(l0 l00) {
        this.c.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override  // androidx.core.view.l0$b
    public y0 d(y0 y00, List list0) {
        for(Object object0: list0) {
            l0 l00 = (l0)object0;
            if((l00.c() & 8) != 0) {
                int v = this.e;
                float f = l00.b();
                this.c.setTranslationY(((float)A1.a.c(v, 0, f)));
                return y00;
            }
            if(false) {
                break;
            }
        }
        return y00;
    }

    @Override  // androidx.core.view.l0$b
    public androidx.core.view.l0.a e(l0 l00, androidx.core.view.l0.a l0$a0) {
        this.c.getLocationOnScreen(this.f);
        int v = this.d - this.f[1];
        this.e = v;
        this.c.setTranslationY(((float)v));
        return l0$a0;
    }
}

