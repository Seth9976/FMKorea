package l2;

final class d extends a {
    static abstract class l2.d.a {
    }

    static final class b extends l2.B.a.a.a {
        private String a;
        private String b;
        private String c;

        @Override  // l2.B$a$a$a
        public a a() {
            String s = this.a == null ? " arch" : "";
            if(this.b == null) {
                s = s + " libraryName";
            }
            if(this.c == null) {
                s = s + " buildId";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new d(this.a, this.b, this.c, null);
        }

        @Override  // l2.B$a$a$a
        public l2.B.a.a.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null arch");
            }
            this.a = s;
            return this;
        }

        @Override  // l2.B$a$a$a
        public l2.B.a.a.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null buildId");
            }
            this.c = s;
            return this;
        }

        @Override  // l2.B$a$a$a
        public l2.B.a.a.a d(String s) {
            if(s == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.b = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;

    private d(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    d(String s, String s1, String s2, l2.d.a d$a0) {
        this(s, s1, s2);
    }

    @Override  // l2.B$a$a
    public String b() {
        return this.a;
    }

    @Override  // l2.B$a$a
    public String c() {
        return this.c;
    }

    @Override  // l2.B$a$a
    public String d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            String s = ((a)object0).b();
            if(this.a.equals(s)) {
                String s1 = ((a)object0).d();
                if(this.b.equals(s1)) {
                    String s2 = ((a)object0).c();
                    return this.c.equals(s2);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.a + ", libraryName=" + this.b + ", buildId=" + this.c + "}";
    }
}

