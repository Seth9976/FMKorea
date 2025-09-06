package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.widget.c0;
import androidx.core.view.Y;
import androidx.core.view.y0;
import com.google.android.material.internal.q;
import com.google.android.material.internal.t.d;
import com.google.android.material.internal.t;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.f;
import z1.a;
import z1.j;
import z1.k;

public class BottomNavigationView extends NavigationBarView {
    public interface b extends com.google.android.material.navigation.NavigationBarView.b {
    }

    public interface c extends com.google.android.material.navigation.NavigationBarView.c {
    }

    public BottomNavigationView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.e);
    }

    public BottomNavigationView(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, j.g);
    }

    public BottomNavigationView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        c0 c00 = q.j(this.getContext(), attributeSet0, k.s0, v, v1, new int[0]);
        this.setItemHorizontalTranslationEnabled(c00.a(k.v0, true));
        if(c00.s(k.t0)) {
            this.setMinimumHeight(c00.f(0, 0));
        }
        boolean z = !c00.a(k.u0, true);
        c00.x();
        this.f();
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    protected f c(Context context0) {
        return new com.google.android.material.bottomnavigation.b(context0);
    }

    private void e(Context context0) {
        View view0 = new View(context0);
        view0.setBackgroundColor(androidx.core.content.a.getColor(context0, z1.b.a));
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, this.getResources().getDimensionPixelSize(z1.c.g)));
        this.addView(view0);
    }

    private void f() {
        class com.google.android.material.bottomnavigation.BottomNavigationView.a implements com.google.android.material.internal.t.c {
            final BottomNavigationView a;

            @Override  // com.google.android.material.internal.t$c
            public y0 a(View view0, y0 y00, d t$d0) {
                t$d0.d += y00.i();
                boolean z = Y.z(view0) == 1;
                int v = y00.j();
                int v1 = y00.k();
                t$d0.a += (z ? v1 : v);
                int v2 = t$d0.c;
                if(!z) {
                    v = v1;
                }
                t$d0.c = v2 + v;
                t$d0.a(view0);
                return y00;
            }
        }

        t.b(this, new com.google.android.material.bottomnavigation.BottomNavigationView.a(this));
    }

    private int g(int v) {
        int v1 = this.getSuggestedMinimumHeight();
        if(View.MeasureSpec.getMode(v) != 0x40000000 && v1 > 0) {
            int v2 = this.getPaddingTop();
            int v3 = this.getPaddingBottom();
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), v1 + (v2 + v3)), 0x40000000);
        }
        return v;
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    private boolean h() [...] // Inlined contents

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, this.g(v1));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        com.google.android.material.bottomnavigation.b b0 = (com.google.android.material.bottomnavigation.b)this.getMenuView();
        if(b0.n() != z) {
            b0.setItemHorizontalTranslationEnabled(z);
            this.getPresenter().c(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bottomNavigationView$b0) {
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(c bottomNavigationView$c0) {
        this.setOnItemSelectedListener(bottomNavigationView$c0);
    }
}

