package l2;

final class m extends a {
    static abstract class l2.m.a {
    }

    static final class b extends l2.B.e.d.a.a {
        private l2.B.e.d.a.b a;
        private C b;
        private C c;
        private Boolean d;
        private Integer e;

        b() {
        }

        private b(a b$e$d$a0) {
            this.a = b$e$d$a0.d();
            this.b = b$e$d$a0.c();
            this.c = b$e$d$a0.e();
            this.d = b$e$d$a0.b();
            this.e = b$e$d$a0.f();
        }

        b(a b$e$d$a0, l2.m.a m$a0) {
            this(b$e$d$a0);
        }

        @Override  // l2.B$e$d$a$a
        public a a() {
            String s = this.a == null ? " execution" : "";
            if(this.e == null) {
                s = s + " uiOrientation";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new m(this.a, this.b, this.c, this.d, ((int)this.e), null);
        }

        @Override  // l2.B$e$d$a$a
        public l2.B.e.d.a.a b(Boolean boolean0) {
            this.d = boolean0;
            return this;
        }

        @Override  // l2.B$e$d$a$a
        public l2.B.e.d.a.a c(C c0) {
            this.b = c0;
            return this;
        }

        @Override  // l2.B$e$d$a$a
        public l2.B.e.d.a.a d(l2.B.e.d.a.b b$e$d$a$b0) {
            if(b$e$d$a$b0 == null) {
                throw new NullPointerException("Null execution");
            }
            this.a = b$e$d$a$b0;
            return this;
        }

        @Override  // l2.B$e$d$a$a
        public l2.B.e.d.a.a e(C c0) {
            this.c = c0;
            return this;
        }

        @Override  // l2.B$e$d$a$a
        public l2.B.e.d.a.a f(int v) {
            this.e = v;
            return this;
        }
    }

    private final l2.B.e.d.a.b a;
    private final C b;
    private final C c;
    private final Boolean d;
    private final int e;

    private m(l2.B.e.d.a.b b$e$d$a$b0, C c0, C c1, Boolean boolean0, int v) {
        this.a = b$e$d$a$b0;
        this.b = c0;
        this.c = c1;
        this.d = boolean0;
        this.e = v;
    }

    m(l2.B.e.d.a.b b$e$d$a$b0, C c0, C c1, Boolean boolean0, int v, l2.m.a m$a0) {
        this(b$e$d$a$b0, c0, c1, boolean0, v);
    }

    @Override  // l2.B$e$d$a
    public Boolean b() {
        return this.d;
    }

    @Override  // l2.B$e$d$a
    public C c() {
        return this.b;
    }

    @Override  // l2.B$e$d$a
    public l2.B.e.d.a.b d() {
        return this.a;
    }

    @Override  // l2.B$e$d$a
    public C e() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            l2.B.e.d.a.b b$e$d$a$b0 = ((a)object0).d();
            if(this.a.equals(b$e$d$a$b0)) {
                C c0 = this.b;
                if(c0 != null) {
                    if(c0.equals(((a)object0).c())) {
                    label_10:
                        C c1 = this.c;
                        if(c1 != null) {
                            if(c1.equals(((a)object0).e())) {
                            label_15:
                                Boolean boolean0 = this.d;
                                if(boolean0 != null) {
                                    if(boolean0.equals(((a)object0).b())) {
                                    label_20:
                                        int v = ((a)object0).f();
                                        return this.e == v;
                                    }
                                }
                                else if(((a)object0).b() == null) {
                                    goto label_20;
                                }
                            }
                        }
                        else if(((a)object0).e() == null) {
                            goto label_15;
                        }
                    }
                }
                else if(((a)object0).c() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$d$a
    public int f() {
        return this.e;
    }

    @Override  // l2.B$e$d$a
    public l2.B.e.d.a.a g() {
        return new b(this, null);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Boolean boolean0 = this.d;
        if(boolean0 != null) {
            v1 = boolean0.hashCode();
        }
        return ((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1) * 1000003 ^ this.e;
    }

    @Override
    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", uiOrientation=" + this.e + "}";
    }
}

