package androidx.recyclerview.widget;

import android.view.View;

class f {
    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    boolean h;
    boolean i;

    f() {
        this.a = true;
        this.f = 0;
        this.g = 0;
    }

    boolean a(y recyclerView$y0) {
        return this.c >= 0 && this.c < recyclerView$y0.b();
    }

    View b(u recyclerView$u0) {
        View view0 = recyclerView$u0.o(this.c);
        this.c += this.d;
        return view0;
    }

    @Override
    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}

