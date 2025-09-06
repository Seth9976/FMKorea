package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.Y;

class g {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public g(View view0) {
        this.f = true;
        this.g = true;
        this.a = view0;
    }

    void a() {
        int v = this.d;
        int v1 = this.a.getTop();
        Y.Z(this.a, v - (v1 - this.b));
        int v2 = this.e;
        int v3 = this.a.getLeft();
        Y.Y(this.a, v2 - (v3 - this.c));
    }

    public int b() {
        return this.d;
    }

    void c() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public boolean d(int v) {
        if(this.g && this.e != v) {
            this.e = v;
            this.a();
            return true;
        }
        return false;
    }

    public boolean e(int v) {
        if(this.f && this.d != v) {
            this.d = v;
            this.a();
            return true;
        }
        return false;
    }
}

