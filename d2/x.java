package d2;

import B2.b;

public class x implements b {
    private volatile Object a;
    private volatile b b;
    private static final Object c;

    static {
        x.c = new Object();
    }

    public x(b b0) {
        this.a = x.c;
        this.b = b0;
    }

    @Override  // B2.b
    public Object get() {
        Object object0 = this.a;
        Object object1 = x.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.a;
                if(object0 == object1) {
                    object0 = this.b.get();
                    this.a = object0;
                    this.b = null;
                }
            }
        }
        return object0;
    }
}

