package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;

public abstract class k0 {
    static abstract class a {
        static void a(Window window0, boolean z) {
            View view0 = window0.getDecorView();
            int v = view0.getSystemUiVisibility();
            view0.setSystemUiVisibility((z ? v & 0xFFFFF8FF : v | 0x700));
        }
    }

    static abstract class b {
        static void a(Window window0, boolean z) {
            window0.setDecorFitsSystemWindows(z);
        }
    }

    public static V0 a(Window window0, View view0) {
        return new V0(window0, view0);
    }

    public static void b(Window window0, boolean z) {
        if(Build.VERSION.SDK_INT >= 30) {
            b.a(window0, z);
            return;
        }
        a.a(window0, z);
    }
}

