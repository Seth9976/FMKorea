package S1;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.t;

public abstract class h {
    static d a(int v) {
        switch(v) {
            case 0: {
                return new j();
            }
            case 1: {
                return new e();
            }
            default: {
                return h.b();
            }
        }
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view0, float f) {
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof g) {
            ((g)drawable0).U(f);
        }
    }

    public static void e(View view0) {
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof g) {
            h.f(view0, ((g)drawable0));
        }
    }

    public static void f(View view0, g g0) {
        if(g0.M()) {
            g0.Y(t.f(view0));
        }
    }
}

