package l2;

final class h extends e {
    static abstract class a {
    }

    static final class b extends l2.B.e.b {
        private String a;
        private String b;
        private String c;
        private Long d;
        private Long e;
        private Boolean f;
        private l2.B.e.a g;
        private f h;
        private l2.B.e.e i;
        private c j;
        private C k;
        private Integer l;

        b() {
        }

        private b(e b$e0) {
            this.a = b$e0.g();
            this.b = b$e0.i();
            this.c = b$e0.c();
            this.d = b$e0.l();
            this.e = b$e0.e();
            this.f = Boolean.valueOf(b$e0.n());
            this.g = b$e0.b();
            this.h = b$e0.m();
            this.i = b$e0.k();
            this.j = b$e0.d();
            this.k = b$e0.f();
            this.l = b$e0.h();
        }

        b(e b$e0, a h$a0) {
            this(b$e0);
        }

        @Override  // l2.B$e$b
        public e a() {
            String s = this.a == null ? " generator" : "";
            if(this.b == null) {
                s = s + " identifier";
            }
            if(this.d == null) {
                s = s + " startedAt";
            }
            if(this.f == null) {
                s = s + " crashed";
            }
            if(this.g == null) {
                s = s + " app";
            }
            if(this.l == null) {
                s = s + " generatorType";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new h(this.a, this.b, this.c, ((long)this.d), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, ((int)this.l), null);
        }

        @Override  // l2.B$e$b
        public l2.B.e.b b(l2.B.e.a b$e$a0) {
            if(b$e$a0 == null) {
                throw new NullPointerException("Null app");
            }
            this.g = b$e$a0;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b c(String s) {
            this.c = s;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b e(c b$e$c0) {
            this.j = b$e$c0;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b f(Long long0) {
            this.e = long0;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b g(C c0) {
            this.k = c0;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b h(String s) {
            if(s == null) {
                throw new NullPointerException("Null generator");
            }
            this.a = s;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b i(int v) {
            this.l = v;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b j(String s) {
            if(s == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = s;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b l(l2.B.e.e b$e$e0) {
            this.i = b$e$e0;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b m(long v) {
            this.d = v;
            return this;
        }

        @Override  // l2.B$e$b
        public l2.B.e.b n(f b$e$f0) {
            this.h = b$e$f0;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final Long e;
    private final boolean f;
    private final l2.B.e.a g;
    private final f h;
    private final l2.B.e.e i;
    private final c j;
    private final C k;
    private final int l;

    private h(String s, String s1, String s2, long v, Long long0, boolean z, l2.B.e.a b$e$a0, f b$e$f0, l2.B.e.e b$e$e0, c b$e$c0, C c0, int v1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = long0;
        this.f = z;
        this.g = b$e$a0;
        this.h = b$e$f0;
        this.i = b$e$e0;
        this.j = b$e$c0;
        this.k = c0;
        this.l = v1;
    }

    h(String s, String s1, String s2, long v, Long long0, boolean z, l2.B.e.a b$e$a0, f b$e$f0, l2.B.e.e b$e$e0, c b$e$c0, C c0, int v1, a h$a0) {
        this(s, s1, s2, v, long0, z, b$e$a0, b$e$f0, b$e$e0, b$e$c0, c0, v1);
    }

    @Override  // l2.B$e
    public l2.B.e.a b() {
        return this.g;
    }

    @Override  // l2.B$e
    public String c() {
        return this.c;
    }

    @Override  // l2.B$e
    public c d() {
        return this.j;
    }

    @Override  // l2.B$e
    public Long e() {
        return this.e;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            String s = ((e)object0).g();
            if(this.a.equals(s)) {
                String s1 = ((e)object0).i();
                if(this.b.equals(s1)) {
                    String s2 = this.c;
                    if(s2 != null) {
                        if(s2.equals(((e)object0).c())) {
                        label_12:
                            long v = ((e)object0).l();
                            if(this.d == v) {
                                Long long0 = this.e;
                                if(long0 != null) {
                                    if(long0.equals(((e)object0).e())) {
                                    label_19:
                                        boolean z = ((e)object0).n();
                                        if(this.f == z) {
                                            l2.B.e.a b$e$a0 = ((e)object0).b();
                                            if(this.g.equals(b$e$a0)) {
                                                f b$e$f0 = this.h;
                                                if(b$e$f0 != null) {
                                                    if(b$e$f0.equals(((e)object0).m())) {
                                                    label_28:
                                                        l2.B.e.e b$e$e0 = this.i;
                                                        if(b$e$e0 != null) {
                                                            if(b$e$e0.equals(((e)object0).k())) {
                                                            label_33:
                                                                c b$e$c0 = this.j;
                                                                if(b$e$c0 != null) {
                                                                    if(b$e$c0.equals(((e)object0).d())) {
                                                                    label_38:
                                                                        C c0 = this.k;
                                                                        if(c0 != null) {
                                                                            if(c0.equals(((e)object0).f())) {
                                                                            label_43:
                                                                                int v1 = ((e)object0).h();
                                                                                return this.l == v1;
                                                                            }
                                                                        }
                                                                        else if(((e)object0).f() == null) {
                                                                            goto label_43;
                                                                        }
                                                                    }
                                                                }
                                                                else if(((e)object0).d() == null) {
                                                                    goto label_38;
                                                                }
                                                            }
                                                        }
                                                        else if(((e)object0).k() == null) {
                                                            goto label_33;
                                                        }
                                                    }
                                                }
                                                else if(((e)object0).m() == null) {
                                                    goto label_28;
                                                }
                                            }
                                        }
                                    }
                                }
                                else if(((e)object0).e() == null) {
                                    goto label_19;
                                }
                            }
                        }
                    }
                    else if(((e)object0).c() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e
    public C f() {
        return this.k;
    }

    @Override  // l2.B$e
    public String g() {
        return this.a;
    }

    @Override  // l2.B$e
    public int h() {
        return this.l;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        int v3 = this.f ? 0x4CF : 0x4D5;
        int v4 = this.g.hashCode();
        int v5 = this.h == null ? 0 : this.h.hashCode();
        int v6 = this.i == null ? 0 : this.i.hashCode();
        int v7 = this.j == null ? 0 : this.j.hashCode();
        C c0 = this.k;
        if(c0 != null) {
            v = c0.hashCode();
        }
        return (((((((v1 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v7) * 1000003 ^ v) * 1000003 ^ this.l;
    }

    @Override  // l2.B$e
    public String i() {
        return this.b;
    }

    @Override  // l2.B$e
    public l2.B.e.e k() {
        return this.i;
    }

    @Override  // l2.B$e
    public long l() {
        return this.d;
    }

    @Override  // l2.B$e
    public f m() {
        return this.h;
    }

    @Override  // l2.B$e
    public boolean n() {
        return this.f;
    }

    @Override  // l2.B$e
    public l2.B.e.b o() {
        return new b(this, null);
    }

    @Override
    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", appQualitySessionId=" + this.c + ", startedAt=" + this.d + ", endedAt=" + this.e + ", crashed=" + this.f + ", app=" + this.g + ", user=" + this.h + ", os=" + this.i + ", device=" + this.j + ", events=" + this.k + ", generatorType=" + this.l + "}";
    }
}

