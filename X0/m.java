package x0;

import z3.k;

public final class m {
    private final String a;
    private final int b;

    public m(String s, int v) {
        k.e(s, "workSpecId");
        super();
        this.a = s;
        this.b = v;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        return k.a(this.a, ((m)object0).a) ? this.b == ((m)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}

