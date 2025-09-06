package l2;

final class u extends d {
    static abstract class a {
    }

    static final class b extends l2.B.e.d.d.a {
        private String a;

        @Override  // l2.B$e$d$d$a
        public d a() {
            String s = this.a == null ? " content" : "";
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new u(this.a, null);
        }

        @Override  // l2.B$e$d$d$a
        public l2.B.e.d.d.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null content");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;

    private u(String s) {
        this.a = s;
    }

    u(String s, a u$a0) {
        this(s);
    }

    @Override  // l2.B$e$d$d
    public String b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = ((d)object0).b();
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
        return "Log{content=" + this.a + "}";
    }
}

