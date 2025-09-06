package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.V0;
import androidx.core.view.k0;
import z3.k;

final class n implements r {
    @Override  // androidx.activity.r
    public void a(z z0, z z1, Window window0, View view0, boolean z2, boolean z3) {
        k.e(z0, "statusBarStyle");
        k.e(z1, "navigationBarStyle");
        k.e(window0, "window");
        k.e(view0, "view");
        k0.b(window0, false);
        window0.setStatusBarColor(z0.d(z2));
        window0.setNavigationBarColor(z1.d(z3));
        V0 v00 = new V0(window0, view0);
        v00.c(!z2);
        v00.b(!z3);
    }
}

