package l2;

final class r extends e {
    static abstract class a {
    }

    static final class b extends l2.B.e.d.a.b.e.a {
        private String a;
        private Integer b;
        private C c;

        @Override  // l2.B$e$d$a$b$e$a
        public e a() {
            String s = this.a == null ? " name" : "";
            if(this.b == null) {
                s = s + " importance";
            }
            if(this.c == null) {
                s = s + " frames";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new r(this.a, ((int)this.b), this.c, null);
        }

        @Override  // l2.B$e$d$a$b$e$a
        public l2.B.e.d.a.b.e.a b(C c0) {
            if(c0 == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = c0;
            return this;
        }

        @Override  // l2.B$e$d$a$b$e$a
        public l2.B.e.d.a.b.e.a c(int v) {
            this.b = v;
            return this;
        }

        @Override  // l2.B$e$d$a$b$e$a
        public l2.B.e.d.a.b.e.a d(String s) {
            if(s == null) {
                throw new NullPointerException("Null name");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final int b;
    private final C c;

    private r(String s, int v, C c0) {
        this.a = s;
        this.b = v;
        this.c = c0;
    }

    r(String s, int v, C c0, a r$a0) {
        this(s, v, c0);
    }

    @Override  // l2.B$e$d$a$b$e
    public C b() {
        return this.c;
    }

    @Override  // l2.B$e$d$a$b$e
    public int c() {
        return this.b;
    }

    @Override  // l2.B$e$d$a$b$e
    public String d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            String s = ((e)object0).d();
            if(this.a.equals(s)) {
                int v = ((e)object0).c();
                if(this.b == v) {
                    C c0 = ((e)object0).b();
                    return this.c.equals(c0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}

