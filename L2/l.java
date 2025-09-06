package l2;

final class l extends d {
    static abstract class a {
    }

    static final class b extends l2.B.e.d.b {
        private Long a;
        private String b;
        private l2.B.e.d.a c;
        private c d;
        private l2.B.e.d.d e;

        b() {
        }

        private b(d b$e$d0) {
            this.a = b$e$d0.e();
            this.b = b$e$d0.f();
            this.c = b$e$d0.b();
            this.d = b$e$d0.c();
            this.e = b$e$d0.d();
        }

        b(d b$e$d0, a l$a0) {
            this(b$e$d0);
        }

        @Override  // l2.B$e$d$b
        public d a() {
            String s = this.a == null ? " timestamp" : "";
            if(this.b == null) {
                s = s + " type";
            }
            if(this.c == null) {
                s = s + " app";
            }
            if(this.d == null) {
                s = s + " device";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new l(((long)this.a), this.b, this.c, this.d, this.e, null);
        }

        @Override  // l2.B$e$d$b
        public l2.B.e.d.b b(l2.B.e.d.a b$e$d$a0) {
            if(b$e$d$a0 == null) {
                throw new NullPointerException("Null app");
            }
            this.c = b$e$d$a0;
            return this;
        }

        @Override  // l2.B$e$d$b
        public l2.B.e.d.b c(c b$e$d$c0) {
            if(b$e$d$c0 == null) {
                throw new NullPointerException("Null device");
            }
            this.d = b$e$d$c0;
            return this;
        }

        @Override  // l2.B$e$d$b
        public l2.B.e.d.b d(l2.B.e.d.d b$e$d$d0) {
            this.e = b$e$d$d0;
            return this;
        }

        @Override  // l2.B$e$d$b
        public l2.B.e.d.b e(long v) {
            this.a = v;
            return this;
        }

        @Override  // l2.B$e$d$b
        public l2.B.e.d.b f(String s) {
            if(s == null) {
                throw new NullPointerException("Null type");
            }
            this.b = s;
            return this;
        }
    }

    private final long a;
    private final String b;
    private final l2.B.e.d.a c;
    private final c d;
    private final l2.B.e.d.d e;

    private l(long v, String s, l2.B.e.d.a b$e$d$a0, c b$e$d$c0, l2.B.e.d.d b$e$d$d0) {
        this.a = v;
        this.b = s;
        this.c = b$e$d$a0;
        this.d = b$e$d$c0;
        this.e = b$e$d$d0;
    }

    l(long v, String s, l2.B.e.d.a b$e$d$a0, c b$e$d$c0, l2.B.e.d.d b$e$d$d0, a l$a0) {
        this(v, s, b$e$d$a0, b$e$d$c0, b$e$d$d0);
    }

    @Override  // l2.B$e$d
    public l2.B.e.d.a b() {
        return this.c;
    }

    @Override  // l2.B$e$d
    public c c() {
        return this.d;
    }

    @Override  // l2.B$e$d
    public l2.B.e.d.d d() {
        return this.e;
    }

    @Override  // l2.B$e$d
    public long e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            long v = ((d)object0).e();
            if(this.a == v) {
                String s = ((d)object0).f();
                if(this.b.equals(s)) {
                    l2.B.e.d.a b$e$d$a0 = ((d)object0).b();
                    if(this.c.equals(b$e$d$a0)) {
                        c b$e$d$c0 = ((d)object0).c();
                        if(this.d.equals(b$e$d$c0)) {
                            return this.e == null ? ((d)object0).d() == null : this.e.equals(((d)object0).d());
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$d
    public String f() {
        return this.b;
    }

    @Override  // l2.B$e$d
    public l2.B.e.d.b g() {
        return new b(this, null);
    }

    @Override
    public int hashCode() {
        int v = ((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
        return this.e == null ? v : v ^ this.e.hashCode();
    }

    @Override
    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}

