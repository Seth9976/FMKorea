package a2;

final class a extends m {
    private final long a;
    private final long b;
    private final long c;

    a(long v, long v1, long v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override  // a2.m
    public long b() {
        return this.b;
    }

    @Override  // a2.m
    public long c() {
        return this.a;
    }

    @Override  // a2.m
    public long d() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof m) {
            long v = ((m)object0).c();
            if(this.a == v) {
                long v1 = ((m)object0).b();
                if(this.b == v1) {
                    long v2 = ((m)object0).d();
                    return this.c == v2;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c));
    }

    @Override
    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}

