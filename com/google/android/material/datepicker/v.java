package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.B;
import androidx.recyclerview.widget.RecyclerView.g;
import java.util.Locale;

class v extends g {
    public static class a extends B {
        final TextView t;

        a(TextView textView0) {
            super(textView0);
            this.t = textView0;
        }
    }

    private final f c;

    v(f f0) {
        this.c = f0;
    }

    public a A(ViewGroup viewGroup0, int v) {
        return new a(((TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(z1.g.v, viewGroup0, false)));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public int e() {
        return this.c.v().l();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public void m(B recyclerView$B0, int v) {
        this.z(((a)recyclerView$B0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public B o(ViewGroup viewGroup0, int v) {
        return this.A(viewGroup0, v);
    }

    int x(int v) {
        return v - this.c.v().k().h;
    }

    int y(int v) {
        return this.c.v().k().h + v;
    }

    public void z(a v$a0, int v) {
        int v1 = this.y(v);
        Locale locale0 = Locale.getDefault();
        v$a0.t.setText(String.format(locale0, "%d", v1));
        String s = d.e(v$a0.t.getContext(), v1);
        v$a0.t.setContentDescription(s);
        boolean z = u.i().get(1) != v1;
        throw null;
    }
}

