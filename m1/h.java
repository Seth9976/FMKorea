package M1;

import P1.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.g;
import androidx.core.view.animation.a;

public abstract class h {
    private static float a(String[] arr_s, int v) {
        float f = Float.parseFloat(arr_s[v]);
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
        }
        return f;
    }

    private static String b(String s, String s1) {
        return s.substring(s1.length() + 1, s.length() - 1);
    }

    private static TimeInterpolator c(String s) {
        if(h.e(s, "cubic-bezier")) {
            String[] arr_s = h.b(s, "cubic-bezier").split(",");
            if(arr_s.length != 4) {
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + arr_s.length);
            }
            return a.a(h.a(arr_s, 0), h.a(arr_s, 1), h.a(arr_s, 2), h.a(arr_s, 3));
        }
        if(!h.e(s, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: " + s);
        }
        return a.b(g.e(h.b(s, "path")));
    }

    // 去混淆评级： 低(20)
    private static boolean d(String s) {
        return h.e(s, "cubic-bezier") || h.e(s, "path");
    }

    // 去混淆评级： 低(20)
    private static boolean e(String s, String s1) {
        return s.startsWith(s1 + "(") && s.endsWith(")");
    }

    public static int f(Context context0, int v, int v1) {
        return b.c(context0, v, v1);
    }

    public static TimeInterpolator g(Context context0, int v, TimeInterpolator timeInterpolator0) {
        TypedValue typedValue0 = new TypedValue();
        if(!context0.getTheme().resolveAttribute(v, typedValue0, true)) {
            return timeInterpolator0;
        }
        if(typedValue0.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String s = String.valueOf(typedValue0.string);
        return h.d(s) ? h.c(s) : AnimationUtils.loadInterpolator(context0, typedValue0.resourceId);
    }
}

