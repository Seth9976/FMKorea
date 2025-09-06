package N1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

abstract class j {
    public static class a {
        float a;
        float b;
        int c;
        int d;

    }

    c a;

    public j(c c0) {
        this.a = c0;
    }

    abstract void a(Canvas arg1, Rect arg2, float arg3, boolean arg4, boolean arg5);

    abstract void b(Canvas arg1, Paint arg2, int arg3, int arg4);

    abstract void c(Canvas arg1, Paint arg2, a arg3, int arg4);

    abstract void d(Canvas arg1, Paint arg2, float arg3, float arg4, int arg5, int arg6, int arg7);

    abstract int e();

    abstract int f();

    void g(Canvas canvas0, Rect rect0, float f, boolean z, boolean z1) {
        this.a.e();
        this.a(canvas0, rect0, f, z, z1);
    }
}

