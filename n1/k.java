package N1;

import androidx.vectordrawable.graphics.drawable.b;
import java.util.ArrayList;
import java.util.List;

abstract class k {
    protected l a;
    protected final List b;

    protected k(int v) {
        this.b = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            a j$a0 = new a();
            this.b.add(j$a0);
        }
    }

    abstract void a();

    protected float b(int v, int v1, int v2) {
        return ((float)(v - v1)) / ((float)v2);
    }

    public abstract void c();

    public abstract void d(b arg1);

    protected void e(l l0) {
        this.a = l0;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}

