package H1;

import P1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.d;

public abstract class a {
    public static int a(int v, int v1) {
        return d.k(v, Color.alpha(v) * v1 / 0xFF);
    }

    public static int b(Context context0, int v, int v1) {
        Integer integer0 = a.f(context0, v);
        return integer0 == null ? v1 : ((int)integer0);
    }

    public static int c(Context context0, int v, String s) {
        return a.l(context0, b.e(context0, v, s));
    }

    public static int d(View view0, int v) {
        return a.l(view0.getContext(), b.f(view0, v));
    }

    public static int e(View view0, int v, int v1) {
        return a.b(view0.getContext(), v, v1);
    }

    public static Integer f(Context context0, int v) {
        TypedValue typedValue0 = b.a(context0, v);
        return typedValue0 == null ? null : a.l(context0, typedValue0);
    }

    public static ColorStateList g(Context context0, int v) {
        TypedValue typedValue0 = b.a(context0, v);
        if(typedValue0 == null) {
            return null;
        }
        int v1 = typedValue0.resourceId;
        if(v1 != 0) {
            return androidx.core.content.a.getColorStateList(context0, v1);
        }
        return typedValue0.data == 0 ? null : ColorStateList.valueOf(typedValue0.data);
    }

    public static boolean h(int v) {
        return v != 0 && d.d(v) > 0.5;
    }

    public static int i(int v, int v1) {
        return d.g(v1, v);
    }

    public static int j(int v, int v1, float f) {
        return a.i(v, d.k(v1, Math.round(((float)Color.alpha(v1)) * f)));
    }

    public static int k(View view0, int v, int v1, float f) {
        return a.j(a.d(view0, v), a.d(view0, v1), f);
    }

    private static int l(Context context0, TypedValue typedValue0) {
        return typedValue0.resourceId == 0 ? typedValue0.data : androidx.core.content.a.getColor(context0, typedValue0.resourceId);
    }
}

