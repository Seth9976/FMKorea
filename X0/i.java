package x0;

import z3.k;

public final class i {
    public final String a;
    private final int b;
    public final int c;

    public i(String s, int v, int v1) {
        k.e(s, "workSpecId");
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    public final int a() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(!k.a(this.a, ((i)object0).a)) {
            return false;
        }
        return this.b == ((i)object0).b ? this.c == ((i)object0).c : false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c;
    }

    @Override
    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}

