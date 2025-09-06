package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

public class r extends p implements z {
    public static final class a extends com.google.common.collect.p.a {
        public r a() {
            Set set0 = this.a.entrySet();
            Comparator comparator0 = this.b;
            if(comparator0 != null) {
                set0 = F.a(comparator0).d().b(set0);
            }
            return r.e(set0, this.c);
        }
    }

    static abstract class b {
        static final com.google.common.collect.L.b a;

        static {
            b.a = L.a(r.class, "emptySet");
        }
    }

    private final transient q h;
    private static final long serialVersionUID;

    r(o o0, int v, Comparator comparator0) {
        super(o0, v);
        this.h = r.d(comparator0);
    }

    private static q d(Comparator comparator0) {
        return comparator0 == null ? q.u() : s.G(comparator0);
    }

    static r e(Collection collection0, Comparator comparator0) {
        if(collection0.isEmpty()) {
            return r.f();
        }
        com.google.common.collect.o.a o$a0 = new com.google.common.collect.o.a(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            Object object1 = ((Map.Entry)object0).getKey();
            q q0 = r.h(comparator0, ((Collection)((Map.Entry)object0).getValue()));
            if(!q0.isEmpty()) {
                o$a0.e(object1, q0);
                v += q0.size();
            }
        }
        return new r(o$a0.b(), v, comparator0);
    }

    public static r f() {
        return k.i;
    }

    // 去混淆评级： 低(20)
    Comparator g() {
        return this.h instanceof s ? ((s)this.h).comparator() : null;
    }

    private static q h(Comparator comparator0, Collection collection0) {
        return comparator0 == null ? q.p(collection0) : s.C(comparator0, collection0);
    }

    private static com.google.common.collect.q.a i(Comparator comparator0) {
        return comparator0 == null ? new com.google.common.collect.q.a() : new com.google.common.collect.s.a(comparator0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        o o0;
        objectInputStream0.defaultReadObject();
        Comparator comparator0 = (Comparator)objectInputStream0.readObject();
        int v = objectInputStream0.readInt();
        if(v < 0) {
            throw new InvalidObjectException("Invalid key count " + v);
        }
        com.google.common.collect.o.a o$a0 = o.a();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = objectInputStream0.readObject();
            int v3 = objectInputStream0.readInt();
            if(v3 <= 0) {
                throw new InvalidObjectException("Invalid value count " + v3);
            }
            com.google.common.collect.q.a q$a0 = r.i(comparator0);
            for(int v4 = 0; v4 < v3; ++v4) {
                q$a0.f(objectInputStream0.readObject());
            }
            q q0 = q$a0.i();
            if(q0.size() != v3) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object0);
            }
            o$a0.e(object0, q0);
            v2 += v3;
        }
        try {
            o0 = o$a0.b();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw (InvalidObjectException)new InvalidObjectException(illegalArgumentException0.getMessage()).initCause(illegalArgumentException0);
        }
        com.google.common.collect.p.b.a.b(this, o0);
        com.google.common.collect.p.b.b.a(this, v2);
        q q1 = r.d(comparator0);
        b.a.b(this, q1);
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.g());
        L.b(this, objectOutputStream0);
    }
}

