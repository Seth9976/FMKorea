package l2;

final class v extends e {
    static abstract class a {
    }

    static final class b extends l2.B.e.e.a {
        private Integer a;
        private String b;
        private String c;
        private Boolean d;

        @Override  // l2.B$e$e$a
        public e a() {
            String s = this.a == null ? " platform" : "";
            if(this.b == null) {
                s = s + " version";
            }
            if(this.c == null) {
                s = s + " buildVersion";
            }
            if(this.d == null) {
                s = s + " jailbroken";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new v(((int)this.a), this.b, this.c, this.d.booleanValue(), null);
        }

        @Override  // l2.B$e$e$a
        public l2.B.e.e.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = s;
            return this;
        }

        @Override  // l2.B$e$e$a
        public l2.B.e.e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override  // l2.B$e$e$a
        public l2.B.e.e.a d(int v) {
            this.a = v;
            return this;
        }

        @Override  // l2.B$e$e$a
        public l2.B.e.e.a e(String s) {
            if(s == null) {
                throw new NullPointerException("Null version");
            }
            this.b = s;
            return this;
        }
    }

    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    private v(int v, String s, String s1, boolean z) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = z;
    }

    v(int v, String s, String s1, boolean z, a v$a0) {
        this(v, s, s1, z);
    }

    @Override  // l2.B$e$e
    public String b() {
        return this.c;
    }

    @Override  // l2.B$e$e
    public int c() {
        return this.a;
    }

    @Override  // l2.B$e$e
    public String d() {
        return this.b;
    }

    @Override  // l2.B$e$e
    public boolean e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            int v = ((e)object0).c();
            if(this.a == v) {
                String s = ((e)object0).d();
                if(this.b.equals(s)) {
                    String s1 = ((e)object0).b();
                    if(this.c.equals(s1)) {
                        boolean z = ((e)object0).e();
                        return this.d == z;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = (((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
        return this.d ? v ^ 0x4CF : v ^ 0x4D5;
    }

    @Override
    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}

