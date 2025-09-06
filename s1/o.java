package S1;

import D1.a.a;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;

public abstract class o {
    boolean a;
    boolean b;
    k c;
    RectF d;
    final Path e;

    public o() {
        this.a = false;
        this.b = false;
        this.d = new RectF();
        this.e = new Path();
    }

    public static o a(View view0) {
        return Build.VERSION.SDK_INT >= 33 ? new q(view0) : new p(view0);
    }

    abstract void b(View arg1);

    private boolean c() {
        return this.d.left <= this.d.right && this.d.top <= this.d.bottom;
    }

    public void d(Canvas canvas0, a a$a0) {
        if(this.i() && !this.e.isEmpty()) {
            canvas0.save();
            canvas0.clipPath(this.e);
            a$a0.a(canvas0);
            canvas0.restore();
            return;
        }
        a$a0.a(canvas0);
    }

    public void e(View view0, RectF rectF0) {
        this.d = rectF0;
        this.j();
        this.b(view0);
    }

    public void f(View view0, k k0) {
        this.c = k0;
        this.j();
        this.b(view0);
    }

    public void g(View view0, boolean z) {
        if(z != this.a) {
            this.a = z;
            this.b(view0);
        }
    }

    public void h(View view0, boolean z) {
        this.b = z;
        this.b(view0);
    }

    abstract boolean i();

    private void j() {
        if(this.c() && this.c != null) {
            l.k().e(this.c, 1.0f, this.d, this.e);
        }
    }
}

