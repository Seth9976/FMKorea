package q3;

import l3.o;
import p3.f;
import r3.d;
import r3.h;
import r3.j;
import y3.p;
import z3.k;
import z3.y;

abstract class c {
    public static f a(p p0, Object object0, f f0) {
        public static final class a extends j {
            private int g;
            final p h;
            final Object i;

            public a(f f0, p p0, Object object0) {
                this.h = p0;
                this.i = object0;
                k.c(f0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(f0);
            }

            @Override  // r3.a
            protected Object t(Object object0) {
                switch(this.g) {
                    case 0: {
                        this.g = 1;
                        o.b(object0);
                        k.c(this.h, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                        return ((p)y.a(this.h, 2)).k(this.i, this);
                    }
                    case 1: {
                        this.g = 2;
                        o.b(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }


        public static final class b extends d {
            private int i;
            final p j;
            final Object k;

            public b(f f0, p3.j j0, p p0, Object object0) {
                this.j = p0;
                this.k = object0;
                k.c(f0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(f0, j0);
            }

            @Override  // r3.a
            protected Object t(Object object0) {
                switch(this.i) {
                    case 0: {
                        this.i = 1;
                        o.b(object0);
                        k.c(this.j, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                        return ((p)y.a(this.j, 2)).k(this.k, this);
                    }
                    case 1: {
                        this.i = 2;
                        o.b(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }

        k.e(p0, "<this>");
        k.e(f0, "completion");
        f f1 = h.a(f0);
        if(p0 instanceof r3.a) {
            return ((r3.a)p0).q(object0, f1);
        }
        p3.j j0 = f1.getContext();
        return j0 == p3.k.f ? new a(f1, p0, object0) : new b(f1, j0, p0, object0);
    }

    public static f b(f f0) {
        k.e(f0, "<this>");
        d d0 = f0 instanceof d ? ((d)f0) : null;
        if(d0 != null) {
            f f1 = d0.v();
            return f1 == null ? f0 : f1;
        }
        return f0;
    }
}

