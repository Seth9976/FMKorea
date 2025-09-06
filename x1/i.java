package X1;

final class i extends g {
    private final Object f;
    private static final long serialVersionUID;

    i(Object object0) {
        this.f = object0;
    }

    @Override  // X1.g
    public Object b() {
        return this.f;
    }

    @Override  // X1.g
    public boolean c() {
        return true;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof i ? this.f.equals(((i)object0).f) : false;
    }

    @Override
    public int hashCode() {
        return this.f.hashCode() + 0x598DF91C;
    }

    @Override
    public String toString() {
        return "Optional.of(" + this.f + ")";
    }
}

