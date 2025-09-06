package B;

import z3.k;

public class g extends f {
    private final Object c;

    public g(int v) {
        super(v);
        this.c = new Object();
    }

    @Override  // B.f
    public boolean a(Object object0) {
        k.e(object0, "instance");
        synchronized(this.c) {
            return super.a(object0);
        }
    }

    @Override  // B.f
    public Object b() {
        synchronized(this.c) {
            return super.b();
        }
    }
}

