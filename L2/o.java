package l2;

final class o extends a {
    static abstract class l2.o.a {
    }

    static final class b extends l2.B.e.d.a.b.a.a {
        private Long a;
        private Long b;
        private String c;
        private String d;

        @Override  // l2.B$e$d$a$b$a$a
        public a a() {
            String s = this.a == null ? " baseAddress" : "";
            if(this.b == null) {
                s = s + " size";
            }
            if(this.c == null) {
                s = s + " name";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new o(((long)this.a), ((long)this.b), this.c, this.d, null);
        }

        @Override  // l2.B$e$d$a$b$a$a
        public l2.B.e.d.a.b.a.a b(long v) {
            this.a = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$a$a
        public l2.B.e.d.a.b.a.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null name");
            }
            this.c = s;
            return this;
        }

        @Override  // l2.B$e$d$a$b$a$a
        public l2.B.e.d.a.b.a.a d(long v) {
            this.b = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$a$a
        public l2.B.e.d.a.b.a.a e(String s) {
            this.d = s;
            return this;
        }
    }

    private final long a;
    private final long b;
    private final String c;
    private final String d;

    private o(long v, long v1, String s, String s1) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
    }

    o(long v, long v1, String s, String s1, l2.o.a o$a0) {
        this(v, v1, s, s1);
    }

    @Override  // l2.B$e$d$a$b$a
    public long b() {
        return this.a;
    }

    @Override  // l2.B$e$d$a$b$a
    public String c() {
        return this.c;
    }

    @Override  // l2.B$e$d$a$b$a
    public long d() {
        return this.b;
    }

    @Override  // l2.B$e$d$a$b$a
    public String e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            long v = ((a)object0).b();
            if(this.a == v) {
                long v1 = ((a)object0).d();
                if(this.b == v1) {
                    String s = ((a)object0).c();
                    if(this.c.equals(s)) {
                        return this.d == null ? ((a)object0).e() == null : this.d.equals(((a)object0).e());
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = (((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ this.c.hashCode()) * 1000003;
        return this.d == null ? v : v ^ this.d.hashCode();
    }

    @Override
    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }
}

