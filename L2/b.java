package l2;

final class b extends B {
    static abstract class a {
    }

    static final class l2.b.b extends l2.B.b {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private String g;
        private e h;
        private d i;
        private l2.B.a j;

        l2.b.b() {
        }

        private l2.b.b(B b0) {
            this.a = b0.k();
            this.b = b0.g();
            this.c = b0.j();
            this.d = b0.h();
            this.e = b0.f();
            this.f = b0.d();
            this.g = b0.e();
            this.h = b0.l();
            this.i = b0.i();
            this.j = b0.c();
        }

        l2.b.b(B b0, a b$a0) {
            this(b0);
        }

        @Override  // l2.B$b
        public B a() {
            String s = this.a == null ? " sdkVersion" : "";
            if(this.b == null) {
                s = s + " gmpAppId";
            }
            if(this.c == null) {
                s = s + " platform";
            }
            if(this.d == null) {
                s = s + " installationUuid";
            }
            if(this.f == null) {
                s = s + " buildVersion";
            }
            if(this.g == null) {
                s = s + " displayVersion";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new b(this.a, this.b, ((int)this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        @Override  // l2.B$b
        public l2.B.b b(l2.B.a b$a0) {
            this.j = b$a0;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b c(String s) {
            if(s == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f = s;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b d(String s) {
            if(s == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.g = s;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b e(String s) {
            this.e = s;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b f(String s) {
            if(s == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.b = s;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b g(String s) {
            if(s == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = s;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b h(d b$d0) {
            this.i = b$d0;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b i(int v) {
            this.c = v;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b j(String s) {
            if(s == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.a = s;
            return this;
        }

        @Override  // l2.B$b
        public l2.B.b k(e b$e0) {
            this.h = b$e0;
            return this;
        }
    }

    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final e i;
    private final d j;
    private final l2.B.a k;

    private b(String s, String s1, int v, String s2, String s3, String s4, String s5, e b$e0, d b$d0, l2.B.a b$a0) {
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = b$e0;
        this.j = b$d0;
        this.k = b$a0;
    }

    b(String s, String s1, int v, String s2, String s3, String s4, String s5, e b$e0, d b$d0, l2.B.a b$a0, a b$a1) {
        this(s, s1, v, s2, s3, s4, s5, b$e0, b$d0, b$a0);
    }

    @Override  // l2.B
    public l2.B.a c() {
        return this.k;
    }

    @Override  // l2.B
    public String d() {
        return this.g;
    }

    @Override  // l2.B
    public String e() {
        return this.h;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof B) {
            String s = ((B)object0).k();
            if(this.b.equals(s)) {
                String s1 = ((B)object0).g();
                if(this.c.equals(s1)) {
                    int v = ((B)object0).j();
                    if(this.d == v) {
                        String s2 = ((B)object0).h();
                        if(this.e.equals(s2)) {
                            String s3 = this.f;
                            if(s3 != null) {
                                if(s3.equals(((B)object0).f())) {
                                label_16:
                                    String s4 = ((B)object0).d();
                                    if(this.g.equals(s4)) {
                                        String s5 = ((B)object0).e();
                                        if(this.h.equals(s5)) {
                                            e b$e0 = this.i;
                                            if(b$e0 != null) {
                                                if(b$e0.equals(((B)object0).l())) {
                                                label_25:
                                                    d b$d0 = this.j;
                                                    if(b$d0 == null) {
                                                        if(((B)object0).i() == null) {
                                                            return this.k == null ? ((B)object0).c() == null : this.k.equals(((B)object0).c());
                                                        }
                                                    }
                                                    else if(b$d0.equals(((B)object0).i())) {
                                                        return this.k == null ? ((B)object0).c() == null : this.k.equals(((B)object0).c());
                                                    }
                                                }
                                            }
                                            else if(((B)object0).l() == null) {
                                                goto label_25;
                                            }
                                        }
                                    }
                                }
                            }
                            else if(((B)object0).f() == null) {
                                goto label_16;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B
    public String f() {
        return this.f;
    }

    @Override  // l2.B
    public String g() {
        return this.c;
    }

    @Override  // l2.B
    public String h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = ((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode()) * 1000003;
        int v1 = 0;
        int v2 = this.f == null ? 0 : this.f.hashCode();
        int v3 = this.g.hashCode();
        int v4 = this.h.hashCode();
        int v5 = this.i == null ? 0 : this.i.hashCode();
        int v6 = this.j == null ? 0 : this.j.hashCode();
        l2.B.a b$a0 = this.k;
        if(b$a0 != null) {
            v1 = b$a0.hashCode();
        }
        return (((((v ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v1;
    }

    @Override  // l2.B
    public d i() {
        return this.j;
    }

    @Override  // l2.B
    public int j() {
        return this.d;
    }

    @Override  // l2.B
    public String k() {
        return this.b;
    }

    @Override  // l2.B
    public e l() {
        return this.i;
    }

    @Override  // l2.B
    protected l2.B.b m() {
        return new l2.b.b(this, null);
    }

    @Override
    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", buildVersion=" + this.g + ", displayVersion=" + this.h + ", session=" + this.i + ", ndkPayload=" + this.j + ", appExitInfo=" + this.k + "}";
    }
}

