package N1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.q;
import z1.a;
import z1.k;

public final class g extends c {
    public int h;
    public int i;
    public int j;

    public g(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.i);
    }

    public g(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, f.u);
    }

    public g(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        int v2 = context0.getResources().getDimensionPixelSize(z1.c.q0);
        int v3 = context0.getResources().getDimensionPixelSize(z1.c.p0);
        TypedArray typedArray0 = q.i(context0, attributeSet0, k.Q1, v, v1, new int[0]);
        this.h = Math.max(P1.c.d(context0, typedArray0, k.T1, v2), this.a * 2);
        this.i = P1.c.d(context0, typedArray0, k.S1, v3);
        this.j = typedArray0.getInt(k.R1, 0);
        typedArray0.recycle();
        this.e();
    }
}

