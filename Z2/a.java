package z2;

import java.util.List;

final class a extends r {
    private final String a;
    private final List b;

    a(String s, List list0) {
        if(s == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = s;
        if(list0 == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.b = list0;
    }

    @Override  // z2.r
    public List b() {
        return this.b;
    }

    @Override  // z2.r
    public String c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof r) {
            String s = ((r)object0).c();
            if(this.a.equals(s)) {
                List list0 = ((r)object0).b();
                return this.b.equals(list0);
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
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}

