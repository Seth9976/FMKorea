package androidx.work;

import z3.g;
import z3.k;

public final class m extends v {
    public static final class a extends androidx.work.v.a {
        public a(Class class0) {
            k.e(class0, "workerClass");
            super(class0);
            this.h().d = "androidx.work.OverwritingInputMerger";
        }

        @Override  // androidx.work.v$a
        public v c() {
            return this.m();
        }

        @Override  // androidx.work.v$a
        public androidx.work.v.a g() {
            return this;
        }

        public m m() {
            if(this.d() && this.h().j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new m(this);
        }

        public a n() [...] // Inlined contents
    }

    public static final class b {
        private b() {
        }

        public b(g g0) {
        }

        public final m a(Class class0) {
            k.e(class0, "workerClass");
            return (m)new a(class0).b();
        }
    }

    public static final b e;

    static {
        m.e = new b(null);
    }

    public m(a m$a0) {
        k.e(m$a0, "builder");
        super(m$a0.e(), m$a0.h(), m$a0.f());
    }

    public static final m e(Class class0) {
        return m.e.a(class0);
    }
}

