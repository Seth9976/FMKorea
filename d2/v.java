package d2;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import y2.a;
import y2.b;
import y2.c;
import y2.d;

class v implements c, d {
    private final Map a;
    private Queue b;
    private final Executor c;

    v(Executor executor0) {
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = executor0;
    }

    @Override  // y2.d
    public void a(Class class0, Executor executor0, b b0) {
        synchronized(this) {
            E.b(class0);
            E.b(b0);
            E.b(executor0);
            if(!this.a.containsKey(class0)) {
                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                this.a.put(class0, concurrentHashMap0);
            }
            ((ConcurrentHashMap)this.a.get(class0)).put(b0, executor0);
        }
    }

    @Override  // y2.d
    public void b(Class class0, b b0) {
        this.a(class0, this.c, b0);
    }

    // 检测为 Lambda 实现
    public static void c(Map.Entry map$Entry0, a a0) [...]

    void d() {
        synchronized(this) {
            Queue queue0 = this.b;
            if(queue0 == null) {
                queue0 = null;
            }
            else {
                this.b = null;
            }
        }
        if(queue0 != null) {
            for(Object object0: queue0) {
                androidx.appcompat.app.E.a(object0);
                this.g(null);
            }
        }
    }

    private Set e(a a0) {
        synchronized(this) {
            throw null;
        }
    }

    private static void f(Map.Entry map$Entry0, a a0) {
        ((b)map$Entry0.getKey()).a(a0);
    }

    public void g(a a0) {
        E.b(a0);
        synchronized(this) {
            Queue queue0 = this.b;
            if(queue0 != null) {
                queue0.add(a0);
                return;
            }
        }
        for(Object object0: this.e(a0)) {
            ((Executor)((Map.Entry)object0).getValue()).execute(() -> v.f(((Map.Entry)object0), null));
        }
    }
}

