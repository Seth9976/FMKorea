package androidx.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

abstract class z {
    static abstract class a {
        static int a(ViewGroup viewGroup0, int v) {
            return viewGroup0.getChildDrawingOrder(v);
        }

        static void b(ViewGroup viewGroup0, boolean z) {
            viewGroup0.suppressLayout(z);
        }
    }

    private static boolean a = true;

    static {
    }

    private static void a(ViewGroup viewGroup0, boolean z) {
        if(z.a) {
            try {
                a.b(viewGroup0, z);
            }
            catch(NoSuchMethodError unused_ex) {
                z.a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup0, boolean z) {
        if(Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup0, z);
            return;
        }
        z.a(viewGroup0, z);
    }
}

