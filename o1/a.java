package O1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;
import androidx.core.widget.c;
import com.google.android.material.internal.q;
import z1.j;
import z1.k;

public class a extends t {
    private ColorStateList j;
    private boolean k;
    private static final int l;
    private static final int[][] m;

    static {
        a.l = j.t;
        a.m = new int[][]{new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
    }

    public a(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.Q);
    }

    public a(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, a.l), attributeSet0, v);
        Context context1 = this.getContext();
        TypedArray typedArray0 = q.i(context1, attributeSet0, k.q4, v, a.l, new int[0]);
        if(typedArray0.hasValue(k.r4)) {
            c.d(this, P1.c.a(context1, typedArray0, 0));
        }
        this.k = typedArray0.getBoolean(k.s4, false);
        typedArray0.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if(this.j == null) {
            int v = H1.a.d(this, z1.a.j);
            int v1 = H1.a.d(this, z1.a.m);
            int v2 = H1.a.d(this, z1.a.p);
            int[] arr_v = new int[a.m.length];
            arr_v[0] = H1.a.j(v2, v, 1.0f);
            arr_v[1] = H1.a.j(v2, v1, 0.54f);
            arr_v[2] = H1.a.j(v2, v1, 0.38f);
            arr_v[3] = H1.a.j(v2, v1, 0.38f);
            this.j = new ColorStateList(a.m, arr_v);
        }
        return this.j;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.k && c.b(this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k = z;
        if(z) {
            c.d(this, this.getMaterialThemeColorsTintList());
            return;
        }
        c.d(this, null);
    }
}

