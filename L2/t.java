package l2;

final class t extends c {
    static abstract class a {
    }

    static final class b extends l2.B.e.d.c.a {
        private Double a;
        private Integer b;
        private Boolean c;
        private Integer d;
        private Long e;
        private Long f;

        @Override  // l2.B$e$d$c$a
        public c a() {
            String s = this.b == null ? " batteryVelocity" : "";
            if(this.c == null) {
                s = s + " proximityOn";
            }
            if(this.d == null) {
                s = s + " orientation";
            }
            if(this.e == null) {
                s = s + " ramUsed";
            }
            if(this.f == null) {
                s = s + " diskUsed";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new t(this.a, ((int)this.b), this.c.booleanValue(), ((int)this.d), ((long)this.e), ((long)this.f), null);
        }

        @Override  // l2.B$e$d$c$a
        public l2.B.e.d.c.a b(Double double0) {
            this.a = double0;
            return this;
        }

        @Override  // l2.B$e$d$c$a
        public l2.B.e.d.c.a c(int v) {
            this.b = v;
            return this;
        }

        @Override  // l2.B$e$d$c$a
        public l2.B.e.d.c.a d(long v) {
            this.f = v;
            return this;
        }

        @Override  // l2.B$e$d$c$a
        public l2.B.e.d.c.a e(int v) {
            this.d = v;
            return this;
        }

        @Override  // l2.B$e$d$c$a
        public l2.B.e.d.c.a f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override  // l2.B$e$d$c$a
        public l2.B.e.d.c.a g(long v) {
            this.e = v;
            return this;
        }
    }

    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    private t(Double double0, int v, boolean z, int v1, long v2, long v3) {
        this.a = double0;
        this.b = v;
        this.c = z;
        this.d = v1;
        this.e = v2;
        this.f = v3;
    }

    t(Double double0, int v, boolean z, int v1, long v2, long v3, a t$a0) {
        this(double0, v, z, v1, v2, v3);
    }

    @Override  // l2.B$e$d$c
    public Double b() {
        return this.a;
    }

    @Override  // l2.B$e$d$c
    public int c() {
        return this.b;
    }

    @Override  // l2.B$e$d$c
    public long d() {
        return this.f;
    }

    @Override  // l2.B$e$d$c
    public int e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            Double double0 = this.a;
            if(double0 != null) {
                if(double0.equals(((c)object0).b())) {
                label_8:
                    int v = ((c)object0).c();
                    if(this.b == v) {
                        boolean z = ((c)object0).g();
                        if(this.c == z) {
                            int v1 = ((c)object0).e();
                            if(this.d == v1) {
                                long v2 = ((c)object0).f();
                                if(this.e == v2) {
                                    long v3 = ((c)object0).d();
                                    return this.f == v3;
                                }
                            }
                        }
                    }
                }
            }
            else if(((c)object0).b() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // l2.B$e$d$c
    public long f() {
        return this.e;
    }

    @Override  // l2.B$e$d$c
    public boolean g() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ this.b) * 1000003;
        return this.c ? (((v ^ 0x4CF) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20)) : (((v ^ 0x4D5) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20));
    }

    @Override
    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }
}

