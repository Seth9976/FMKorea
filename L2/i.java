package l2;

final class i extends a {
    static abstract class l2.i.a {
    }

    static final class b extends l2.B.e.a.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;

        @Override  // l2.B$e$a$a
        public a a() {
            String s = this.a == null ? " identifier" : "";
            if(this.b == null) {
                s = s + " version";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new i(this.a, this.b, this.c, null, this.d, this.e, this.f, null);
        }

        @Override  // l2.B$e$a$a
        public l2.B.e.a.a b(String s) {
            this.e = s;
            return this;
        }

        @Override  // l2.B$e$a$a
        public l2.B.e.a.a c(String s) {
            this.f = s;
            return this;
        }

        @Override  // l2.B$e$a$a
        public l2.B.e.a.a d(String s) {
            this.c = s;
            return this;
        }

        @Override  // l2.B$e$a$a
        public l2.B.e.a.a e(String s) {
            if(s == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = s;
            return this;
        }

        @Override  // l2.B$e$a$a
        public l2.B.e.a.a f(String s) {
            this.d = s;
            return this;
        }

        @Override  // l2.B$e$a$a
        public l2.B.e.a.a g(String s) {
            if(s == null) {
                throw new NullPointerException("Null version");
            }
            this.b = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    private i(String s, String s1, String s2, l2.B.e.a.b b$e$a$b0, String s3, String s4, String s5) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
    }

    i(String s, String s1, String s2, l2.B.e.a.b b$e$a$b0, String s3, String s4, String s5, l2.i.a i$a0) {
        this(s, s1, s2, b$e$a$b0, s3, s4, s5);
    }

    @Override  // l2.B$e$a
    public String b() {
        return this.e;
    }

    @Override  // l2.B$e$a
    public String c() {
        return this.f;
    }

    @Override  // l2.B$e$a
    public String d() {
        return this.c;
    }

    @Override  // l2.B$e$a
    public String e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            String s = ((a)object0).e();
            if(this.a.equals(s)) {
                String s1 = ((a)object0).h();
                if(this.b.equals(s1)) {
                    String s2 = this.c;
                    if(s2 != null) {
                        if(s2.equals(((a)object0).d())) {
                        label_12:
                            ((a)object0).g();
                            String s3 = this.d;
                            if(s3 != null) {
                                if(s3.equals(((a)object0).f())) {
                                label_18:
                                    String s4 = this.e;
                                    if(s4 == null) {
                                        if(((a)object0).b() == null) {
                                            return this.f == null ? ((a)object0).c() == null : this.f.equals(((a)object0).c());
                                        }
                                    }
                                    else if(s4.equals(((a)object0).b())) {
                                        return this.f == null ? ((a)object0).c() == null : this.f.equals(((a)object0).c());
                                    }
                                }
                            }
                            else if(((a)object0).f() == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((a)object0).d() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$a
    public String f() {
        return this.d;
    }

    @Override  // l2.B$e$a
    public l2.B.e.a.b g() {
        return null;
    }

    @Override  // l2.B$e$a
    public String h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        String s = this.f;
        if(s != null) {
            v2 = s.hashCode();
        }
        return (((((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ v3) * 0xD5009D89 ^ v4) * 1000003 ^ v5) * 1000003 ^ v2;
    }

    @Override
    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + null + ", installationUuid=" + this.d + ", developmentPlatform=" + this.e + ", developmentPlatformVersion=" + this.f + "}";
    }
}

