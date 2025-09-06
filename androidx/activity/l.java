package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import z3.k;

public abstract class l {
    private static final int a;
    private static final int b;
    private static r c;

    static {
        l.a = Color.argb(230, 0xFF, 0xFF, 0xFF);
        l.b = Color.argb(0x80, 27, 27, 27);
    }

    public static final void a(ComponentActivity componentActivity0, z z0, z z1) {
        k.e(componentActivity0, "<this>");
        k.e(z0, "statusBarStyle");
        k.e(z1, "navigationBarStyle");
        View view0 = componentActivity0.getWindow().getDecorView();
        k.d(view0, "window.decorView");
        Resources resources0 = view0.getResources();
        k.d(resources0, "view.resources");
        boolean z2 = ((Boolean)z0.b().h(resources0)).booleanValue();
        Resources resources1 = view0.getResources();
        k.d(resources1, "view.resources");
        boolean z3 = ((Boolean)z1.b().h(resources1)).booleanValue();
        r r0 = l.c;
        if(r0 == null) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 29) {
                r0 = new q();
            }
            else if(v >= 26) {
                r0 = new n();
            }
            else {
                r0 = new m();
            }
        }
        Window window0 = componentActivity0.getWindow();
        k.d(window0, "window");
        r0.a(z0, z1, window0, view0, z2, z3);
    }

    public static void b(ComponentActivity componentActivity0, z z0, z z1, int v, Object object0) {
        if((v & 1) != 0) {
            z0 = a.b(z.e, 0, 0, null, 4, null);
        }
        if((v & 2) != 0) {
            z1 = a.b(z.e, l.a, l.b, null, 4, null);
        }
        l.a(componentActivity0, z0, z1);
    }
}

