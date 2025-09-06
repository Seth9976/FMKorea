package u1;

import m1.i;
import m1.p;

final class b extends k {
    private final long a;
    private final p b;
    private final i c;

    b(long v, p p0, i i0) {
        this.a = v;
        if(p0 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = p0;
        if(i0 == null) {
            throw new NullPointerException("Null event");
        }
        this.c = i0;
    }

    @Override  // u1.k
    public i b() {
        return this.c;
    }

    @Override  // u1.k
    public long c() {
        return this.a;
    }

    @Override  // u1.k
    public p d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof k) {
            long v = ((k)object0).c();
            if(this.a == v) {
                p p0 = ((k)object0).d();
                if(this.b.equals(p0)) {
                    i i0 = ((k)object0).b();
                    return this.c.equals(i0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}

