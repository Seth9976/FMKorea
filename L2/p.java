package l2;

final class p extends c {
    static abstract class a {
    }

    static final class b extends l2.B.e.d.a.b.c.a {
        private String a;
        private String b;
        private C c;
        private c d;
        private Integer e;

        @Override  // l2.B$e$d$a$b$c$a
        public c a() {
            String s = this.a == null ? " type" : "";
            if(this.c == null) {
                s = s + " frames";
            }
            if(this.e == null) {
                s = s + " overflowCount";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new p(this.a, this.b, this.c, this.d, ((int)this.e), null);
        }

        @Override  // l2.B$e$d$a$b$c$a
        public l2.B.e.d.a.b.c.a b(c b$e$d$a$b$c0) {
            this.d = b$e$d$a$b$c0;
            return this;
        }

        @Override  // l2.B$e$d$a$b$c$a
        public l2.B.e.d.a.b.c.a c(C c0) {
            if(c0 == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = c0;
            return this;
        }

        @Override  // l2.B$e$d$a$b$c$a
        public l2.B.e.d.a.b.c.a d(int v) {
            this.e = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$c$a
        public l2.B.e.d.a.b.c.a e(String s) {
            this.b = s;
            return this;
        }

        @Override  // l2.B$e$d$a$b$c$a
        public l2.B.e.d.a.b.c.a f(String s) {
            if(s == null) {
                throw new NullPointerException("Null type");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final C c;
    private final c d;
    private final int e;

    private p(String s, String s1, C c0, c b$e$d$a$b$c0, int v) {
        this.a = s;
        this.b = s1;
        this.c = c0;
        this.d = b$e$d$a$b$c0;
        this.e = v;
    }

    p(String s, String s1, C c0, c b$e$d$a$b$c0, int v, a p$a0) {
        this(s, s1, c0, b$e$d$a$b$c0, v);
    }

    @Override  // l2.B$e$d$a$b$c
    public c b() {
        return this.d;
    }

    @Override  // l2.B$e$d$a$b$c
    public C c() {
        return this.c;
    }

    @Override  // l2.B$e$d$a$b$c
    public int d() {
        return this.e;
    }

    @Override  // l2.B$e$d$a$b$c
    public String e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            String s = ((c)object0).f();
            if(this.a.equals(s)) {
                String s1 = this.b;
                if(s1 != null) {
                    if(s1.equals(((c)object0).e())) {
                    label_10:
                        C c0 = ((c)object0).c();
                        if(this.c.equals(c0)) {
                            c b$e$d$a$b$c0 = this.d;
                            if(b$e$d$a$b$c0 != null) {
                                if(b$e$d$a$b$c0.equals(((c)object0).b())) {
                                label_17:
                                    int v = ((c)object0).d();
                                    return this.e == v;
                                }
                            }
                            else if(((c)object0).b() == null) {
                                goto label_17;
                            }
                        }
                    }
                }
                else if(((c)object0).e() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$d$a$b$c
    public String f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c.hashCode();
        c b$e$d$a$b$c0 = this.d;
        if(b$e$d$a$b$c0 != null) {
            v1 = b$e$d$a$b$c0.hashCode();
        }
        return ((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1) * 1000003 ^ this.e;
    }

    @Override
    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }
}

