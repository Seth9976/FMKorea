package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

abstract class n extends LinearLayoutManager {
    n(Context context0, int v, boolean z) {
        super(context0, v, z);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void M1(RecyclerView recyclerView0, y recyclerView$y0, int v) {
        class a extends g {
            final n q;

            a(Context context0) {
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.g
            protected float v(DisplayMetrics displayMetrics0) {
                return 100.0f / ((float)displayMetrics0.densityDpi);
            }
        }

        a n$a0 = new a(this, recyclerView0.getContext());
        n$a0.p(v);
        this.N1(n$a0);
    }
}

