package l1;

final class e extends k {
    static abstract class a {
    }

    static final class b extends l1.k.a {
        private l1.k.b a;
        private l1.a b;

        @Override  // l1.k$a
        public k a() {
            return new e(this.a, this.b, null);
        }

        @Override  // l1.k$a
        public l1.k.a b(l1.a a0) {
            this.b = a0;
            return this;
        }

        @Override  // l1.k$a
        public l1.k.a c(l1.k.b k$b0) {
            this.a = k$b0;
            return this;
        }
    }

    private final l1.k.b a;
    private final l1.a b;

    private e(l1.k.b k$b0, l1.a a0) {
        this.a = k$b0;
        this.b = a0;
    }

    e(l1.k.b k$b0, l1.a a0, a e$a0) {
        this(k$b0, a0);
    }

    @Override  // l1.k
    public l1.a b() {
        return this.b;
    }

    @Override  // l1.k
    public l1.k.b c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof k) {
            l1.k.b k$b0 = this.a;
            if(k$b0 == null) {
                if(((k)object0).c() == null) {
                    return this.b == null ? ((k)object0).b() == null : this.b.equals(((k)object0).b());
                }
            }
            else if(k$b0.equals(((k)object0).c())) {
                return this.b == null ? ((k)object0).b() == null : this.b.equals(((k)object0).b());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        l1.a a0 = this.b;
        if(a0 != null) {
            v = a0.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}

