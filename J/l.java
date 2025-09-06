package J;

import I3.I;
import I3.J;
import I3.i;
import I3.q0;
import K3.d;
import K3.e;
import K3.f;
import K3.j;
import java.util.concurrent.atomic.AtomicInteger;
import l3.o;
import l3.u;
import y3.p;
import z3.k;

public final class l {
    private final I a;
    private final p b;
    private final d c;
    private final AtomicInteger d;

    public l(I i0, y3.l l0, p p0, p p1) {
        static final class a extends z3.l implements y3.l {
            final y3.l g;
            final l h;
            final p i;

            a(y3.l l0, l l1, p p0) {
                this.g = l0;
                this.h = l1;
                this.i = p0;
                super(1);
            }

            public final void b(Throwable throwable0) {
                u u0;
                this.g.h(throwable0);
                this.h.c.c(throwable0);
                do {
                    Object object0 = f.d(this.h.c.b());
                    if(object0 == null) {
                        u0 = null;
                    }
                    else {
                        this.i.k(object0, throwable0);
                        u0 = u.a;
                    }
                }
                while(u0 != null);
            }

            @Override  // y3.l
            public Object h(Object object0) {
                this.b(((Throwable)object0));
                return u.a;
            }
        }

        k.e(i0, "scope");
        k.e(l0, "onComplete");
        k.e(p0, "onUndeliveredElement");
        k.e(p1, "consumeMessage");
        super();
        this.a = i0;
        this.b = p1;
        this.c = e.b(0x7FFFFFFF, null, null, 6, null);
        this.d = new AtomicInteger(0);
        q0 q00 = (q0)i0.h().a(q0.b);
        if(q00 != null) {
            q00.f(new a(l0, this, p0));
        }
    }

    public final void e(Object object0) {
        static final class b extends r3.k implements p {
            Object j;
            int k;
            final l l;

            b(l l0, p3.f f0) {
                this.l = l0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((I)object0), ((p3.f)object1));
            }

            @Override  // r3.a
            public final p3.f q(Object object0, p3.f f0) {
                return new b(this.l, f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                p p0;
                Object object1 = q3.b.c();
                switch(this.k) {
                    case 0: {
                        o.b(object0);
                        if(this.l.d.get() <= 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        goto label_12;
                    }
                    case 1: {
                        p0 = (p)this.j;
                        o.b(object0);
                        goto label_19;
                    }
                    case 2: {
                        o.b(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    if(this.l.d.decrementAndGet() == 0) {
                        return u.a;
                    }
                label_12:
                    J.c(this.l.a);
                    p0 = this.l.b;
                    this.j = p0;
                    this.k = 1;
                    object0 = this.l.c.a(this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_19:
                    this.j = null;
                    this.k = 2;
                }
                while(p0.k(object0, this) != object1);
                return object1;
            }

            public final Object w(I i0, p3.f f0) {
                return ((b)this.q(i0, f0)).t(u.a);
            }
        }

        Object object1 = this.c.d(object0);
        if(object1 instanceof K3.f.a) {
            Throwable throwable0 = f.c(object1);
            if(throwable0 == null) {
                throwable0 = new j("Channel was closed normally");
            }
            throw throwable0;
        }
        if(!f.f(object1)) {
            throw new IllegalStateException("Check failed.");
        }
        if(this.d.getAndIncrement() == 0) {
            b l$b0 = new b(this, null);
            i.d(this.a, null, null, l$b0, 3, null);
        }
    }
}

