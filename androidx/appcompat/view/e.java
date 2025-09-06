package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e.a;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements a {
    private Context h;
    private ActionBarContextView i;
    private androidx.appcompat.view.b.a j;
    private WeakReference k;
    private boolean l;
    private boolean m;
    private androidx.appcompat.view.menu.e n;

    public e(Context context0, ActionBarContextView actionBarContextView0, androidx.appcompat.view.b.a b$a0, boolean z) {
        this.h = context0;
        this.i = actionBarContextView0;
        this.j = b$a0;
        androidx.appcompat.view.menu.e e0 = new androidx.appcompat.view.menu.e(actionBarContextView0.getContext()).X(1);
        this.n = e0;
        e0.W(this);
        this.m = z;
    }

    @Override  // androidx.appcompat.view.menu.e$a
    public boolean a(androidx.appcompat.view.menu.e e0, MenuItem menuItem0) {
        return this.j.d(this, menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.e$a
    public void b(androidx.appcompat.view.menu.e e0) {
        this.k();
        this.i.l();
    }

    @Override  // androidx.appcompat.view.b
    public void c() {
        if(this.l) {
            return;
        }
        this.l = true;
        this.j.a(this);
    }

    @Override  // androidx.appcompat.view.b
    public View d() {
        return this.k == null ? null : ((View)this.k.get());
    }

    @Override  // androidx.appcompat.view.b
    public Menu e() {
        return this.n;
    }

    @Override  // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.i.getContext());
    }

    @Override  // androidx.appcompat.view.b
    public CharSequence g() {
        return this.i.getSubtitle();
    }

    @Override  // androidx.appcompat.view.b
    public CharSequence i() {
        return this.i.getTitle();
    }

    @Override  // androidx.appcompat.view.b
    public void k() {
        this.j.c(this, this.n);
    }

    @Override  // androidx.appcompat.view.b
    public boolean l() {
        return this.i.j();
    }

    @Override  // androidx.appcompat.view.b
    public void m(View view0) {
        this.i.setCustomView(view0);
        this.k = view0 == null ? null : new WeakReference(view0);
    }

    @Override  // androidx.appcompat.view.b
    public void n(int v) {
        this.o(this.h.getString(v));
    }

    @Override  // androidx.appcompat.view.b
    public void o(CharSequence charSequence0) {
        this.i.setSubtitle(charSequence0);
    }

    @Override  // androidx.appcompat.view.b
    public void q(int v) {
        this.r(this.h.getString(v));
    }

    @Override  // androidx.appcompat.view.b
    public void r(CharSequence charSequence0) {
        this.i.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.view.b
    public void s(boolean z) {
        super.s(z);
        this.i.setTitleOptional(z);
    }
}

