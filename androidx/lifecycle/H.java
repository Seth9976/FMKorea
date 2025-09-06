package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import z3.g;
import z3.k;

public abstract class h {
    public static enum a {
        public static final class androidx.lifecycle.h.a.a {
            public abstract class androidx.lifecycle.h.a.a.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[b.values().length];
                    try {
                        arr_v[b.h.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[b.i.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[b.j.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[b.f.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[b.g.ordinal()] = 5;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    androidx.lifecycle.h.a.a.a.a = arr_v;
                }
            }

            private androidx.lifecycle.h.a.a() {
            }

            public androidx.lifecycle.h.a.a(g g0) {
            }

            public final a a(b h$b0) {
                k.e(h$b0, "state");
                switch(h$b0) {
                    case 1: {
                        return a.ON_DESTROY;
                    }
                    case 2: {
                        return a.ON_STOP;
                    }
                    case 3: {
                        return a.ON_PAUSE;
                    }
                    default: {
                        return null;
                    }
                }
            }

            public final a b(b h$b0) {
                k.e(h$b0, "state");
                switch(h$b0) {
                    case 1: {
                        return a.ON_START;
                    }
                    case 2: {
                        return a.ON_RESUME;
                    }
                    case 5: {
                        return a.ON_CREATE;
                    }
                    default: {
                        return null;
                    }
                }
            }

            public final a c(b h$b0) {
                k.e(h$b0, "state");
                switch(h$b0) {
                    case 1: {
                        return a.ON_CREATE;
                    }
                    case 2: {
                        return a.ON_START;
                    }
                    case 3: {
                        return a.ON_RESUME;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public abstract class androidx.lifecycle.h.a.b {
            public static final int[] a;

            static {
                int[] arr_v = new int[a.values().length];
                try {
                    arr_v[a.ON_CREATE.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.ON_STOP.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.ON_START.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.ON_PAUSE.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.ON_RESUME.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.ON_DESTROY.ordinal()] = 6;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.ON_ANY.ordinal()] = 7;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                androidx.lifecycle.h.a.b.a = arr_v;
            }
        }

        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final androidx.lifecycle.h.a.a Companion;

        static {
            a.Companion = new androidx.lifecycle.h.a.a(null);
        }

        private static final a[] b() [...] // Inlined contents

        public final b f() {
            switch(this) {
                case 1: 
                case 2: {
                    return b.h;
                }
                case 3: 
                case 4: {
                    return b.i;
                }
                case 5: {
                    return b.j;
                }
                case 6: {
                    return b.f;
                }
                default: {
                    throw new IllegalArgumentException(this + " has no target state");
                }
            }
        }
    }

    public static enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        private static final b[] b() [...] // Inlined contents

        public final boolean f(b h$b0) {
            k.e(h$b0, "state");
            return this.compareTo(h$b0) >= 0;
        }
    }

    private AtomicReference a;

    public h() {
        this.a = new AtomicReference();
    }

    public abstract void a(m arg1);

    public abstract b b();

    public abstract void c(m arg1);
}

