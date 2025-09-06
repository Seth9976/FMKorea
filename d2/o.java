package d2;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t2.a;
import y2.d;

public class o implements e, a {
    static abstract class d2.o.a {
    }

    public static final class b {
        private final Executor a;
        private final List b;
        private final List c;
        private j d;

        b(Executor executor0) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = j.a;
            this.a = executor0;
        }

        // 检测为 Lambda 实现
        public static ComponentRegistrar a(ComponentRegistrar componentRegistrar0) [...]

        public b b(c c0) {
            this.c.add(c0);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar0) {
            p p0 = () -> componentRegistrar0;
            this.b.add(p0);
            return this;
        }

        public b d(Collection collection0) {
            this.b.addAll(collection0);
            return this;
        }

        public o e() {
            return new o(this.a, this.b, this.c, this.d, null);
        }

        private static ComponentRegistrar f(ComponentRegistrar componentRegistrar0) [...] // Inlined contents

        public b g(j j0) {
            this.d = j0;
            return this;
        }
    }

    private final Map a;
    private final Map b;
    private final Map c;
    private final List d;
    private Set e;
    private final v f;
    private final AtomicReference g;
    private final j h;
    private static final B2.b i;

    static {
        o.i = new k();
    }

    private o(Executor executor0, Iterable iterable0, Collection collection0, j j0) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        v v0 = new v(executor0);
        this.f = v0;
        this.h = j0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(c.s(v0, v.class, new Class[]{d.class, y2.c.class}));
        arrayList0.add(c.s(this, a.class, new Class[0]));
        for(Object object0: collection0) {
            c c0 = (c)object0;
            if(c0 != null) {
                arrayList0.add(c0);
            }
        }
        this.d = o.q(iterable0);
        this.n(arrayList0);
    }

    o(Executor executor0, Iterable iterable0, Collection collection0, j j0, d2.o.a o$a0) {
        this(executor0, iterable0, collection0, j0);
    }

    @Override  // d2.e
    public Object a(Class class0) {
        return d2.d.b(this, class0);
    }

    @Override  // d2.e
    public B2.b b(F f0) {
        synchronized(this) {
            E.c(f0, "Null interface requested.");
            return (B2.b)this.b.get(f0);
        }
    }

    @Override  // d2.e
    public B2.b c(Class class0) {
        return d2.d.d(this, class0);
    }

    @Override  // d2.e
    public Set d(Class class0) {
        return d2.d.f(this, class0);
    }

    @Override  // d2.e
    public B2.a e(F f0) {
        B2.b b0 = this.b(f0);
        if(b0 == null) {
            return D.e();
        }
        return b0 instanceof D ? ((D)b0) : D.i(b0);
    }

    @Override  // d2.e
    public B2.b f(F f0) {
        synchronized(this) {
            B2.b b0 = (y)this.c.get(f0);
            return b0 != null ? b0 : o.i;
        }
    }

    @Override  // d2.e
    public Object g(F f0) {
        return d2.d.a(this, f0);
    }

    @Override  // d2.e
    public Set h(F f0) {
        return d2.d.e(this, f0);
    }

    @Override  // d2.e
    public B2.a i(Class class0) {
        return d2.d.c(this, class0);
    }

    // 检测为 Lambda 实现
    public static Object j(o o0, c c0) [...]

    // 检测为 Lambda 实现
    public static void k(D d0, B2.b b0) [...]

    // 检测为 Lambda 实现
    public static void l(y y0, B2.b b0) [...]

    public static b m(Executor executor0) {
        return new b(executor0);
    }

    private void n(List list0) {
        ArrayList arrayList0 = new ArrayList();
        synchronized(this) {
            Iterator iterator0 = this.d.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                B2.b b0 = (B2.b)object0;
                try {
                    ComponentRegistrar componentRegistrar0 = (ComponentRegistrar)b0.get();
                    if(componentRegistrar0 == null) {
                        continue;
                    }
                    list0.addAll(this.h.a(componentRegistrar0));
                    iterator0.remove();
                }
                catch(w w0) {
                    iterator0.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", w0);
                }
            }
            Iterator iterator1 = list0.iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                Object[] arr_object = ((c)object1).j().toArray();
                int v1 = 0;
            label_21:
                if(v1 >= arr_object.length) {
                    continue;
                }
                Object object2 = arr_object[v1];
                if(object2.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                    if(this.e.contains(object2.toString())) {
                        iterator1.remove();
                        continue;
                    }
                    this.e.add(object2.toString());
                }
                ++v1;
                goto label_21;
            }
            if(this.a.isEmpty()) {
                q.a(list0);
            }
            else {
                ArrayList arrayList1 = new ArrayList(this.a.keySet());
                arrayList1.addAll(list0);
                q.a(arrayList1);
            }
            for(Object object3: list0) {
                x x0 = new x(() -> this.r(((c)object3)));
                this.a.put(((c)object3), x0);
            }
            arrayList0.addAll(this.w(list0));
            arrayList0.addAll(this.x());
            this.v();
        }
        for(Object object4: arrayList0) {
            ((Runnable)object4).run();
        }
        this.u();
    }

    private void o(Map map0, boolean z) {
        for(Object object0: map0.entrySet()) {
            c c0 = (c)((Map.Entry)object0).getKey();
            B2.b b0 = (B2.b)((Map.Entry)object0).getValue();
            if(c0.n() || c0.o() && z) {
                b0.get();
            }
        }
        this.f.d();
    }

    public void p(boolean z) {
        HashMap hashMap0;
        if(!com.facebook.internal.q.a(this.g, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized(this) {
            hashMap0 = new HashMap(this.a);
        }
        this.o(hashMap0, z);
    }

    private static List q(Iterable iterable0) {
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    private Object r(c c0) {
        return c0.h().a(new G(c0, this));
    }

    private static void s(D d0, B2.b b0) {
        d0.j(b0);
    }

    private static void t(y y0, B2.b b0) {
        y0.a(b0);
    }

    private void u() {
        Boolean boolean0 = (Boolean)this.g.get();
        if(boolean0 != null) {
            this.o(this.a, boolean0.booleanValue());
        }
    }

    private void v() {
        for(Object object0: this.a.keySet()) {
            c c0 = (c)object0;
            for(Object object1: c0.g()) {
                r r0 = (r)object1;
                if(r0.g() && !this.c.containsKey(r0.c())) {
                    y y0 = y.b(Collections.emptySet());
                    this.c.put(r0.c(), y0);
                }
                else if(!this.b.containsKey(r0.c())) {
                    if(r0.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", c0, r0.c()));
                    }
                    if(!r0.g()) {
                        D d0 = D.e();
                        this.b.put(r0.c(), d0);
                    }
                }
            }
        }
    }

    private List w(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            c c0 = (c)object0;
            if(c0.p()) {
                B2.b b0 = (B2.b)this.a.get(c0);
                for(Object object1: c0.j()) {
                    F f0 = (F)object1;
                    if(this.b.containsKey(f0)) {
                        ((ArrayList)list1).add(() -> o.s(((D)(((B2.b)this.b.get(f0)))), b0));
                    }
                    else {
                        this.b.put(f0, b0);
                    }
                }
            }
        }
        return list1;
    }

    private List x() {
        List list0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            c c0 = (c)map$Entry0.getKey();
            if(!c0.p()) {
                B2.b b0 = (B2.b)map$Entry0.getValue();
                for(Object object1: c0.j()) {
                    F f0 = (F)object1;
                    if(!hashMap0.containsKey(f0)) {
                        hashMap0.put(f0, new HashSet());
                    }
                    ((Set)hashMap0.get(f0)).add(b0);
                }
            }
        }
        for(Object object2: hashMap0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            Object object3 = map$Entry1.getKey();
            if(this.c.containsKey(object3)) {
                Object object4 = map$Entry1.getKey();
                y y1 = (y)this.c.get(object4);
                for(Object object5: ((Set)map$Entry1.getValue())) {
                    ((ArrayList)list0).add(() -> o.t(y1, ((B2.b)object5)));
                }
            }
            else {
                F f1 = (F)map$Entry1.getKey();
                y y0 = y.b(((Collection)map$Entry1.getValue()));
                this.c.put(f1, y0);
            }
        }
        return list0;
    }
}

