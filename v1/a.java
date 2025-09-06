package V1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

public abstract class a {
    private static final int[] a;
    private static final int[] b;

    static {
        a.a = new int[]{0x1010000, z1.a.a0};
        a.b = new int[]{z1.a.B};
    }

    private static int a(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.a);
        int v = typedArray0.getResourceId(0, 0);
        int v1 = typedArray0.getResourceId(1, 0);
        typedArray0.recycle();
        return v == 0 ? v1 : v;
    }

    private static int b(Context context0, AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.b, v, v1);
        int v2 = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        return v2;
    }

    public static Context c(Context context0, AttributeSet attributeSet0, int v, int v1) {
        int v2 = a.b(context0, attributeSet0, v, v1);
        if(v2 != 0 && (!(context0 instanceof d) || ((d)context0).c() != v2)) {
            Context context1 = new d(context0, v2);
            int v3 = a.a(context0, attributeSet0);
            if(v3 != 0) {
                context1.getTheme().applyStyle(v3, true);
            }
            return context1;
        }
        return context0;
    }
}

