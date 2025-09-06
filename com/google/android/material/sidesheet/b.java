package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class b extends c {
    final SideSheetBehavior a;

    b(SideSheetBehavior sideSheetBehavior0) {
        this.a = sideSheetBehavior0;
    }

    @Override  // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.rightMargin;
    }

    @Override  // com.google.android.material.sidesheet.c
    float b(int v) {
        float f = (float)this.e();
        return (f - ((float)v)) / (f - ((float)this.d()));
    }

    @Override  // com.google.android.material.sidesheet.c
    int c(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.rightMargin;
    }

    @Override  // com.google.android.material.sidesheet.c
    int d() {
        return Math.max(0, this.e() - this.a.d0() - this.a.k0());
    }

    @Override  // com.google.android.material.sidesheet.c
    int e() {
        return this.a.n0();
    }

    @Override  // com.google.android.material.sidesheet.c
    int f() {
        return this.a.n0();
    }

    @Override  // com.google.android.material.sidesheet.c
    int g() {
        return this.d();
    }

    @Override  // com.google.android.material.sidesheet.c
    int h(View view0) {
        return view0.getLeft() - this.a.k0();
    }

    @Override  // com.google.android.material.sidesheet.c
    public int i(CoordinatorLayout coordinatorLayout0) {
        return coordinatorLayout0.getRight();
    }

    @Override  // com.google.android.material.sidesheet.c
    int j() {
        return 0;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean k(float f) {
        return f < 0.0f;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean l(View view0) {
        return view0.getLeft() > (this.e() + this.d()) / 2;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean m(float f, float f1) {
        return d.a(f, f1) && Math.abs(f) > 500.0f;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean n(View view0, float f) {
        return Math.abs(((float)view0.getRight()) + f * this.a.i0()) > 0.5f;
    }

    @Override  // com.google.android.material.sidesheet.c
    void o(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.rightMargin = v;
    }

    @Override  // com.google.android.material.sidesheet.c
    void p(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1) {
        int v2 = this.a.n0();
        if(v <= v2) {
            viewGroup$MarginLayoutParams0.rightMargin = v2 - v;
        }
    }
}

