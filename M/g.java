package M;

import J.f;
import l3.o;
import l3.u;
import q3.b;
import r3.k;
import y3.p;

public abstract class g {
    public static final Object a(f f0, p p0, p3.f f1) {
        static final class a extends k implements p {
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
                Object object1 = b.c();
                switch(this.j) {
                    case 0: {
                        o.b(object0);
                        M.a a0 = ((d)this.k).c();
                        this.k = a0;
                        this.j = 1;
                        return this.l.k(a0, this) == object1 ? object1 : a0;
                    }
                    case 1: {
                        M.a a1 = (M.a)this.k;
                        o.b(object0);
                        return a1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            public final Object w(d d0, p3.f f0) {
                return ((a)this.q(d0, f0)).t(u.a);
            }
        }

        return f0.a(new a(p0, null), f1);
    }
}

