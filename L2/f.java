package l2;

final class f extends d {
    static abstract class a {
    }

    static final class b extends l2.B.d.a {
        private C a;
        private String b;

        @Override  // l2.B$d$a
        public d a() {
            String s = this.a == null ? " files" : "";
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new f(this.a, this.b, null);
        }

        @Override  // l2.B$d$a
        public l2.B.d.a b(C c0) {
            if(c0 == null) {
                throw new NullPointerException("Null files");
            }
            this.a = c0;
            return this;
        }

        @Override  // l2.B$d$a
        public l2.B.d.a c(String s) {
            this.b = s;
            return this;
        }
    }

    private final C a;
    private final String b;

    private f(C c0, String s) {
        this.a = c0;
        this.b = s;
    }

    f(C c0, String s, a f$a0) {
        this(c0, s);
    }

    @Override  // l2.B$d
    public C b() {
        return this.a;
    }

    @Override  // l2.B$d
    public String c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            C c0 = ((d)object0).b();
            if(this.a.equals(c0)) {
                return this.b == null ? ((d)object0).c() == null : this.b.equals(((d)object0).c());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }
}

