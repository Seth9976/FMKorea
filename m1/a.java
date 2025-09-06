package M1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.activity.b;

public abstract class a {
    private final TimeInterpolator a;
    protected final View b;
    protected final int c;
    protected final int d;
    protected final int e;
    private b f;

    public a(View view0) {
        this.b = view0;
        Context context0 = view0.getContext();
        Interpolator interpolator0 = androidx.core.view.animation.a.a(0.0f, 0.0f, 0.0f, 1.0f);
        this.a = h.g(context0, z1.a.M, interpolator0);
        this.c = h.f(context0, z1.a.D, 300);
        this.d = h.f(context0, z1.a.G, 150);
        this.e = h.f(context0, z1.a.F, 100);
    }

    public float a(float f) {
        return this.a.getInterpolation(f);
    }

    protected b b() {
        if(this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        b b0 = this.f;
        this.f = null;
        return b0;
    }

    public b c() {
        b b0 = this.f;
        this.f = null;
        return b0;
    }

    protected void d(b b0) {
        this.f = b0;
    }

    protected b e(b b0) {
        if(this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        b b1 = this.f;
        this.f = b0;
        return b1;
    }
}

