package d2;

import B2.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class y implements b {
    private volatile Set a;
    private volatile Set b;

    y(Collection collection0) {
        this.b = null;
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.a.addAll(collection0);
    }

    void a(b b0) {
        synchronized(this) {
            if(this.b == null) {
                this.a.add(b0);
            }
            else {
                this.b.add(b0.get());
            }
        }
    }

    static y b(Collection collection0) {
        return new y(((Set)collection0));
    }

    public Set c() {
        if(this.b == null) {
            synchronized(this) {
                if(this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    this.d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    private void d() {
        synchronized(this) {
            for(Object object0: this.a) {
                this.b.add(((b)object0).get());
            }
            this.a = null;
        }
    }

    @Override  // B2.b
    public Object get() {
        return this.c();
    }
}

