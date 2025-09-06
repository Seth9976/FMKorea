package l2;

final class q extends d {
    static abstract class a {
    }

    static final class b extends l2.B.e.d.a.b.d.a {
        private String a;
        private String b;
        private Long c;

        @Override  // l2.B$e$d$a$b$d$a
        public d a() {
            String s = this.a == null ? " name" : "";
            if(this.b == null) {
                s = s + " code";
            }
            if(this.c == null) {
                s = s + " address";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new q(this.a, this.b, ((long)this.c), null);
        }

        @Override  // l2.B$e$d$a$b$d$a
        public l2.B.e.d.a.b.d.a b(long v) {
            this.c = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$d$a
        public l2.B.e.d.a.b.d.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null code");
            }
            this.b = s;
            return this;
        }

        @Override  // l2.B$e$d$a$b$d$a
        public l2.B.e.d.a.b.d.a d(String s) {
            if(s == null) {
                throw new NullPointerException("Null name");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final long c;

    private q(String s, String s1, long v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    q(String s, String s1, long v, a q$a0) {
        this(s, s1, v);
    }

    @Override  // l2.B$e$d$a$b$d
    public long b() {
        return this.c;
    }

    @Override  // l2.B$e$d$a$b$d
    public String c() {
        return this.b;
    }

    @Override  // l2.B$e$d$a$b$d
    public String d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = ((d)object0).d();
            if(this.a.equals(s)) {
                String s1 = ((d)object0).c();
                if(this.b.equals(s1)) {
                    long v = ((d)object0).b();
                    return this.c == v;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }
}

