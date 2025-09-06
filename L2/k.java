package l2;

final class k extends c {
    static abstract class a {
    }

    static final class b extends l2.B.e.c.a {
        private Integer a;
        private String b;
        private Integer c;
        private Long d;
        private Long e;
        private Boolean f;
        private Integer g;
        private String h;
        private String i;

        @Override  // l2.B$e$c$a
        public c a() {
            String s = this.a == null ? " arch" : "";
            if(this.b == null) {
                s = s + " model";
            }
            if(this.c == null) {
                s = s + " cores";
            }
            if(this.d == null) {
                s = s + " ram";
            }
            if(this.e == null) {
                s = s + " diskSpace";
            }
            if(this.f == null) {
                s = s + " simulator";
            }
            if(this.g == null) {
                s = s + " state";
            }
            if(this.h == null) {
                s = s + " manufacturer";
            }
            if(this.i == null) {
                s = s + " modelClass";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new k(((int)this.a), this.b, ((int)this.c), ((long)this.d), ((long)this.e), this.f.booleanValue(), ((int)this.g), this.h, this.i, null);
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a b(int v) {
            this.a = v;
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a c(int v) {
            this.c = v;
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a d(long v) {
            this.e = v;
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a e(String s) {
            if(s == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.h = s;
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a f(String s) {
            if(s == null) {
                throw new NullPointerException("Null model");
            }
            this.b = s;
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a g(String s) {
            if(s == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.i = s;
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a h(long v) {
            this.d = v;
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override  // l2.B$e$c$a
        public l2.B.e.c.a j(int v) {
            this.g = v;
            return this;
        }
    }

    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    private k(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = v4;
        this.h = s1;
        this.i = s2;
    }

    k(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2, a k$a0) {
        this(v, s, v1, v2, v3, z, v4, s1, s2);
    }

    @Override  // l2.B$e$c
    public int b() {
        return this.a;
    }

    @Override  // l2.B$e$c
    public int c() {
        return this.c;
    }

    @Override  // l2.B$e$c
    public long d() {
        return this.e;
    }

    @Override  // l2.B$e$c
    public String e() {
        return this.h;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            int v = ((c)object0).b();
            if(this.a == v) {
                String s = ((c)object0).f();
                if(this.b.equals(s)) {
                    int v1 = ((c)object0).c();
                    if(this.c == v1) {
                        long v2 = ((c)object0).h();
                        if(this.d == v2) {
                            long v3 = ((c)object0).d();
                            if(this.e == v3) {
                                boolean z = ((c)object0).j();
                                if(this.f == z) {
                                    int v4 = ((c)object0).i();
                                    if(this.g == v4) {
                                        String s1 = ((c)object0).e();
                                        if(this.h.equals(s1)) {
                                            String s2 = ((c)object0).g();
                                            return this.i.equals(s2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$c
    public String f() {
        return this.b;
    }

    @Override  // l2.B$e$c
    public String g() {
        return this.i;
    }

    @Override  // l2.B$e$c
    public long h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = (((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003;
        return this.f ? (((v ^ 0x4CF) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode() : (((v ^ 0x4D5) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override  // l2.B$e$c
    public int i() {
        return this.g;
    }

    @Override  // l2.B$e$c
    public boolean j() {
        return this.f;
    }

    @Override
    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.d + ", diskSpace=" + this.e + ", simulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }
}

