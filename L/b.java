package l;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class b implements Iterable {
    static class a extends e {
        a(c b$c0, c b$c1) {
            super(b$c0, b$c1);
        }

        @Override  // l.b$e
        c c(c b$c0) {
            return b$c0.i;
        }

        @Override  // l.b$e
        c d(c b$c0) {
            return b$c0.h;
        }
    }

    static class l.b.b extends e {
        l.b.b(c b$c0, c b$c1) {
            super(b$c0, b$c1);
        }

        @Override  // l.b$e
        c c(c b$c0) {
            return b$c0.h;
        }

        @Override  // l.b$e
        c d(c b$c0) {
            return b$c0.i;
        }
    }

    static class c implements Map.Entry {
        final Object f;
        final Object g;
        c h;
        c i;

        c(Object object0, Object object1) {
            this.f = object0;
            this.g = object1;
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            return object0 instanceof c ? this.f.equals(((c)object0).f) && this.g.equals(((c)object0).g) : false;
        }

        @Override
        public Object getKey() {
            return this.f;
        }

        @Override
        public Object getValue() {
            return this.g;
        }

        @Override
        public int hashCode() {
            return this.f.hashCode() ^ this.g.hashCode();
        }

        @Override
        public Object setValue(Object object0) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        @Override
        public String toString() {
            return this.f + "=" + this.g;
        }
    }

    public class d extends f implements Iterator {
        private c f;
        private boolean g;
        final b h;

        d() {
            this.g = true;
        }

        @Override  // l.b$f
        void a(c b$c0) {
            c b$c1 = this.f;
            if(b$c0 == b$c1) {
                this.f = b$c1.i;
                this.g = b$c1.i == null;
            }
        }

        public Map.Entry c() {
            if(this.g) {
                this.g = false;
                this.f = b.this.f;
                return this.f;
            }
            this.f = this.f == null ? null : this.f.h;
            return this.f;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean hasNext() {
            return this.g ? b.this.f != null : this.f != null && this.f.h != null;
        }

        @Override
        public Object next() {
            return this.c();
        }
    }

    static abstract class e extends f implements Iterator {
        c f;
        c g;

        e(c b$c0, c b$c1) {
            this.f = b$c1;
            this.g = b$c0;
        }

        @Override  // l.b$f
        public void a(c b$c0) {
            if(this.f == b$c0 && b$c0 == this.g) {
                this.g = null;
                this.f = null;
            }
            c b$c1 = this.f;
            if(b$c1 == b$c0) {
                this.f = this.c(b$c1);
            }
            if(this.g == b$c0) {
                this.g = this.f();
            }
        }

        abstract c c(c arg1);

        abstract c d(c arg1);

        public Map.Entry e() {
            Map.Entry map$Entry0 = this.g;
            this.g = this.f();
            return map$Entry0;
        }

        private c f() {
            return this.g == this.f || this.f == null ? null : this.d(this.g);
        }

        @Override
        public boolean hasNext() {
            return this.g != null;
        }

        @Override
        public Object next() {
            return this.e();
        }
    }

    public static abstract class f {
        abstract void a(c arg1);
    }

    c f;
    private c g;
    private final WeakHashMap h;
    private int i;

    public b() {
        this.h = new WeakHashMap();
        this.i = 0;
    }

    public Map.Entry a() {
        return this.f;
    }

    protected c c(Object object0) {
        c b$c0;
        for(b$c0 = this.f; b$c0 != null && !b$c0.f.equals(object0); b$c0 = b$c0.h) {
        }
        return b$c0;
    }

    public d d() {
        d b$d0 = new d(this);
        this.h.put(b$d0, Boolean.FALSE);
        return b$d0;
    }

    public Iterator descendingIterator() {
        Iterator iterator0 = new l.b.b(this.g, this.f);
        this.h.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    public Map.Entry e() {
        return this.g;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(this.size() != ((b)object0).size()) {
            return false;
        }
        Iterator iterator0 = this.iterator();
        Iterator iterator1 = ((b)object0).iterator();
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = iterator1.next();
            if(map$Entry0 == null && object2 != null || map$Entry0 != null && !map$Entry0.equals(object2)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return !iterator0.hasNext() && !iterator1.hasNext();
    }

    c h(Object object0, Object object1) {
        c b$c0 = new c(object0, object1);
        ++this.i;
        c b$c1 = this.g;
        if(b$c1 == null) {
            this.f = b$c0;
            this.g = b$c0;
            return b$c0;
        }
        b$c1.h = b$c0;
        b$c0.i = b$c1;
        this.g = b$c0;
        return b$c0;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += ((Map.Entry)object0).hashCode();
        }
        return v;
    }

    public Object i(Object object0, Object object1) {
        c b$c0 = this.c(object0);
        if(b$c0 != null) {
            return b$c0.g;
        }
        this.h(object0, object1);
        return null;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new a(this.f, this.g);
        this.h.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    public Object k(Object object0) {
        c b$c0 = this.c(object0);
        if(b$c0 == null) {
            return null;
        }
        --this.i;
        if(!this.h.isEmpty()) {
            for(Object object1: this.h.keySet()) {
                ((f)object1).a(b$c0);
            }
        }
        c b$c1 = b$c0.i;
        if(b$c1 == null) {
            this.f = b$c0.h;
        }
        else {
            b$c1.h = b$c0.h;
        }
        c b$c2 = b$c0.h;
        if(b$c2 == null) {
            this.g = b$c1;
        }
        else {
            b$c2.i = b$c1;
        }
        b$c0.h = null;
        b$c0.i = null;
        return b$c0.g;
    }

    public int size() {
        return this.i;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((Map.Entry)object0).toString());
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

