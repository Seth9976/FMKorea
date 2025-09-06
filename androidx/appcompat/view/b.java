package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {
    public interface a {
        void a(b arg1);

        boolean b(b arg1, Menu arg2);

        boolean c(b arg1, Menu arg2);

        boolean d(b arg1, MenuItem arg2);
    }

    private Object f;
    private boolean g;

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.g;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View arg1);

    public abstract void n(int arg1);

    public abstract void o(CharSequence arg1);

    public void p(Object object0) {
        this.f = object0;
    }

    public abstract void q(int arg1);

    public abstract void r(CharSequence arg1);

    public void s(boolean z) {
        this.g = z;
    }
}

