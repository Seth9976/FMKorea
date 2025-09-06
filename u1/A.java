package U1;

import P1.b;
import P1.c;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.A;
import z1.k;

public class a extends A {
    public a(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010084);
    }

    public a(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, 0), attributeSet0, v);
        this.v(attributeSet0, v, 0);
    }

    private void s(Resources.Theme resources$Theme0, int v) {
        TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(v, k.x4);
        int v1 = a.w(this.getContext(), typedArray0, new int[]{k.z4, k.A4});
        typedArray0.recycle();
        if(v1 >= 0) {
            this.setLineHeight(v1);
        }
    }

    @Override  // androidx.appcompat.widget.A
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        if(a.t(context0)) {
            this.s(context0.getTheme(), v);
        }
    }

    private static boolean t(Context context0) {
        return b.b(context0, z1.a.Y, true);
    }

    private static int u(Resources.Theme resources$Theme0, AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, k.B4, v, v1);
        int v2 = typedArray0.getResourceId(k.C4, -1);
        typedArray0.recycle();
        return v2;
    }

    private void v(AttributeSet attributeSet0, int v, int v1) {
        Context context0 = this.getContext();
        if(a.t(context0)) {
            Resources.Theme resources$Theme0 = context0.getTheme();
            if(!a.x(context0, resources$Theme0, attributeSet0, v, v1)) {
                int v2 = a.u(resources$Theme0, attributeSet0, v, v1);
                if(v2 != -1) {
                    this.s(resources$Theme0, v2);
                }
            }
        }
    }

    private static int w(Context context0, TypedArray typedArray0, int[] arr_v) {
        int v1 = -1;
        for(int v = 0; v < arr_v.length && v1 < 0; ++v) {
            v1 = c.d(context0, typedArray0, arr_v[v], -1);
        }
        return v1;
    }

    private static boolean x(Context context0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, k.B4, v, v1);
        int v2 = a.w(context0, typedArray0, new int[]{k.D4, k.E4});
        typedArray0.recycle();
        return v2 != -1;
    }
}

