package androidx.fragment.app;

import B.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

public class k {
    private final m a;

    private k(m m0) {
        this.a = m0;
    }

    public void a(Fragment fragment0) {
        this.a.j.n(this.a, this.a, fragment0);
    }

    public static k b(m m0) {
        return new k(((m)h.h(m0, "callbacks == null")));
    }

    public void c() {
        this.a.j.y();
    }

    public boolean d(MenuItem menuItem0) {
        return this.a.j.B(menuItem0);
    }

    public void e() {
        this.a.j.C();
    }

    public void f() {
        this.a.j.E();
    }

    public void g() {
        this.a.j.N();
    }

    public void h() {
        this.a.j.R();
    }

    public void i() {
        this.a.j.S();
    }

    public void j() {
        this.a.j.U();
    }

    public boolean k() {
        return this.a.j.b0(true);
    }

    public FragmentManager l() {
        return this.a.j;
    }

    public void m() {
        this.a.j.Y0();
    }

    public View n(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.a.j.v0().onCreateView(view0, s, context0, attributeSet0);
    }
}

