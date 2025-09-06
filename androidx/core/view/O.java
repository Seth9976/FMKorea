package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class o {
    interface a {
        float a(VelocityTracker arg1, MotionEvent arg2, int arg3);
    }

    interface b {
        void a(Context arg1, int[] arg2, MotionEvent arg3, int arg4);
    }

    private final Context a;
    private final p b;
    private final b c;
    private final a d;
    private VelocityTracker e;
    private float f;
    private int g;
    private int h;
    private int i;
    private final int[] j;

    public o(Context context0, p p0) {
        this(context0, p0, (Context context0, int[] arr_v, MotionEvent motionEvent0, int v) -> {
            ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
            arr_v[0] = c0.i(context0, viewConfiguration0, motionEvent0.getDeviceId(), v, motionEvent0.getSource());
            arr_v[1] = c0.h(context0, viewConfiguration0, motionEvent0.getDeviceId(), v, motionEvent0.getSource());
        }, (VelocityTracker velocityTracker0, MotionEvent motionEvent0, int v) -> {
            U.a(velocityTracker0, motionEvent0);
            U.b(velocityTracker0, 1000);
            return U.d(velocityTracker0, v);
        });
    }

    o(Context context0, p p0, b o$b0, a o$a0) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{0x7FFFFFFF, 0};
        this.a = context0;
        this.b = p0;
        this.c = o$b0;
        this.d = o$a0;
    }

    // 检测为 Lambda 实现
    private static void c(Context context0, int[] arr_v, MotionEvent motionEvent0, int v) [...]

    private boolean d(MotionEvent motionEvent0, int v) {
        int v1 = motionEvent0.getSource();
        int v2 = motionEvent0.getDeviceId();
        if(this.h == v1 && this.i == v2 && this.g == v) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent0, v);
        this.h = v1;
        this.i = v2;
        this.g = v;
        return true;
    }

    private float e(MotionEvent motionEvent0, int v) {
        if(this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent0, v);
    }

    // 检测为 Lambda 实现
    private static float f(VelocityTracker velocityTracker0, MotionEvent motionEvent0, int v) [...]

    public void g(MotionEvent motionEvent0, int v) {
        boolean z = this.d(motionEvent0, v);
        if(this.j[0] == 0x7FFFFFFF) {
            VelocityTracker velocityTracker0 = this.e;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.e = null;
            }
            return;
        }
        float f = this.e(motionEvent0, v) * this.b.b();
        float f1 = Math.signum(f);
        float f2 = 0.0f;
        if(z || f1 != Math.signum(this.f) && f1 != 0.0f) {
            this.b.c();
        }
        int[] arr_v = this.j;
        if(Math.abs(f) < ((float)arr_v[0])) {
            return;
        }
        float f3 = Math.max(-arr_v[1], Math.min(f, arr_v[1]));
        if(this.b.a(f3)) {
            f2 = f3;
        }
        this.f = f2;
    }
}

