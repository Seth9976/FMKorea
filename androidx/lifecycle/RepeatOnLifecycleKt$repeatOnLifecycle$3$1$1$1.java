package androidx.lifecycle;

import I3.I;
import I3.J;
import I3.i;
import I3.q0;
import l3.o;
import p3.f;
import q3.b;
import r3.k;
import y3.p;
import z3.u;

final class RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1 implements l {
    final a f;
    final u g;
    final I h;
    final a i;
    final I3.l j;
    final R3.a k;
    final p l;

    @Override  // androidx.lifecycle.l
    public final void c(n n0, a h$a0) {
        static final class androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a extends k implements p {
            Object j;
            Object k;
            int l;
            final R3.a m;
            final p n;

            androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a(R3.a a0, p p0, f f0) {
                this.m = a0;
                this.n = p0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((I)object0), ((f)object1));
            }

            @Override  // r3.a
            public final f q(Object object0, f f0) {
                return new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a(this.m, this.n, f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                static final class androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a.a extends k implements p {
                    int j;
                    private Object k;
                    final p l;

                    androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a.a(p p0, f f0) {
                        this.l = p0;
                        super(2, f0);
                    }

                    @Override  // y3.p
                    public Object k(Object object0, Object object1) {
                        return this.w(((I)object0), ((f)object1));
                    }

                    @Override  // r3.a
                    public final f q(Object object0, f f0) {
                        f f1 = new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a.a(this.l, f0);
                        f1.k = object0;
                        return f1;
                    }

                    @Override  // r3.a
                    public final Object t(Object object0) {
                        Object object1 = b.c();
                        switch(this.j) {
                            case 0: {
                                o.b(object0);
                                this.j = 1;
                                return this.l.k(((I)this.k), this) == object1 ? object1 : l3.u.a;
                            }
                            case 1: {
                                o.b(object0);
                                return l3.u.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }

                    public final Object w(I i0, f f0) {
                        return ((androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a.a)this.q(i0, f0)).t(l3.u.a);
                    }
                }

                Throwable throwable1;
                R3.a a2;
                p p0;
                R3.a a0;
                Object object1 = b.c();
                switch(this.l) {
                    case 0: {
                        o.b(object0);
                        a0 = this.m;
                        p0 = this.n;
                        this.j = a0;
                        this.k = p0;
                        this.l = 1;
                        if(a0.c(null, this) == object1) {
                            return object1;
                        }
                        goto label_15;
                    }
                    case 1: {
                        p0 = (p)this.k;
                        R3.a a1 = (R3.a)this.j;
                        o.b(object0);
                        a0 = a1;
                        try {
                        label_15:
                            androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a.a repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a0 = new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a.a(p0, null);
                            this.j = a0;
                            this.k = null;
                            this.l = 2;
                            if(J.b(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a0, this) == object1) {
                                return object1;
                            }
                        }
                        catch(Throwable throwable0) {
                            a2 = a0;
                            throwable1 = throwable0;
                            a2.b(null);
                            throw throwable1;
                        }
                        a2 = a0;
                        break;
                    }
                    case 2: {
                        a2 = (R3.a)this.j;
                        try {
                            o.b(object0);
                            break;
                        }
                        catch(Throwable throwable1) {
                        }
                        a2.b(null);
                        throw throwable1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                a2.b(null);
                return l3.u.a;
            }

            public final Object w(I i0, f f0) {
                return ((androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a)this.q(i0, f0)).t(l3.u.a);
            }
        }

        z3.k.e(n0, "<anonymous parameter 0>");
        z3.k.e(h$a0, "event");
        if(h$a0 == this.f) {
            androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a0 = new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.a(this.k, this.l, null);
            this.g.f = i.d(this.h, null, null, repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a0, 3, null);
            return;
        }
        if(h$a0 == this.i) {
            q0 q00 = (q0)this.g.f;
            if(q00 != null) {
                I3.q0.a.a(q00, null, 1, null);
            }
            this.g.f = null;
        }
        if(h$a0 == a.ON_DESTROY) {
            this.j.e(l3.u.a);
        }
    }
}

