package l2;

final class w extends f {
    static abstract class a {
    }

    static final class b extends l2.B.e.f.a {
        private String a;

        @Override  // l2.B$e$f$a
        public f a() {
            String s = this.a == null ? " identifier" : "";
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new w(this.a, null);
        }

        @Override  // l2.B$e$f$a
        public l2.B.e.f.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;

    private w(String s) {
        this.a = s;
    }

    w(String s, a w$a0) {
        this(s);
    }

    @Override  // l2.B$e$f
    public String b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof f) {
            String s = ((f)object0).b();
            return this.a.equals(s);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public String toString() {
        return "User{identifier=" + this.a + "}";
    }
}

