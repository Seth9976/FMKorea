package l2;

final class s extends b {
    static abstract class a {
    }

    static final class l2.s.b extends l2.B.e.d.a.b.e.b.a {
        private Long a;
        private String b;
        private String c;
        private Long d;
        private Integer e;

        @Override  // l2.B$e$d$a$b$e$b$a
        public b a() {
            String s = this.a == null ? " pc" : "";
            if(this.b == null) {
                s = s + " symbol";
            }
            if(this.d == null) {
                s = s + " offset";
            }
            if(this.e == null) {
                s = s + " importance";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new s(((long)this.a), this.b, this.c, ((long)this.d), ((int)this.e), null);
        }

        @Override  // l2.B$e$d$a$b$e$b$a
        public l2.B.e.d.a.b.e.b.a b(String s) {
            this.c = s;
            return this;
        }

        @Override  // l2.B$e$d$a$b$e$b$a
        public l2.B.e.d.a.b.e.b.a c(int v) {
            this.e = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$e$b$a
        public l2.B.e.d.a.b.e.b.a d(long v) {
            this.d = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$e$b$a
        public l2.B.e.d.a.b.e.b.a e(long v) {
            this.a = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$e$b$a
        public l2.B.e.d.a.b.e.b.a f(String s) {
            if(s == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = s;
            return this;
        }
    }

    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    private s(long v, String s, String s1, long v1, int v2) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v1;
        this.e = v2;
    }

    s(long v, String s, String s1, long v1, int v2, a s$a0) {
        this(v, s, s1, v1, v2);
    }

    @Override  // l2.B$e$d$a$b$e$b
    public String b() {
        return this.c;
    }

    @Override  // l2.B$e$d$a$b$e$b
    public int c() {
        return this.e;
    }

    @Override  // l2.B$e$d$a$b$e$b
    public long d() {
        return this.d;
    }

    @Override  // l2.B$e$d$a$b$e$b
    public long e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            long v = ((b)object0).e();
            if(this.a == v) {
                String s = ((b)object0).f();
                if(this.b.equals(s)) {
                    String s1 = this.c;
                    if(s1 != null) {
                        if(s1.equals(((b)object0).b())) {
                        label_12:
                            long v1 = ((b)object0).d();
                            if(this.d == v1) {
                                int v2 = ((b)object0).c();
                                return this.e == v2;
                            }
                        }
                    }
                    else if(((b)object0).b() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$d$a$b$e$b
    public String f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
        return this.c == null ? (v * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ this.e : ((v ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ this.e;
    }

    @Override
    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }
}

