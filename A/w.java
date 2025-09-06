package A;

import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import z3.k;

public final class w {
    public static final w a;

    static {
        w.a = new w();
    }

    public static final void a(Resources.Theme resources$Theme0, View view0) {
        k.e(resources$Theme0, "theme");
        k.e(view0, "decor");
        w.c(resources$Theme0, view0, null, 4, null);
    }

    public static final void b(Resources.Theme resources$Theme0, View view0, TypedValue typedValue0) {
        k.e(resources$Theme0, "theme");
        k.e(view0, "decor");
        k.e(typedValue0, "tv");
        int v = !resources$Theme0.resolveAttribute(0x10104E0, typedValue0, true) || typedValue0.data == 0 ? 0 : 8;
        if(resources$Theme0.resolveAttribute(0x101056C, typedValue0, true) && typedValue0.data != 0) {
            v |= 16;
        }
        WindowInsetsController windowInsetsController0 = view0.getWindowInsetsController();
        k.b(windowInsetsController0);
        windowInsetsController0.setSystemBarsAppearance(v, 24);
    }

    public static void c(Resources.Theme resources$Theme0, View view0, TypedValue typedValue0, int v, Object object0) {
        if((v & 4) != 0) {
            typedValue0 = new TypedValue();
        }
        w.b(resources$Theme0, view0, typedValue0);
    }
}

