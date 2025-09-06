package l1;

final class i extends o {
    static abstract class a {
    }

    static final class b extends l1.o.a {
        private c a;
        private l1.o.b b;

        @Override  // l1.o$a
        public o a() {
            return new i(this.a, this.b, null);
        }

        @Override  // l1.o$a
        public l1.o.a b(l1.o.b o$b0) {
            this.b = o$b0;
            return this;
        }

        @Override  // l1.o$a
        public l1.o.a c(c o$c0) {
            this.a = o$c0;
            return this;
        }
    }

    private final c a;
    private final l1.o.b b;

    private i(c o$c0, l1.o.b o$b0) {
        this.a = o$c0;
        this.b = o$b0;
    }

    i(c o$c0, l1.o.b o$b0, a i$a0) {
        this(o$c0, o$b0);
    }

    @Override  // l1.o
    public l1.o.b b() {
        return this.b;
    }

    @Override  // l1.o
    public c c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof o) {
            c o$c0 = this.a;
            if(o$c0 == null) {
                if(((o)object0).c() == null) {
                    return this.b == null ? ((o)object0).b() == null : this.b.equals(((o)object0).b());
                }
            }
            else if(o$c0.equals(((o)object0).c())) {
                return this.b == null ? ((o)object0).b() == null : this.b.equals(((o)object0).b());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        l1.o.b o$b0 = this.b;
        if(o$b0 != null) {
            v = o$b0.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}

