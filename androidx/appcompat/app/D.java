package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.activity.B;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.k;
import androidx.core.app.v.a;
import androidx.core.app.v;
import androidx.core.os.i;
import androidx.fragment.app.h;
import androidx.lifecycle.N;
import androidx.lifecycle.O;

public abstract class d extends h implements c, e, a {
    private g E;
    private Resources F;

    public d() {
        this.b1();
    }

    @Override  // androidx.core.app.v$a
    public Intent E() {
        return k.a(this);
    }

    @Override  // androidx.appcompat.app.e
    public b M(androidx.appcompat.view.b.a b$a0) {
        return null;
    }

    public g Z0() {
        if(this.E == null) {
            this.E = g.j(this, this);
        }
        return this.E;
    }

    public androidx.appcompat.app.a a1() {
        return this.Z0().u();
    }

    @Override  // androidx.activity.ComponentActivity
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.c1();
        this.Z0().e(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    protected void attachBaseContext(Context context0) {
        super.attachBaseContext(this.Z0().i(context0));
    }

    private void b1() {
        class androidx.appcompat.app.d.a implements androidx.savedstate.a.c {
            final d a;

            @Override  // androidx.savedstate.a$c
            public Bundle a() {
                Bundle bundle0 = new Bundle();
                d.this.Z0().E(bundle0);
                return bundle0;
            }
        }


        class androidx.appcompat.app.d.b implements c.b {
            final d a;

            @Override  // c.b
            public void a(Context context0) {
                g g0 = d.this.Z0();
                g0.v();
                g0.A(d.this.getSavedStateRegistry().b("androidx:appcompat"));
            }
        }

        this.getSavedStateRegistry().h("androidx:appcompat", new androidx.appcompat.app.d.a(this));
        this.y0(new androidx.appcompat.app.d.b(this));
    }

    private void c1() {
        N.a(this.getWindow().getDecorView(), this);
        O.a(this.getWindow().getDecorView(), this);
        j0.e.a(this.getWindow().getDecorView(), this);
        B.a(this.getWindow().getDecorView(), this);
    }

    @Override  // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a a0 = this.a1();
        if(this.getWindow().hasFeature(0) && (a0 == null || !a0.f())) {
            super.closeOptionsMenu();
        }
    }

    public void d1(v v0) {
        v0.c(this);
    }

    @Override  // androidx.core.app.h
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        androidx.appcompat.app.a a0 = this.a1();
        return v != 82 || a0 == null || !a0.p(keyEvent0) ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    protected void e1(i i0) {
    }

    protected void f1(int v) {
    }

    @Override  // android.app.Activity
    public View findViewById(int v) {
        return this.Z0().l(v);
    }

    public void g1(v v0) {
    }

    @Override  // android.app.Activity
    public MenuInflater getMenuInflater() {
        return this.Z0().s();
    }

    // 去混淆评级： 低(40)
    @Override  // android.view.ContextThemeWrapper
    public Resources getResources() {
        return this.F == null ? super.getResources() : this.F;
    }

    public void h1() {
    }

    public boolean i1() {
        Intent intent0 = this.E();
        if(intent0 != null) {
            if(this.m1(intent0)) {
                v v0 = v.e(this);
                this.d1(v0);
                v0.h();
                try {
                    androidx.core.app.b.b(this);
                }
                catch(IllegalStateException unused_ex) {
                    this.finish();
                }
                return true;
            }
            this.l1(intent0);
            return true;
        }
        return false;
    }

    @Override  // android.app.Activity
    public void invalidateOptionsMenu() {
        this.Z0().w();
    }

    private boolean j1(KeyEvent keyEvent0) {
        if(Build.VERSION.SDK_INT < 26 && !keyEvent0.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent0.getMetaState()) && keyEvent0.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent0.getKeyCode())) {
            Window window0 = this.getWindow();
            return window0 != null && window0.getDecorView() != null && window0.getDecorView().dispatchKeyShortcutEvent(keyEvent0);
        }
        return false;
    }

    public void k1(Toolbar toolbar0) {
        this.Z0().Q(toolbar0);
    }

    public void l1(Intent intent0) {
        k.e(this, intent0);
    }

    public boolean m1(Intent intent0) {
        return k.f(this, intent0);
    }

    @Override  // androidx.appcompat.app.e
    public void n(b b0) {
    }

    @Override  // androidx.appcompat.app.b$c
    public androidx.appcompat.app.b.b o() {
        return this.Z0().p();
    }

    @Override  // androidx.activity.ComponentActivity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.Z0().z(configuration0);
        if(this.F != null) {
            Configuration configuration1 = super.getResources().getConfiguration();
            DisplayMetrics displayMetrics0 = super.getResources().getDisplayMetrics();
            this.F.updateConfiguration(configuration1, displayMetrics0);
        }
    }

    @Override  // android.app.Activity
    public void onContentChanged() {
    }

    @Override  // androidx.fragment.app.h
    protected void onDestroy() {
        super.onDestroy();
        this.Z0().B();
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Activity
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this.j1(keyEvent0) ? true : super.onKeyDown(v, keyEvent0);
    }

    @Override  // androidx.fragment.app.h
    public final boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        androidx.appcompat.app.a a0 = this.a1();
        return menuItem0.getItemId() != 0x102002C || a0 == null || (a0.i() & 4) == 0 ? false : this.i1();
    }

    @Override  // android.app.Activity
    public boolean onMenuOpened(int v, Menu menu0) {
        return super.onMenuOpened(v, menu0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void onPanelClosed(int v, Menu menu0) {
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    protected void onPostCreate(Bundle bundle0) {
        super.onPostCreate(bundle0);
        this.Z0().C(bundle0);
    }

    @Override  // androidx.fragment.app.h
    protected void onPostResume() {
        super.onPostResume();
        this.Z0().D();
    }

    @Override  // androidx.fragment.app.h
    protected void onStart() {
        super.onStart();
        this.Z0().F();
    }

    @Override  // androidx.fragment.app.h
    protected void onStop() {
        super.onStop();
        this.Z0().G();
    }

    @Override  // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence0, int v) {
        super.onTitleChanged(charSequence0, v);
        this.Z0().S(charSequence0);
    }

    @Override  // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a a0 = this.a1();
        if(this.getWindow().hasFeature(0) && (a0 == null || !a0.q())) {
            super.openOptionsMenu();
        }
    }

    @Override  // androidx.appcompat.app.e
    public void r(b b0) {
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(int v) {
        this.c1();
        this.Z0().L(v);
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(View view0) {
        this.c1();
        this.Z0().M(view0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.c1();
        this.Z0().N(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    public void setTheme(int v) {
        super.setTheme(v);
        this.Z0().R(v);
    }
}

