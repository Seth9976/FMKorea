package d0;

import I3.I;
import I3.J;
import I3.W;
import I3.i;
import Z1.d;
import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.b;
import androidx.privacysandbox.ads.adservices.topics.f;
import l3.o;
import l3.u;
import y3.p;
import z3.g;
import z3.k;

public abstract class a {
    static final class d0.a.a extends a {
        private final f b;

        public d0.a.a(f f0) {
            k.e(f0, "mTopicsManager");
            super();
            this.b = f0;
        }

        @Override  // d0.a
        public d b(b b0) {
            static final class d0.a.a.a extends r3.k implements p {
                int j;
                final d0.a.a k;
                final b l;

                d0.a.a.a(d0.a.a a$a0, b b0, p3.f f0) {
                    this.k = a$a0;
                    this.l = b0;
                    super(2, f0);
                }

                @Override  // y3.p
                public Object k(Object object0, Object object1) {
                    return this.w(((I)object0), ((p3.f)object1));
                }

                @Override  // r3.a
                public final p3.f q(Object object0, p3.f f0) {
                    return new d0.a.a.a(this.k, this.l, f0);
                }

                @Override  // r3.a
                public final Object t(Object object0) {
                    Object object1 = q3.b.c();
                    switch(this.j) {
                        case 0: {
                            o.b(object0);
                            this.j = 1;
                            object0 = this.k.b.a(this.l, this);
                            return object0 == object1 ? object1 : object0;
                        }
                        case 1: {
                            o.b(object0);
                            return object0;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }

                public final Object w(I i0, p3.f f0) {
                    return ((d0.a.a.a)this.q(i0, f0)).t(u.a);
                }
            }

            k.e(b0, "request");
            return b0.b.c(i.b(J.a(W.c()), null, null, new d0.a.a.a(this, b0, null), 3, null), null, 1, null);
        }
    }

    public static final class d0.a.b {
        private d0.a.b() {
        }

        public d0.a.b(g g0) {
        }

        public final a a(Context context0) {
            k.e(context0, "context");
            f f0 = f.a.a(context0);
            return f0 != null ? new d0.a.a(f0) : null;
        }
    }

    public static final d0.a.b a;

    static {
        a.a = new d0.a.b(null);
    }

    public static final a a(Context context0) {
        return a.a.a(context0);
    }

    public abstract d b(b arg1);
}

