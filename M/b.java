package M;

import J.f;
import l3.o;
import l3.u;
import y3.p;
import z3.k;

public final class b implements f {
    private final f a;

    public b(f f0) {
        k.e(f0, "delegate");
        super();
        this.a = f0;
    }

    @Override  // J.f
    public Object a(p p0, p3.f f0) {
        static final class a extends r3.k implements p {
            int j;
            Object k;
            final p l;

            a(p p0, p3.f f0) {
                this.l = p0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((d)object0), ((p3.f)object1));
            }

            @Override  // r3.a
            public final p3.f q(Object object0, p3.f f0) {
                p3.f f1 = new a(this.l, f0);
                f1.k = object0;
                return f1;
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                Object object1 = q3.b.c();
                switch(this.j) {
                    case 0: {
                        o.b(object0);
                        this.j = 1;
                        object0 = this.l.k(((d)this.k), this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        o.b(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                ((M.a)(((d)object0))).f();
                return (d)object0;
            }

            public final Object w(d d0, p3.f f0) {
                return ((a)this.q(d0, f0)).t(u.a);
            }
        }

        a b$a0 = new a(p0, null);
        return this.a.a(b$a0, f0);
    }

    @Override  // J.f
    public L3.b getData() {
        return this.a.getData();
    }
}

