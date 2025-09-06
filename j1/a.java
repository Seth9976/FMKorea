package J1;

import P1.b;
import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.d;

public class a {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private static final int f;

    static {
        a.f = 5;
    }

    public a(Context context0) {
        this(b.b(context0, z1.a.t, false), H1.a.b(context0, z1.a.s, 0), H1.a.b(context0, z1.a.r, 0), H1.a.b(context0, z1.a.p, 0), context0.getResources().getDisplayMetrics().density);
    }

    public a(boolean z, int v, int v1, int v2, float f) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = f;
    }

    public float a(float f) {
        return this.e <= 0.0f || f <= 0.0f ? 0.0f : Math.min((((float)Math.log1p(f / this.e)) * 4.5f + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int v, float f) {
        float f1 = this.a(f);
        int v1 = Color.alpha(v);
        int v2 = H1.a.j(d.k(v, 0xFF), this.b, f1);
        if(f1 > 0.0f) {
            int v3 = this.c;
            if(v3 != 0) {
                v2 = H1.a.i(v2, d.k(v3, a.f));
            }
        }
        return d.k(v2, v1);
    }

    // 去混淆评级： 低(20)
    public int c(int v, float f) {
        return !this.a || !this.e(v) ? v : this.b(v, f);
    }

    public boolean d() {
        return this.a;
    }

    private boolean e(int v) {
        return d.k(v, 0xFF) == this.d;
    }
}

