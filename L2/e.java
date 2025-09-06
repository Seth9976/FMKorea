package l2;

final class e extends c {
    static abstract class a {
    }

    static final class b extends l2.B.c.a {
        private String a;
        private String b;

        @Override  // l2.B$c$a
        public c a() {
            String s = this.a == null ? " key" : "";
            if(this.b == null) {
                s = s + " value";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new e(this.a, this.b, null);
        }

        @Override  // l2.B$c$a
        public l2.B.c.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null key");
            }
            this.a = s;
            return this;
        }

        @Override  // l2.B$c$a
        public l2.B.c.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null value");
            }
            this.b = s;
            return this;
        }
    }

    private final String a;
    private final String b;

    private e(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    e(String s, String s1, a e$a0) {
        this(s, s1);
    }

    @Override  // l2.B$c
    public String b() {
        return this.a;
    }

    @Override  // l2.B$c
    public String c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            String s = ((c)object0).b();
            if(this.a.equals(s)) {
                String s1 = ((c)object0).c();
                return this.b.equals(s1);
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }
}

