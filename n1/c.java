package N1;

import H1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.q;
import z1.k;

public abstract class c {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    protected c(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.c = new int[0];
        int v2 = context0.getResources().getDimensionPixelSize(z1.c.r0);
        TypedArray typedArray0 = q.i(context0, attributeSet0, k.h0, v, v1, new int[0]);
        this.a = P1.c.d(context0, typedArray0, k.q0, v2);
        this.b = Math.min(P1.c.d(context0, typedArray0, k.p0, 0), this.a / 2);
        this.e = typedArray0.getInt(k.m0, 0);
        this.f = typedArray0.getInt(k.i0, 0);
        this.g = typedArray0.getDimensionPixelSize(k.k0, 0);
        this.c(context0, typedArray0);
        this.d(context0, typedArray0);
        typedArray0.recycle();
    }

    public boolean a() {
        return this.f != 0;
    }

    public boolean b() {
        return this.e != 0;
    }

    private void c(Context context0, TypedArray typedArray0) {
        if(!typedArray0.hasValue(k.j0)) {
            this.c = new int[]{a.b(context0, z1.a.n, -1)};
            return;
        }
        if(typedArray0.peekValue(2).type != 1) {
            this.c = new int[]{typedArray0.getColor(2, -1)};
            return;
        }
        int[] arr_v = context0.getResources().getIntArray(typedArray0.getResourceId(2, -1));
        this.c = arr_v;
        if(arr_v.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(Context context0, TypedArray typedArray0) {
        if(typedArray0.hasValue(k.o0)) {
            this.d = typedArray0.getColor(7, -1);
            return;
        }
        this.d = this.c[0];
        TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(new int[]{0x1010033});
        float f = typedArray1.getFloat(0, 0.2f);
        typedArray1.recycle();
        this.d = a.a(this.d, ((int)(f * 255.0f)));
    }

    void e() {
        if(this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}

