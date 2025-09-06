package K2;

import z3.k;

public final class p {
    private final j a;
    private final s b;
    private final b c;

    public p(j j0, s s0, b b0) {
        k.e(j0, "eventType");
        k.e(s0, "sessionData");
        k.e(b0, "applicationInfo");
        super();
        this.a = j0;
        this.b = s0;
        this.c = b0;
    }

    public final b a() {
        return this.c;
    }

    public final j b() {
        return this.a;
    }

    public final s c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(this.a != ((p)object0).a) {
            return false;
        }
        return k.a(this.b, ((p)object0).b) ? k.a(this.c, ((p)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.b + ", applicationInfo=" + this.c + ')';
    }
}

