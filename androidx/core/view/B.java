package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {
    public interface a {
    }

    public interface androidx.core.view.b.b {
        void onActionProviderVisibilityChanged(boolean arg1);
    }

    private final Context a;
    private a b;
    private androidx.core.view.b.b c;

    public b(Context context0) {
        this.a = context0;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem arg1);

    public abstract boolean d();

    public abstract void e(SubMenu arg1);

    public abstract boolean f();

    public void g() {
        this.c = null;
        this.b = null;
    }

    public void h(a b$a0) {
        this.b = b$a0;
    }

    public abstract void i(androidx.core.view.b.b arg1);
}

