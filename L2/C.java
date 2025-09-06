package l2;

final class c extends a {
    static abstract class l2.c.a {
    }

    static final class b extends l2.B.a.b {
        private Integer a;
        private String b;
        private Integer c;
        private Integer d;
        private Long e;
        private Long f;
        private Long g;
        private String h;
        private C i;

        @Override  // l2.B$a$b
        public a a() {
            String s = this.a == null ? " pid" : "";
            if(this.b == null) {
                s = s + " processName";
            }
            if(this.c == null) {
                s = s + " reasonCode";
            }
            if(this.d == null) {
                s = s + " importance";
            }
            if(this.e == null) {
                s = s + " pss";
            }
            if(this.f == null) {
                s = s + " rss";
            }
            if(this.g == null) {
                s = s + " timestamp";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new c(((int)this.a), this.b, ((int)this.c), ((int)this.d), ((long)this.e), ((long)this.f), ((long)this.g), this.h, this.i, null);
        }

        @Override  // l2.B$a$b
        public l2.B.a.b b(C c0) {
            this.i = c0;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b c(int v) {
            this.d = v;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b d(int v) {
            this.a = v;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b e(String s) {
            if(s == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = s;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b f(long v) {
            this.e = v;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b g(int v) {
            this.c = v;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b h(long v) {
            this.f = v;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b i(long v) {
            this.g = v;
            return this;
        }

        @Override  // l2.B$a$b
        public l2.B.a.b j(String s) {
            this.h = s;
            return this;
        }
    }

    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final String h;
    private final C i;

    private c(int v, String s, int v1, int v2, long v3, long v4, long v5, String s1, C c0) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = s1;
        this.i = c0;
    }

    c(int v, String s, int v1, int v2, long v3, long v4, long v5, String s1, C c0, l2.c.a c$a0) {
        this(v, s, v1, v2, v3, v4, v5, s1, c0);
    }

    @Override  // l2.B$a
    public C b() {
        return this.i;
    }

    @Override  // l2.B$a
    public int c() {
        return this.d;
    }

    @Override  // l2.B$a
    public int d() {
        return this.a;
    }

    @Override  // l2.B$a
    public String e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            int v = ((a)object0).d();
            if(this.a == v) {
                String s = ((a)object0).e();
                if(this.b.equals(s)) {
                    int v1 = ((a)object0).g();
                    if(this.c == v1) {
                        int v2 = ((a)object0).c();
                        if(this.d == v2) {
                            long v3 = ((a)object0).f();
                            if(this.e == v3) {
                                long v4 = ((a)object0).h();
                                if(this.f == v4) {
                                    long v5 = ((a)object0).i();
                                    if(this.g == v5) {
                                        String s1 = this.h;
                                        if(s1 == null) {
                                            if(((a)object0).j() == null) {
                                                return this.i == null ? ((a)object0).b() == null : this.i.equals(((a)object0).b());
                                            }
                                        }
                                        else if(s1.equals(((a)object0).j())) {
                                            return this.i == null ? ((a)object0).b() == null : this.i.equals(((a)object0).b());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$a
    public long f() {
        return this.e;
    }

    @Override  // l2.B$a
    public int g() {
        return this.c;
    }

    @Override  // l2.B$a
    public long h() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = (((((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003;
        int v1 = 0;
        int v2 = this.h == null ? 0 : this.h.hashCode();
        C c0 = this.i;
        if(c0 != null) {
            v1 = c0.hashCode();
        }
        return (v ^ v2) * 1000003 ^ v1;
    }

    @Override  // l2.B$a
    public long i() {
        return this.g;
    }

    @Override  // l2.B$a
    public String j() {
        return this.h;
    }

    @Override
    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}

