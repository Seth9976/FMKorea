package F3;

import java.util.Iterator;
import y3.l;
import z3.k;

public final class o implements e {
    private final e a;
    private final l b;

    public o(e e0, l l0) {
        k.e(e0, "sequence");
        k.e(l0, "transformer");
        super();
        this.a = e0;
        this.b = l0;
    }

    public final e c(l l0) {
        k.e(l0, "iterator");
        return new d(this.a, this.b, l0);
    }

    @Override  // F3.e
    public Iterator iterator() {
        public static final class a implements Iterator {
            private final Iterator f;
            final o g;

            a(o o0) {
                this.g = o0;
                super();
                this.f = o0.a.iterator();
            }

            @Override
            public boolean hasNext() {
                return this.f.hasNext();
            }

            @Override
            public Object next() {
                l l0 = this.g.b;
                Object object0 = this.f.next();
                return l0.h(object0);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

