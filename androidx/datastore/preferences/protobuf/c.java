package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class C extends c implements D, RandomAccess {
    private final List g;
    private static final C h;
    public static final D i;

    static {
        C c0 = new C();
        C.h = c0;
        c0.b();
        C.i = c0;
    }

    public C() {
        this(10);
    }

    public C(int v) {
        this(new ArrayList(v));
    }

    private C(ArrayList arrayList0) {
        this.g = arrayList0;
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public Object F(int v) {
        return this.g.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean J() {
        return super.J();
    }

    @Override
    public void add(int v, Object object0) {
        this.c(v, ((String)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean addAll(int v, Collection collection0) {
        this.a();
        if(collection0 instanceof D) {
            collection0 = ((D)collection0).r();
        }
        boolean z = this.g.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    public void c(int v, String s) {
        this.a();
        this.g.add(v, s);
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public void clear() {
        this.a();
        this.g.clear();
        ++this.modCount;
    }

    private static String d(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof g ? ((g)object0).y() : y.j(((byte[])object0));
    }

    public String e(int v) {
        Object object0 = this.g.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof g) {
            String s = ((g)object0).y();
            if(((g)object0).n()) {
                this.g.set(v, s);
            }
            return s;
        }
        String s1 = y.j(((byte[])object0));
        if(y.g(((byte[])object0))) {
            this.g.set(v, s1);
        }
        return s1;
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.y$b
    public b g(int v) {
        return this.h(v);
    }

    @Override
    public Object get(int v) {
        return this.e(v);
    }

    public C h(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.g);
        return new C(arrayList0);
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public int hashCode() {
        return super.hashCode();
    }

    public String i(int v) {
        this.a();
        Object object0 = this.g.remove(v);
        ++this.modCount;
        return C.d(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public void j(g g0) {
        this.a();
        this.g.add(g0);
        ++this.modCount;
    }

    public String k(int v, String s) {
        this.a();
        return C.d(this.g.set(v, s));
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public List r() {
        return Collections.unmodifiableList(this.g);
    }

    @Override
    public Object remove(int v) {
        return this.i(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override
    public Object set(int v, Object object0) {
        return this.k(v, ((String)object0));
    }

    @Override
    public int size() {
        return this.g.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public D w() {
        return this.J() ? new o0(this) : this;
    }
}

