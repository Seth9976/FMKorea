package x0;

import z3.k;

public final class d {
    private final String a;
    private final Long b;

    public d(String s, Long long0) {
        k.e(s, "key");
        super();
        this.a = s;
        this.b = long0;
    }

    public d(String s, boolean z) {
        k.e(s, "key");
        this(s, ((long)(z ? 1L : 0L)));
    }

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        return k.a(this.a, ((d)object0).a) ? k.a(this.b, ((d)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}

