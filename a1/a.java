package A1;

import T.b;
import T.c;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class a {
    public static final TimeInterpolator a;
    public static final TimeInterpolator b;
    public static final TimeInterpolator c;
    public static final TimeInterpolator d;
    public static final TimeInterpolator e;

    static {
        a.a = new LinearInterpolator();
        a.b = new b();
        a.c = new T.a();
        a.d = new c();
        a.e = new DecelerateInterpolator();
    }

    public static float a(float f, float f1, float f2) [...] // Inlined contents

    public static float b(float f, float f1, float f2, float f3, float f4) {
        if(f4 <= f2) {
            return f;
        }
        return f4 >= f3 ? f1 : a.a(f, f1, (f4 - f2) / (f3 - f2));
    }

    public static int c(int v, int v1, float f) {
        return v + Math.round(f * ((float)(v1 - v)));
    }
}

