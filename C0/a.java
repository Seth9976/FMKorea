package c0;

import I3.I;
import I3.J;
import I3.W;
import I3.i;
import Z1.d;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import e0.n;
import l3.o;
import l3.u;
import p3.f;
import y3.p;
import z3.g;
import z3.k;

public abstract class a {
    static final class c0.a.a extends a {
        private final n b;

        public c0.a.a(n n0) {
            k.e(n0, "mMeasurementManager");
            super();
            this.b = n0;
        }

        @Override  // c0.a
        public d b() {
            static final class b extends r3.k implements p {
                int j;
                final c0.a.a k;

                b(c0.a.a a$a0, f f0) {
                    this.k = a$a0;
                    super(2, f0);
                }

                @Override  // y3.p
                public Object k(Object object0, Object object1) {
                    return this.w(((I)object0), ((f)object1));
                }

                @Override  // r3.a
                public final f q(Object object0, f f0) {
                    return new b(this.k, f0);
                }

                @Override  // r3.a
                public final Object t(Object object0) {
                    Object object1 = q3.b.c();
                    switch(this.j) {
                        case 0: {
                            o.b(object0);
                            this.j = 1;
                            object0 = this.k.b.b(this);
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

                public final Object w(I i0, f f0) {
                    return ((b)this.q(i0, f0)).t(u.a);
                }
            }

            return b0.b.c(i.b(J.a(W.a()), null, null, new b(this, null), 3, null), null, 1, null);
        }

        @Override  // c0.a
        public d c(Uri uri0, InputEvent inputEvent0) {
            static final class c extends r3.k implements p {
                int j;
                final c0.a.a k;
                final Uri l;
                final InputEvent m;

                c(c0.a.a a$a0, Uri uri0, InputEvent inputEvent0, f f0) {
                    this.k = a$a0;
                    this.l = uri0;
                    this.m = inputEvent0;
                    super(2, f0);
                }

                @Override  // y3.p
                public Object k(Object object0, Object object1) {
                    return this.w(((I)object0), ((f)object1));
                }

                @Override  // r3.a
                public final f q(Object object0, f f0) {
                    return new c(this.k, this.l, this.m, f0);
                }

                @Override  // r3.a
                public final Object t(Object object0) {
                    Object object1 = q3.b.c();
                    switch(this.j) {
                        case 0: {
                            o.b(object0);
                            this.j = 1;
                            return this.k.b.c(this.l, this.m, this) == object1 ? object1 : u.a;
                        }
                        case 1: {
                            o.b(object0);
                            return u.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }

                public final Object w(I i0, f f0) {
                    return ((c)this.q(i0, f0)).t(u.a);
                }
            }

            k.e(uri0, "attributionSource");
            return b0.b.c(i.b(J.a(W.a()), null, null, new c(this, uri0, inputEvent0, null), 3, null), null, 1, null);
        }

        @Override  // c0.a
        public d d(Uri uri0) {
            static final class c0.a.a.d extends r3.k implements p {
                int j;
                final c0.a.a k;
                final Uri l;

                c0.a.a.d(c0.a.a a$a0, Uri uri0, f f0) {
                    this.k = a$a0;
                    this.l = uri0;
                    super(2, f0);
                }

                @Override  // y3.p
                public Object k(Object object0, Object object1) {
                    return this.w(((I)object0), ((f)object1));
                }

                @Override  // r3.a
                public final f q(Object object0, f f0) {
                    return new c0.a.a.d(this.k, this.l, f0);
                }

                @Override  // r3.a
                public final Object t(Object object0) {
                    Object object1 = q3.b.c();
                    switch(this.j) {
                        case 0: {
                            o.b(object0);
                            this.j = 1;
                            return this.k.b.d(this.l, this) == object1 ? object1 : u.a;
                        }
                        case 1: {
                            o.b(object0);
                            return u.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }

                public final Object w(I i0, f f0) {
                    return ((c0.a.a.d)this.q(i0, f0)).t(u.a);
                }
            }

            k.e(uri0, "trigger");
            return b0.b.c(i.b(J.a(W.a()), null, null, new c0.a.a.d(this, uri0, null), 3, null), null, 1, null);
        }

        public d f(e0.a a0) {
            static final class c0.a.a.a extends r3.k implements p {
                int j;
                final c0.a.a k;

                c0.a.a.a(c0.a.a a$a0, e0.a a0, f f0) {
                    this.k = a$a0;
                    super(2, f0);
                }

                @Override  // y3.p
                public Object k(Object object0, Object object1) {
                    return this.w(((I)object0), ((f)object1));
                }

                @Override  // r3.a
                public final f q(Object object0, f f0) {
                    return new c0.a.a.a(this.k, null, f0);
                }

                @Override  // r3.a
                public final Object t(Object object0) {
                    Object object1 = q3.b.c();
                    switch(this.j) {
                        case 0: {
                            o.b(object0);
                            this.j = 1;
                            return this.k.b.a(null, this) == object1 ? object1 : u.a;
                        }
                        case 1: {
                            o.b(object0);
                            return u.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }

                public final Object w(I i0, f f0) {
                    return ((c0.a.a.a)this.q(i0, f0)).t(u.a);
                }
            }

            k.e(a0, "deletionRequest");
            return b0.b.c(i.b(J.a(W.a()), null, null, new c0.a.a.a(this, a0, null), 3, null), null, 1, null);
        }

        public d g(e0.o o0) {
            static final class e extends r3.k implements p {
                int j;
                final c0.a.a k;

                e(c0.a.a a$a0, e0.o o0, f f0) {
                    this.k = a$a0;
                    super(2, f0);
                }

                @Override  // y3.p
                public Object k(Object object0, Object object1) {
                    return this.w(((I)object0), ((f)object1));
                }

                @Override  // r3.a
                public final f q(Object object0, f f0) {
                    return new e(this.k, null, f0);
                }

                @Override  // r3.a
                public final Object t(Object object0) {
                    Object object1 = q3.b.c();
                    switch(this.j) {
                        case 0: {
                            o.b(object0);
                            this.j = 1;
                            return this.k.b.e(null, this) == object1 ? object1 : u.a;
                        }
                        case 1: {
                            o.b(object0);
                            return u.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }

                public final Object w(I i0, f f0) {
                    return ((e)this.q(i0, f0)).t(u.a);
                }
            }

            k.e(o0, "request");
            return b0.b.c(i.b(J.a(W.a()), null, null, new e(this, o0, null), 3, null), null, 1, null);
        }

        public d h(e0.p p0) {
            static final class c0.a.a.f extends r3.k implements p {
                int j;
                final c0.a.a k;

                c0.a.a.f(c0.a.a a$a0, e0.p p0, f f0) {
                    this.k = a$a0;
                    super(2, f0);
                }

                @Override  // y3.p
                public Object k(Object object0, Object object1) {
                    return this.w(((I)object0), ((f)object1));
                }

                @Override  // r3.a
                public final f q(Object object0, f f0) {
                    return new c0.a.a.f(this.k, null, f0);
                }

                @Override  // r3.a
                public final Object t(Object object0) {
                    Object object1 = q3.b.c();
                    switch(this.j) {
                        case 0: {
                            o.b(object0);
                            this.j = 1;
                            return this.k.b.f(null, this) == object1 ? object1 : u.a;
                        }
                        case 1: {
                            o.b(object0);
                            return u.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }

                public final Object w(I i0, f f0) {
                    return ((c0.a.a.f)this.q(i0, f0)).t(u.a);
                }
            }

            k.e(p0, "request");
            return b0.b.c(i.b(J.a(W.a()), null, null, new c0.a.a.f(this, p0, null), 3, null), null, 1, null);
        }
    }

    public static final class c0.a.b {
        private c0.a.b() {
        }

        public c0.a.b(g g0) {
        }

        public final a a(Context context0) {
            k.e(context0, "context");
            n n0 = n.a.a(context0);
            return n0 != null ? new c0.a.a(n0) : null;
        }
    }

    public static final c0.a.b a;

    static {
        a.a = new c0.a.b(null);
    }

    public static final a a(Context context0) {
        return a.a.a(context0);
    }

    public abstract d b();

    public abstract d c(Uri arg1, InputEvent arg2);

    public abstract d d(Uri arg1);
}

