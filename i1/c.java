package I1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.q;
import z1.k;

public abstract class c {
    public static Rect a(Context context0, int v, int v1) {
        TypedArray typedArray0 = q.i(context0, null, k.S2, v, v1, new int[0]);
        int v2 = context0.getResources().getDimensionPixelSize(z1.c.U);
        int v3 = typedArray0.getDimensionPixelSize(k.V2, v2);
        int v4 = context0.getResources().getDimensionPixelSize(z1.c.V);
        int v5 = typedArray0.getDimensionPixelSize(k.W2, v4);
        int v6 = context0.getResources().getDimensionPixelSize(z1.c.T);
        int v7 = typedArray0.getDimensionPixelSize(k.U2, v6);
        int v8 = context0.getResources().getDimensionPixelSize(z1.c.S);
        int v9 = typedArray0.getDimensionPixelSize(k.T2, v8);
        typedArray0.recycle();
        if(context0.getResources().getConfiguration().getLayoutDirection() == 1) {
            int v10 = v7;
            v7 = v3;
            v3 = v10;
        }
        return new Rect(v3, v5, v7, v9);
    }

    public static InsetDrawable b(Drawable drawable0, Rect rect0) {
        return new InsetDrawable(drawable0, rect0.left, rect0.top, rect0.right, rect0.bottom);
    }
}

