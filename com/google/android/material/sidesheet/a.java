package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class a extends c {
    final SideSheetBehavior a;

    a(SideSheetBehavior sideSheetBehavior0) {
        this.a = sideSheetBehavior0;
    }

    @Override  // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.leftMargin;
    }

    @Override  // com.google.android.material.sidesheet.c
    float b(int v) {
        float f = (float)this.e();
        return (((float)v) - f) / (((float)this.d()) - f);
    }

    @Override  // com.google.android.material.sidesheet.c
    int c(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.leftMargin;
    }

    @Override  // com.google.android.material.sidesheet.c
    int d() {
        return Math.max(0, this.a.m0() + this.a.k0());
    }

    @Override  // com.google.android.material.sidesheet.c
    int e() {
        return -this.a.d0() - this.a.k0();
    }

    @Override  // com.google.android.material.sidesheet.c
    int f() {
        return this.a.k0();
    }

    @Override  // com.google.android.material.sidesheet.c
    int g() {
        return -this.a.d0();
    }

    @Override  // com.google.android.material.sidesheet.c
    int h(View view0) {
        return view0.getRight() + this.a.k0();
    }

    @Override  // com.google.android.material.sidesheet.c
    public int i(CoordinatorLayout coordinatorLayout0) {
        return coordinatorLayout0.getLeft();
    }

    @Override  // com.google.android.material.sidesheet.c
    int j() {
        return 1;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean k(float f) {
        return f > 0.0f;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean l(View view0) {
        return view0.getRight() < (this.d() - this.e()) / 2;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean m(float f, float f1) {
        return d.a(f, f1) && Math.abs(f) > 500.0f;
    }

    @Override  // com.google.android.material.sidesheet.c
    boolean n(View view0, float f) {
        return Math.abs(((float)view0.getLeft()) + f * this.a.i0()) > 0.5f;
    }

    @Override  // com.google.android.material.sidesheet.c
    void o(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.leftMargin = v;
    }

    @Override  // com.google.android.material.sidesheet.c
    void p(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1) {
        if(v <= this.a.n0()) {
            viewGroup$MarginLayoutParams0.leftMargin = v1;
        }
    }
}

