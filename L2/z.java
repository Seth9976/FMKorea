package l2;

final class z extends b {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    z(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2) {
        this.a = v;
        if(s == null) {
            throw new NullPointerException("Null model");
        }
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = v4;
        if(s1 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.h = s1;
        if(s2 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.i = s2;
    }

    @Override  // l2.D$b
    public int a() {
        return this.a;
    }

    @Override  // l2.D$b
    public int b() {
        return this.c;
    }

    @Override  // l2.D$b
    public long d() {
        return this.e;
    }

    @Override  // l2.D$b
    public boolean e() {
        return this.f;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            int v = ((b)object0).a();
            if(this.a == v) {
                String s = ((b)object0).g();
                if(this.b.equals(s)) {
                    int v1 = ((b)object0).b();
                    if(this.c == v1) {
                        long v2 = ((b)object0).j();
                        if(this.d == v2) {
                            long v3 = ((b)object0).d();
                            if(this.e == v3) {
                                boolean z = ((b)object0).e();
                                if(this.f == z) {
                                    int v4 = ((b)object0).i();
                                    if(this.g == v4) {
                                        String s1 = ((b)object0).f();
                                        if(this.h.equals(s1)) {
                                            String s2 = ((b)object0).h();
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

    @Override  // l2.D$b
    public String f() {
        return this.h;
    }

    @Override  // l2.D$b
    public String g() {
        return this.b;
    }

    @Override  // l2.D$b
    public String h() {
        return this.i;
    }

    @Override
    public int hashCode() {
        int v = (((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003;
        return this.f ? (((v ^ 0x4CF) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode() : (((v ^ 0x4D5) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override  // l2.D$b
    public int i() {
        return this.g;
    }

    @Override  // l2.D$b
    public long j() {
        return this.d;
    }

    @Override
    public String toString() {
        return "DeviceData{arch=" + this.a + ", model=" + this.b + ", availableProcessors=" + this.c + ", totalRam=" + this.d + ", diskSpace=" + this.e + ", isEmulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }
}

