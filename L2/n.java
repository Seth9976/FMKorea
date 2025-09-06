package l2;

final class n extends b {
    static abstract class a {
    }

    static final class l2.n.b extends l2.B.e.d.a.b.b {
        private C a;
        private c b;
        private l2.B.a c;
        private d d;
        private C e;

        @Override  // l2.B$e$d$a$b$b
        public b a() {
            String s = this.d == null ? " signal" : "";
            if(this.e == null) {
                s = s + " binaries";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new n(this.a, this.b, this.c, this.d, this.e, null);
        }

        @Override  // l2.B$e$d$a$b$b
        public l2.B.e.d.a.b.b b(l2.B.a b$a0) {
            this.c = b$a0;
            return this;
        }

        @Override  // l2.B$e$d$a$b$b
        public l2.B.e.d.a.b.b c(C c0) {
            if(c0 == null) {
                throw new NullPointerException("Null binaries");
            }
            this.e = c0;
            return this;
        }

        @Override  // l2.B$e$d$a$b$b
        public l2.B.e.d.a.b.b d(c b$e$d$a$b$c0) {
            this.b = b$e$d$a$b$c0;
            return this;
        }

        @Override  // l2.B$e$d$a$b$b
        public l2.B.e.d.a.b.b e(d b$e$d$a$b$d0) {
            if(b$e$d$a$b$d0 == null) {
                throw new NullPointerException("Null signal");
            }
            this.d = b$e$d$a$b$d0;
            return this;
        }

        @Override  // l2.B$e$d$a$b$b
        public l2.B.e.d.a.b.b f(C c0) {
            this.a = c0;
            return this;
        }
    }

    private final C a;
    private final c b;
    private final l2.B.a c;
    private final d d;
    private final C e;

    private n(C c0, c b$e$d$a$b$c0, l2.B.a b$a0, d b$e$d$a$b$d0, C c1) {
        this.a = c0;
        this.b = b$e$d$a$b$c0;
        this.c = b$a0;
        this.d = b$e$d$a$b$d0;
        this.e = c1;
    }

    n(C c0, c b$e$d$a$b$c0, l2.B.a b$a0, d b$e$d$a$b$d0, C c1, a n$a0) {
        this(c0, b$e$d$a$b$c0, b$a0, b$e$d$a$b$d0, c1);
    }

    @Override  // l2.B$e$d$a$b
    public l2.B.a b() {
        return this.c;
    }

    @Override  // l2.B$e$d$a$b
    public C c() {
        return this.e;
    }

    @Override  // l2.B$e$d$a$b
    public c d() {
        return this.b;
    }

    @Override  // l2.B$e$d$a$b
    public d e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            C c0 = this.a;
            if(c0 != null) {
                if(c0.equals(((b)object0).f())) {
                label_8:
                    c b$e$d$a$b$c0 = this.b;
                    if(b$e$d$a$b$c0 != null) {
                        if(b$e$d$a$b$c0.equals(((b)object0).d())) {
                        label_13:
                            l2.B.a b$a0 = this.c;
                            if(b$a0 != null) {
                                if(b$a0.equals(((b)object0).b())) {
                                label_18:
                                    d b$e$d$a$b$d0 = ((b)object0).e();
                                    if(this.d.equals(b$e$d$a$b$d0)) {
                                        C c1 = ((b)object0).c();
                                        return this.e.equals(c1);
                                    }
                                }
                            }
                            else if(((b)object0).b() == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((b)object0).d() == null) {
                        goto label_13;
                    }
                }
            }
            else if(((b)object0).f() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$d$a$b
    public C f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        l2.B.a b$a0 = this.c;
        if(b$a0 != null) {
            v = b$a0.hashCode();
        }
        return ((((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}

