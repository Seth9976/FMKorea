package l;

import java.util.HashMap;
import java.util.Map.Entry;

public class a extends b {
    private final HashMap j;

    public a() {
        this.j = new HashMap();
    }

    @Override  // l.b
    protected c c(Object object0) {
        return (c)this.j.get(object0);
    }

    public boolean contains(Object object0) {
        return this.j.containsKey(object0);
    }

    @Override  // l.b
    public Object i(Object object0, Object object1) {
        c b$c0 = this.c(object0);
        if(b$c0 != null) {
            return b$c0.g;
        }
        c b$c1 = this.h(object0, object1);
        this.j.put(object0, b$c1);
        return null;
    }

    @Override  // l.b
    public Object k(Object object0) {
        Object object1 = super.k(object0);
        this.j.remove(object0);
        return object1;
    }

    public Map.Entry l(Object object0) {
        return this.contains(object0) ? ((c)this.j.get(object0)).i : null;
    }
}

