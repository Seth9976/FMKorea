package l2;

final class x extends D {
    private final a a;
    private final c b;
    private final b c;

    x(a d$a0, c d$c0, b d$b0) {
        if(d$a0 == null) {
            throw new NullPointerException("Null appData");
        }
        this.a = d$a0;
        if(d$c0 == null) {
            throw new NullPointerException("Null osData");
        }
        this.b = d$c0;
        if(d$b0 == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.c = d$b0;
    }

    @Override  // l2.D
    public a a() {
        return this.a;
    }

    @Override  // l2.D
    public b c() {
        return this.c;
    }

    @Override  // l2.D
    public c d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof D) {
            a d$a0 = ((D)object0).a();
            if(this.a.equals(d$a0)) {
                c d$c0 = ((D)object0).d();
                if(this.b.equals(d$c0)) {
                    b d$b0 = ((D)object0).c();
                    return this.c.equals(d$b0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}

