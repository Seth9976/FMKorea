package P1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.c0;
import f.a;
import z1.k;

public abstract class c {
    public static ColorStateList a(Context context0, TypedArray typedArray0, int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = a.a(context0, v1);
                return colorStateList0 == null ? typedArray0.getColorStateList(v) : colorStateList0;
            }
        }
        return typedArray0.getColorStateList(v);
    }

    public static ColorStateList b(Context context0, c0 c00, int v) {
        if(c00.s(v)) {
            int v1 = c00.n(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = a.a(context0, v1);
                return colorStateList0 == null ? c00.c(v) : colorStateList0;
            }
        }
        return c00.c(v);
    }

    private static int c(TypedValue typedValue0) {
        return typedValue0.getComplexUnit();
    }

    public static int d(Context context0, TypedArray typedArray0, int v, int v1) {
        TypedValue typedValue0 = new TypedValue();
        if(typedArray0.getValue(v, typedValue0) && typedValue0.type == 2) {
            TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(new int[]{typedValue0.data});
            int v2 = typedArray1.getDimensionPixelSize(0, v1);
            typedArray1.recycle();
            return v2;
        }
        return typedArray0.getDimensionPixelSize(v, v1);
    }

    public static Drawable e(Context context0, TypedArray typedArray0, int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                Drawable drawable0 = a.b(context0, v1);
                return drawable0 == null ? typedArray0.getDrawable(v) : drawable0;
            }
        }
        return typedArray0.getDrawable(v);
    }

    public static float f(Context context0) {
        return context0.getResources().getConfiguration().fontScale;
    }

    // 去混淆评级： 低(20)
    static int g(TypedArray typedArray0, int v, int v1) {
        return typedArray0.hasValue(v) ? v : v1;
    }

    public static d h(Context context0, TypedArray typedArray0, int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? null : new d(context0, v1);
        }
        return null;
    }

    public static int i(Context context0, int v, int v1) {
        if(v == 0) {
            return v1;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, k.g7);
        TypedValue typedValue0 = new TypedValue();
        boolean z = typedArray0.getValue(k.h7, typedValue0);
        typedArray0.recycle();
        if(!z) {
            return v1;
        }
        return c.c(typedValue0) == 2 ? Math.round(TypedValue.complexToFloat(typedValue0.data) * context0.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
    }

    public static boolean j(Context context0) {
        return context0.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean k(Context context0) {
        return context0.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

